/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-17 14:53:46
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-31 09:15:15
*/

package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MPasien;
import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.entity.MKamar;
import com.rsia.madura.entity.MKondisi;
import com.rsia.madura.entity.MRujukan;
import com.rsia.madura.entity.MTindakan;
import com.rsia.madura.entity.MPaket;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MParamPeriksa;
import com.rsia.madura.entity.MIcd;
import com.rsia.madura.entity.MIcd9;
import com.rsia.madura.entity.MPenunjang;
import com.rsia.madura.entity.MPaket;

import com.rsia.madura.service.PelayananService;
import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.service.KamarService;
import com.rsia.madura.service.KondisiPasienService;
import com.rsia.madura.service.RujukanService;
import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.PaketService;
import com.rsia.madura.service.SatuanService;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.ParamPeriksaService;
import com.rsia.madura.service.IcdService;
import com.rsia.madura.service.Icd9Service;
import com.rsia.madura.service.PenunjangService;
import com.rsia.madura.service.PaketService;

// pelayanan == pendaftaran

@Controller
@RequestMapping("/pelayanan")
public class PelayananController {
	@Autowired
	private PelayananService pelayananService;
	@Autowired
	private PasienService pasienService;
	@Autowired
	private PegawaiService pegawaiService;
	@Autowired
	private KamarService kamarService;
	@Autowired
	private KondisiPasienService kondisiService;
	@Autowired
	private RujukanService rujukanService;
	@Autowired
	private TindakanService tindakanService;
	@Autowired
	private PaketService paketService;
	@Autowired
	private SatuanService satuanService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private ParamPeriksaService paramperiksaService;
	@Autowired
	private IcdService icdService;
	@Autowired
	private Icd9Service icd9Service;
	@Autowired
	private PenunjangService penunjangService;
	
	private String uri ="redirect: /pelayanan";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model,
			@RequestParam(value="page", required=false, defaultValue = "1") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit) {
		List<MPendaftaran> pelayanans = pelayananService.getPelayanans(page, limit);
		String link = pelayananService.createLinks(page, limit);
		
		model.addAttribute("pelayanans", pelayanans);
		model.addAttribute("link", link);
		
		return "pelayanan/index";
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		MPendaftaran pelayananModel = pelayananService.getPelayanan(id);
		List<MPasien> pasiens = pasienService.findAll();
		List<MPegawai> pegawais = pegawaiService.getPegawai();
		List<MKamar> kamars = kamarService.findAll();
		List<MKondisi> kondisis = kondisiService.getKondisis();
		List<MRujukan> rujukans = rujukanService.getRujukans();
		List<MTindakan> tindakans = tindakanService.findAll();
		List<MPaket> pakets = paketService.findAll();
		List<MSatuan> satuans = satuanService.getSatuans();
		List<MBarang> barangs = barangService.getBarangs();
		List<MParamPeriksa> params = paramperiksaService.findAll();
		List<MIcd> icds = icdService.findAll();
		List<MIcd9> icd9s = icd9Service.findAll();
		List<MPenunjang> penunjangs = penunjangService.findAll();
		
		if (pelayananModel.getPaketID() != null) {
			MPaket paket = paketService.getById(pelayananModel.getPaketID());
			model.addAttribute("paket", paket);
		}
		
		model.addAttribute("pelayananModel", pelayananModel);
		model.addAttribute("pasiens", pasiens);
		model.addAttribute("pegawais", pegawais);
		model.addAttribute("kamars", kamars);
		model.addAttribute("kondisis", kondisis);
		model.addAttribute("rujukans", rujukans);
		model.addAttribute("tindakans", tindakans);
		model.addAttribute("pakets", pakets);
		model.addAttribute("satuans", satuans);
		model.addAttribute("barangs", barangs);
		model.addAttribute("params", params);
		model.addAttribute("icds", icds);
		model.addAttribute("icd9s", icd9s);
		model.addAttribute("penunjangs", penunjangs);
		model.addAttribute("footerjs", "../pelayanan/inc/footerjs.jsp");
		
		return "pelayanan/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("pendaftaranModel") MPendaftaran pendaftaranModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MPendaftaran dtPelayanan = pelayananService.getPelayanan(pendaftaranModel.getPendaftaranID());		

		if (dtPelayanan != null) {
			pendaftaranModel.setPasien(dtPelayanan.getPasien());
			pendaftaranModel.setPendaftaranUpdatedBy("Admin");
			pendaftaranModel.setPendaftaranUpdatedDate(currentTime);
			pelayananService.update(pendaftaranModel);
		}

		return "redirect: /pelayanan/update/" + pendaftaranModel.getPendaftaranID();
	}	

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id){
		Date currentTime = new Date(System.currentTimeMillis());
		MPendaftaran pelayananModel = pelayananService.getPelayanan(id);
		
		pelayananModel.setPendaftaranAktif("T");
		pelayananModel.setPendaftaranDeletedBy("Admin");
		pelayananModel.setPendaftaranDeletedDate(currentTime);
		
		pelayananService.delete(pelayananModel);

		return "redirect: /pelayanan/";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

}

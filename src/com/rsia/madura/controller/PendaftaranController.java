/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-25 10:14:49
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-26 16:18:16
*/
package com.rsia.madura.controller;

import java.util.Date;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MPasien;
import com.rsia.madura.entity.MKondisi;
import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.entity.MPaket;
import com.rsia.madura.entity.MRujukan;
import com.rsia.madura.entity.MTindakan;
import com.rsia.madura.entity.MKamar;
import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MRuang;

import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.PendaftaranService;
import com.rsia.madura.service.KondisiPasienService;
import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.service.PaketService;
import com.rsia.madura.service.RujukanService;
import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.KamarService;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.RuangService;
// import com.rsia.madura.service.PendidikanService;

@Controller
@RequestMapping("/pendaftaran")
public class PendaftaranController {
	@Autowired
	private PendaftaranService pendaftaranService;
	
	@Autowired
	private PasienService pasienService;
	
	@Autowired
	private RujukanService rujukanService;
	
	@Autowired
	private TindakanService tindakanService;
	
	@Autowired
	private KondisiPasienService kondisiPasienService;
	
	@Autowired
	private PaketService paketService;

	@Autowired
	private PegawaiService pegawaiService;

	@Autowired
	private KamarService kamarService;

	@Autowired
	private KelasService kelasService;

	@Autowired
	private RuangService ruangService;

	private String uri = "redirect: /pendaftaran";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit) {
		
		List<MPendaftaran> pendaftarans = pendaftaranService.getPendaftarans(page, limit);
		String link = pendaftaranService.createLinks(page, limit);

		model.addAttribute("link", link);
		model.addAttribute("pendaftarans", pendaftarans);
		return "pendaftaran/index";
	}
	
	@RequestMapping("/tambah")
	public String addForm(Model model) {
		MPendaftaran PendaftaranModel = new MPendaftaran();
		
		List<MPendaftaran> pendaftarans = pendaftaranService.getPendaftarans();
		
		List<MPasien> pasien = pasienService.findAll();
		List<MRujukan> rujukan = rujukanService.getRujukans();
		List<MTindakan> tindakan = tindakanService.findAll();
		List<MKondisi> kondisipasien = kondisiPasienService.getKondisis();
		List<MPaket> pakets = paketService.findAll();
		List<MPegawai> pegawais = pegawaiService.getPegawai();
		List<MKamar> kamars = kamarService.findAll();
		List<MKelas> kelases = kelasService.findAll();
		List<MRuang> ruangs = ruangService.findAll();

		model.addAttribute("pendaftarans", pendaftarans);
		model.addAttribute("pasiens", pasien);
		model.addAttribute("rujukans", rujukan);
		model.addAttribute("tindakans", tindakan);
		model.addAttribute("kondisipasiens", kondisipasien);
		model.addAttribute("pakets", pakets);
		model.addAttribute("pegawais", pegawais);
		model.addAttribute("kamars", kamars);
		model.addAttribute("kelases", kelases);
		model.addAttribute("ruangs", ruangs);
		model.addAttribute("footerjs", "../pendaftaran/inc/footerjs.jsp");
		model.addAttribute("PendaftaranModel", PendaftaranModel);

		return "pendaftaran/tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("pendaftaranModel") MPendaftaran pendaftaranModel) {
		Date currentTime = new Date(System.currentTimeMillis());

		pendaftaranModel.setPendaftaranAktif("Y");
		pendaftaranModel.setPendaftaranCreatedBy("Admin");
		pendaftaranModel.setPendaftaranCreatedDate(currentTime);

		pendaftaranService.store(pendaftaranModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Date currentTime = new Date(System.currentTimeMillis());

		MPendaftaran pendaftaranModel = pendaftaranService.getPendaftaran(id);

		pendaftaranModel.setPendaftaranAktif("T");
		pendaftaranModel.setPendaftaranDeletedDate(currentTime);

		pendaftaranService.delete(pendaftaranModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		MPendaftaran result = pendaftaranService.getPendaftaran(id);

		Map<String, String> jenispendaftaran = new HashMap<String, String>();
		jenispendaftaran.put("O", "Operatif");
		jenispendaftaran.put("N", "Non Operatif");

		model.addAttribute("jenispendaftaran", jenispendaftaran);

		model.addAttribute("pendaftaranModel", result);

		return "PendaftaranUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("pendaftaranModel") MPendaftaran pendaftaranModel) {
		Date currentTime = new Date(System.currentTimeMillis());

		pendaftaranModel.setPendaftaranAktif("Y");
		pendaftaranModel.setPendaftaranUpdatedBy("Admin");
		pendaftaranModel.setPendaftaranUpdatedDate(currentTime);

		pendaftaranService.update(pendaftaranModel);

		return this.uri;
	}
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
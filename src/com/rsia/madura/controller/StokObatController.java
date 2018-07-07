package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MStokObat;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.StokObatService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/stok-obat")
public class StokObatController {
	@Autowired
	private StokObatService stokObatService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String stokObatList(Model model) {
		List<MStokObat> result = stokObatService.getStokObats();
		
		model.addAttribute("result", result);
		
		return "/stok-obat/index";
	}
	
	@RequestMapping(value="/form-add")
	public String StokObatFormAddView(Model model){
		MStokObat stokObatModel = new MStokObat();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		
		
		model.addAttribute("stokObatModel", stokObatModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		
		return "/stok-obat/tambah";
	}
	
	@RequestMapping(value="/store")
	public String StokObatStore(@ModelAttribute("stokObatModel") MStokObat stokObatModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		stokObatModel.setStokObatAktif('Y');
		stokObatModel.setStokObatCreatedBy("Admin");
		stokObatModel.setStokObatCreatedDate(currentTime);
	
		
		stokObatService.stokObatStore(stokObatModel);
		
		return "redirect:/stokObat";
	}
	
	
}

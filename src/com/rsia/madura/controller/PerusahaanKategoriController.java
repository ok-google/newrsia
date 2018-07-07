package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.MPerusahaanKategori;
import com.rsia.madura.service.PerusahaanKategoriService;

@Controller
@RequestMapping("/perusahaanKategori")
public class PerusahaanKategoriController {
	@Autowired
	private PerusahaanKategoriService perusahaanKategoriService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String PerusahaanKategoriListView(Model model, @RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		List<MPerusahaanKategori> resultPerusahaanKategori = perusahaanKategoriService.getPerusahaans(page, limit);
		String link = perusahaanKategoriService.createLinks(page, limit);
		
		model.addAttribute("result", resultPerusahaanKategori);
		model.addAttribute("link", link);
		
		return "/perusahaanKategori/index";
	}
	
	@RequestMapping(value="/form-add")
	public String PerusahaanKategoriFormAdd(Model model){
		MPerusahaanKategori perusahaanKategoriModel = new MPerusahaanKategori();
		
		model.addAttribute("perusahaanKategoriModel", perusahaanKategoriModel);
		
		return "/perusahaanKategori/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String PerusahaanKategoriStore(@ModelAttribute("perusahaanKategoriModel") MPerusahaanKategori perusahaanKategoriModel ) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		perusahaanKategoriModel.setPerusahaanAktif('Y');
		perusahaanKategoriModel.setPerusahaanKategoriCreatedBy("Rizki");
		perusahaanKategoriModel.setPerusahaanKategoriCreatedDate(currentTime);
		
		perusahaanKategoriService.store(perusahaanKategoriModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/perusahaanKategori/list/?page=1&limit=10";
	}
	
	@RequestMapping(value="/form-update", method=RequestMethod.GET)
	public String PerusahaanKategoriFormUpdate(Model model, @RequestParam("perusahaanKategoriId") int perusahaanKategoriId) {
		MPerusahaanKategori result = perusahaanKategoriService.getPerusahaan(perusahaanKategoriId);
		
		model.addAttribute("perusahaanKategoriModel", result);
		
		return "/perusahaanKategori/update";
	}
	
	@RequestMapping(value="/update")
	public String PerusahaanKategoriUpdate(@ModelAttribute("perusahaanKategoriModel") MPerusahaanKategori perusahaanKategoriModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		perusahaanKategoriModel.setPerusahaanKategoriRevised(perusahaanKategoriModel.getPerusahaanKategoriRevised()+1);
		perusahaanKategoriModel.setPerusahaanKategoriUpdatedBy("Admin");
		perusahaanKategoriModel.setPerusahaanKategoriUpdatedDate(currentTime);
		
		perusahaanKategoriService.update(perusahaanKategoriModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/perusahaanKategori/list/?page=1&limit=10";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String PerusahaanKategoriDelete(@RequestParam("perusahaanKategoriId") int perusahaanKategoriId) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MPerusahaanKategori perusahaanKategoriModel = perusahaanKategoriService.getPerusahaan(perusahaanKategoriId);
		perusahaanKategoriModel.setPerusahaanAktif('T');
		perusahaanKategoriModel.setPerusahaanKategoriDeletedDate(currentTime);
		
		perusahaanKategoriService.delete(perusahaanKategoriModel);
		
		return "redirect:http://localhost:8080/com.rsia.modura/perusahaanKategori/list/?page=1&limit=10";
	}

}

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

import com.rsia.madura.entity.MPerusahaan;
import com.rsia.madura.service.PerusahaanService;

@Controller
@RequestMapping("/perusahaan")
public class PerusahaanController {
	@Autowired
	private PerusahaanService perusahaanService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String PerusahaanListView(Model model, @RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		List<MPerusahaan> resultPerusahaan = perusahaanService.getPerusahaans(page, limit);
		String link = perusahaanService.createLinks(page, limit);
		
		model.addAttribute("result", resultPerusahaan);
		model.addAttribute("link", link);
		
		return "perusahaan/index";
	}
	
	@RequestMapping(value="/form-add")
	public String PerusahaanFormAdd(Model model){
		MPerusahaan perusahaanModel = new MPerusahaan();
		
		model.addAttribute("perusahaanModel", perusahaanModel);
		
		return "/perusahaan/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String PerusahaanStore(@ModelAttribute("perusahaanModel") MPerusahaan perusahaanModel ) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		perusahaanModel.setPerusahaanAktif('Y');
		perusahaanModel.setPerusahaatCreatedBy("Rizki");
		perusahaanModel.setPerusahaanCreatedDate(currentTime);
		
		perusahaanService.store(perusahaanModel);
		
		return "redirect:/perusahaan/list/?page=1&limit=10";
	}
	
	@RequestMapping(value="/form-update")
	public String PerusahaanFormUpdate(Model model, @RequestParam("perusahaanId") int perusahaanId) {
		MPerusahaan result = perusahaanService.getPerusahaan(perusahaanId);
		
		model.addAttribute("perusahaanModel", result);
		
		return "perusahaan/update";
	}
	
	@RequestMapping(value="/update")
	public String PerusahaanUpdate(@ModelAttribute("perusahaanModel") MPerusahaan perusahaanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		perusahaanModel.setPerusahaatUpdatedBy("Admin");
		perusahaanModel.setPerusahaanUpdatedDate(currentTime);
		perusahaanModel.setPerusahaanRevised(perusahaanModel.getPerusahaanRevised()+1);
		
		perusahaanService.update(perusahaanModel);
		
		return "redirect:/perusahaan/list/?page=1&limit=10";
	}
	
	@RequestMapping(value="/delete")
	public String PerusahaanDelete(@RequestParam("perusahaanId") int perusahaanId) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MPerusahaan perusahaanModel = perusahaanService.getPerusahaan(perusahaanId);
		perusahaanModel.setPerusahaanAktif('T');
		perusahaanModel.setPerusahaanDeletedDate(currentTime);
		
		perusahaanService.delete(perusahaanModel);
		
		return "redirect:/perusahaan/list/?page=1&limit=10";
	}
}

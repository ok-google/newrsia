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
import org.springframework.web.bind.annotation.PathVariable;


import com.rsia.madura.entity.MGaji;
import com.rsia.madura.service.GajiService;

@Controller
@RequestMapping("/gaji")
public class GajiController{
	@Autowired
	private GajiService GajiService;

	private String uri = "redirect: /gaji";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
			@RequestParam(value="page", required=false, defaultValue = "1") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit){
		List<MGaji> result = GajiService.getGajis(page, limit);
		String link = GajiService.createLinks(page, limit);
		MGaji gajiModel = new MGaji();

		model.addAttribute("gaji", result);
		model.addAttribute("link", link);
		model.addAttribute("gajiModel", gajiModel);
	return "gaji/index";	
	}
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String GajiFormView(Model model){
		List<MGaji> result = GajiService.getGajis();
		// String link = gajiService.createLinks(page, limit);
		MGaji gajiModel = new MGaji();
		
		model.addAttribute("gaji", result);
		// model.addAttribute("link", link);
		model.addAttribute("gajiModel", gajiModel);
		
		return "gaji/tambah";
	}
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String gajiStore(@ModelAttribute("gajiModel") MGaji gajiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		gajiModel.setGajiAktif('Y');
		gajiModel.setGajiCreatedBy("Rizki");
		gajiModel.setGajiCreatedDate(currentTime);
		
		GajiService.store(gajiModel);
		
		return "redirect: /gaji";
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String GajiUpdateFormView(Model model, @PathVariable int id){
		MGaji result = GajiService.getGaji(id);
		
		model.addAttribute("gajiModel", result);
		
		return "gaji/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String gajiUpdate(@ModelAttribute("gajiModel") MGaji gajiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		gajiModel.setGajiUpdatedBy("Rizki");
		gajiModel.setGajiUpdatedDate(currentTime);
		
		GajiService.update(gajiModel);
		
		return "redirect: /gaji";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String gajiDelete(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MGaji gajiModel = GajiService.getGaji(id);
		
		// gajiModel.setGajiAktif("T");
		gajiModel.setGajiDeletedDate(currentTime);
		
		GajiService.delete(gajiModel);
		
		return "redirect: /gaji";
	}
}

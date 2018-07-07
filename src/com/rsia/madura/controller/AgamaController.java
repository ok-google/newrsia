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

import com.rsia.madura.entity.MAgama;
import com.rsia.madura.service.AgamaService;

@Controller
@RequestMapping("/agama")
public class AgamaController {
	@Autowired
	private AgamaService agamaService;
	
	private String uri ="redirect: /agama/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView() {
		return this.uri;
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model, 
			@RequestParam(value="page", required=false, defaultValue = "0") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit){
		
		List<MAgama> result = agamaService.getAgamas();
		String link = agamaService.createLinks(page, limit);
		MAgama agamaModel = new MAgama();
		
		model.addAttribute("agama", result);
		model.addAttribute("link", link);
		model.addAttribute("agamaModel", agamaModel);
		
		return "agama/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("agamaModel") MAgama agamaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		agamaModel.setAgamaAktif("Y");
		agamaModel.setAgamaCreatedBy("Admin");	
		agamaModel.setAgamaCreatedDate(currentTime);
		
		agamaService.store(agamaModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MAgama agamaModel = agamaService.getAgama(id);
		
		agamaModel.setAgamaAktif("T");
		agamaModel.setAgamaDeletedDate(currentTime);
		
		agamaService.delete(agamaModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		
		MAgama result = agamaService.getAgama(id);
		
		model.addAttribute("agamaModel", result);
		
		return "agama/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("agamaModel") MAgama agamaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		agamaModel.setAgamaAktif("Y");
		agamaModel.setAgamaUpdatedBy("Admin");
		agamaModel.setAgamaUpdatedDate(currentTime);;
		
		agamaService.update(agamaModel);
		
		return this.uri;
	}
}

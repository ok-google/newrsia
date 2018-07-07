/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:32 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:56:20
 */
package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import java.sql.Timestamp;

import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.service.ProvinsiService;


@Controller
@RequestMapping("/provinsi")
public class ProvinsiController {
	
	@Autowired
	private ProvinsiService provinsiService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String Index(){
		return "redirect: /provinsi/tambah";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String ProvinsiFormView(Model model, 
			@RequestParam(value="page", required=false, defaultValue = "1") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit){
		List<MProvinsi> result = provinsiService.getProvinsis(page, limit);
		String link = provinsiService.createLinks(page, limit);
		MProvinsi provinsiModel = new MProvinsi();
		
		model.addAttribute("provinsi", result);
		model.addAttribute("link", link);
		model.addAttribute("provinsiModel", provinsiModel);
		
		return "provinsi/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String provinsiStore(@ModelAttribute("provinsiModel") MProvinsi provinsiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		provinsiModel.setPropinsiAktif("Y");
		provinsiModel.setPropinsiCreatedBy("Rizki");
		provinsiModel.setPropinsiCreatedDate(currentTime);
		
		provinsiService.store(provinsiModel);
		
		return "redirect: /provinsi/tambah";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String ProvinsiUpdateFormView(Model model, @PathVariable int id){
		MProvinsi result = provinsiService.getProvinsi(id);
		
		model.addAttribute("provinsiModel", result);
		
		return "provinsi/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String provinsiUpdate(@ModelAttribute("provinsiModel") MProvinsi provinsiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		provinsiModel.setPropinsiUpdatedBy("Rizki");
		provinsiModel.setPropinsiUpdatedDate(currentTime);
		
		provinsiService.update(provinsiModel);
		
		return "redirect: /provinsi/tambah";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String provinsiUpdate(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MProvinsi provinsiModel = provinsiService.getProvinsi(id);
		
		provinsiModel.setPropinsiAktif("T");
		provinsiModel.setPropinsideletedDate(currentTime);
		
		provinsiService.delete(provinsiModel);
		
		return "redirect: /provinsi/tambah";
	}

}

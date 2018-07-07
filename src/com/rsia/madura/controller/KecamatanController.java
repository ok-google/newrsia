/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:44:38 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:56:00
 */
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

import com.rsia.madura.entity.MKecamatan;
import com.rsia.madura.entity.MKota;
import com.rsia.madura.service.KecamatanService;
import com.rsia.madura.service.KotaService;

@Controller
@RequestMapping("/kecamatan")
public class KecamatanController {
	@Autowired
	private KecamatanService kecamatanService;
	@Autowired
	private KotaService kotaService;
	
	public String Index(){
		return "redirect: /kecamatan/tambah";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String KecamatanFormView(Model model, @RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		List<MKecamatan> resultKecamatan = kecamatanService.getKecamatans(page, limit);
		List<MKota> resultKota = kotaService.getKotas();
		String link = kecamatanService.createLinks(page, limit);
		MKecamatan kecamatanModel = new MKecamatan();
		
		model.addAttribute("kecamatan", resultKecamatan);
		model.addAttribute("kota", resultKota);
		model.addAttribute("link", link);
		model.addAttribute("kecamatanModel", kecamatanModel);
		
		return "kecamatan/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String kecamatanStore(@ModelAttribute("kecamatanModel") MKecamatan kecamatanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kecamatanModel.setKecamatanAktif("Y");
		kecamatanModel.setKecamatanCreatedBy("Rizki");
		kecamatanModel.setKecamatanCreatedDate(currentTime);
		
		kecamatanService.store(kecamatanModel);
		
		return "redirect: /kecamatan/tambah";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String kecamatanUpdateFormView(Model model, @PathVariable int id){
		MKecamatan result = kecamatanService.getKecamatan(id);
		List<MKota> resultKota = kotaService.getKotas();
		
		model.addAttribute("kecamatanModel", result);
		model.addAttribute("kota", resultKota);
		
		return "kecamatan/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String kecamatanUpdate(@ModelAttribute("kecamatanModel") MKecamatan kecamatanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kecamatanModel.setKecamatanUpdatedBy("Rizki");
		kecamatanModel.setKecamatanUpdatedDate(currentTime);
		
		kecamatanService.update(kecamatanModel);
		
		return "redirect: /kecamatan/tambah";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String kecamatanDelete(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MKecamatan kecamatanModel = kecamatanService.getKecamatan(id);
		kecamatanModel.setKecamatanAktif("T");
		kecamatanModel.setKecamatanDeletedDate(currentTime);
		
		kecamatanService.delete(kecamatanModel);
		
		return "redirect: /kecamatan/tambah";
	}
}

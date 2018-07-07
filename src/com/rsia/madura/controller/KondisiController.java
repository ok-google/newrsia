/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:46:31 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-30 15:04:31
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

import com.rsia.madura.entity.MKondisi;
import com.rsia.madura.service.KondisiPasienService;

import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.service.ProvinsiService;

@Controller
@RequestMapping("/kondisi")
public class KondisiController {
	private String uri ="redirect: /kondisi" ;
	
	@Autowired
	private KondisiPasienService kondisiService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String KondisiFormView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		
		List<MKondisi> result = kondisiService.getKondisis(page, limit);
		String link = kondisiService.createLinks(page, limit);
		MKondisi kondisiModel = new MKondisi();
		
		model.addAttribute("kondisi", result);
		model.addAttribute("link", link);
		model.addAttribute("kondisiModel", kondisiModel);
		
		return "kondisi/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("kondisiModel") MKondisi kondisiModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kondisiModel.setKondisiAktif("Y");
		kondisiModel.setKondisiCreatedBy("Admin");	
		kondisiModel.setKondisiCreatedDate(currentTime);
		
		kondisiService.store(kondisiModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MKondisi kondisiModel = kondisiService.getKondisi(id);
		
		kondisiModel.setKondisiAktif("T");
		kondisiModel.setKondisiDeletedDate(currentTime);
		
		kondisiService.delete(kondisiModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		
		MKondisi result = kondisiService.getKondisi(id);
		
		model.addAttribute("kondisiModel", result);
		
		return "kondisi/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("kondisiModel") MKondisi kondisiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kondisiModel.setKondisiAktif("Y");
		kondisiModel.setKondisiCreatedBy("Admin");
		kondisiModel.setKondisiUpdatedDate(currentTime);;
		
		kondisiService.update(kondisiModel);
		
		return this.uri;
	}
	
	
}

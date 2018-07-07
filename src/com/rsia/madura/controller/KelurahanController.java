/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:46:36 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:56:14
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

import com.rsia.madura.entity.MKelurahan;
import com.rsia.madura.service.KelurahanService;
import com.rsia.madura.entity.MKecamatan;
import com.rsia.madura.service.KecamatanService;


@Controller
@RequestMapping("/kelurahan")
public class KelurahanController {
	
	@Autowired
	private KelurahanService kelurahanService;
	@Autowired
	private KecamatanService kecamatanService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String Index(){
		return "redirect: /kelurahan/tambah";
	}
	
	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String KelurahanFormView(Model model, @RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		List<MKelurahan> resultKelurahan = kelurahanService.getKelurahans(page, limit);
		List<MKecamatan> resultKecamatan = kecamatanService.getKecamatans();
		String link = kelurahanService.createLinks(page, limit);
		MKelurahan kelurahanModel = new MKelurahan();
		
		model.addAttribute("kelurahan", resultKelurahan);
		model.addAttribute("kecamatan", resultKecamatan);
		model.addAttribute("link", link);
		model.addAttribute("kelurahanModel", kelurahanModel);
		return "kelurahan/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String kelurahanStore(@ModelAttribute("kelurahanModel") MKelurahan kelurahanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kelurahanModel.setKelurahanAktif("Y");
		kelurahanModel.setKelurahanCreatedBy("Rizki");
		kelurahanModel.setKelurahanCreatedDate(currentTime);
		
		kelurahanService.store(kelurahanModel);
		
		return "redirect: /kelurahan/tambah";
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String kelurahanUpdateFormView(Model model, @PathVariable int id){
		MKelurahan result = kelurahanService.getKelurahan(id);
		List<MKecamatan> resultKecamatan = kecamatanService.getKecamatans();
		
		model.addAttribute("kelurahanModel", result);
		model.addAttribute("kecamatan", resultKecamatan);
		
		return "kelurahan/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String kelurahanUpdate(@ModelAttribute("kelurahanModel") MKelurahan kelurahanModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		kelurahanModel.setKelurahanUpdatedBy("Rizki");
		kelurahanModel.setKelurahanUpdatedDate(currentTime);
		
		kelurahanService.update(kelurahanModel);
		
		return "redirect: /kelurahan/tambah";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String kelurahanDelete(Model model, @PathVariable int id) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MKelurahan kelurahanModel = kelurahanService.getKelurahan(id);
		kelurahanModel.setKelurahanAktif("T");
		kelurahanModel.setKelurahanDeletedDate(currentTime);
		
		kelurahanService.delete(kelurahanModel);
		
		return "redirect: /kelurahan/tambah";
	}
}

/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:43:41 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:56:07
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

import com.rsia.madura.entity.MJabatan;
import com.rsia.madura.service.JabatanService;

@Controller
@RequestMapping("/jabatan")
public class JabatanController {
	@Autowired
	private JabatanService jabatanService;

	private String uri = "redirect: /jabatan/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		return this.uri;
	}

	@RequestMapping(value="/tambah")
	public String JabatanFormAddView(Model model) {
		List<MJabatan> resultJabatan = jabatanService.getJabatans();
		MJabatan jabatanModel = new MJabatan();
		
		model.addAttribute("jabatan", resultJabatan);
		model.addAttribute("jabatanModel", jabatanModel);
		
		return "jabatan/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String JabatanStore(@ModelAttribute("jabatanModel") MJabatan jabatanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		jabatanModel.setJabatanAktif('Y');
		jabatanModel.setJabatanCreatedBy("Admin");
		jabatanModel.setJabatanCreatedDate(currentTime);
		
		jabatanService.store(jabatanModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String JabatanFormUpdateView(Model model, @PathVariable int id) {
		MJabatan result = jabatanService.getJabatan(id);
		
		model.addAttribute("jabatanModel", result);
		
		return "jabatan/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String JabatanUpdate(@ModelAttribute("jabatanModel") MJabatan jabatanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		jabatanModel.setJabatanUpdatedBy("Admin");
		jabatanModel.setJabatanUpdatedDate(currentTime);
		
		jabatanService.update(jabatanModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String JabatanDelete(Model model, @PathVariable int id) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		MJabatan jabatanModel = jabatanService.getJabatan(id);
		
		jabatanModel.setJabatanAktif('T');
		jabatanModel.setJabatanDeletedDate(currentTime);
		
		jabatanService.delete(jabatanModel);
		
		return this.uri;
	}

}

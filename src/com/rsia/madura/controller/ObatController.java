/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 01:12:53
*/
package com.rsia.madura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;

import com.rsia.madura.entity.MObat;
import com.rsia.madura.service.ObatService;

@Controller
@RequestMapping("/obat")
public class ObatController {
	@Autowired
	private ObatService obatService;

	private String uri ="redirect: /obat";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MObat> obats = obatService.findAll();
		model.addAttribute("obats", obats);
		model.addAttribute("footerjs", "");
		return "obat/index";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MObat> obats = obatService.findAll();
		MObat obatModel = new MObat();
		
		model.addAttribute("obats", obats);
		model.addAttribute("obatModel", obatModel);
		return "obat/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("obatModel") MObat obatModel, BindingResult bindingResult) {
		obatService.store(obatModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		MObat obatModel = obatService.getById(id);
		List<MObat> obats = obatService.findAll();
		model.addAttribute("obats", obats);
		model.addAttribute("obatModel", obatModel);

		return "obat/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("obatModel") MObat obatModel) {
		obatService.update(obatModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MObat obat = obatService.getById(id);
		obatService.delete(obat);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Obat");
    }
}
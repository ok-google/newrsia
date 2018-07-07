/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:21:35
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
import org.springframework.validation.BindingResult;

import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MRuang;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.RuangService;

@Controller
@RequestMapping("/ruangan")
public class RuangController {
	@Autowired
	private RuangService ruangService;

	@Autowired
	private KelasService kelasService;

	private String uri ="redirect: /ruangan";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model,  
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit) {

		List<MRuang> ruangs = ruangService.findAll(page, limit);
		String links = ruangService.createLinks(page, limit);

		model.addAttribute("link", links);
		model.addAttribute("ruangs", ruangs);
		model.addAttribute("footerjs", "");
		return "ruangan/index";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MKelas> kelases = kelasService.findAll();
		List<MRuang> ruangs = ruangService.findAll();
		MRuang ruangModel = new MRuang();

		model.addAttribute("ruangs", ruangs);
		model.addAttribute("kelases", kelases);
		model.addAttribute("ruangModel", ruangModel);
		return "ruangan/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("ruangModel") MRuang ruangModel, BindingResult bindingResult) {
		ruangService.store(ruangModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MKelas> kelases = kelasService.findAll();
		List<MRuang> ruangs = ruangService.findAll();
		MRuang ruangModel = ruangService.getById(id);

		model.addAttribute("ruangs", ruangs);
		model.addAttribute("kelases", kelases);
		model.addAttribute("ruangModel", ruangModel);

		return "ruangan/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("ruangModel") MRuang ruangModel) {
		ruangService.update(ruangModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MRuang ruang = ruangService.getById(id);
		ruangService.delete(ruang);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Ruang");
    }
}
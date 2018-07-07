/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 16:33:57
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

import com.rsia.madura.entity.MPenunjang;
import com.rsia.madura.entity.MPenunjangGroup;
import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MJenisLayanan;
import com.rsia.madura.service.PenunjangService;
import com.rsia.madura.service.PenunjangGroupService;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.JenisLayananService;


@Controller
@RequestMapping("/penunjang")
public class PenunjangController {
	@Autowired
	private PenunjangService penunjangService;

	@Autowired
	private PenunjangGroupService penunjangGroupService;

	@Autowired
	private KelasService kelasService;

	@Autowired
	private JenisLayananService jenisLayananService;

	private String uri ="redirect: /penunjang";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
			@RequestParam(value="page", required=false, defaultValue = "0") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit) {

		List<MPenunjang> penunjangs = penunjangService.findAll(page, limit);
		String link = penunjangService.createLinks(page, limit);
		MPenunjang penunjangModel = new MPenunjang();

		model.addAttribute("penunjangs", penunjangs);
		model.addAttribute("link", link);
		model.addAttribute("penunjangModel", penunjangModel);
		return "penunjang/index";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MPenunjangGroup> penunjangGroups = penunjangGroupService.findAll();
		List<MKelas> kelases = kelasService.findAll();
		List<MJenisLayanan> jenisLayanans = jenisLayananService.findAll();
		MPenunjang penunjangModel = new MPenunjang();

		model.addAttribute("penunjangGroups", penunjangGroups);
		model.addAttribute("penunjangModel", penunjangModel);
		model.addAttribute("kelases", kelases);
		model.addAttribute("jenisLayanans", jenisLayanans);
		model.addAttribute("footerjs", "../penunjang/inc/footerjs.jsp");
		return "penunjang/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("penunjangModel") MPenunjang penunjangModel, BindingResult bindingResult) {
		penunjangService.store(penunjangModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MPenunjangGroup> penunjangGroups = penunjangGroupService.findAll();
		List<MKelas> kelases = kelasService.findAll();
		List<MJenisLayanan> jenisLayanans = jenisLayananService.findAll();
		MPenunjang penunjangModel = penunjangService.getById(id);

		model.addAttribute("penunjangGroups", penunjangGroups);
		model.addAttribute("penunjangModel", penunjangModel);
		model.addAttribute("jenisLayanans", jenisLayanans);
		model.addAttribute("footerjs", "../penunjang/inc/footerjs.jsp");
		model.addAttribute("kelases", kelases);

		return "penunjang/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("penunjangModel") MPenunjang penunjangModel) {
		penunjangService.update(penunjangModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MPenunjang penunjang = penunjangService.getById(id);
		penunjangService.delete(penunjang);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Penunjang");
    }
}
/*
* @Author: PRADESGA
* @Date:   2018-04-07 07:50:20
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 07:21:11
*/
package com.rsia.madura.controller;
import java.util.List; // Class to hold a list of objects
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

import org.springframework.util.MultiValueMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.rsia.madura.entity.MPaket;
import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MKamar;
import com.rsia.madura.entity.MTindakan;
import com.rsia.madura.entity.MObat;
import com.rsia.madura.entity.MPenunjang;

import com.rsia.madura.service.PaketService;
import com.rsia.madura.service.KelasService;
import com.rsia.madura.service.KamarService;
import com.rsia.madura.service.ObatService;
import com.rsia.madura.service.TindakanService;
import com.rsia.madura.service.PenunjangService;

@Controller
@RequestMapping("/paket")
public class PaketController {
	@Autowired
	private PaketService paketService;

	@Autowired
	private KelasService kelasService;

	@Autowired
	private KamarService kamarService;

	@Autowired
	private TindakanService tindakanService;

	@Autowired
	private ObatService obatService;

	@Autowired
	private PenunjangService penunjangService;

	private String uri ="redirect: /paket";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model,
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit) {
		List<MPaket> paketan = paketService.findAll(page, limit);
		String links = paketService.createLinks(page, limit);

		model.addAttribute("links", links);
		model.addAttribute("paketan", paketan);
		model.addAttribute("footerjs", "");
		return "paket/index";
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MKelas> kelases = kelasService.findAll();
		List<MKamar> kamars = kamarService.findAll();
		List<MObat> obats = obatService.findAll();
		List<MTindakan> tindakans = tindakanService.findAll();
		List<MPenunjang> penunjangs = penunjangService.findAll();

		MPaket paketModel = new MPaket();

		Map<String, String> satuan = new HashMap<String, String>();
		satuan.put("1", "MM");
		satuan.put("2", "CM");		
		
		model.addAttribute("kelases", kelases);
		model.addAttribute("kamars", kamars);
		model.addAttribute("tindakans", tindakans);
		model.addAttribute("obats", obats);
		model.addAttribute("penunjangs", penunjangs);
		model.addAttribute("satuan", satuan);
		
		model.addAttribute("paketModel", paketModel);
		model.addAttribute("footerjs", "../paket/inc/footerjs.jsp");
		return "paket/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("paketModel") MPaket paketModel) {	
		paketService.store(paketModel);
		return this.uri;
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("paketModel") MPaket paketModel) {
		paketService.update(paketModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MKelas> kelases = kelasService.findAll();
		List<MTindakan> tindakans = tindakanService.findAll();
		List<MKamar> kamars = kamarService.findAll();
		List<MObat> obats = obatService.findAll();
		List<MPenunjang> penunjangs = penunjangService.findAll();
		MPaket paketModel = paketService.getById(id);

		Map<String, String> satuan = new HashMap<String, String>();
		satuan.put("1", "MM");
		satuan.put("2", "CM");	
		
		model.addAttribute("kelases", kelases);
		model.addAttribute("kamars", kamars);
		model.addAttribute("tindakans", tindakans);
		model.addAttribute("obats", obats);
		model.addAttribute("satuan", satuan);
		model.addAttribute("penunjangs", penunjangs);
		model.addAttribute("paketModel", paketModel);
		model.addAttribute("footerjs", "../paket/inc/footerjs.jsp");

		return "paket/update";
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MPaket paketModel = paketService.getById(id);
		paketService.delete(paketModel);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Paket");
    }
}
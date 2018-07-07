/*
* @Author: PRADESGA
* @Date:   2018-04-07 04:10:39
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 01:57:26
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

import com.rsia.madura.entity.MJenisLayanan;
import com.rsia.madura.service.JenisLayananService;

@Controller
@RequestMapping("/jenis-layanan")
public class JenisLayananController {
	@Autowired
	private JenisLayananService jenislayananService;

	private String uri ="redirect: /jenis-layanan/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		return this.uri;
	}

	@RequestMapping(value="/tambah", method=RequestMethod.GET)
	public String FormView(Model model) {
		List<MJenisLayanan> jenislayanans = jenislayananService.findAll();
		MJenisLayanan jenislayananModel = new MJenisLayanan();

		model.addAttribute("jenislayanans", jenislayanans);
		model.addAttribute("jenislayananModel", jenislayananModel);
		return "jenisLayanan/tambah";
	}

	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String Store(@ModelAttribute("jenislayananModel") MJenisLayanan jenislayananModel) {
		jenislayananService.store(jenislayananModel);
		return this.uri;
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id){
		List<MJenisLayanan> jenislayanans = jenislayananService.findAll();
		MJenisLayanan jenislayananModel = jenislayananService.getJenisLayanan(id);

		model.addAttribute("jenislayanans", jenislayanans);
		model.addAttribute("jenislayananModel", jenislayananModel);

		return "jenisLayanan/update";
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String Update(@ModelAttribute("jenislayananModel") MJenisLayanan jenislayananModel) {
		jenislayananService.update(jenislayananModel);
		return this.uri;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {
		MJenisLayanan jenislayanan = jenislayananService.getJenisLayanan(id);
		jenislayananService.delete(jenislayanan);
		return this.uri;
	}

	@ModelAttribute
    public void addAttributes(Model model) {
    	model.addAttribute("pagetitle", "Master Jenis Layanan");
    }
}
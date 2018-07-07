package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MKamar;
import com.rsia.madura.entity.MKelas;
import com.rsia.madura.entity.MRuang;

import com.rsia.madura.service.KamarService;
import com.rsia.madura.service.RuangService;
import com.rsia.madura.service.KelasService;

@Controller
@RequestMapping("/kamar")
public class KamarController {
	@Autowired
	private KamarService kamarService;

	@Autowired
	private RuangService ruangService;

	@Autowired
	private KelasService kelasService;

	private String uri ="redirect: /kamar";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit) {
		
		List<MKamar> kamars = kamarService.findAll(page, limit);
		String links = kamarService.createLinks(page, limit);

		model.addAttribute("link", links);
		model.addAttribute("kamars", kamars);
		model.addAttribute("footerjs", "");
		return "kamar/index";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		MKamar kamarModel = new MKamar();
		List<MRuang> ruang = ruangService.findAll();
		List<MKelas> kelas = kelasService.findAll();

		Map<String, String> pelayanan = new HashMap<String, String>();
		pelayanan.put("RI", "Rawat Inap");
		pelayanan.put("RJ", "Rawat Jalan");

		model.addAttribute("ruang", ruang);
		model.addAttribute("kelas", kelas);
		model.addAttribute("pelayanan", pelayanan);
		model.addAttribute("kamarModel", kamarModel);

		return "kamar/tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("kamarModel") MKamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		kamarModel.setKamarAktif("Y");
		kamarModel.setKamarCreatedBy("Admin");
		kamarModel.setKamarCreatedDate(currentTime);

		kamarService.store(kamarModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MKamar kamarModel = kamarService.getKamar(id);

		kamarModel.setKamarAktif("T");
		kamarModel.setKamarDeletedDate(currentTime);

		kamarService.delete(kamarModel);

		return this.uri;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id) {

		MKamar result = kamarService.getKamar(id);

		List<MRuang> ruang = ruangService.findAll();
		List<MKelas> kelas = kelasService.findAll();

		Map<String, String> pelayanan = new HashMap<String, String>();
		pelayanan.put("RI", "Rawat Inap");
		pelayanan.put("RJ", "Rawat Jalan");

		model.addAttribute("ruang", ruang);
		model.addAttribute("kelas", kelas);
		model.addAttribute("pelayanan", pelayanan);

		model.addAttribute("kamarModel", result);

		return "kamar/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("kamarModel") MKamar kamarModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		kamarModel.setKamarAktif("Y");
		kamarModel.setKamarUpdatedBy("Admin");
		kamarModel.setKamarUpdatedDate(currentTime);

		kamarService.update(kamarModel);

		return this.uri;
	}

}

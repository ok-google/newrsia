/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:23 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-28 14:26:11
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

import com.rsia.madura.entity.MRujukan;
import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.entity.MKota;
import com.rsia.madura.entity.MKecamatan;

import com.rsia.madura.service.RujukanService;
import com.rsia.madura.service.ProvinsiService;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.KecamatanService;

@Controller
@RequestMapping("/rujukan")
public class RujukanController {
	@Autowired
	private RujukanService rujukanService;
	@Autowired
	private ProvinsiService ProvinsiService;
	@Autowired
	private KotaService KotaService;
	@Autowired
	private KecamatanService KecamatanService;

	private String uri = "redirect: /rujukan/";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		List<MRujukan> rujukans = rujukanService.getRujukans(page,limit);
		String links = rujukanService.createLinks(page, limit);
		
		model.addAttribute("link", links);
		model.addAttribute("rujukans", rujukans);

		return "rujukan/index";
	}

	@RequestMapping("/tambah")
	public String addForm(Model model) {
		MRujukan rujukanModel = new MRujukan();
		List<MProvinsi> provinsi = ProvinsiService.getProvinsis();
		List<MKota> kota = KotaService.getKotas();
		List<MKecamatan> kecamatan = KecamatanService.getKecamatans();

		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("rujukanModel", rujukanModel);

		return "rujukan/tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("rujukanModel") MRujukan rujukanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		rujukanModel.setRujukanAktif("Y");
		rujukanModel.setRujukanCreatedBy("Admin");
		rujukanModel.setRujukanCreatedDate(currentTime);

		rujukanService.store(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id) {

		MRujukan result = rujukanService.getRujukan(id);
		List<MProvinsi> provinsi = ProvinsiService.getProvinsis();
		List<MKota> kota = KotaService.getKotas();
		List<MKecamatan> kecamatan = KecamatanService.getKecamatans();

		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("rujukanModel", result);

		return "rujukan/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("rujukanModel") MRujukan rujukanModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		rujukanModel.setRujukanAktif("Y");
		rujukanModel.setRujukanUpdatedBy("Admin");
		rujukanModel.setRujukanUpdatedDate(currentTime);
		;

		rujukanService.update(rujukanModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MRujukan rujukanModel = rujukanService.getRujukan(id);

		rujukanModel.setRujukanAktif("T");
		rujukanModel.setRujukanDeletedDate(currentTime);

		rujukanService.delete(rujukanModel);

		return this.uri;
	}

}

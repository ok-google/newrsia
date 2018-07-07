/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:52:41 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-24 12:40:57
 */
package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

import com.rsia.madura.entity.MPasien;
import com.rsia.madura.entity.MPendidikan;
import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.entity.MKota;
import com.rsia.madura.entity.MKecamatan;
import com.rsia.madura.entity.MKelurahan;
import com.rsia.madura.entity.MAgama;

import com.rsia.madura.service.PasienService;
import com.rsia.madura.service.PendidikanService;
import com.rsia.madura.service.ProvinsiService;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.KecamatanService;
import com.rsia.madura.service.KelurahanService;
import com.rsia.madura.service.AgamaService;

@Controller
@RequestMapping("/pasien")
public class PasienController {
	@Autowired
	private PasienService PasienService;
	@Autowired
	private ProvinsiService ProvinsiService;
	@Autowired
	private KotaService KotaService;
	@Autowired
	private KecamatanService KecamatanService;
	@Autowired
	private KelurahanService KelurahanService;
	@Autowired
	private AgamaService AgamaService;
	@Autowired
	private PendidikanService PendidikanService;

	private String uri = "redirect: /pasien";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit) {
		List<MPasien> pasiens = PasienService.findAll(page, limit);
		String links = PasienService.createLinks(page, limit);

		model.addAttribute("link", links);
		model.addAttribute("pasiens", pasiens);

		return "pasien/index";
	
	}

	@RequestMapping(value = "/tambah", method = RequestMethod.GET)
	public String AddForm(Model model) {

		MPasien pasienModel = new MPasien();
		List<MPasien> pasien = PasienService.findAll();
		List<MProvinsi> provinsi = ProvinsiService.getProvinsis();
		List<MKota> kota = KotaService.getKotas();
		List<MKecamatan> kecamatan = KecamatanService.getKecamatans();
		List<MKelurahan> kelurahan = KelurahanService.getKelurahans();
		List<MPendidikan> pendidikan = PendidikanService.getPendidikan();

		Map<String, String> jeniskelamin = new HashMap<String, String>();
		jeniskelamin.put("L", "Laki-Laki");
		jeniskelamin.put("P", "Perempuan");

		Map<String, String> goldar = new HashMap<String, String>();
		goldar.put("A", "A");
		goldar.put("AB", "AB");

		Map<String, String> agama = new HashMap<String, String>();
		agama.put("1", "Islam");
		agama.put("2", "Non Islam");

		model.addAttribute("Pasien", pasien);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);
		model.addAttribute("Agama", agama);
		model.addAttribute("Pendidikan", pendidikan);
		model.addAttribute("pasienModel", pasienModel);
		
		return "pasien/tambah";
	} 
	
	@RequestMapping(value = "/tambahold", method = RequestMethod.GET)
	public String AddFormOld(Model model) {

		MPasien pasienModel = new MPasien();
		List<MPasien> pasien = PasienService.findAll();
		List<MProvinsi> provinsi = ProvinsiService.getProvinsis();
		List<MKota> kota = KotaService.getKotas();
		List<MKecamatan> kecamatan = KecamatanService.getKecamatans();
		List<MKelurahan> kelurahan = KelurahanService.getKelurahans();
		List<MPendidikan> pendidikan = PendidikanService.getPendidikan();

		Map<String, String> jeniskelamin = new HashMap<String, String>();
		jeniskelamin.put("L", "Laki-Laki");
		jeniskelamin.put("P", "Perempuan");

		Map<String, String> goldar = new HashMap<String, String>();
		goldar.put("A", "A");
		goldar.put("AB", "AB");

		Map<String, String> agama = new HashMap<String, String>();
		agama.put("1", "Islam");
		agama.put("2", "Non Islam");

		model.addAttribute("Pasien", pasien);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);
		model.addAttribute("Agama", agama);
		model.addAttribute("Pendidikan", pendidikan);
		model.addAttribute("pasienModel", pasienModel);
		
		 // return "vMpasienTambah";
		 return "vMpasienTambahOld";
		// return "vPendaftaran";
	} 
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("pasienModel") MPasien pasienModel) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pasienModel.setPasienAktif("Y");
		pasienModel.setPasienCreatedBy("Admin");
		pasienModel.setPasienCreatedDate(currentTime);
		pasienModel.setStatusID(1);

		pasienModel.setPasienTanggallahir(currentTime);

		PasienService.store(pasienModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MPasien pasienModel = PasienService.getById(id);

		pasienModel.setPasienAktif("T");
		pasienModel.setPasienDeletedDate(currentTime);

		PasienService.delete(pasienModel);

		return this.uri;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id) {
		List<MProvinsi> provinsi = ProvinsiService.getProvinsis();
		List<MKota> kota = KotaService.getKotas();
		List<MKecamatan> kecamatan = KecamatanService.getKecamatans();
		List<MKelurahan> kelurahan = KelurahanService.getKelurahans();
		List<MPendidikan> pendidikan = PendidikanService.getPendidikan();

		Map<String, String> jeniskelamin = new HashMap<String, String>();
		jeniskelamin.put("L", "Laki-Laki");
		jeniskelamin.put("P", "Perempuan");

		Map<String, String> goldar = new HashMap<String, String>();
		goldar.put("A", "A");
		goldar.put("AB", "AB");

		Map<String, String> agama = new HashMap<String, String>();
		agama.put("1", "Islam");
		agama.put("2", "Non Islam");

		model.addAttribute("provinsi", provinsi);
		model.addAttribute("Kota", kota);
		model.addAttribute("Kecamatan", kecamatan);
		model.addAttribute("Kelurahan", kelurahan);
		model.addAttribute("Jeniskelamin", jeniskelamin);
		model.addAttribute("Goldar", goldar);
		model.addAttribute("Agama", agama);
		model.addAttribute("Pendidikan", pendidikan);

		MPasien result = PasienService.getById(id);
		model.addAttribute("pasienModel", result);

		return "pasien/update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("pasienModel") MPasien pasienModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pasienModel.setPasienAktif("Y");
		pasienModel.setPasienUpdatedBy("Admin");
		pasienModel.setPasienUpdatedDate(currentTime);
		pasienModel.setStatusID(1);

		pasienModel.setPasienTanggallahir(currentTime);

		PasienService.update(pasienModel);
		return this.uri;
	}

	@RequestMapping("/todaftar")
	public String toDaftar(Model model) {
		return "vDaftar";
	}

	@RequestMapping("/todaftarrj")
	public String toDaftarRj(Model model) {
		return "vDaftarRj";
	}

	@RequestMapping("/todaftarrjtambah")
	public String toDaftarRjtambah(Model model) {
		return "vDaftarRjTambah";
	}
}

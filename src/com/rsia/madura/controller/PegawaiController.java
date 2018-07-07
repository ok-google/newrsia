/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:52:41 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-14 17:52:41 
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

import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.entity.MPendidikan;
import com.rsia.madura.entity.MJabatan;
import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.entity.MKota;
import com.rsia.madura.entity.MKecamatan;
import com.rsia.madura.entity.MKelurahan;
import com.rsia.madura.entity.MAgama;

import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.service.JabatanService;
import com.rsia.madura.service.PendidikanService;
import com.rsia.madura.service.ProvinsiService;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.KecamatanService;
import com.rsia.madura.service.KelurahanService;
import com.rsia.madura.service.AgamaService;

@Controller
@RequestMapping("/pegawai")
public class PegawaiController {
	@Autowired
	private PegawaiService PegawaiService;
	@Autowired
	private JabatanService JabatanService;
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

	private String uri = "redirect: /pegawai";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
		List<MPegawai> pegawais = PegawaiService.getPegawai();

		model.addAttribute("pegawais", pegawais);

		return "pegawai/index";
	
	}

	@RequestMapping(value = "/tambah", method = RequestMethod.GET)
	public String AddForm(Model model) {

		MPegawai pegawaiModel = new MPegawai();
		List<MPegawai> pegawai = PegawaiService.getPegawai();
		List<MJabatan> jabatan = JabatanService.getJabatans();
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

		model.addAttribute("pegawai", pegawai);
		model.addAttribute("jabatan", jabatan);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("kota", kota);
		model.addAttribute("kecamatan", kecamatan);
		model.addAttribute("kelurahan", kelurahan);
		model.addAttribute("jeniskelamin", jeniskelamin);
		model.addAttribute("goldar", goldar);
		model.addAttribute("agama", agama);
		model.addAttribute("pendidikan", pendidikan);
		model.addAttribute("pegawaiModel", pegawaiModel);
		
		return "pegawai/tambah";
	}
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("pegawaiModel") MPegawai pegawaiModel) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pegawaiModel.setPegawaiAktif("Y");
		pegawaiModel.setPegawaiCreatedBy("Admin");
		pegawaiModel.setPegawaiCreatedDate(currentTime);

		PegawaiService.store(pegawaiModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @PathVariable int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MPegawai pegawaiModel = PegawaiService.getPegawai(id);

		pegawaiModel.setPegawaiAktif("T");
		pegawaiModel.setPegawaiDeletedDate(currentTime);

		PegawaiService.delete(pegawaiModel);

		return this.uri;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @PathVariable int id) {
		List<MJabatan> jabatan = JabatanService.getJabatans();
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

		model.addAttribute("jabatan", jabatan);
		model.addAttribute("provinsi", provinsi);
		model.addAttribute("kota", kota);
		model.addAttribute("kecamatan", kecamatan);
		model.addAttribute("kelurahan", kelurahan);
		model.addAttribute("jeniskelamin", jeniskelamin);
		model.addAttribute("goldar", goldar);
		model.addAttribute("agama", agama);
		model.addAttribute("pendidikan", pendidikan);

		MPegawai result = PegawaiService.getPegawai(id);
		model.addAttribute("pegawaiModel", result);

		return "pegawai/update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("pegawaiModel") MPegawai pegawaiModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		pegawaiModel.setPegawaiAktif("Y");
		pegawaiModel.setPegawaiUpdatedBy("Admin");
		pegawaiModel.setPegawaiUpdatedDate(currentTime);

		PegawaiService.update(pegawaiModel);
		return this.uri;
	}

}

package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MJenisBarang;
import com.rsia.madura.entity.MSatuan;

import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.JenisBarangService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/barang")
public class BarangController {
	@Autowired
	private BarangService barangService;

	@Autowired
	private JenisBarangService jenisBarangService;

	@Autowired
	private SatuanService satuanService;

	private String uri = "redirect:/barang";
	
	@RequestMapping(method=RequestMethod.GET)
	public String BarangFormView(Model model, 
			@RequestParam(value="page", required=false, defaultValue="1") int page, 
			@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		
		List<MBarang> result = barangService.getBarangs(page, limit);
		String link = barangService.createLinks(page, limit);
		
		model.addAttribute("result", result);
		model.addAttribute("link", link);
		
		System.out.println(result);
		return "/barang/index";
	}
	
	@RequestMapping(value="/form-add")
	public String BarangFormView(Model model){
		MBarang barangModel = new MBarang();
		List<MJenisBarang> jenisBarangResult = jenisBarangService.getJenisBarangs();
		List<MSatuan> satuanResult = satuanService.getSatuans();
		
		model.addAttribute("barangModel", barangModel);
		model.addAttribute("jenisBarang", jenisBarangResult);
		model.addAttribute("satuan", satuanResult);
		
		return "/barang/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String barangStore(@ModelAttribute("barangModel") MBarang barangModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		System.out.println(barangModel);

		barangModel.setBarangAktif("Y");
		barangModel.setBarangCreatedDate(currentTime);
		barangModel.setBarangCreatedBy("Admin");
		
		barangService.store(barangModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/form-update")
	public String BarangFormUpdateView(Model model, @RequestParam("IdBarang") int barangId){
		MBarang barangModel = barangService.getBarang(barangId);
		
		model.addAttribute("barangModel", barangModel);
		
		return "/barang/update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String barangUpdate(@ModelAttribute("barangModel") MBarang barangModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		barangModel.setBarangUpdatedDate(currentTime);
		barangModel.setBarangUpdatedBy("Admin");
		
		barangService.update(barangModel);
		
		return this.uri;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String barangDelete(@RequestParam("IdBarang") int barangId) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		MBarang barangModel = barangService.getBarang(barangId);
		
		barangModel.setBarangAktif("T");
		barangModel.setBarangDeletedDate(currentTime);
		
		barangService.delete(barangModel);
		
		return "/barang/list/?page=1&limit=10";
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}

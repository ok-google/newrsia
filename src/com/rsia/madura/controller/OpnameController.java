package com.rsia.madura.controller;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.PathVariable;

import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MOpname;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.service.OpnameService;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/opname")
public class OpnameController {
	@Autowired
	private OpnameService opnameService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;

	private String uri = "redirect:/opname";
	
	@RequestMapping(method=RequestMethod.GET)
	public String OpnameListView(Model model){
		List<MOpname> result = opnameService.getOpnames();
		
		model.addAttribute("reesult", result);
		
		return "/opname/index";
	}
	
	@RequestMapping(value="/form-add")
	public String OpnameFormAddView(Model model){
		MOpname opnameModel = new MOpname();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		
		model.addAttribute("opnameModel", opnameModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);

		model.addAttribute("footerjs", "../opname/inc/footerjs.jsp");
		
		return "opname/tambah";
	}
	
	@RequestMapping(value="/store")
	public String OpnameStore(@ModelAttribute("opnameModel") MOpname opnameModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		opnameModel.setOpnameStatus("Aktif");
		opnameModel.setOpnameTanggal(currentTime);
		opnameModel.setOpnameAktif('Y');
		opnameModel.setOpnameCreatedBy("Admin");
		opnameModel.setOpnameCreatedDate(currentTime);
		
		opnameService.store(opnameModel);
		
		return "redirect:/opname";
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }	
}

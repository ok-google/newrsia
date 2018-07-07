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
import com.rsia.madura.entity.MReturJual;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.ReturJualService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/retur-jual")
public class ReturJualController {
	@Autowired
	private ReturJualService returJualService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;

	private String uri = "redirect:/returJual";
	
	@RequestMapping(method=RequestMethod.GET)
	public String returJualList(Model model) {
		List<MReturJual> result = returJualService.getReturJuals();
		
		model.addAttribute("result", result);
		
		return "/returJual/index";
	}
	
	@RequestMapping(value="/tambah")
	public String ReturJualFormAddView(Model model){
		MReturJual returJualModel = new MReturJual();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		
		
		model.addAttribute("returJualModel", returJualModel);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("footerjs", "../returJual/inc/footerjs.jsp");

		
		return "/returJual/tambah";
	}
	
	@RequestMapping(value="/store")
	public String ReturJualStore(@ModelAttribute("returJualModel") MReturJual returJualModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		returJualModel.setReturJualAktif('Y');
		returJualModel.setReturJualCreatedBy("Admin");
		returJualModel.setReturJualBayarStatus('Y');
		returJualModel.setReturJualStatus('Y');
		returJualModel.setReturJualCreatedDate(currentTime);

		
	
		
		returJualService.store(returJualModel);
		
		return "redirect:/returJual";
	}

	 @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
	
	
}

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

import com.rsia.madura.entity.MTerima;
import com.rsia.madura.entity.MJenisBarang;
import com.rsia.madura.entity.MOrder;

import com.rsia.madura.service.OrderService;
import com.rsia.madura.service.JenisBarangService;
import com.rsia.madura.service.TerimaService;
@Controller
@RequestMapping("/terima")
public class TerimaController {
	
	@Autowired
	private TerimaService terimaService;

	@Autowired
	private OrderService orderService;

	@Autowired
	private JenisBarangService barangJenisService;

	private String uri = "redirect: /terima";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model, 
				@RequestParam(value="page", required=false, defaultValue = "1") int page, 
				@RequestParam(value="limit", required=false, defaultValue = "10") int limit) {
		List<MTerima> result = terimaService.getTerimas();
		String link = terimaService.createLinks(page, limit);

		return "terima/index";
	}
	
	@RequestMapping(value="/form-add")
	public String formAdd(Model model) {
		MTerima terimaModel = new MTerima();
		List<MOrder> resultOrder = orderService.getOrders();
		List<MJenisBarang> resultBarangJenis = barangJenisService.getJenisBarangs();
		
		model.addAttribute("terimaModel", terimaModel);
		model.addAttribute("order", resultOrder);
		model.addAttribute("barangJenis", resultBarangJenis);
		model.addAttribute("footerjs", "../terima/inc/footerjs.jsp");
		
		return "terima/tambah";
	}

	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public String Store(@ModelAttribute("terimaModel") MTerima terimaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		System.out.println(terimaModel);		

		terimaModel.setTerimaAktif('Y');

		terimaModel.setTerimaCreatedBy("Admin");
		terimaModel.setTerimaPPN('Y');
//		terimaModel.setTerimaBarangJenisId(0);
		terimaModel.setTerimaCreatedDate(currentTime);

		terimaService.store(terimaModel);

		return this.uri;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MTerima terimaModel = terimaService.getTerima(id);

		terimaModel.setTerimaAktif('T');
		terimaModel.setTerimaDeletedDate(currentTime);

		terimaService.delete(terimaModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		MTerima result = terimaService.getTerima(id);

		model.addAttribute("terimaModel", result);

		return "TerimaUpdateForm";
	}


	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("terimaModel") MTerima terimaModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		terimaModel.setTerimaAktif('Y');
		terimaModel.setTerimaUpdatedBy("Admin");
		terimaModel.setTerimaUpdatedDate(currentTime);

		terimaService.update(terimaModel);

		return this.uri;
	}
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }





	
}

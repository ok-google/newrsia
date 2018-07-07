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

import com.rsia.madura.entity.MBarangTrans;
import com.rsia.madura.service.BarangTransService;

@Controller
@RequestMapping("/barangtrans")
public class BarangTransController{
	@Autowired
	private BarangTransService BarangTransService;

	private String uri = "redirect: /barangtrans";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
	return "barangTrans/index";	
}
}

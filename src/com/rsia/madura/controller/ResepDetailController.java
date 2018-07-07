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

import com.rsia.madura.entity.MResepDetail;
import com.rsia.madura.service.ResepDetailService;

@Controller
@RequestMapping("/resepdetail")
public class ResepDetailController{
	@Autowired
	private ResepDetailService ResepDetailService;

	private String uri = "redirect: /resepdetail";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView(Model model) {
	return "resepDetail/index";	
}
}

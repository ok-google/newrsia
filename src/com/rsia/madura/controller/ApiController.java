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
import org.springframework.web.bind.annotation.ResponseBody;

import com.rsia.madura.entity.MAgama;
import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.entity.MPenunjang;

import com.rsia.madura.service.AgamaService;
import com.rsia.madura.service.PelayananService;
import com.rsia.madura.service.PenunjangService;;

@Controller
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private AgamaService agamaService;
	@Autowired
	private PelayananService pelayananService;
	@Autowired
	private PenunjangService penunjangService;
	
	private String uri ="redirect: /agama/tambah";

	@RequestMapping(method=RequestMethod.GET)
	public String IndexView() {
		return this.uri;
	}

	@RequestMapping("data/{id}")
	@ResponseBody
	public MPendaftaran getById(@PathVariable int id) {
		return pelayananService.getPelayanan(id);
	}

	@RequestMapping("penunjang/{id}")
	@ResponseBody
	public MPenunjang penunjang(@PathVariable int id) {
		return penunjangService.getById(id);
	}
	

}

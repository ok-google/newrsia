// /*
// * @Author: PRADESGA
// * @Date:   2018-04-07 07:50:20
// * @Last Modified by:   Pradesga Indonesia
// * @Last Modified time: 2018-05-26 16:21:59
// */
// package com.rsia.madura.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.PathVariable;

// @Controller
// @RequestMapping("/pendaftaran")
// public class DaftarController {
// 	@RequestMapping(method=RequestMethod.GET)
// 	public String IndexView(Model model) {
// 		return "daftar/index";
// 	}

// 	@ModelAttribute
//     public void addAttributes(Model model) {
//     	model.addAttribute("pagetitle", "Pendaftaran Pasien");
//     }
// }
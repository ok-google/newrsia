/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:47:46 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:55:53
 */
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

import com.rsia.madura.entity.MKota;
import com.rsia.madura.entity.MProvinsi;
import com.rsia.madura.service.KotaService;
import com.rsia.madura.service.ProvinsiService;

@Controller
@RequestMapping("/kota")
public class KotaController {
		
		@Autowired
		private KotaService kotaService;
		@Autowired
		private ProvinsiService provinsiService;
		
		@RequestMapping(method=RequestMethod.GET)
		public String Index(){
			return "redirect: /kota/tambah";
		}

		@RequestMapping(value="/tambah", method=RequestMethod.GET)
		public String KotaFormView(Model model, @RequestParam(value="page", required=false, defaultValue="1") int page, 
				@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		
			List<MKota> resultKota = kotaService.getKotas(page, limit);
			List<MProvinsi> resultProvinsi = provinsiService.getProvinsis();
			String links = kotaService.createLinks(page, limit);
			MKota kotaModel = new MKota();
			
			model.addAttribute("kota", resultKota);
			model.addAttribute("provinsi", resultProvinsi);
			model.addAttribute("link", links);
			model.addAttribute("kotaModel", kotaModel);

			return "kota/tambah";
		}
		
		@RequestMapping(value="/store", method=RequestMethod.POST)
		public String kotaStore(@ModelAttribute("kotaModel") MKota kotaModel) {
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			
			kotaModel.setkotaAktif("Y");
			kotaModel.setkotaCreatedBy("Rizki");
			kotaModel.setkotaCreatedDate(currentTime);
			
			kotaService.store(kotaModel);
			
			return "redirect: /kota/tambah";
		}
		
		@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
		public String kotaUpdateFormView(Model model, @PathVariable int id){
			MKota result = kotaService.getKota(id);
			List<MProvinsi> resultProvinsi = provinsiService.getProvinsis();
			
			model.addAttribute("kotaModel", result);
			model.addAttribute("provinsi", resultProvinsi);
			
			return "kota/update";
		}
		
		@RequestMapping(value="/update", method=RequestMethod.POST)
		public String kotaUpdate(@ModelAttribute("kotaModel") MKota kotaModel) {
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			
			kotaModel.setkotaUpdatedBy("Rizki");
			kotaModel.setkotaUpdatedDate(currentTime);
			
			kotaService.update(kotaModel);
			
			return "redirect: /kota/tambah";
		}
		
		@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
		public String kotaDelete(Model model, @PathVariable int id) {
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			
			MKota kotaModel = kotaService.getKota(id);
			kotaModel.setkotaAktif("T");
			kotaModel.setkotadeletedDate(currentTime);
			
			kotaService.delete(kotaModel);
			
			return "redirect: /kota/tambah";
		}
}

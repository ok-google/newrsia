/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:50:32 
 * @Last Modified by: Pradesga
 * @Last Modified time: 2018-04-15 13:56:20
 */
package com.rsia.madura.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;

import com.rsia.madura.entity.MTransaksiPasien;
import com.rsia.madura.entity.MTransaksiBayar;
import com.rsia.madura.entity.MPendaftaran;
import com.rsia.madura.service.TransaksiPasienService;
import com.rsia.madura.service.PendaftaranService;


@Controller
@RequestMapping("/kasir")
public class KasirController {
	
	@Autowired
	private TransaksiPasienService transaksiService;

	@Autowired
	private PendaftaranService pendaftaranService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String Index(Model model, 
			@RequestParam(value="page", required=false, defaultValue = "1") int page, 
			@RequestParam(value="limit", required=false, defaultValue = "10") int limit){
		
		List<MTransaksiPasien> transaksies = transaksiService.findAll();
		model.addAttribute("transaksies", transaksies);
		return "kasir/index";
	}

	@RequestMapping(value="/pembayaran", method=RequestMethod.GET)
	public String TransaksiPasienFormView(Model model, @RequestParam(value="pendaftaran", required=false) Integer daftarID){

		MTransaksiPasien transaksiModel = new MTransaksiPasien();
		MPendaftaran daftar = pendaftaranService.getPendaftaran(daftarID);
		MTransaksiPasien transaksiDaftarID = transaksiService.findBy("pendaftaran_pendaftaran_id", daftarID.toString());
		Integer sudahBayar = 0;
		Long rentangHari = 0L;

		if (transaksiDaftarID != null) {
			for (MTransaksiBayar bayar : transaksiDaftarID.getBayar()) {
				sudahBayar += bayar.getTransaksiBayarNominal();
			};
		}

		if (daftar.getPendaftaranMrs()!=null && daftar.getPendaftaranKrs()!=null) {
			rentangHari = this.betweenDates(daftar.getPendaftaranMrs(), daftar.getPendaftaranKrs());
		}
		
		model.addAttribute("daftar", daftar);
		model.addAttribute("transaksiModel", transaksiModel);
		model.addAttribute("transaksiDaftarID", transaksiDaftarID);
		model.addAttribute("daftarID", daftarID);
		model.addAttribute("sudahBayar", sudahBayar);
		model.addAttribute("rentangHari", rentangHari);
		model.addAttribute("footerjs", "../kasir/inc/footerjs.jsp");
		
		return "kasir/tambah";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String transaksiStore(@ModelAttribute("transaksiModel") MTransaksiPasien transaksiModel,
		@RequestParam(value="cetak", required=false, defaultValue="") String cetak ) {
		
		int transaksiID;

		if (transaksiModel.getTransaksiID() == null) {
			transaksiID = transaksiService.store(transaksiModel);
		} else {
			transaksiService.update(transaksiModel);
			transaksiID = transaksiModel.getTransaksiID();
		}

		if (cetak.equals("kuitansi")) {
			return "redirect: /kasir/cetak-kuitansi/"+ transaksiID;		
		} else if (cetak.equals("tagihan")) {
			return "redirect: /kasir/cetak-tagihan/"+ transaksiID;
		} else {
			return "redirect: /kasir?pendaftaran="+ transaksiModel.getPendaftaran().getPendaftaranID();
		}

	}

	@RequestMapping(value="/cetak-tagihan/{id}", method=RequestMethod.GET)
	public String CetakTagihan(Model model, @PathVariable int id) {

		MTransaksiPasien transaksiModel = transaksiService.getTransaksiPasien(id);
		
		model.addAttribute("transaksiModel", transaksiModel);
		model.addAttribute("footerjs", "../kasir/inc/footerjs.jsp");
		
		return "kasir/tagihan";
	}

	@RequestMapping(value="/cetak-kuitansi/{id}", method=RequestMethod.GET)
	public String CetakKuitansi(Model model, @PathVariable int id) {

		MTransaksiPasien transaksiModel = transaksiService.getTransaksiPasien(id);
		
		model.addAttribute("transaksiModel", transaksiModel);
		model.addAttribute("footerjs", "../kasir/inc/footerjs.jsp");
		
		return "kasir/kuitansi";
	}

	public static Long betweenDates(Date firstDate, Date secondDate) {
			return ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant());
	}
	
}

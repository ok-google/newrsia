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

import com.rsia.madura.entity.MPegawai;
import com.rsia.madura.entity.MBarang;
import com.rsia.madura.entity.MJenisBarang;
import com.rsia.madura.entity.MPerusahaan;
import com.rsia.madura.entity.MSatuan;
import com.rsia.madura.entity.MOrder;
import com.rsia.madura.entity.MOrderDetail;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.JenisBarangService;
import com.rsia.madura.service.OrderService;
import com.rsia.madura.service.PegawaiService;
import com.rsia.madura.service.PerusahaanService;
import com.rsia.madura.service.SatuanService;
import com.rsia.madura.service.OrderDetailService;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private JenisBarangService jBService;
	@Autowired
	private PerusahaanService perusahaanService;
	@Autowired
	private PegawaiService pegawaiService;
	@Autowired
	private BarangService barangService;
	@Autowired
	private SatuanService satuanService;
	
	private String uri = "redirect:/order";

	@RequestMapping(method=RequestMethod.GET)
	public String OrderListView(Model model,
								@RequestParam(value="page", required=false, defaultValue="1") int page, 
								@RequestParam(value="limit", required=false, defaultValue="10") int limit){
		
		List<MOrder> result = orderService.getOrders();
		
		model.addAttribute("order", result);
		
		return "/order/index";
	}
	
	@RequestMapping(value="/form-add")
	public String OrderFormAddView(Model model){
		MOrder orderModel = new MOrder();
		List<MPerusahaan> resultPerusahaan = perusahaanService.getPerusahaans();
		List<MJenisBarang> resultJenisBarang = jBService.getJenisBarangs();
		List<MBarang> resultBarang = barangService.getBarangs();
		List<MPegawai> resultPegawai = pegawaiService.getPegawai();
		List<MSatuan> resultSatuan = satuanService.getSatuans();
		
		model.addAttribute("orderModel", orderModel);
		model.addAttribute("perusahaan", resultPerusahaan);
		model.addAttribute("jenisBarang", resultJenisBarang);
		model.addAttribute("pegawai", resultPegawai);
		model.addAttribute("satuan", resultSatuan);
		model.addAttribute("barang", resultBarang);
		model.addAttribute("footerjs", "../order/inc/footerjs.jsp");
		
		return "order/tambah";
	}
	
	@RequestMapping(value="/store")
	public String OrderStore(@ModelAttribute("orderModel") MOrder orderModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		orderModel.setOrderAktif('Y');
		orderModel.setOrderCreatedBy("Admin");
		orderModel.setOrderCreatedDate(currentTime);

		orderService.store(orderModel);
		
		return "redirect:/order/list";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String DeleteUpdate(Model model, @RequestParam(value = "Id", required = false) int id) {

		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		MOrder orderModel = orderService.getOrder(id);

		orderModel.setOrderAktif('T');
		orderModel.setOrderDeletedDate(currentTime);

		orderService.delete(orderModel);

		return this.uri;
	}

	@RequestMapping(value = "/form-update", method = RequestMethod.GET)
	public String UpdateFormView(Model model, @RequestParam(value = "Id", required = false) int id) {

		MOrder result = orderService.getOrder(id);



		model.addAttribute("orderModel", result);

		return "order/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(@ModelAttribute("orderModel") MOrder orderModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());

		orderModel.setOrderAktif('Y');
		orderModel.setOrderUpdatedBy("Admin");
		orderModel.setOrderUpdatedDate(currentTime);

		orderService.update(orderModel);

		return this.uri;
	}
   
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }	





}

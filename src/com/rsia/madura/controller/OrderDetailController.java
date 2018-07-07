package com.rsia.madura.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsia.madura.entity.MOrderDetail;
import com.rsia.madura.service.OrderDetailService;

@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {
	@Autowired
	private OrderDetailService orderDetailService;

	
	@RequestMapping(value="/store")
	public String OrderDetailStore(@ModelAttribute("orderDetailModel") MOrderDetail orderDetailModel, Model model) throws Exception {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		
		orderDetailModel.setOrderDetailOrderId(1);
		orderDetailModel.setOrderDetailBarangId(1);
		orderDetailModel.setOrderDetailSatuanId(1);
		orderDetailModel.setOrderDetailCreatedBy("Admin");
		orderDetailModel.setOrderDetailUpdatedBy("Admin");
		orderDetailModel.setOrderDetailPpn("Y");
		orderDetailModel.setOrderDetailCreatedDate(currentTime);
		orderDetailModel.setOrderDetailUpdatedDate(currentTime);
		orderDetailModel.setOrderDetailDeletedDate(currentTime);
		System.out.println(orderDetailModel);
		
		orderDetailService.store(orderDetailModel);
		
		return "redirect:../order/form-add";
	}

}

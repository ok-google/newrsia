package com.rsia.madura.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OrderDAO;
import com.rsia.madura.entity.MOrder;

@Service
public class OrderServiceAction implements OrderService {
	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	@Transactional
	public List<MOrder> getOrders() {
		
		return orderDAO.getOrders();
	}

	@Override
	@Transactional
	public List<MOrder> getOrders(int page, int limit) {
		
		return orderDAO.getOrders(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {
		
		return orderDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MOrder getOrder(int orderId) {
		
		return orderDAO.getOrder(orderId);
	}

	@Override
	@Transactional
	public int store(MOrder orderModel) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		if(orderModel.getDetail() != null) {
			orderModel.getDetail().forEach((detail) ->{
				detail.setOrder(orderModel);
				detail.setOrderDetailCreatedBy("Admin");
				detail.setOrderDetailCreatedDate(currentTime);
			});
		}
		
		return orderDAO.orderStore(orderModel);
	}

	@Override
	@Transactional
	public int update(MOrder orderModel) {

		return orderDAO.orderUpdate(orderModel);
	}

	@Override
	@Transactional
	public int delete(MOrder orderModel) {
	
		return orderDAO.orderDelete(orderModel);
	}

}

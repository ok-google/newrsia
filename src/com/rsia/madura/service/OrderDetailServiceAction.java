package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.OrderDetailDAO;
import com.rsia.madura.entity.MOrderDetail;

@Service
public class OrderDetailServiceAction implements OrderDetailService {
	@Autowired
	private OrderDetailDAO orderDetailDAO;
	
	@Override
	@Transactional
	public List<MOrderDetail> getOrderDetails() {

		return orderDetailDAO.getOrderDetails();
	}

	@Override
	@Transactional
	public List<MOrderDetail> getOrderDetails(int page, int limit) {
		
		return orderDetailDAO.getOrderDetails(page, limit);
	}

	@Override
	public String createLinks(int page, int limit) {

		return orderDetailDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public MOrderDetail getOrderDetail(int orderDetailId) {
		
		return orderDetailDAO.getOrderDetail(orderDetailId);
	}

	@Override
	@Transactional
	public int store(MOrderDetail orderDetailModel) {

		return orderDetailDAO.orderDetailStore(orderDetailModel);
	}

	@Override
	@Transactional
	public int update(MOrderDetail orderDetailModel) {

		return orderDetailDAO.orderDetailUpdate(orderDetailModel);
	}

	@Override
	@Transactional
	public int delete(MOrderDetail orderDetailModel) {

		return orderDetailDAO.orderDetailDelete(orderDetailModel);
	}

	@Override
	@Transactional
	public List<MOrderDetail> where(String column, String value) {
		
		return orderDetailDAO.where(column, value);
	}

	@Override
	@Transactional
	public int updateOrderId(int orderId) {
		
		return orderDetailDAO.updateOrderId(orderId);
	}

}

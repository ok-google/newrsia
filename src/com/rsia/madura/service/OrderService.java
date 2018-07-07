package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MOrder;

public interface OrderService {
	public List<MOrder> getOrders();
	public List<MOrder> getOrders(int page, int limit);
	public String createLinks(int page, int limit);
	public MOrder getOrder(int orderId);
	
	public int store(MOrder orderModel);
	public int update(MOrder orderModel);
	public int delete(MOrder orderModel);
}

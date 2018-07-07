package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MOrder;

public interface OrderDAO {
	public List<MOrder> getOrders();
	public List<MOrder> getOrders(int page, int limit);
	public String createLinks(int page, int limit);
	public MOrder getOrder(int orderId);
	
	public int orderStore(MOrder orderModel);
	public int orderUpdate(MOrder orderModel);
	public int orderDelete(MOrder orderModel);
}

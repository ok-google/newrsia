package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MOrderDetail;

public interface OrderDetailDAO {
	public List<MOrderDetail> getOrderDetails();
	public List<MOrderDetail> getOrderDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MOrderDetail getOrderDetail(int orderDetailId);
	public List<MOrderDetail> where(String column, String value);
	public int updateOrderId(int orderId);
	
	public int orderDetailStore(MOrderDetail orderDetailModel);
	public int orderDetailUpdate(MOrderDetail orderDetailModel);
	public int orderDetailDelete(MOrderDetail orderDetailModel);
}

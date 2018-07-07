package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MReturJualDetail;

public interface ReturJualDetailService {
	public List<MReturJualDetail> getReturJualDetails();
	public List<MReturJualDetail> getReturJualDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturJualDetail getReturJualDetail(int ReturJualDetailId);
	
	public int store(MReturJualDetail ReturJualDetailModel);
	public int update(MReturJualDetail ReturJualDetailModel);
	public int delete(MReturJualDetail ReturJualDetailModel);
}

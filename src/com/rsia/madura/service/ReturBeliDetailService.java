package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MReturBeliDetail;

public interface ReturBeliDetailService {
	public List<MReturBeliDetail> getReturBeliDetails();
	public List<MReturBeliDetail> getReturBeliDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturBeliDetail getReturBeliDetail(int ReturBeliDetailId);
	public List<MReturBeliDetail> where(String column, String value);
	
	public int store(MReturBeliDetail ReturBeliDetailModel);
	public int update(MReturBeliDetail ReturBeliDetailModel);
	public int delete(MReturBeliDetail ReturBeliDetailModel);
}	

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MTerimaDetail;

public interface TerimaDetailService {
	public List<MTerimaDetail> getTerimaDetails();
	public List<MTerimaDetail> getTerimaDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MTerimaDetail getTerimaDetail(int terimaDetailId);
	
	public int store(MTerimaDetail terimaDetailModel);
	public int update(MTerimaDetail terimaDetailModel);
	public int delete(MTerimaDetail terimaDetailModel);
}

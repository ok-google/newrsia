package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MResepDetail;

public interface ResepDetailService {
	public List<MResepDetail> getResepDetails();
	public List<MResepDetail> getResepDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MResepDetail getResepDetail(int resepDetailId);
	
	public int store(MResepDetail resepDetailModel);
	public int update(MResepDetail resepDetailModel);
	public int delete(MResepDetail resepDetailModel);
}

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MOpnameDetail;

public interface OpnameDetailService {
	public List<MOpnameDetail> getOpnameDetails();
	public List<MOpnameDetail> getOpnameDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MOpnameDetail getOpnameDetail(int opnameDetailId);
	
	public int store(MOpnameDetail opnameDetailModel);
	public int update(MOpnameDetail opnameDetailModel);
	public int delete(MOpnameDetail opnameDetailModel);
}

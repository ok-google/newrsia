package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MReturBeliDetail;

public interface ReturBeliDetailDAO {
	public List<MReturBeliDetail> getReturBeliDetails();
	public List<MReturBeliDetail> getReturBeliDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturBeliDetail getReturBeliDetail(int ReturBeliDetailId);
	public List<MReturBeliDetail> where(String column, String value);
	
	public int ReturBeliDetailStore(MReturBeliDetail ReturBeliDetailModel);
	public int ReturBeliDetailUpdate(MReturBeliDetail ReturBeliDetailModel);
	public int ReturBeliDetailDelete(MReturBeliDetail ReturBeliDetailModel);
}

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MTerimaDetail;

public interface TerimaDetailDAO {
	public List<MTerimaDetail> getTerimaDetails();
	public List<MTerimaDetail> getTerimaDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MTerimaDetail getTerimaDetail(int terimaDetailId);
	
	public int terimaDetailStore(MTerimaDetail terimaDetailModel);
	public int terimaDetailUpdate(MTerimaDetail terimaDetailModel);
	public int terimaDetailDelete(MTerimaDetail terimaDetailModel);
}

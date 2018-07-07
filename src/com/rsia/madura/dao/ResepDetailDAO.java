package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MResepDetail;

public interface ResepDetailDAO {
	public List<MResepDetail> getResepDetails();
	public List<MResepDetail> getResepDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MResepDetail getResepDetail(int resepDetailId);
	
	public int resepDetailStore(MResepDetail resepDetailModel);
	public int resepDetailUpdate(MResepDetail resepDetailModel);
	public int resepDetailDelete(MResepDetail resepDetailModel);
}

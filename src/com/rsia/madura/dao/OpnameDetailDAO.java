package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MOpnameDetail;

public interface OpnameDetailDAO {
	public List<MOpnameDetail> getOpnameDetails();
	public List<MOpnameDetail> getOpnameDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MOpnameDetail getOpnameDetail(int opnameDetailId);
	
	public int opnameDetailStore(MOpnameDetail opnameDetailModel);
	public int opnameDetailUpdate(MOpnameDetail opnameDetailModel);
	public int opnameDetailDelete(MOpnameDetail opnameDetailModel);
}

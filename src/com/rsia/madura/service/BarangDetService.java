package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarangDetail;

public interface BarangDetService {

	public List<MBarangDetail> getBarangDetails();
	public List<MBarangDetail> getBarangDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarangDetail getBarangDetail(int bardet_id);
	
	public int bardetStore(MBarangDetail bardetModel);
	public int bardetUpdate(MBarangDetail bardetModel);
	public int bardetDelete(MBarangDetail bardetModel);
	
}

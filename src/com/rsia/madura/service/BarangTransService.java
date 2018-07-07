package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarangTrans;

public interface BarangTransService {
	public List<MBarangTrans> getBarangTranss();
	public List<MBarangTrans> getBarangTranss(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarangTrans getBarangTrans(int barangTransId);
	
	public int store(MBarangTrans barangTransModel);
	public int update(MBarangTrans barangTransModel);
	public int delete(MBarangTrans barangTransModel);
}

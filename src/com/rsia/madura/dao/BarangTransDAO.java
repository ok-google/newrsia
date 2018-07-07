package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarangTrans;

public interface BarangTransDAO {
	public List<MBarangTrans> getBarangTranss();
	public List<MBarangTrans> getBarangTranss(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarangTrans getBarangTrans(int barangTransId);
	
	public int barangTransStore(MBarangTrans barangTransModel);
	public int barangTransUpdate(MBarangTrans barangTransModel);
	public int barangTransDelete(MBarangTrans barangTransModel);
}

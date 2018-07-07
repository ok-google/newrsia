package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarangDetail;

public interface BarangDetailDao {

	public List<MBarangDetail> getBarangDetails();
	public List<MBarangDetail> getBarangDetails(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarangDetail getBarangDetail(int barangdet_id);

	public int barangdetailStore(MBarangDetail barangdetailModel);
	public int barangdetailUpdate(MBarangDetail barangdetailModel);
	public int barangdetailDelete(MBarangDetail barangdetailModel);
	

}

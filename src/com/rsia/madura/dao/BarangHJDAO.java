package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarangHJ;

public interface BarangHJDAO {

	public List<MBarangHJ> getBarangHJs();

	public List<MBarangHJ> getBarangHJs(int page, int limit);

	public String createLinks(int page, int limit);

	public int baranghjStore(MBarangHJ baranghjModel);

	public MBarangHJ getbarangHJ(int IDBarangHJ);

	public int barangHJUpdate(MBarangHJ baranghjModel);

	public int BarangHJDelete(MBarangHJ baranghjModel);

}

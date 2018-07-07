package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarangHJ;

public interface BarangHJService {

	public List<MBarangHJ> getBarangHJs();

	public List<MBarangHJ> getBarangHJs(int page, int limit);

	public String createLinks(int page, int limit);

	public MBarangHJ getBarangHJ(int IDBarangHJ);

	public int store(MBarangHJ baranghjModel);

	public int update(MBarangHJ baranghjModel);

	public int delete(MBarangHJ baranghjModel);

}

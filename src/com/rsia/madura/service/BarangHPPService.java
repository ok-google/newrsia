package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarangHPP;

public interface BarangHPPService {

	public List<MBarangHPP> getBarangHPPs();
	public List<MBarangHPP> getBarangHPPs(int page, int limit);
	public MBarangHPP getBarangHPP(int IdBarangHPP);
	
	public String createLinks(int page, int limit);
	public int store(MBarangHPP baranghppModel);
	public int update(MBarangHPP baranghppModel);
	public int delete(MBarangHPP baranghppModel);
}

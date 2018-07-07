package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarangHPP;


public interface BarangHPPDAO {

	public List<MBarangHPP> getBaranghpps();
	public List<MBarangHPP> getBaranghpps(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarangHPP getBarangHPP(int IdBarangHPP);
	
	public int baranghppStore(MBarangHPP baranghppModel);
	public int baranghppUpdate(MBarangHPP baranghppModel);
	public int baranghppDelete(MBarangHPP baranghppModel);
}

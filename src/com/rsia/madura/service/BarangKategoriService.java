package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarangKategori;

public interface BarangKategoriService {

	public List<MBarangKategori> getKategoris();
	public List<MBarangKategori> getKategoris(int page, int limit);
	public MBarangKategori getBarangKategori(int kategoriId);
	
	public String createLinks(int page, int limit);
	public int store(MBarangKategori kategoriModel);
	public int update(MBarangKategori kategoriModel);
	public int delete(MBarangKategori kategoriModel);
}

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarangKategori;

public interface BarangKategoriDAO {

	public List<MBarangKategori> getKategoris();
	public List<MBarangKategori> getKategoris(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarangKategori getBarangKategori(int kategoriId);
	
	public int kategoriStore(MBarangKategori kategoriModel);
	public int kategoriUpdate(MBarangKategori kategoriModel);
	public int kategoriDelete(MBarangKategori kategoriModel);
	
}

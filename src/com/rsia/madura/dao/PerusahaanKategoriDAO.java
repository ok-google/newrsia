package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPerusahaanKategori;

public interface PerusahaanKategoriDAO {
	public List<MPerusahaanKategori> getPerusahaans();
	public List<MPerusahaanKategori> getPerusahaans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPerusahaanKategori getPerusahaan(int perusahaanKategoriId);
	
	public int perusahaanKategoriStore(MPerusahaanKategori perusahaanKategoriModel);
	public int perusahaanKategoriUpdate(MPerusahaanKategori perusahaanKategoriModel);
	public int perusahaanKategoriDelete(MPerusahaanKategori perusahaanKategoriModel);
}

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPerusahaanKategori;

public interface PerusahaanKategoriService {
	public List<MPerusahaanKategori> getPerusahaans();
	public List<MPerusahaanKategori> getPerusahaans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPerusahaanKategori getPerusahaan(int perusahaanKategoriId);
	
	public int store(MPerusahaanKategori perusahaanKategoriModel);
	public int update(MPerusahaanKategori perusahaanKategoriModel);
	public int delete(MPerusahaanKategori perusahaanKategoriModel);
}

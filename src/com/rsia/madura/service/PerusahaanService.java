package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MPerusahaan;

public interface PerusahaanService {
	public List<MPerusahaan> getPerusahaans();
	public List<MPerusahaan> getPerusahaans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPerusahaan getPerusahaan(int perusahaanId);
	
	public int store(MPerusahaan perusahaanModel);
	public int update(MPerusahaan perusahaanModel);
	public int delete(MPerusahaan perusahaanModel);
}

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MPerusahaan;

public interface PerusahaanDAO {
	public List<MPerusahaan> getPerusahaans();
	public List<MPerusahaan> getPerusahaans(int page, int limit);
	public String createLinks(int page, int limit);
	public MPerusahaan getPerusahaan(int perusahaanId);
	
	public int perusahaanStore(MPerusahaan perusahaanModel);
	public int perusahaanUpdate(MPerusahaan perusahaanModel);
	public int perusahaanDelete(MPerusahaan perusahaanModel);
}

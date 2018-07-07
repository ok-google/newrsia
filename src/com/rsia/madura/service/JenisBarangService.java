package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MJenisBarang;

public interface JenisBarangService {
	public List<MJenisBarang> getJenisBarangs();
	public MJenisBarang getJenisBarang(int jenisBarangId);
	
	public int store(MJenisBarang jenisBarangModel);
	public int update(MJenisBarang jenisBarangModel);
	public int delete(MJenisBarang jenisBarangModel);
}

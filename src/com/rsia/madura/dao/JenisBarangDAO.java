package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MJenisBarang;

public interface JenisBarangDAO {
	public List<MJenisBarang> getJenisBarangs();
	public MJenisBarang getJenisBarang(int jenisBarangId);
	
	public int jenisBarangStore(MJenisBarang jenisBarangModel);
	public int jenisBarangUpdate(MJenisBarang jenisBarangModel);
	public int jenisBarangDelete(MJenisBarang jenisBarangModel);
}

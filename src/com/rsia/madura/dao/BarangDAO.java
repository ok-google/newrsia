package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MBarang;

public interface BarangDAO {

	public List<MBarang> getBarangs();
	public List<MBarang> getBarangs(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarang getBarang(int barangId);
	
	public int barangStore(MBarang barangModel);
	public int barangUpdate(MBarang barangModel);
	public int barangDelete(MBarang barangModel);

}

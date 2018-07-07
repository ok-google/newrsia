package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MBarang;

public interface BarangService {
	public List<MBarang> getBarangs();
	public List<MBarang> getBarangs(int page, int limit);
	public String createLinks(int page, int limit);
	public MBarang getBarang(int barangId);
	
	public int store(MBarang barangModel);
	public int update(MBarang barangModel);
	public int delete(MBarang barangModel);
}

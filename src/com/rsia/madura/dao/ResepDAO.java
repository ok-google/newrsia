package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MResep;

public interface ResepDAO {
	public List<MResep> getReseps();
	public List<MResep> getReseps(int page, int limit);
	public String createLinks(int page, int limit);
	public MResep getResep(int resepId);
	
	public int resepStore(MResep resepModel);
	public int resepUpdate(MResep resepModel);
	public int resepDelete(MResep resepModel);
}

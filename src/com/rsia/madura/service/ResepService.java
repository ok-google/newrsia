package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MResep;

public interface ResepService {
	public List<MResep> getReseps();
	public List<MResep> getReseps(int page, int limit);
	public String createLinks(int page, int limit);
	public MResep getResep(int resepId);
	
	public int store(MResep resepModel);
	public int update(MResep resepModel);
	public int delete(MResep resepModel);
}

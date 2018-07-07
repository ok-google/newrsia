package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MJual;

public interface JualService {
	public List<MJual> getJuals();
	public List<MJual> getJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public MJual getJual(int jualId);
	
	public int store(MJual jualModel);
	public int update(MJual jualModel);
	public int delete(MJual jualModel);
}

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MJual;

public interface JualDAO {
	public List<MJual> getJuals();
	public List<MJual> getJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public MJual getJual(int jualId);
	
	public int jualStore(MJual jualModel);
	public int jualUpdate(MJual jualModel);
	public int jualDelete(MJual jualModel);
}

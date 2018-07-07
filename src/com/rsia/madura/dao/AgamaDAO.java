package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MAgama;

public interface AgamaDAO {
	public List<MAgama> getAgamas();
	public List<MAgama> getAgamas(int page, int limit);
	public String createLinks(int page, int limit);
	public MAgama getAgama(int AgamaId);
	
	public int AgamaStore(MAgama AgamaModel);
	public void AgamaUpdate(MAgama AgamaModel);
	public void AgamaDelete(MAgama AgamaModel);
}

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MTerima;

public interface TerimaService {
	public List<MTerima> getTerimas();
	public List<MTerima> getTerimas(int page, int limit);
	public String createLinks(int page, int limit);
	public MTerima getTerima(int terimaId);
	
	public int store(MTerima terimaModel);
	public int update(MTerima terimaModel);
	public int delete(MTerima terimaModel);
}

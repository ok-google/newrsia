package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MTerima;

public interface TerimaDAO {
	public List<MTerima> getTerimas();
	public List<MTerima> getTerimas(int page, int limit);
	public String createLinks(int page, int limit);
	public MTerima getTerima(int terimaId);
	
	public int terimaStore(MTerima terimaModel);
	public int terimaUpdate(MTerima terimaModel);
	public int terimaDelete(MTerima terimaModel);
}

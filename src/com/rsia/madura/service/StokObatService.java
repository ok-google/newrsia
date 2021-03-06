package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MStokObat;

public interface StokObatService {
	public List<MStokObat> getStokObats();
	public List<MStokObat> getStokObats(int page, int limit);
	public String createLinks(int page, int limit);
	public MStokObat getStokObat(int stokObatId);
	
	public int stokObatStore(MStokObat stokObatModel);
	public int stokObatUpdate(MStokObat stokObatModel);
	public int stokObatDelete(MStokObat stokObatModel);
}

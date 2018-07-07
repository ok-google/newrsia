package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKasir;

public interface KasirDAO {
	public List<MKasir> getKasirs();
	public List<MKasir> getKasirs(int page, int limit);
	public String createLinks(int page, int limit);
	public MKasir getKasir(int KasirId);
	
	public int KasirStore(MKasir KasirModel);
	public void KasirUpdate(MKasir KasirModel);
	public void KasirDelete(MKasir KasirModel);
}

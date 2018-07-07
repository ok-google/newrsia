package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MKelurahan;

public interface KelurahanDAO {
	public List<MKelurahan> getKelurahans();
	public List<MKelurahan> getKelurahans(int page, int limit);
	public String createLinks(int page, int limit);
	public MKelurahan getKelurahan(int kelurahanId);
	
	public void kelurahanStore(MKelurahan kelurahanModel);
	public void kelurahanUpdate(MKelurahan kelurahanModel);
	public void kelurahanDelete(MKelurahan kelurahanModel);
}

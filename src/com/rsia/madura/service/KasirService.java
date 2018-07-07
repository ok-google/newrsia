package com.rsia.madura.service;

import java.util.List;
 
import com.rsia.madura.entity.MKasir;

public interface KasirService {	
	public List<MKasir> getKasirs();
	public List<MKasir> getKasirs(int page, int limit);
	public String createLinks(int page, int limit);
	public MKasir getKasir(int id);
	
	public int store(MKasir data);
	public void update(MKasir data);
	public void delete(MKasir data);
}

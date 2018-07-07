package com.rsia.madura.service;

import java.util.List;
 
import com.rsia.madura.entity.MAgama;

public interface AgamaService {	
	public List<MAgama> getAgamas();
	public List<MAgama> getAgamas(int page, int limit);
	public String createLinks(int page, int limit);
	public MAgama getAgama(int id);
	
	public int store(MAgama data);
	public void update(MAgama data);
	public void delete(MAgama data);
}

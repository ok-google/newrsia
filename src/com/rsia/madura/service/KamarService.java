package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MKamar;

public interface KamarService {
	public List<MKamar> findAll();
	public List<MKamar> findAll(int page, int limit);

	public String createLinks(int page, int limit);
	public MKamar getKamar(int id);
	
	public void store(MKamar data);
	public void update(MKamar data);
	public void delete(MKamar data);
}

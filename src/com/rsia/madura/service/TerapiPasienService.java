package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MTerapiPasien;

public interface TerapiPasienService {
	public List<MTerapiPasien> findAll();
	public List<MTerapiPasien> findAll(int page, int limit);
	public String createLinks(int page, int limit);
	public MTerapiPasien getById(int id);
	
	public void store(MTerapiPasien data);
	public void update(MTerapiPasien data);
	public void delete(MTerapiPasien data);
}
package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MReturBeli;

public interface ReturBeliService {
	public List<MReturBeli> getReturBelis();
	public List<MReturBeli> getReturBelis(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturBeli getReturBeli(int returBeliId);
	
	public int store(MReturBeli returBeliModel);
	public int update(MReturBeli returBeliModel);
	public int delete(MReturBeli returBeliModel);
}

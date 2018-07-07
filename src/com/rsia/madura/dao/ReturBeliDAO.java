package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MReturBeli;

public interface ReturBeliDAO {
	public List<MReturBeli> getReturBelis();
	public List<MReturBeli> getReturBelis(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturBeli getReturBeli(int returBeliId);
	
	public int returBeliStore(MReturBeli returBeliModel);
	public int returBeliUpdate(MReturBeli returBeliModel);
	public int returBeliDelete(MReturBeli returBeliModel);
}

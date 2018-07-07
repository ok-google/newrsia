package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MReturJual;

public interface ReturJualService {
	public List<MReturJual> getReturJuals();
	public List<MReturJual> getReturJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturJual getReturJual(int returJualId);
	
	public int store(MReturJual returJualModel);
	public int update(MReturJual returJualModel);
	public int delete(MReturJual returJualModel);
}

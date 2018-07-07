package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MReturJual;

public interface ReturJualDAO {
	public List<MReturJual> getReturJuals();
	public List<MReturJual> getReturJuals(int page, int limit);
	public String createLinks(int page, int limit);
	public MReturJual getReturJual(int returJualId);
	
	public int returJualStore(MReturJual returJualModel);
	public int returJualUpdate(MReturJual returJualModel);
	public int returJualDelete(MReturJual returJualModel);
}

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MOpname;

public interface OpnameService {
	public List<MOpname> getOpnames();
	public List<MOpname> getOpnames(int page, int limit);
	public String createLinks(int page, int limit);
	public MOpname getOpname(int opnameId);
	
	public int store(MOpname opnameModel);
	public int update(MOpname opnameModel);
	public int delete(MOpname opnameModel);
}

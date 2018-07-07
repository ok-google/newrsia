package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MOpname;

public interface OpnameDAO {
	public List<MOpname> getOpnames();
	public List<MOpname> getOpnames(int page, int limit);
	public String createLinks(int page, int limit);
	public MOpname getOpname(int opnameId);
	
	public int opnameStore(MOpname opnameModel);
	public int opnameUpdate(MOpname opnameModel);
	public int opnameDelete(MOpname opnameModel);
}

package com.rsia.madura.service;

import java.util.List;

import com.rsia.madura.entity.MRole;

public interface RoleService {
	public List<MRole> getRoles();
	public MRole getRole(int roleId);
	
	public int store(MRole roleModel);
	public int update(MRole roleModel);
	public int delete(MRole roleModel);
}

package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MRole;

public interface RoleDAO {
	public List<MRole> getRoles();
	public MRole getRole(int roleId);
	
	public int roleStore(MRole roleModel);
	public int roleUpdate(MRole roleModel);
	public int roleDelete(MRole roleModel);
}

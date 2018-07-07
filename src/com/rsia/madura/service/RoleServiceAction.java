package com.rsia.madura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.RoleDAO;
import com.rsia.madura.entity.MRole;

@Service
public class RoleServiceAction implements RoleService {
	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	@Transactional
	public List<MRole> getRoles() {
		
		return roleDAO.getRoles();
	}

	@Override
	@Transactional
	public MRole getRole(int roleId) {
		
		return roleDAO.getRole(roleId);
	}

	@Override
	@Transactional
	public int store(MRole roleModel) {
		
		return roleDAO.roleStore(roleModel);

	}

	@Override
	@Transactional
	public int update(MRole roleModel) {
		
		return roleDAO.roleUpdate(roleModel);

	}

	@Override
	@Transactional
	public int delete(MRole roleModel) {
		
		return roleDAO.roleDelete(roleModel);

	}

}

package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MRole;

@Repository
public class RoleAction implements RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MRole> getRoles() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MRole> query = current.createQuery("from MRole where roleAktif = 'Y'", MRole.class);
		List<MRole> result = query.getResultList();
		
		return result;
	}

	@Override
	public MRole getRole(int roleId) {
		Session current = sessionFactory.getCurrentSession();
		
		MRole result = current.get(MRole.class, roleId);
		
		return result;
	}


	@Override
	public int roleStore(MRole roleModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(roleModel);
		current.flush();
		
		return roleModel.getRoleID();

	}

	@Override
	public int roleUpdate(MRole roleModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(roleModel);
		current.flush();
		
		return roleModel.getRoleID();

	}

	@Override
	public int roleDelete(MRole roleModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(roleModel);
		current.flush();
		
		return roleModel.getRoleID();

	}

}

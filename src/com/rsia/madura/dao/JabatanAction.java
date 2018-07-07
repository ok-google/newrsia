/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:12:22 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:12:22 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MJabatan;

@Repository
public class JabatanAction implements JabatanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<MJabatan> getJabatans() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MJabatan> jabatanQuery = current.createQuery("from MJabatan", MJabatan.class);
		List<MJabatan> result = jabatanQuery.getResultList();
		
		return result;
	}

	@Override
	public MJabatan getJabatan(int jabatanId) {
		Session current = sessionFactory.getCurrentSession();
		
		MJabatan result = current.get(MJabatan.class, jabatanId);
		
		return result;
	}

	@Override
	public void jabatanStore(MJabatan jabatanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(jabatanModel);

	}

	@Override
	public void jabatanUpdate(MJabatan jabatanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jabatanModel);

	}

	@Override
	public void jabatanDelete(MJabatan jabatanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jabatanModel);

	}

}

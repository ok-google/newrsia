/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-16 09:02:01
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 09:02:17
*/

package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MSatuan;

@Repository
public class SatuanAction implements SatuanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MSatuan> getSatuans() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MSatuan> query = current.createQuery("from MSatuan", MSatuan.class);
		List<MSatuan> result = query.getResultList();
		
		return result;
	}

	@Override
	public MSatuan getSatuan(int satuanID) {
		Session current = sessionFactory.getCurrentSession();
		
		MSatuan result = current.get(MSatuan.class, satuanID);
		
		return result;
	}

	@Override
	public int satuanStore(MSatuan satuanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(satuanModel);
		current.flush();
		
		return satuanModel.getSatuanID();
	}

	@Override
	public int satuanUpdate(MSatuan satuanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(satuanModel);
		current.flush();
		
		return satuanModel.getSatuanID();
	}

	@Override
	public int satuanDelete(MSatuan satuanModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(satuanModel);
		current.flush();
		
		return satuanModel.getSatuanID();

	}

}
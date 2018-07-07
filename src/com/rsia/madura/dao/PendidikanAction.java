/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:21:47 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:21:47 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPendidikan;

@Repository
public class PendidikanAction implements PendidikanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MPendidikan> getPendidikan() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MPendidikan> query = current.createQuery("from MPendidikan", MPendidikan.class);
		
		List<MPendidikan> Pendidikan = query.getResultList();
		return Pendidikan;
	}

}

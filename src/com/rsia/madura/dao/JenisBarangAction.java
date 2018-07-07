package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MJenisBarang;

@Repository
public class JenisBarangAction implements JenisBarangDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MJenisBarang> getJenisBarangs() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MJenisBarang> gajiQuery = current.createQuery("from MJenisBarang", MJenisBarang.class);
		List<MJenisBarang> result = gajiQuery.getResultList();
		
		return result;
		
	}

	@Override
	public MJenisBarang getJenisBarang(int jenisBarangId) {
		Session current = sessionFactory.getCurrentSession();
		
		MJenisBarang result = current.get(MJenisBarang.class, jenisBarangId);
		
		return result;
	}

	@Override
	public int jenisBarangStore(MJenisBarang jenisBarangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(jenisBarangModel);
		current.flush();
		
		return jenisBarangModel.getBarangJenisId();
		
	}

	@Override
	public int jenisBarangUpdate(MJenisBarang jenisBarangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jenisBarangModel);
		current.flush();
		
		return jenisBarangModel.getBarangJenisId();
		
	}

	@Override
	public int jenisBarangDelete(MJenisBarang jenisBarangModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(jenisBarangModel);
		current.flush();
		
		return jenisBarangModel.getBarangJenisId();
		
	}
}

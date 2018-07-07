/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-28 22:55:04
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-29 05:23:15
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MIcd9;

@Repository
public class Icd9Action implements Icd9DAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MIcd9> getIcd9s() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MIcd9> query = current.createQuery("FROM MIcd9 i WHERE i.icd9Aktif = :icd9Aktif", MIcd9.class);
		query.setParameter("icd9Aktif", "Y");
		List<MIcd9> result = query.getResultList();
		return result;
	}

	@Override
	public List<MIcd9> getIcd9s(int page, int limit) {
		// TODO Auto-generated method stub
		List<MIcd9> result = this.getData(page, limit);
		this.total = this.getIcd9s().size();

		return result;
	}

	public List<MIcd9> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MIcd9> query = current.createQuery("FROM MIcd9 k WHERE k.icd9Aktif = :icd9Aktif", MIcd9.class).setMaxResults(limit);
		query.setParameter("icd9Aktif", "Y");
		List<MIcd9> result = query.getResultList();

		return result;
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		double last = Math.ceil((double) this.total / (double) limit);

		int start = ((page - 5) > 0) ? page - 5 : 1;
		int end = (int) (((page + 5) < last) ? page + 5 : last);

		String html = "<ul class='pagination'>";

		String first = (page == 1) ? "disabled" : "";
		html = html + "<li class='page-first' " + first + "><a href='?limit=" + limit + "&page=" + (page - 1) + "'>&laquo;</a></li>";

		if (start > 1) {
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=1'>1</a></li>";
			html = html + "<li class='page-number disabled'><span>...</span></li>";
		}

		for (int i = start; i <= end; i++) {
			String position = (page == i) ? "active" : "";
			html = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> " + i + "</a></li>";
		}

		if (end < last) {
			html = html + "<li class='page-number disabled'><span>...</span></li>";
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int) last + "'>" + (int) last + "</a></li>";
		}

		String status = (page == (int) last) ? "disabled" : "";
		html = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + (page + 1) + "'>&raquo;</a></li>";
		html = html + "</ul>";

		return html;
	}

	@Override
	public MIcd9 getIcd9(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MIcd9 result = current.get(MIcd9.class, Id);
		return result;
	}

	@Override
	public void icd9Store(MIcd9 icd9Model) {
		Session current = sessionFactory.getCurrentSession();
		current.save(icd9Model);
	}

	@Override
	public void icd9Update(MIcd9 icd9Model) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(icd9Model);
	}

	@Override
	public void icd9Delete(MIcd9 icd9Model) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(icd9Model);
	}
}
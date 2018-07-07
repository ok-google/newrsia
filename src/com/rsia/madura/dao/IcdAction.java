/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-27 14:01:52
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-27 14:14:22
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MIcd;

@Repository
public class IcdAction implements IcdDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MIcd> getIcds() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MIcd> query = current.createQuery("FROM MIcd i WHERE i.icdAktif = :icdAktif", MIcd.class);
		query.setParameter("icdAktif", "Y");
		List<MIcd> result = query.getResultList();
		return result;
	}

	@Override
	public List<MIcd> getIcds(int page, int limit) {
		// TODO Auto-generated method stub
		List<MIcd> result = this.getData(page, limit);
		this.total = this.getIcds().size();

		return result;
	}

	public List<MIcd> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MIcd> query = current.createQuery("FROM MIcd k WHERE k.icdAktif = :icdAktif", MIcd.class).setMaxResults(limit);
		query.setParameter("icdAktif", "Y");
		List<MIcd> result = query.getResultList();

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
	public MIcd getIcd(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MIcd result = current.get(MIcd.class, Id);
		return result;
	}

	@Override
	public void icdStore(MIcd icdModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(icdModel);
	}

	@Override
	public void icdUpdate(MIcd icdModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(icdModel);
	}

	@Override
	public void icdDelete(MIcd icdModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(icdModel);
	}
}
/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:15:00
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:22:40
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MTindakanPasien;

@Repository
public class TindakanPasienAction implements TindakanPasienDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MTindakanPasien> getTindakanPasiens() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MTindakanPasien> query = current.createQuery("from MTindakanPasien", MTindakanPasien.class);

		List<MTindakanPasien> tindakanpasien = query.getResultList();

		return tindakanpasien;
	}

	@Override
	public List<MTindakanPasien> getTindakanPasiens(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MTindakanPasien> query = current.createQuery("from MTindakanPasien", MTindakanPasien.class);
		List<MTindakanPasien> tindakanpasien = query.getResultList();
		this.total = tindakanpasien.size();
		tindakanpasien = this.getData(page, limit);

		return tindakanpasien;
	}

	public List<MTindakanPasien> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MTindakanPasien> query = current.createQuery("from MTindakanPasien", MTindakanPasien.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MTindakanPasien> Result = query.getResultList();

		return Result;
	}

	@Override
	public String createLinks(int page, int limit) {
		// TODO Auto-generated method stub
		double last = Math.ceil((double) this.total / (double) limit);

		int start = ((page - 5) > 0) ? page - 5 : 1;
		int end = (int) (((page + 5) < last) ? page + 5 : last);

		String html = "<ul class='pagination'>";

		String first = (page == 1) ? "disabled" : "";
		html = html + "<li class='page-first' " + first + "><a href='?limit=" + limit + "&page=" + (page - 1)
				+ "'>&laquo;</a></li>";

		if (start > 1) {
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=1'>1</a></li>";
			html = html + "<li class='page-number disabled'><span>...</span></li>";
		}

		for (int i = start; i <= end; i++) {
			String position = (page == i) ? "active" : "";
			html = html + "<li class='page-number ' " + position + "'><a href='?limit=" + limit + "&page=" + i + "'> "
					+ i + "</a></li>";
		}

		if (end < last) {
			html = html + "<li class='page-number disabled'><span>...</span></li>";
			html = html + "<li class='page-number'><a href='?limit=" + limit + "&page=" + (int) last + "'>" + (int) last
					+ "</a></li>";
		}

		String status = (page == (int) last) ? "disabled" : "";
		html = html + "<li class='page-number " + status + "'><a href='?limit=" + limit + "&page=" + (page + 1)
				+ "'>&raquo;</a></li>";

		html = html + "</ul>";

		return html;
	}

	@Override
	public MTindakanPasien getTindakanPasien(int tindakanpasienId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MTindakanPasien result = current.get(MTindakanPasien.class, tindakanpasienId);

		return result;
	}

	@Override
	public int TindakanPasienStore(MTindakanPasien TindakanPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(TindakanPasienModel);

	}

	@Override
	public void TindakanPasienUpdate(MTindakanPasien TindakanPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(TindakanPasienModel);
	}

	@Override
	public void TindakanPasienDelete(MTindakanPasien TindakanPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		current.remove(TindakanPasienModel);

	}
}

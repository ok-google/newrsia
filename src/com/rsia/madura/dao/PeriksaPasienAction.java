/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:04:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:10:36
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPeriksaPasien;

@Repository
public class PeriksaPasienAction implements PeriksaPasienDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MPeriksaPasien> getPeriksaPasiens() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MPeriksaPasien> query = current.createQuery("from MPeriksaPasien", MPeriksaPasien.class);

		List<MPeriksaPasien> periksapasien = query.getResultList();

		return periksapasien;
	}

	@Override
	public List<MPeriksaPasien> getPeriksaPasiens(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPeriksaPasien> query = current.createQuery("from MPeriksaPasien", MPeriksaPasien.class);
		List<MPeriksaPasien> periksapasien = query.getResultList();
		this.total = periksapasien.size();
		periksapasien = this.getData(page, limit);

		return periksapasien;
	}

	public List<MPeriksaPasien> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPeriksaPasien> query = current.createQuery("from MPeriksaPasien", MPeriksaPasien.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MPeriksaPasien> Result = query.getResultList();

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
	public MPeriksaPasien getPeriksaPasien(int periksapasienId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPeriksaPasien result = current.get(MPeriksaPasien.class, periksapasienId);

		return result;
	}

	@Override
	public int PeriksaPasienStore(MPeriksaPasien PeriksaPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(PeriksaPasienModel);

	}

	@Override
	public void PeriksaPasienUpdate(MPeriksaPasien PeriksaPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PeriksaPasienModel);
	}

	@Override
	public void PeriksaPasienDelete(MPeriksaPasien PeriksaPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		current.remove(PeriksaPasienModel);

	}
}

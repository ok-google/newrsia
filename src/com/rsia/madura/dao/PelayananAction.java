/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 10:02:39
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 07:13:05
*/

package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPendaftaran;

@Repository
public class PelayananAction implements PelayananDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public int total;

	@Override
	public List<MPendaftaran> getPelayanans() {
		Session current = sessionFactory.getCurrentSession();
		Query<MPendaftaran> query = current.createQuery("from MPendaftaran p WHERE p.pendaftaranAktif = :pendaftaranAktif ORDER BY pendaftaranID DESC", MPendaftaran.class);
		query.setParameter("pendaftaranAktif", "Y");
		List<MPendaftaran> Pelayanan = query.getResultList();

		return Pelayanan;
	}

	@Override
	public List<MPendaftaran> getPelayanans(int page, int limit) {
		List<MPendaftaran> result = this.getData(page, limit);
		this.total = this.getPelayanans().size();

		return result;

	}

	public List<MPendaftaran> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPendaftaran> query = current.createQuery("from MPendaftaran p WHERE p.pendaftaranAktif = :pendaftaranAktif ORDER BY pendaftaranID DESC", MPendaftaran.class)
				.setFirstResult((page - 1) * limit).setMaxResults(limit);
		query.setParameter("pendaftaranAktif", "Y");
		List<MPendaftaran> Result = query.getResultList();

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
	public MPendaftaran getPelayanan(int PelayananId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPendaftaran result = current.get(MPendaftaran.class, PelayananId);

		return result;
	}

	@Override
	public void update(MPendaftaran PelayananModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PelayananModel);
	}

	@Override
	public void delete(MPendaftaran PelayananModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PelayananModel);
	}
}
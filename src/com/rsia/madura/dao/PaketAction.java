/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:54:17
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:27:12
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPaket;

@Repository
public class PaketAction implements PaketDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MPaket> getPakets() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPaket> query = current.createQuery("FROM MPaket k WHERE k.paketAktif = :paketAktif", MPaket.class);
		query.setParameter("paketAktif", "Y");
		List<MPaket> result = query.getResultList();
		return result;
	}

	@Override
	public List<MPaket> getPakets(int page, int limit) {
		// TODO Auto-generated method stub
		List<MPaket> result = this.getData(page, limit);
		this.total = this.getPakets().size();

		return result;
	}

	public List<MPaket> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPaket> query = current.createQuery("FROM MPaket k WHERE k.paketAktif = :paketAktif", MPaket.class).setFirstResult((page - 1) * limit).setMaxResults(limit);
		query.setParameter("paketAktif", "Y");
		List<MPaket> result = query.getResultList();

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
	public MPaket getPaket(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MPaket result = current.get(MPaket.class, Id);
		return result;
	}

	@Override
	public void PaketStore(MPaket PaketModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(PaketModel);
	}

	@Override
	public void PaketUpdate(MPaket PaketModel) {
		Session current = sessionFactory.getCurrentSession();
		current.merge(PaketModel);
	}

	@Override
	public void PaketDelete(MPaket PaketModel) {
		Session current = sessionFactory.getCurrentSession();
		current.merge(PaketModel);
	}
}
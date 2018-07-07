/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:54:17
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-08 08:29:43
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MKelas;

@Repository
public class KelasAction implements KelasDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MKelas> getKelases() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MKelas> query = current.createQuery("FROM MKelas k WHERE k.kelasAktif = :kelasAktif", MKelas.class);
		query.setParameter("kelasAktif", "Y");
		List<MKelas> result = query.getResultList();
		return result;
	}

	@Override
	public List<MKelas> getKelases(int page, int limit) {
		// TODO Auto-generated method stub
		List<MKelas> result = this.getData(page, limit);
		this.total = this.getKelases().size();

		return result;
	}

	public List<MKelas> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MKelas> query = current.createQuery("FROM MKelas k WHERE k.kelasAktif = :kelasAktif", MKelas.class).setFirstResult((page - 1) * limit).setMaxResults(limit);
		query.setParameter("kelasAktif", "Y");
		List<MKelas> result = query.getResultList();

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
	public MKelas getKelas(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MKelas result = current.get(MKelas.class, Id);
		return result;
	}

	@Override
	public void KelasStore(MKelas KelasModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(KelasModel);
	}

	@Override
	public void KelasUpdate(MKelas KelasModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(KelasModel);
	}

	@Override
	public void KelasDelete(MKelas KelasModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(KelasModel);
	}
}
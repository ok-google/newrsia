/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-19 14:17:13
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 14:55:11
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MJenisLayanan;

@Repository
public class JenisLayananAction implements JenisLayananDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MJenisLayanan> getJenisLayanans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MJenisLayanan> query = current.createQuery("FROM MJenisLayanan k WHERE k.jenislayananAktif = :jenislayananAktif", MJenisLayanan.class);
		query.setParameter("jenislayananAktif", "Y");
		List<MJenisLayanan> result = query.getResultList();
		return result;
	}

	@Override
	public List<MJenisLayanan> getJenisLayanans(int page, int limit) {
		// TODO Auto-generated method stub
		List<MJenisLayanan> result = this.getData(page, limit);
		this.total = this.getJenisLayanans().size();

		return result;
	}

	public List<MJenisLayanan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MJenisLayanan> query = current.createQuery("FROM MJenisLayanan k WHERE k.jenislayananAktif = :jenislayananAktif", MJenisLayanan.class).setMaxResults(limit);
		query.setParameter("jenislayananAktif", "Y");
		List<MJenisLayanan> result = query.getResultList();

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
	public MJenisLayanan getJenisLayanan(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MJenisLayanan result = current.get(MJenisLayanan.class, Id);
		return result;
	}

	@Override
	public void JenisLayananStore(MJenisLayanan JenisLayananModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(JenisLayananModel);
	}

	@Override
	public void JenisLayananUpdate(MJenisLayanan JenisLayananModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(JenisLayananModel);
	}

	@Override
	public void JenisLayananDelete(MJenisLayanan JenisLayananModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(JenisLayananModel);
	}
}
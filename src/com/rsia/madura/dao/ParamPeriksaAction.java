/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-15 15:57:52
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-15 15:59:51
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MParamPeriksa;

@Repository
public class ParamPeriksaAction implements ParamPeriksaDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MParamPeriksa> getParamPeriksases() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MParamPeriksa> query = current.createQuery("FROM MParamPeriksa p WHERE p.paramperiksaAktif = :paramperiksaAktif", MParamPeriksa.class);
		query.setParameter("paramperiksaAktif", "Y");
		List<MParamPeriksa> result = query.getResultList();
		return result;
	}

	@Override
	public List<MParamPeriksa> getParamPeriksases(int page, int limit) {
		// TODO Auto-generated method stub
		List<MParamPeriksa> result = this.getData(page, limit);
		this.total = this.getParamPeriksases().size();

		return result;
	}

	public List<MParamPeriksa> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MParamPeriksa> query = current.createQuery("FROM MParamPeriksa p WHERE p.paramperiksaAktif = :paramperiksaAktif", MParamPeriksa.class).setMaxResults(limit);
		query.setParameter("paramperiksaAktif", "Y");
		List<MParamPeriksa> result = query.getResultList();

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
	public MParamPeriksa getParamPeriksa(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MParamPeriksa result = current.get(MParamPeriksa.class, Id);
		return result;
	}

	@Override
	public void ParamPeriksaStore(MParamPeriksa paramperiksaModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(paramperiksaModel);
	}

	@Override
	public void ParamPeriksaUpdate(MParamPeriksa paramperiksaModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(paramperiksaModel);
	}

	@Override
	public void ParamPeriksaDelete(MParamPeriksa paramperiksaModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(paramperiksaModel);
	}
}
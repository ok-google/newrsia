/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:16:13
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:23:20
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPenunjangTrans;

@Repository
public class PenunjangTransAction implements PenunjangTransDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MPenunjangTrans> getPenunjangTranss() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MPenunjangTrans> query = current.createQuery("from MPenunjangTrans", MPenunjangTrans.class);

		List<MPenunjangTrans> penunjangtrans = query.getResultList();

		return penunjangtrans;
	}

	@Override
	public List<MPenunjangTrans> getPenunjangTranss(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPenunjangTrans> query = current.createQuery("from MPenunjangTrans", MPenunjangTrans.class);
		List<MPenunjangTrans> penunjangtrans = query.getResultList();
		this.total = penunjangtrans.size();
		penunjangtrans = this.getData(page, limit);

		return penunjangtrans;
	}

	public List<MPenunjangTrans> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPenunjangTrans> query = current.createQuery("from MPenunjangTrans", MPenunjangTrans.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MPenunjangTrans> Result = query.getResultList();

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
	public MPenunjangTrans getPenunjangTrans(int penunjangtransId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPenunjangTrans result = current.get(MPenunjangTrans.class, penunjangtransId);

		return result;
	}

	@Override
	public int PenunjangTransStore(MPenunjangTrans PenunjangTransModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(PenunjangTransModel);

	}

	@Override
	public void PenunjangTransUpdate(MPenunjangTrans PenunjangTransModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PenunjangTransModel);
	}

	@Override
	public void PenunjangTransDelete(MPenunjangTrans PenunjangTransModel) {
		Session current = sessionFactory.getCurrentSession();

		current.remove(PenunjangTransModel);

	}
}

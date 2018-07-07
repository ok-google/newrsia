/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:15:23
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:22:51
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPakai;

@Repository
public class PakaiAction implements PakaiDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MPakai> getPakais() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MPakai> query = current.createQuery("from MPakai", MPakai.class);

		List<MPakai> pakai = query.getResultList();

		return pakai;
	}

	@Override
	public List<MPakai> getPakais(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPakai> query = current.createQuery("from MPakai", MPakai.class);
		List<MPakai> pakai = query.getResultList();
		this.total = pakai.size();
		pakai = this.getData(page, limit);

		return pakai;
	}

	public List<MPakai> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPakai> query = current.createQuery("from MPakai", MPakai.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MPakai> Result = query.getResultList();

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
	public MPakai getPakai(int pakaiId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPakai result = current.get(MPakai.class, pakaiId);

		return result;
	}

	@Override
	public int PakaiStore(MPakai PakaiModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(PakaiModel);

	}

	@Override
	public void PakaiUpdate(MPakai PakaiModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PakaiModel);
	}

	@Override
	public void PakaiDelete(MPakai PakaiModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(PakaiModel);

	}
}

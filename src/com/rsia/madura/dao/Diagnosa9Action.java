/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 11:14:28
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 11:22:04
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MDiagnosa9;

@Repository
public class Diagnosa9Action implements Diagnosa9DAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MDiagnosa9> getDiagnosa9s() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MDiagnosa9> query = current.createQuery("from MDiagnosa9", MDiagnosa9.class);

		List<MDiagnosa9> diagnosa9 = query.getResultList();

		return diagnosa9;
	}

	@Override
	public List<MDiagnosa9> getDiagnosa9s(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MDiagnosa9> query = current.createQuery("from MDiagnosa9", MDiagnosa9.class);
		List<MDiagnosa9> diagnosa9 = query.getResultList();
		this.total = diagnosa9.size();
		diagnosa9 = this.getData(page, limit);

		return diagnosa9;
	}

	public List<MDiagnosa9> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MDiagnosa9> query = current.createQuery("from MDiagnosa9", MDiagnosa9.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MDiagnosa9> Result = query.getResultList();

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
	public MDiagnosa9 getDiagnosa9(int diagnosa9Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MDiagnosa9 result = current.get(MDiagnosa9.class, diagnosa9Id);

		return result;
	}

	@Override
	public int Diagnosa9Store(MDiagnosa9 Diagnosa9Model) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(Diagnosa9Model);

	}

	@Override
	public void Diagnosa9Update(MDiagnosa9 Diagnosa9Model) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(Diagnosa9Model);
	}

	@Override
	public void Diagnosa9Delete(MDiagnosa9 Diagnosa9Model) {
		Session current = sessionFactory.getCurrentSession();

		current.remove(Diagnosa9Model);

	}
}

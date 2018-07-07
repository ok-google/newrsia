/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:25:19 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:25:19 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MRujukan;

@Repository
public class RujukanAction implements RujukanDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MRujukan> getRujukans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MRujukan> query = current.createQuery("from MRujukan r WHERE r.rujukanAktif = :rujukanAktif", MRujukan.class);
		query.setParameter("rujukanAktif", "Y");
		List<MRujukan> rujukan = query.getResultList();

		return rujukan;
	}

	@Override
	public List<MRujukan> getRujukans(int page, int limit) {
		List<MRujukan> rujukan = this.getData(page, limit);
		this.total = this.getRujukans().size();

		return rujukan;
	}

	public List<MRujukan> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MRujukan> query = current.createQuery("from MRujukan r WHERE r.rujukanAktif = :rujukanAktif", MRujukan.class)
				.setFirstResult((page - 1) * limit).setMaxResults(limit);
		query.setParameter("rujukanAktif", "Y");
		List<MRujukan> Result = query.getResultList();

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
	public MRujukan getRujukan(int rujukanId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MRujukan result = current.get(MRujukan.class, rujukanId);

		return result;
	}

	@Override
	public void Store(MRujukan data) {
		Session current = sessionFactory.getCurrentSession();

		current.save(data);

	}

	@Override
	public void Update(MRujukan data) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(data);
	}

	@Override
	public void Delete(MRujukan data) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(data);

	}

}

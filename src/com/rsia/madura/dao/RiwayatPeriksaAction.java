/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-30 06:58:21
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 07:48:29
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MRiwayatPeriksa;

@Repository
public class RiwayatPeriksaAction implements RiwayatPeriksaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MRiwayatPeriksa> getRiwayatPeriksas() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MRiwayatPeriksa> query = current.createQuery("from MRiwayatPeriksa", MRiwayatPeriksa.class);

		List<MRiwayatPeriksa> riwayatperiksa = query.getResultList();

		return riwayatperiksa;
	}

	@Override
	public List<MRiwayatPeriksa> getRiwayatPeriksas(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MRiwayatPeriksa> query = current.createQuery("from MRiwayatPeriksa", MRiwayatPeriksa.class);
		List<MRiwayatPeriksa> riwayatperiksa = query.getResultList();
		this.total = riwayatperiksa.size();
		riwayatperiksa = this.getData(page, limit);

		return riwayatperiksa;
	}

	public List<MRiwayatPeriksa> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MRiwayatPeriksa> query = current.createQuery("from MRiwayatPeriksa", MRiwayatPeriksa.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MRiwayatPeriksa> Result = query.getResultList();

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
	public MRiwayatPeriksa getRiwayatPeriksa(int riwayatperiksaId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MRiwayatPeriksa result = current.get(MRiwayatPeriksa.class, riwayatperiksaId);

		return result;
	}

	@Override
	public int RiwayatPeriksaStore(MRiwayatPeriksa riwayatPeriksaModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(riwayatPeriksaModel);

	}

	@Override
	public void RiwayatPeriksaUpdate(MRiwayatPeriksa riwayatPeriksaModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(riwayatPeriksaModel);
	}

	@Override
	public void RiwayatPeriksaDelete(MRiwayatPeriksa riwayatPeriksaModel) {
		Session current = sessionFactory.getCurrentSession();

		current.remove(riwayatPeriksaModel);

	}
}

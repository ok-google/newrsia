/*
 * @Author: Pradesga 
 * @Date: 2018-04-14 17:54:07 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-14 17:54:07 
 */
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPegawai;

@Repository
public class PegawaiAction implements PegawaiDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MPegawai> getPegawai() {
		Session current = sessionFactory.getCurrentSession();

		Query<MPegawai> query = current.createQuery("from MPegawai", MPegawai.class);

		List<MPegawai> Pegawai = query.getResultList();

		return Pegawai;
	}

	@Override
	public List<MPegawai> getPegawais() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MPegawai> query = current.createQuery("from MPegawai", MPegawai.class);

		List<MPegawai> pasien = query.getResultList();

		return pasien;
	}

	@Override
	public List<MPegawai> getPegawais(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPegawai> query = current.createQuery("from MPegawai", MPegawai.class);
		List<MPegawai> pasien = query.getResultList();
		this.total = pasien.size();
		pasien = this.getData(page, limit);

		return pasien;
	}

	public List<MPegawai> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPegawai> query = current.createQuery("from MPegawai", MPegawai.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MPegawai> Result = query.getResultList();

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
	public MPegawai getPegawai(int pasienId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MPegawai result = current.get(MPegawai.class, pasienId);

		return result;
	}

	@Override
	public void PegawaiStore(MPegawai PegawaiModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(PegawaiModel);
	}

	@Override
	public void PegawaiUpdate(MPegawai PegawaiModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PegawaiModel);

	}

	@Override
	public void PegawaiDelete(MPegawai PegawaiModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PegawaiModel);
	}

}

package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPendaftaran;


@Repository
public class PendaftaranAction implements PendaftaranDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MPendaftaran> getPendaftarans() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPendaftaran> query = current.createQuery("FROM MPendaftaran p WHERE p.pendaftaranAktif = :pendaftaranAktif ORDER BY pendaftaranID DESC", MPendaftaran.class);
		query.setParameter("pendaftaranAktif", "Y");
		List<MPendaftaran> result = query.getResultList();
		return result;
	}

	@Override
	public List<MPendaftaran> getPendaftarans(int page, int limit) {
		// TODO Auto-generated method stub
		List<MPendaftaran> result = this.getData(page, limit);
		this.total = this.getPendaftarans().size();

		return result;
	}

	public List<MPendaftaran> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPendaftaran> query = current.createQuery("FROM MPendaftaran k WHERE k.pendaftaranAktif = :pendaftaranAktif ORDER BY pendaftaranID DESC", MPendaftaran.class).setFirstResult((page - 1) * limit).setMaxResults(limit);
		query.setParameter("pendaftaranAktif", "Y");
		List<MPendaftaran> result = query.getResultList();

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
	public MPendaftaran getPendaftaran(int PendaftaranId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MPendaftaran result = current.get(MPendaftaran.class, PendaftaranId);
		return result;
	}

	@Override
	public int PendaftaranStore(MPendaftaran PendaftaranModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int) current.save(PendaftaranModel);
	}

	@Override
	public void PendaftaranUpdate(MPendaftaran PendaftaranModel) {
		Session current = sessionFactory.getCurrentSession();
		current.merge(PendaftaranModel);
	}

	@Override
	public void PendaftaranDelete(MPendaftaran PendaftaranModel) {
		// TODO Auto-generated method stub
		
	}
}

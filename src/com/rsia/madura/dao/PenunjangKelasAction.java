package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPenunjangKelas;

@Repository
public class PenunjangKelasAction implements PenunjangKelasDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MPenunjangKelas> getPenunjangKelass() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPenunjangKelas> query = current.createQuery("FROM MPenunjangKelas p WHERE p.penunjangmedisAktif = :penunjangmedisAktif", MPenunjangKelas.class);
		query.setParameter("penunjangmedisAktif", "Y");
		List<MPenunjangKelas> result = query.getResultList();
		return result;
	}

	@Override
	public List<MPenunjangKelas> getPenunjangKelass(int page, int limit) {
		// TODO Auto-generated method stub
		List<MPenunjangKelas> result = this.getData(page, limit);
		this.total = this.getPenunjangKelass().size();

		return result;
	}

	public List<MPenunjangKelas> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPenunjangKelas> query = current.createQuery("FROM MPenunjangKelas", MPenunjangKelas.class).setFirstResult((page-1)*limit).setMaxResults(limit);
		query.setParameter("penunjangmedisAktif", "Y");
		List<MPenunjangKelas> result = query.getResultList();

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
	public MPenunjangKelas getPenunjangKelas(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MPenunjangKelas result = current.get(MPenunjangKelas.class, Id);
		return result;
	}

	@Override
	public void PenunjangKelasStore(MPenunjangKelas penunjangmedisModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(penunjangmedisModel);
	}

	@Override
	public void PenunjangKelasUpdate(MPenunjangKelas penunjangmedisModel) {
		Session current = sessionFactory.getCurrentSession();
		current.merge(penunjangmedisModel);
	}

	@Override
	public void PenunjangKelasDelete(MPenunjangKelas penunjangmedisModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(penunjangmedisModel);
	}
}
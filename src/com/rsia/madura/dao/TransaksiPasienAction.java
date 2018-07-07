package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MTransaksiPasien;

@Repository
public class TransaksiPasienAction implements TransaksiPasienDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MTransaksiPasien> getTransaksiPasiens() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MTransaksiPasien> query = current.createQuery("from MTransaksiPasien", MTransaksiPasien.class);

		List<MTransaksiPasien> transaksi = query.getResultList();

		return transaksi;
	}

	@Override
	public List<MTransaksiPasien> getTransaksiPasiens(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MTransaksiPasien> query = current.createQuery("from MTransaksiPasien", MTransaksiPasien.class);
		List<MTransaksiPasien> transaksi = query.getResultList();
		this.total = transaksi.size();
		transaksi = this.getData(page, limit);

		return transaksi;
	}

	public List<MTransaksiPasien> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MTransaksiPasien> query = current.createQuery("from MTransaksiPasien", MTransaksiPasien.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MTransaksiPasien> Result = query.getResultList();

		return Result;
	}

	@Override
	public MTransaksiPasien findBy(String key, String value) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MTransaksiPasien> query = current.createQuery("from MTransaksiPasien where " + key + " = '" + value + "'", MTransaksiPasien.class);		
		query.setMaxResults(1);
		MTransaksiPasien transaksi = (MTransaksiPasien) query.uniqueResult();


		return transaksi;
	}

	@Override
	public List<MTransaksiPasien> findsBy(String key, String value) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MTransaksiPasien> query = current.createQuery("from MTransaksiPasien where " + key + " = '" + value + "'", MTransaksiPasien.class);
		List<MTransaksiPasien> transaksi = query.getResultList();

		return transaksi;
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
	public MTransaksiPasien getTransaksiPasien(int id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MTransaksiPasien result = current.get(MTransaksiPasien.class, id);

		return result;
	}

	@Override
	public int TransaksiPasienStore(MTransaksiPasien TransaksiPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(TransaksiPasienModel);

	}

	@Override
	public void TransaksiPasienUpdate(MTransaksiPasien TransaksiPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(TransaksiPasienModel);
	}

	@Override
	public void TransaksiPasienDelete(MTransaksiPasien TransaksiPasienModel) {
		Session current = sessionFactory.getCurrentSession();

		current.remove(TransaksiPasienModel);

	}
}

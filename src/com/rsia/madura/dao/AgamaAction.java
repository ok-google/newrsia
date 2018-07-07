package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MAgama;

@Repository
public class AgamaAction implements AgamaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	public int total;

	@Override
	public List<MAgama> getAgamas() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		Query<MAgama> query = current.createQuery("from MAgama", MAgama.class);

		List<MAgama> agama = query.getResultList();

		return agama;
	}

	@Override
	public List<MAgama> getAgamas(int page, int limit) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MAgama> query = current.createQuery("from MAgama", MAgama.class);
		List<MAgama> agama = query.getResultList();
		this.total = agama.size();
		agama = this.getData(page, limit);

		return agama;
	}

	public List<MAgama> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MAgama> query = current.createQuery("from MAgama", MAgama.class).setFirstResult((page - 1) * limit)
				.setMaxResults(limit);
		List<MAgama> Result = query.getResultList();

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
	public MAgama getAgama(int agamaId) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();

		MAgama result = current.get(MAgama.class, agamaId);

		return result;
	}

	@Override
	public int AgamaStore(MAgama AgamaModel) {
		Session current = sessionFactory.getCurrentSession();

		return (int)current.save(AgamaModel);

	}

	@Override
	public void AgamaUpdate(MAgama AgamaModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(AgamaModel);
	}

	@Override
	public void AgamaDelete(MAgama AgamaModel) {
		Session current = sessionFactory.getCurrentSession();

		current.saveOrUpdate(AgamaModel);

	}
}

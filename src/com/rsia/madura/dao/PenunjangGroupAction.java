/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-12 15:47:35
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 16:51:55
*/

package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPenunjangGroup;

@Repository
public class PenunjangGroupAction implements PenunjangGroupDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MPenunjangGroup> getPenunjangGroups() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPenunjangGroup> query = current.createQuery("FROM MPenunjangGroup p WHERE p.pmedisgroupAktif = :pmedisgroupAktif", MPenunjangGroup.class);
		query.setParameter("pmedisgroupAktif", "Y");
		List<MPenunjangGroup> result = query.getResultList();
		return result;
	}

	@Override
	public List<MPenunjangGroup> getPenunjangGroups(int page, int limit) {
		// TODO Auto-generated method stub
		List<MPenunjangGroup> result = this.getData(page, limit);
		this.total = this.getPenunjangGroups().size();

		return result;
	}

	public List<MPenunjangGroup> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPenunjangGroup> query = current.createQuery("FROM MPenunjangGroup p WHERE p.pmedisgroupAktif = :pmedisgroupAktif", MPenunjangGroup.class).setFirstResult((page-1)*limit).setMaxResults(limit);
		query.setParameter("pmedisgroupAktif", "Y");
		List<MPenunjangGroup> result = query.getResultList();

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
	public MPenunjangGroup getPenunjangGroup(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MPenunjangGroup result = current.get(MPenunjangGroup.class, Id);
		return result;
	}

	@Override
	public void PenunjangGroupStore(MPenunjangGroup penunjangModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(penunjangModel);
	}

	@Override
	public void PenunjangGroupUpdate(MPenunjangGroup penunjangModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(penunjangModel);
	}

	@Override
	public void PenunjangGroupDelete(MPenunjangGroup penunjangModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(penunjangModel);
	}
}
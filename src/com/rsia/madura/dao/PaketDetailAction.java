/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:54:17
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:27:12
*/
package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MPaketDetail;

@Repository
public class PaketDetailAction implements PaketDetailDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	

	@Override
	public List<MPaketDetail> getPaketDetails() {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketDetail> query = current.createQuery("FROM MPaketDetail", MPaketDetail.class);
		List<MPaketDetail> result = query.getResultList();
		return result;
	}

	@Override
	public List<MPaketDetail> getPaketDetails(int page, int limit) {
		// TODO Auto-generated method stub
		List<MPaketDetail> result = this.getData(page, limit);
		this.total = this.getPaketDetails().size();

		return result;
	}

	public List<MPaketDetail> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MPaketDetail> query = current.createQuery("FROM MPaketDetail", MPaketDetail.class).setMaxResults(limit);
		List<MPaketDetail> result = query.getResultList();

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
	public MPaketDetail getPaketDetail(int Id) {
		// TODO Auto-generated method stub
		Session current = sessionFactory.getCurrentSession();
		MPaketDetail result = current.get(MPaketDetail.class, Id);
		return result;
	}

	@Override
	public void PaketDetailStore(MPaketDetail PaketDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		current.save(PaketDetailModel);
	}

	@Override
	public void PaketDetailUpdate(MPaketDetail PaketDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PaketDetailModel);
	}

	@Override
	public void PaketDetailDelete(MPaketDetail PaketDetailModel) {
		Session current = sessionFactory.getCurrentSession();
		current.saveOrUpdate(PaketDetailModel);
	}
}
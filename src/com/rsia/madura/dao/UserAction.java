package com.rsia.madura.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.query.spi.ReturnMetadata;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rsia.madura.entity.MUser;

@Repository
public class UserAction implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public int total;
	
	@Override
	public List<MUser> getUsers() {
		Session current = sessionFactory.getCurrentSession();
		
		Query<MUser> query = current.createQuery("from MUser where userAktif = 'Y'", MUser.class);
		 
		List<MUser> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<MUser> getUsers(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MUser> query = current.createQuery("from MUser", MUser.class);
		List<MUser> result = query.getResultList();
		this.total = result.size();
		result = this.getData(page, limit);

		return result;
	}

	public List<MUser> getData(int page, int limit) {
		Session current = sessionFactory.getCurrentSession();
		Query<MUser> query = current.createQuery("from MUser", MUser.class).setFirstResult((page-1)*limit).setMaxResults(limit);
		List<MUser> result = query.getResultList();

		return result;
	}

	@Override
	public String createLinks(int page, int limit) {
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
	public MUser findByUserName(String userName) {
		Session current = sessionFactory.getCurrentSession();
		Query query = current.createQuery("from MUser WHERE userName = :userName");

		query.setParameter("userName", userName);

		List<MUser> result = query.list();
		MUser user = (MUser) result.get(0);

		return user;
	}

	@Override
	public MUser getUser(int userId) {
		Session current = sessionFactory.getCurrentSession();
		
		MUser result = current.get(MUser.class, userId);
		
		return result;
	}

	@Override
	public int userStore(MUser userModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.save(userModel);
		current.flush();
		
		return userModel.getUserID();
	}

	@Override
	public int userUpdate(MUser userModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(userModel);
		current.flush();
		
		return userModel.getUserID();
	}

	@Override
	public int userDelete(MUser userModel) {
		Session current = sessionFactory.getCurrentSession();
		
		current.saveOrUpdate(userModel);
		current.flush();
		
		return userModel.getUserID();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}

package com.rsia.madura.service;

import java.util.List;
import java.security.Principal;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsia.madura.dao.UserDAO;
import com.rsia.madura.entity.MUser;

@Service
public class UserServiceAction implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	@Transactional
	public List<MUser> getUsers() {
		
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public List<MUser> getUsers(int page, int limit) {
		return userDAO.getUsers(page, limit);
	}

	@Override
	@Transactional
	public MUser getUser(int userId) {
		
		return userDAO.getUser(userId);
	}

	@Override
	@Transactional
	public MUser findByUserName(String username) {
		return userDAO.findByUserName(username);
	}

	@Override
	@Transactional
	public String createLinks(int page, int limit) {
		return userDAO.createLinks(page, limit);
	}

	@Override
	@Transactional
	public int store(MUser data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		// Principal principal = SecurityContextHolder.getContext().getAuthentication(); // get current user

		if (data.getUserRole() != null) {
			data.getUserRole().forEach((role) -> {
				role.setUser(data);
			});
		}
		data.setUserPassword(bCryptPasswordEncoder.encode(data.getUserPassword()));
		data.setUserAktif("Y");
		data.setUserCreatedBy("Admin");
		// data.setUserCreatedBy(principal.getName());
		data.setUserCreatedDate(currentTime);
		
		return userDAO.userStore(data);

	}

	@Override
	@Transactional
	public int update(MUser data) {
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		data.setUserUpdatedBy("Admin");	
		data.setUserUpdatedDate(currentTime);
		
		return userDAO.userUpdate(data);

	}

	@Override
	@Transactional
	public int delete(MUser data) {
		
		return userDAO.userDelete(data);

	}

}

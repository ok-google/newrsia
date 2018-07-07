package com.rsia.madura.service;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

import com.rsia.madura.dao.UserDAO;
import com.rsia.madura.entity.MUser;

public class UserServiceLogin implements UserDetailsService {
    
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) {
        MUser user = userDAO.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found by name: " + username);
        }
        return toUserDetails(user);
    }

    private UserDetails toUserDetails(MUser user) {
        ArrayList<String> tempRoles = new ArrayList<String>();
        if (user.getUserRole() != null) {
            user.getUserRole().forEach((role) -> {
                tempRoles.add(role.getRole().getRolePriv());
            });
        }
        String[] userRoles = new String[tempRoles.size()];
        userRoles = tempRoles.toArray(userRoles);
        return User.withUsername(user.getUserName()).password(user.getUserPassword()).roles(userRoles).build();
    }

    public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}

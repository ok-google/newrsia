package com.rsia.madura.dao;

import java.util.List;

import com.rsia.madura.entity.MUser;

public interface UserDAO {
	public List<MUser> getUsers();
	public List<MUser> getUsers(int page, int limit);
	public String createLinks(int page, int limit);
	public MUser findByUserName(String username);
	public MUser getUser(int userId);
	
	public int userStore(MUser userModel);
	public int userUpdate(MUser userModel);
	public int userDelete(MUser userModel);
}

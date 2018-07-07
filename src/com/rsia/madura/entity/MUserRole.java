package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name="s_user_role")
public class MUserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userRoleID")
	private int userRoleID;
	
	@ManyToOne
	private MUser user;

	@ManyToOne
	private MRole role;

	public int getUserRoleID() {
		return userRoleID;
	}

	public void setUserRoleID(int userRoleID) {
		this.userRoleID = userRoleID;
	}

	public MUser getUser() {
		return user;
	}

	public void setUser(MUser user) {
		this.user = user;
	}

	public MRole getRole() {
		return role;
	}

	public void setRole(MRole role) {
		this.role = role;
	}
	
}



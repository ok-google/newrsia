package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_role")
public class MRole {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private int roleID;
	
	@Column(name="s_usergroup_id")
	private int usergroupId;
	
	@Column(name="s_menu_id")
	private int menuId;
	
	@Column(name="role_autoload")
	private char roleAutoload;
	
	@Column(name="role_priv")
	private String rolePriv;
	
	@Column(name="role_active")
	private char roleAktif;
	  
	@Column(name="role_created_date")
	private Timestamp roleCreatedDate;
	
	@Column(name="role_created_by")
	private String roleCreatedBy;
	
	@Column(name="role_updated_date")
	private Timestamp roleUpdatedDate;
	
	@Column(name="role_updated_by")
	private String roleUpdatedBy;
	
	@Column(name="role_update_count")
	private int roleRevised;
	
	@Column(name="role_deleted_date")
	private Timestamp roleDeletedDate;

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public int getUsergroupId() {
		return usergroupId;
	}

	public void setUsergroupId(int usergroupId) {
		this.usergroupId = usergroupId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public char getRoleAutoload() {
		return roleAutoload;
	}

	public void setRoleAutoload(char roleAutoload) {
		this.roleAutoload = roleAutoload;
	}

	public String getRolePriv() {
		return rolePriv;
	}

	public void setRolePriv(String rolePriv) {
		this.rolePriv = rolePriv;
	}

	public char getRoleAktif() {
		return roleAktif;
	}

	public void setRoleAktif(char roleAktif) {
		this.roleAktif = roleAktif;
	}

	public Timestamp getRoleCreatedDate() {
		return roleCreatedDate;
	}

	public void setRoleCreatedDate(Timestamp roleCreatedDate) {
		this.roleCreatedDate = roleCreatedDate;
	}

	public String getRoleCreatedBy() {
		return roleCreatedBy;
	}

	public void setRoleCreatedBy(String roleCreatedBy) {
		this.roleCreatedBy = roleCreatedBy;
	}

	public Timestamp getRoleUpdatedDate() {
		return roleUpdatedDate;
	}

	public void setRoleUpdatedDate(Timestamp roleUpdatedDate) {
		this.roleUpdatedDate = roleUpdatedDate;
	}

	public String getRoleUpdatedBy() {
		return roleUpdatedBy;
	}

	public void setRoleUpdatedBy(String roleUpdatedBy) {
		this.roleUpdatedBy = roleUpdatedBy;
	}

	public int getRoleRevised() {
		return roleRevised;
	}

	public void setRoleRevised(int roleRevised) {
		this.roleRevised = roleRevised;
	}

	public Timestamp getRoleDeletedDate() {
		return roleDeletedDate;
	}

	public void setRoleDeletedDate(Timestamp roleDeletedDate) {
		this.roleDeletedDate = roleDeletedDate;
	}

	@Override
	public String toString() {
		return "s_Role [roleID=" + roleID + ", usergroupId=" + usergroupId + ", menuId=" + menuId + ", roleAutoload="
				+ roleAutoload + ", rolePriv=" + rolePriv + ", roleAktif=" + roleAktif + ", roleCreatedDate="
				+ roleCreatedDate + ", roleCreatedBy=" + roleCreatedBy + ", roleUpdatedDate=" + roleUpdatedDate
				+ ", roleUpdatedBy=" + roleUpdatedBy + ", roleRevised=" + roleRevised + ", roleDeletedDate="
				+ roleDeletedDate + "]";
	}
	
	
	
}



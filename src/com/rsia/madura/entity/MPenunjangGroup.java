/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-12 15:40:22
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-12 17:14:43
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="m_penunjangmedis_group")
public class MPenunjangGroup {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pmedisgroup_id")
	private int pmedisgroupID;
	
	@Column(name="pmedisgroup_master")
	private String pmedisgroupMaster;
	
	@Column(name="pmedisgroup_detail")
	private String pmedisgroupDetail;
	
	@Column(name="pmedisgroup_urut")
	private Integer pmedisgroupUrut;

	@Column(name="pmedisgroup_aktif")
	private String pmedisgroupAktif;
	
	@Column(name="reg_company_id ")
	private Integer regCompanyID ;
	
	@Column(name="reg_apps_id ")
	private Integer regAppsID ;
	
	public int getPmedisgroupID() {
		return this.pmedisgroupID;
	}

	public void setPmedisgroupID(int pmedisgroupID) {
		this.pmedisgroupID = pmedisgroupID;
	}

	public String getPmedisgroupMaster() {
		return this.pmedisgroupMaster;
	}

	public void setPmedisgroupMaster(String pmedisgroupMaster) {
		this.pmedisgroupMaster = pmedisgroupMaster;
	}

	public String getPmedisgroupDetail() {
		return this.pmedisgroupDetail;
	}

	public void setPmedisgroupDetail(String pmedisgroupDetail) {
		this.pmedisgroupDetail = pmedisgroupDetail;
	}

	public Integer getPmedisgroupUrut() {
		return this.pmedisgroupUrut;
	}

	public void setPmedisgroupUrut(Integer pmedisgroupUrut) {
		this.pmedisgroupUrut = pmedisgroupUrut;
	}

	public String getPmedisgroupAktif() {
		return this.pmedisgroupAktif;
	}

	public void setPmedisgroupAktif(String pmedisgroupAktif) {
		this.pmedisgroupAktif = pmedisgroupAktif;
	}

	public Integer getRegCompanyID() {
		return this.regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID) {
		this.regCompanyID = regCompanyID;
	}

	public Integer getRegAppsID() {
		return this.regAppsID;
	}

	public void setRegAppsID(Integer regAppsID) {
		this.regAppsID = regAppsID;
	}
}
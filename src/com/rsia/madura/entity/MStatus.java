/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-17 11:51:04
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-17 12:07:12
*/

package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_status")
public class MStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private int statusID;

	@Column(name = "status_kode")
	private String statusKode;

	@Column(name = "status_nama")
	private String statusNama;

	@Column(name = "status_aktif")
	private String statusAktif;

	@Column(name = "status_created_by")
	private String statusCreatedBy;

	@Column(name = "status_created_date")
	private Timestamp statusCreatedDate;

	@Column(name = "status_updated_by")
	private String statusUpdatedBy;

	@Column(name = "status_updated_date")
	private Timestamp statusUpdatedDate;

	@Column(name = "status_revised")
	private Integer statusRevised;

	@Column(name = "status_urut")
	private Integer statusUrut;

	@Column(name = "status_filter")
	private String statusFilter;

	@Column(name = "reg_company_id")
	private Integer regCompanyID;

	@Column(name = "reg_apps_id")
	private Integer regAppsID;

	@Column(name = "status_keterangan")
	private String statusKeterangan;

	public int getStatusID(int statusID) {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}


	public String getStatusKode(String statusKode) {
		return statusKode;
	}

	public void setStatusKode(String statusKode) {
		this.statusKode = statusKode;
	}


	public String getStatusNama(String statusNama) {
		return statusNama;
	}

	public void setStatusNama(String statusNama) {
		this.statusNama = statusNama;
	}


	public String getStatusAktif(String statusAktif) {
		return statusAktif;
	}

	public void setStatusAktif(String statusAktif) {
		this.statusAktif = statusAktif;
	}


	public String getStatusCreatedBy(String statusCreatedBy) {
		return statusCreatedBy;
	}

	public void setStatusCreatedBy(String statusCreatedBy) {
		this.statusCreatedBy = statusCreatedBy;
	}


	public Timestamp getStatusCreatedDate(Timestamp statusCreatedDate) {
		return statusCreatedDate;
	}

	public void setStatusCreatedDate(Timestamp statusCreatedDate) {
		this.statusCreatedDate = statusCreatedDate;
	}


	public String getStatusUpdatedBy(String statusUpdatedBy) {
		return statusUpdatedBy;
	}

	public void setStatusUpdatedBy(String statusUpdatedBy) {
		this.statusUpdatedBy = statusUpdatedBy;
	}


	public Timestamp getStatusUpdatedDate(Timestamp statusUpdatedDate) {
		return statusUpdatedDate;
	}

	public void setStatusUpdatedDate(Timestamp statusUpdatedDate) {
		this.statusUpdatedDate = statusUpdatedDate;
	}


	public Integer getStatusRevised(Integer statusRevised) {
		return statusRevised;
	}

	public void setStatusRevised(Integer statusRevised) {
		this.statusRevised = statusRevised;
	}


	public Integer getStatusUrut(Integer statusUrut) {
		return statusUrut;
	}

	public void setStatusUrut(Integer statusUrut) {
		this.statusUrut = statusUrut;
	}


	public String getStatusFilter(String statusFilter) {
		return statusFilter;
	}

	public void setStatusFilter(String statusFilter) {
		this.statusFilter = statusFilter;
	}


	public Integer getRegCompanyID(Integer regCompanyID) {
		return regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID) {
		this.regCompanyID = regCompanyID;
	}


	public Integer getRegAppsID(Integer regAppsID) {
		return regAppsID;
	}

	public void setRegAppsID(Integer regAppsID) {
		this.regAppsID = regAppsID;
	}


	public String getStatusKeterangan(String statusKeterangan) {
		return statusKeterangan;
	}

	public void setStatusKeterangan(String statusKeterangan) {
		this.statusKeterangan = statusKeterangan;
	}

}
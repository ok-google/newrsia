/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-28 15:50:53
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-29 23:22:37
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

// disamakan aja dengan file dump mIcd9
@Entity
@Table(name="m_icd9")
public class MIcd9 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "icd9_id")
	private int icd9ID;

	@Column(name = "icd9_kode")
	private String icd9Kode;

	@Column(name = "icd9_nama")
	private String icd9Nama;

	@Column(name = "icd9_alias")
	private String icd9Alias;

	@Column(name = "icd9_keterangan")
	private String icd9Keterangan;

	@Column(name = "icd9_aktif")
	private String icd9Aktif;

	@Column(name = "icd9_created_by")
	private String icd9CreatedBy;

	@Column(name = "icd9_created_date")
	private Timestamp icd9CreatedDate;

	@Column(name = "icd9_updated_by")
	private String icd9UpdatedBy;

	@Column(name = "icd9_updated_date")
	private Timestamp icd9UpdatedDate;

	@Column(name = "icd9_revised")
	private Integer icd9Revised;

	@Column(name = "reg_company_id")
	private Integer regCompanyID;

	@Column(name = "reg_apps_id")
	private Integer regAppsID;

	@Column(name = "icd9_unit_id")
	private Integer icd9UnitID;

	public int getIcd9ID() {
		return icd9ID;
	}

	public void setIcd9ID(int icd9ID) {
		this.icd9ID = icd9ID;
	}

	public String getIcd9Kode() {
		return icd9Kode;
	}

	public void setIcd9Kode(String icd9Kode) {
		this.icd9Kode = icd9Kode;
	}

	public String getIcd9Nama() {
		return icd9Nama;
	}

	public void setIcd9Nama(String icd9Nama) {
		this.icd9Nama = icd9Nama;
	}

	public String getIcd9Alias() {
		return icd9Alias;
	}

	public void setIcd9Alias(String icd9Alias) {
		this.icd9Alias = icd9Alias;
	}

	public String getIcd9Keterangan() {
		return icd9Keterangan;
	}

	public void setIcd9Keterangan(String icd9Keterangan) {
		this.icd9Keterangan = icd9Keterangan;
	}

	public String getIcd9Aktif() {
		return icd9Aktif;
	}

	public void setIcd9Aktif(String icd9Aktif) {
		this.icd9Aktif = icd9Aktif;
	}

	public String getIcd9CreatedBy() {
		return icd9CreatedBy;
	}

	public void setIcd9CreatedBy(String icd9CreatedBy) {
		this.icd9CreatedBy = icd9CreatedBy;
	}

	public Timestamp getIcd9CreatedDate() {
		return icd9CreatedDate;
	}

	public void setIcd9CreatedDate(Timestamp icd9CreatedDate) {
		this.icd9CreatedDate = icd9CreatedDate;
	}

	public String getIcd9UpdatedBy() {
		return icd9UpdatedBy;
	}

	public void setIcd9UpdatedBy(String icd9UpdatedBy) {
		this.icd9UpdatedBy = icd9UpdatedBy;
	}

	public Timestamp getIcd9UpdatedDate() {
		return icd9UpdatedDate;
	}

	public void setIcd9UpdatedDate(Timestamp icd9UpdatedDate) {
		this.icd9UpdatedDate = icd9UpdatedDate;
	}

	public Integer getIcd9Revised() {
		return icd9Revised;
	}

	public void setIcd9Revised(Integer icd9Revised) {
		this.icd9Revised = icd9Revised;
	}

	public Integer getRegCompanyID() {
		return regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID) {
		this.regCompanyID = regCompanyID;
	}

	public Integer getRegAppsID() {
		return regAppsID;
	}

	public void setRegAppsID(Integer regAppsID) {
		this.regAppsID = regAppsID;
	}

	public Integer getIcd9UnitID() {
		return icd9UnitID;
	}

	public void setIcd9UnitID(Integer icd9UnitID) {
		this.icd9UnitID = icd9UnitID;
	}

	@Override
	public String toString() {
		return "mIcd9 [icd9ID=" + icd9ID + "]";
	}  

}
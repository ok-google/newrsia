/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-27 13:31:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-28 09:08:38
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

// disamakan aja dengan file dump mIcd
@Entity
@Table(name="m_icd")
public class MIcd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "icd_id")
	private int icdID;

	@Column(name = "icd_parent_id")
	private Integer icdParentID;

	@Column(name = "icd_parent_kode")
	private String icdParentKode;

	@Column(name = "icd_nama")
	private String icdNama;

	@Column(name = "icd_keterangan")
	private String icdKeterangan;

	@Column(name = "icd_aktif")
	private String icdAktif;

	@Column(name = "icd_created_by")
	private String icdCreatedBy;

	@Column(name = "icd_created_date")
	private Timestamp icdCreatedDate;

	@Column(name = "icd_updated_by")
	private String icdUpdatedBy;

	@Column(name = "icd_updated_date")
	private Timestamp icdUpdatedDate;

	@Column(name = "icd_revised")
	private Integer icdRevised;

	@Column(name = "m_unit_id")
	private Integer mUnitID;

	@Column(name = "icd_kode")
	private String icdKode;

	@Column(name = "icd_alias")
	private String icdAlias;

	@Column(name = "icd_dtd_kode")
	private String icdDtdKode;

	@Column(name = "icd_dtd_nama")
	private String icdDtdNama;

	@Column(name = "icd_unit_id")
	private String icdUnitID;

	@Column(name = "icd_dtd_id")
	private Integer icdDtdID;

	public int getIcdID() {
		return icdID;
	}

	public void setIcdID(int icdID) {
		this.icdID = icdID;
	}

	public Integer getIcdParentID() {
		return icdParentID;
	}

	public void setIcdParentID(Integer icdParentID) {
		this.icdParentID = icdParentID;
	}

	public String getIcdParentKode() {
		return icdParentKode;
	}

	public void setIcdParentKode(String icdParentKode) {
		this.icdParentKode = icdParentKode;
	}

	public String getIcdNama() {
		return icdNama;
	}

	public void setIcdNama(String icdNama) {
		this.icdNama = icdNama;
	}

	public String getIcdKeterangan() {
		return icdKeterangan;
	}

	public void setIcdKeterangan(String icdKeterangan) {
		this.icdKeterangan = icdKeterangan;
	}

	public String getIcdAktif() {
		return icdAktif;
	}

	public void setIcdAktif(String icdAktif) {
		this.icdAktif = icdAktif;
	}

	public String getIcdCreatedBy() {
		return icdCreatedBy;
	}

	public void setIcdCreatedBy(String icdCreatedBy) {
		this.icdCreatedBy = icdCreatedBy;
	}

	public Timestamp getIcdCreatedDate() {
		return icdCreatedDate;
	}

	public void setIcdCreatedDate(Timestamp icdCreatedDate) {
		this.icdCreatedDate = icdCreatedDate;
	}

	public String getIcdUpdatedBy() {
		return icdUpdatedBy;
	}

	public void setIcdUpdatedBy(String icdUpdatedBy) {
		this.icdUpdatedBy = icdUpdatedBy;
	}

	public Timestamp getIcdUpdatedDate() {
		return icdUpdatedDate;
	}

	public void setIcdUpdatedDate(Timestamp icdUpdatedDate) {
		this.icdUpdatedDate = icdUpdatedDate;
	}

	public Integer getIcdRevised() {
		return icdRevised;
	}

	public void setIcdRevised(Integer icdRevised) {
		this.icdRevised = icdRevised;
	}

	public Integer getMUnitID() {
		return mUnitID;
	}

	public void setIUnitID(Integer mUnitID) {
		this.mUnitID = mUnitID;
	}

	public String getIcdKode() {
		return icdKode;
	}

	public void setIcdKode(String icdKode) {
		this.icdKode = icdKode;
	}

	public String getIcdAlias() {
		return icdAlias;
	}

	public void setIcdAlias(String icdAlias) {
		this.icdAlias = icdAlias;
	}

	public String getIcdDtdKode() {
		return icdDtdKode;
	}

	public void setIcdDtdKode(String icdDtdKode) {
		this.icdDtdKode = icdDtdKode;
	}

	public String getIcdDtdNama() {
		return icdDtdNama;
	}

	public void setIcdDtdNama(String icdDtdNama) {
		this.icdDtdNama = icdDtdNama;
	}

	public String getIcdUnitID() {
		return icdUnitID;
	}

	public void setIcdUnitID(String icdUnitID) {
		this.icdUnitID = icdUnitID;
	}

	public Integer getIcdDtdID() {
		return icdDtdID;
	}

	public void setIcdDtdID(Integer icdDtdID) {
		this.icdDtdID = icdDtdID;
	}
}
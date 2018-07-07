/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:10:39 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:10:39 
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
@Table(name="m_wali")
public class MWali {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wali_id")
	private int waliID;
	
	@Column(name="m_pasien_id")
	private int mPasienID;
	
	@Column(name="wali_kode")
	private String waliKode;
	
	@Column(name="wali_nama")
	private String waliNama;
	
	@Column(name="wali_kelamin")
	private String waliKelamin;
	
	@Column(name="wali_alamat")
	private String waliAlamat;
	
	@Column(name="wali_hubungan")
	private String waliHubungan;
	
	@Column(name="wali_aktif")
	private String waliAktif;
	
	@Column(name="wali_created_by")
	private String waliCreatedBy;
	
	@Column(name="wali_created_date")
	private Timestamp waliCreatedDate;
	
	@Column(name="wali_updated_by")
	private String waliUpdatedBy;
	
	@Column(name="wali_updated_date")
	private Timestamp waliUpdatedDate;
	
	@Column(name="wali_revised")
	private int waliRevised;
	
	@Column(name="wali_tgllahir")
	private Timestamp waliTgllahir;
	
	@Column(name="wali_deleted_date")
	private Timestamp waliDeletedDate;

	public int getWaliID() {
		return waliID;
	}

	public void setWaliID(int waliID) {
		this.waliID = waliID;
	}

	public int getMPasienID() {
		return mPasienID;
	}

	public void setMPasienID(int mPasienID) {
		this.mPasienID = mPasienID;
	}

	public String getWaliKode() {
		return waliKode;
	}

	public void setWaliKode(String waliKode) {
		this.waliKode = waliKode;
	}

	public String getWaliNama() {
		return waliNama;
	}

	public void setWaliNama(String waliNama) {
		this.waliNama = waliNama;
	}

	public String getWaliKelamin() {
		return waliKelamin;
	}

	public void setWaliKelamin(String waliKelamin) {
		this.waliKelamin = waliKelamin;
	}

	public String getWaliAlamat() {
		return waliAlamat;
	}

	public void setWaliAlamat(String waliAlamat) {
		this.waliAlamat = waliAlamat;
	}

	public String getWaliHubungan() {
		return waliHubungan;
	}

	public void setWaliHubungan(String waliHubungan) {
		this.waliHubungan = waliHubungan;
	}

	public String getWaliAktif() {
		return waliAktif;
	}

	public void setWaliAktif(String waliAktif) {
		this.waliAktif = waliAktif;
	}

	public String getWaliCreatedBy() {
		return waliCreatedBy;
	}

	public void setWaliCreatedBy(String waliCreatedBy) {
		this.waliCreatedBy = waliCreatedBy;
	}

	public Timestamp getWaliCreatedDate() {
		return waliCreatedDate;
	}

	public void setWaliCreatedDate(Timestamp waliCreatedDate) {
		this.waliCreatedDate = waliCreatedDate;
	}

	public String getWaliUpdatedBy() {
		return waliUpdatedBy;
	}

	public void setWaliUpdatedBy(String waliUpdatedBy) {
		this.waliUpdatedBy = waliUpdatedBy;
	}

	public Timestamp getWaliUpdatedDate() {
		return waliUpdatedDate;
	}

	public void setWaliUpdatedDate(Timestamp waliUpdatedDate) {
		this.waliUpdatedDate = waliUpdatedDate;
	}

	public int getWaliRevised() {
		return waliRevised;
	}

	public void setWaliRevised(int waliRevised) {
		this.waliRevised = waliRevised;
	}

	public Timestamp getWaliTgllahir() {
		return waliTgllahir;
	}

	public void setWaliTgllahir(Timestamp waliTgllahir) {
		this.waliTgllahir = waliTgllahir;
	}

	public Timestamp getWaliDeletedDate() {
		return waliDeletedDate;
	}

	public void setWaliDeletedDate(Timestamp waliDeletedDate) {
		this.waliDeletedDate = waliDeletedDate;
	}

	@Override
	public String toString() {
		return "MWali [waliID=" + waliID + ", mPasienID=" + mPasienID + ", waliKode=" + waliKode
				+ ", waliNama=" + waliNama + ", waliKelamin=" + waliKelamin + ", waliAlamat=" + waliAlamat
				+ ", waliHubungan=" + waliHubungan + ", waliAktif=" + waliAktif + ", waliCreatedBy="
				+ waliCreatedBy + ", waliCreatedDate=" + waliCreatedDate + ", waliUpdatedBy=" + waliUpdatedBy
				+ ", waliUpdatedDate=" + waliUpdatedDate + ", waliRevised=" + waliRevised + ", waliTgllahir="
				+ waliTgllahir + ", waliDeletedDate=" + waliDeletedDate + "]";
	}
	
	
}


/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-24 16:59:51
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:40:51
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_diagnosa9")
public class MDiagnosa9 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "diagnosa9_id")
	private Integer diagnosa9ID;

    @Transient
    private Integer remove;

	// ganti relasi
	@Column(name = "diagnosa9_dokter")
	private Integer diagnosa9Dokter;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "diagnosa9_tanggal")
	private Date diagnosa9Tanggal;

	@Column(name = "diagnosa9_jenis")
	private String diagnosa9Jenis;

	@Column(name = "diagnosa9_kasus")
	private String diagnosa9Kasus;

	@Column(name = "diagnosa9_keterangan")
	private String diagnosa9Keterangan;

	@Column(name = "diagnosa9_aktif")
	private String diagnosa9Aktif;

	@Column(name = "diagnosa9_created_by")
	private String diagnosa9CreatedBy;

	@Column(name = "diagnosa9_created_date")
	private Timestamp diagnosa9CreatedDate;

	@Column(name = "diagnosa9_update_by")
	private String diagnosa9UpdateBy;

	@Column(name = "diagnosa9_update_date")
	private Timestamp diagnosa9UpdateDate;

	@Column(name = "reg_company_id")
	private Integer regCompanyID;

	@Column(name = "reg_apps_id")
	private Integer regAppsID;

	@ManyToOne
	private MPendaftaran pendaftaran;

	@ManyToOne
	private MIcd9 icd9;

	public Integer getDiagnosa9ID() {
		return diagnosa9ID;
	}

	public void setDiagnosa9ID(Integer diagnosa9ID) {
		this.diagnosa9ID = diagnosa9ID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}


	public Integer getDiagnosa9Dokter() {
		return diagnosa9Dokter;
	}

	public void setDiagnosa9Dokter(Integer diagnosa9Dokter) {
		this.diagnosa9Dokter = diagnosa9Dokter;
	}

	public Date getDiagnosa9Tanggal() {
		return diagnosa9Tanggal;
	}

	public void setDiagnosa9Tanggal(Date diagnosa9Tanggal) {
		this.diagnosa9Tanggal = diagnosa9Tanggal;
	}

	public String getDiagnosa9Jenis() {
		return diagnosa9Jenis;
	}

	public void setDiagnosa9Jenis(String diagnosa9Jenis) {
		this.diagnosa9Jenis = diagnosa9Jenis;
	}

	public String getDiagnosa9Kasus() {
		return diagnosa9Kasus;
	}

	public void setDiagnosa9Kasus(String diagnosa9Kasus) {
		this.diagnosa9Kasus = diagnosa9Kasus;
	}

	public String getDiagnosa9Keterangan() {
		return diagnosa9Keterangan;
	}

	public void setDiagnosa9Keterangan(String diagnosa9Keterangan) {
		this.diagnosa9Keterangan = diagnosa9Keterangan;
	}

	public String getDiagnosa9Aktif() {
		return diagnosa9Aktif;
	}

	public void setDiagnosa9Aktif(String diagnosa9Aktif) {
		this.diagnosa9Aktif = diagnosa9Aktif;
	}

	public String getDiagnosa9CreatedBy() {
		return diagnosa9CreatedBy;
	}

	public void setDiagnosa9CreatedBy(String diagnosa9CreatedBy) {
		this.diagnosa9CreatedBy = diagnosa9CreatedBy;
	}

	public Timestamp getDiagnosa9CreatedDate() {
		return diagnosa9CreatedDate;
	}

	public void setDiagnosa9CreatedDate(Timestamp diagnosa9CreatedDate) {
		this.diagnosa9CreatedDate = diagnosa9CreatedDate;
	}

	public String getDiagnosa9UpdateBy() {
		return diagnosa9UpdateBy;
	}

	public void setDiagnosa9UpdateBy(String diagnosa9UpdateBy) {
		this.diagnosa9UpdateBy = diagnosa9UpdateBy;
	}

	public Timestamp getDiagnosa9UpdateDate() {
		return diagnosa9UpdateDate;
	}

	public void setDiagnosa9UpdateDate(Timestamp diagnosa9UpdateDate) {
		this.diagnosa9UpdateDate = diagnosa9UpdateDate;
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

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	public MIcd9 getIcd9() {
		return icd9;
	}

	public void setIcd9(MIcd9 icd9) {
		this.icd9 = icd9;
	}

}

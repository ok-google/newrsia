/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-23 14:23:55
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:40:01
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
import javax.persistence.Transient;

@Entity
@Table(name="t_tindakan_pasein")
public class MTindakanPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tindakanpasienpasien_id")
	private Integer tindakanpasienID;

    @Transient
    private Integer remove;

	@Column(name="tindakanpasien_harga")
	private Integer tindakanpasienHarga;

	@Column(name="tindakanpasien_created_by")
	private String tindakanpasienCreatedBy;
	
	@Column(name="tindakanpasien_created_date")
	private Timestamp tindakanpasienCreatedDate;
	
	@Column(name="tindakanpasien_updated_by")
	private String tindakanpasienUpdatedBy;
	
	@Column(name="tindakanpasien_updated_date")
	private Timestamp tindakanpasienUpdatedDate;

	@Column(name="tindakanpasien_deleted_by")
	private String tindakanpasienDeletedBy;

	@Column(name="tindakanpasien_deleted_date")
	private Timestamp tindakanpasienDeletedDate;

	@Column(name="tindakanpasien_revised")
	private Integer tindakanpasienRevised;

	@ManyToOne
	private MTindakan tindakan;

	@ManyToOne
	private MPegawai pegawai;

	@ManyToOne
	private MPendaftaran pendaftaran;
	
	public Integer getTindakanpasienID() {
		return tindakanpasienID;
	}

	public void setTindakanpasienID(Integer tindakanpasienID) {
		this.tindakanpasienID = tindakanpasienID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	
	public Integer getTindakanpasienHarga() {
		return tindakanpasienHarga;
	}

	public void setTindakanpasienHarga(Integer tindakanpasienHarga) {
		this.tindakanpasienHarga = tindakanpasienHarga;
	}

	public String getTindakanpasienCreatedBy() {
		return tindakanpasienCreatedBy;
	}

	public void setTindakanpasienCreatedBy(String tindakanpasienCreatedBy) {
		this.tindakanpasienCreatedBy = tindakanpasienCreatedBy;
	}

	public Timestamp getTindakanpasienCreatedDate() {
		return tindakanpasienCreatedDate;
	}

	public void setTindakanpasienCreatedDate(Timestamp tindakanpasienCreatedDate) {
		this.tindakanpasienCreatedDate = tindakanpasienCreatedDate;
	}

	public String getTindakanpasienUpdatedBy() {
		return tindakanpasienUpdatedBy;
	}

	public void setTindakanpasienUpdatedBy(String tindakanpasienUpdatedBy) {
		this.tindakanpasienUpdatedBy = tindakanpasienUpdatedBy;
	}

	public Timestamp getTindakanpasienUpdatedDate() {
		return tindakanpasienUpdatedDate;
	}

	public void setTindakanpasienUpdatedDate(Timestamp tindakanpasienUpdatedDate) {
		this.tindakanpasienUpdatedDate = tindakanpasienUpdatedDate;
	}

	public Integer getTindakanpasienRevised() {
		return tindakanpasienRevised;
	}

	public void setTindakanpasienRevised(Integer tindakanpasienRevised) {
		this.tindakanpasienRevised = tindakanpasienRevised;
	}

	public Timestamp getTindakanpasienDeletedDate() {
		return tindakanpasienDeletedDate;
	}

	public void setTindakanpasienDeletedDate(Timestamp tindakanpasienDeletedDate) {
		this.tindakanpasienDeletedDate = tindakanpasienDeletedDate;
	}

	public String getTindakanpasienDeletedBy() {
		return tindakanpasienDeletedBy;
	}

	public void setTindakanpasienDeletedBy(String tindakanpasienDeletedBy) {
		this.tindakanpasienDeletedBy = tindakanpasienDeletedBy;
	}

	public MTindakan getTindakan() {
		return tindakan;
	}

	public void setTindakan(MTindakan tindakan) {
		this.tindakan = tindakan;
	}

	public MPegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(MPegawai pegawai) {
		this.pegawai = pegawai;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}
}
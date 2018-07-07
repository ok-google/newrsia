/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:05:52 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-28 09:41:23
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
@Table(name="m_kecamatan")
public class MKecamatan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kecamatan_id")
	private int kecamatan_id;
	
	@Column(name="kecamatan_kode")
	private String kecamatanKode;
	
	@Column(name="kecamatan_nama")
	private String kecamatanNama;
	
	@Column(name="kecamatan_aktif")
	private String kecamatanAktif;
	
	@Column(name="kecamatan_created_by")
	private String kecamatanCreatedBy;
	
	@Column(name="kecamatan_created_date")
	private Timestamp kecamatanCreatedDate;
	
	@Column(name="kecamatan_updated_by")
	private String kecamatanUpdatedBy;
	
	@Column(name="kecamatan_updated_date")
	private Timestamp kecamatanUpdatedDate;
	
	@Column(name="kecamatan_revised")
	private Integer kecamatanRevised;
	
	@Column(name="kecamatan_deleted_date")
	private Timestamp kecamatanDeletedDate;
	
	// ganti relasi
	@Column(name="m_kota_kode")
	private String kotaKode;

	public int getKecamatan_id() {
		return kecamatan_id;
	}

	public void setKecamatan_id(int kecamatan_id) {
		this.kecamatan_id = kecamatan_id;
	}

	public String getKecamatanKode() {
		return kecamatanKode;
	}

	public void setKecamatanKode(String kecamatanKode) {
		this.kecamatanKode = kecamatanKode;
	}

	public String getKecamatanNama() {
		return kecamatanNama;
	}

	public void setKecamatanNama(String kecamatanNama) {
		this.kecamatanNama = kecamatanNama;
	}

	public String getKecamatanAktif() {
		return kecamatanAktif;
	}

	public void setKecamatanAktif(String kecamatanAktif) {
		this.kecamatanAktif = kecamatanAktif;
	}

	public String getKecamatanCreatedBy() {
		return kecamatanCreatedBy;
	}

	public void setKecamatanCreatedBy(String kecamatanCreatedBy) {
		this.kecamatanCreatedBy = kecamatanCreatedBy;
	}

	public Timestamp getKecamatanCreatedDate() {
		return kecamatanCreatedDate;
	}

	public void setKecamatanCreatedDate(Timestamp kecamatanCreatedDate) {
		this.kecamatanCreatedDate = kecamatanCreatedDate;
	}

	public String getKecamatanUpdatedBy() {
		return kecamatanUpdatedBy;
	}

	public void setKecamatanUpdatedBy(String kecamatanUpdatedBy) {
		this.kecamatanUpdatedBy = kecamatanUpdatedBy;
	}

	public Timestamp getKecamatanUpdatedDate() {
		return kecamatanUpdatedDate;
	}

	public void setKecamatanUpdatedDate(Timestamp kecamatanUpdatedDate) {
		this.kecamatanUpdatedDate = kecamatanUpdatedDate;
	}

	public Integer getKecamatanRevised() {
		return kecamatanRevised;
	}

	public void setKecamatanRevised(Integer kecamatanRevised) {
		this.kecamatanRevised = kecamatanRevised;
	}

	public Timestamp getKecamatanDeletedDate() {
		return kecamatanDeletedDate;
	}

	public void setKecamatanDeletedDate(Timestamp kecamatanDeletedDate) {
		this.kecamatanDeletedDate = kecamatanDeletedDate;
	}

	public String getKotaKode() {
		return kotaKode;
	}

	public void setKotaKode(String kotaKode) {
		this.kotaKode = kotaKode;
	}

	@Override
	public String toString() {
		return "MKecamatan [kecamatan_id=" + kecamatan_id + ", kecamatanKode=" + kecamatanKode + ", kecamatanNama="
				+ kecamatanNama + ", kecamatanAktif=" + kecamatanAktif + ", kecamatanCreatedBy=" + kecamatanCreatedBy
				+ ", kecamatanCreatedDate=" + kecamatanCreatedDate + ", kecamatanUpdatedBy=" + kecamatanUpdatedBy
				+ ", kecamatanUpdatedDate=" + kecamatanUpdatedDate + ", kecamatanRevised=" + kecamatanRevised
				+ ", kecamatanDeletedDate=" + kecamatanDeletedDate + ", kotaKode=" + kotaKode + "]";
	}
	
	
}

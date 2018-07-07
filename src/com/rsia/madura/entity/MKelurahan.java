/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:06:27 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-28 09:41:58
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
@Table(name="m_kelurahan")
public class MKelurahan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kelurahan_id")
	private int kelurahan_id;
	
	@Column(name="kelurahan_kode")
	private String kelurahanKode;
	
	@Column(name="kelurahan_nama")
	private String kelurahanNama;
	
	@Column(name="kelurahan_aktif")
	private String kelurahanAktif;
	
	@Column(name="kelurahan_created_by")
	private String kelurahanCreatedBy;
	
	@Column(name="kelurahan_created_date")
	private Timestamp kelurahanCreatedDate;
	
	@Column(name="kelurahan_updated_by")
	private String kelurahanUpdatedBy;
	
	@Column(name="kelurahan_updated_date")
	private Timestamp kelurahanUpdatedDate;
	
	@Column(name="kelurahan_revised")
	private Integer kelurahanRevised;
	
	@Column(name="kelurahan_deleted_date")
	private Timestamp kelurahanDeletedDate;
	
	// ganti relasi
	@Column(name="m_kecamatan_kode")
	private String kecamatanKode;

	public int getKelurahan_id() {
		return kelurahan_id;
	}

	public void setKelurahan_id(int kelurahan_id) {
		this.kelurahan_id = kelurahan_id;
	}

	public String getKelurahanKode() {
		return kelurahanKode;
	}

	public void setKelurahanKode(String kelurahanKode) {
		this.kelurahanKode = kelurahanKode;
	}

	public String getKelurahanNama() {
		return kelurahanNama;
	}

	public void setKelurahanNama(String kelurahanNama) {
		this.kelurahanNama = kelurahanNama;
	}

	public String getKelurahanAktif() {
		return kelurahanAktif;
	}

	public void setKelurahanAktif(String kelurahanAktif) {
		this.kelurahanAktif = kelurahanAktif;
	}

	public String getKelurahanCreatedBy() {
		return kelurahanCreatedBy;
	}

	public void setKelurahanCreatedBy(String kelurahanCreatedBy) {
		this.kelurahanCreatedBy = kelurahanCreatedBy;
	}

	public Timestamp getKelurahanCreatedDate() {
		return kelurahanCreatedDate;
	}

	public void setKelurahanCreatedDate(Timestamp kelurahanCreatedDate) {
		this.kelurahanCreatedDate = kelurahanCreatedDate;
	}

	public String getKelurahanUpdatedBy() {
		return kelurahanUpdatedBy;
	}

	public void setKelurahanUpdatedBy(String kelurahanUpdatedBy) {
		this.kelurahanUpdatedBy = kelurahanUpdatedBy;
	}

	public Timestamp getKelurahanUpdatedDate() {
		return kelurahanUpdatedDate;
	}

	public void setKelurahanUpdatedDate(Timestamp kelurahanUpdatedDate) {
		this.kelurahanUpdatedDate = kelurahanUpdatedDate;
	}

	public Integer getKelurahanRevised() {
		return kelurahanRevised;
	}

	public void setKelurahanRevised(Integer kelurahanRevised) {
		this.kelurahanRevised = kelurahanRevised;
	}

	public Timestamp getKelurahanDeletedDate() {
		return kelurahanDeletedDate;
	}

	public void setKelurahanDeletedDate(Timestamp kelurahanDeletedDate) {
		this.kelurahanDeletedDate = kelurahanDeletedDate;
	}

	public String getKecamatanKode() {
		return kecamatanKode;
	}

	public void setKecamatanKode(String kecamatanKode) {
		this.kecamatanKode = kecamatanKode;
	}

	@Override
	public String toString() {
		return "MKelurahan [kelurahan_id=" + kelurahan_id + ", kelurahanKode=" + kelurahanKode + ", kelurahanNama="
				+ kelurahanNama + ", kelurahanAktif=" + kelurahanAktif + ", kelurahanCreatedBy=" + kelurahanCreatedBy
				+ ", kelurahanCreatedDate=" + kelurahanCreatedDate + ", kelurahanUpdatedBy=" + kelurahanUpdatedBy
				+ ", kelurahanUpdatedDate=" + kelurahanUpdatedDate + ", kelurahanRevised=" + kelurahanRevised
				+ ", kelurahanDeletedDate=" + kelurahanDeletedDate + ", kecamatanKode=" + kecamatanKode + "]";
	}
	
	
}

/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-07 05:12:01
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
@Table(name="m_kelas")
public class MKelas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kelas_id")
	private int kelasID;

	@Column(name = "kelas_kode")
	private String kelasKode;

	@Column(name = "kelas_nama")
	private String kelasNama;

	@Column(name = "kelas_keterangan")
	private String kelasKeterangan;

	@Column(name = "kelas_aktif")
	private String kelasAktif;

	@Column(name = "kelas_created_by")
	private String kelasCreatedBy;

	@Column(name = "kelas_created_date")
	private Timestamp kelasCreatedDate;

	@Column(name = "kelas_updated_by")
	private String kelasUpdatedBy;

	@Column(name = "kelas_updated_date")
	private Timestamp kelasUpdatedDate;

	@Column(name = "kelas_revised")
	private int kelasRevised;

	@Column(name = "kelas_deleted_date")
	private Timestamp kelasDeletedDate;

	@Column(name = "kelas_deleted_by")
	private String kelasDeletedBy;

	public int getKelasID() {
		return this.kelasID;
	}

	public void setKelasID(int kelasID) {
		this.kelasID = kelasID;
	}

	public String getKelasKode() {
		return this.kelasKode;
	}

	public void setKelasKode(String kelasKode) {
		this.kelasKode = kelasKode;
	}

	public String getKelasNama() {
		return this.kelasNama;
	}

	public void setKelasNama(String kelasNama) {
		this.kelasNama = kelasNama;
	}

	public String getKelasKeterangan() {
		return this.kelasKeterangan;
	}

	public void setKelasKeterangan(String kelasKeterangan) {
		this.kelasKeterangan = kelasKeterangan;
	}

	public String getKelasAktif() {
		return this.kelasAktif;
	}

	public void setKelasAktif(String kelasAktif) {
		this.kelasAktif = kelasAktif;
	}

	public String getKelasCreatedBy() {
		return this.kelasCreatedBy;
	}

	public void setKelasCreatedBy(String kelasCreatedBy) {
		this.kelasCreatedBy = kelasCreatedBy;
	}

	public Timestamp getKelasCreatedDate() {
		return this.kelasCreatedDate;
	}

	public void setKelasCreatedDate(Timestamp kelasCreatedDate) {
		this.kelasCreatedDate = kelasCreatedDate;
	}

	public String getKelasUpdatedBy() {
		return this.kelasUpdatedBy;
	}

	public void setKelasUpdatedBy(String kelasUpdatedBy) {
		this.kelasUpdatedBy = kelasUpdatedBy;
	}

	public Timestamp getKelasUpdatedDate() {
		return this.kelasUpdatedDate;
	}

	public void setKelasUpdatedDate(Timestamp kelasUpdatedDate) {
		this.kelasUpdatedDate = kelasUpdatedDate;
	}

	public int getKelasRevised() {
		return this.kelasRevised;
	}

	public void setKelasRevised(int kelasRevised) {
		this.kelasRevised = kelasRevised;
	}

	public Timestamp getKelasDeletedDate() {
		return this.kelasDeletedDate;
	}

	public void setKelasDeletedDate(Timestamp kelasDeletedDate) {
		this.kelasDeletedDate = kelasDeletedDate;
	}

	public String getKelasDeletedBy() {
		return this.kelasDeletedBy;
	}

	public void setKelasDeletedBy(String kelasDeletedBy) {
		this.kelasDeletedBy = kelasDeletedBy;
	}

	@Override
	public String toString() {
		return "mKelas [kelasID=" + kelasID + ", kelasKode=" + kelasKode + ", kelasNama=" + kelasNama + ", kelasKeterangan=" + kelasKeterangan +"]";
	}
}
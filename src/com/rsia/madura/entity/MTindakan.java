/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 21:25:37
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
@Table(name="m_tindakan")
public class MTindakan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tindakan_id")
	private int tindakanID;

	@Column(name="tindakan_jenis")
	private String tindakanJenis;
	
	@Column(name="tindakan_kategori")
	private String tindakanKategori;
	
	@Column(name="tindakan_kode")
	private String tindakanKode;
	
	@Column(name="tindakan_nama")
	private String tindakanNama;
	
	@Column(name="tindakan_keterangan")
	private String tindakanKeterangan;

	@ManyToOne
	private MKelas kelas;
	
	@Column(name="tindakan_harga")
	private Integer tindakanHarga;
	
	@Column(name="tindakan_aktif")
	private String tindakanAktif;
	
	@Column(name="tindakan_created_by")
	private String tindakanCreatedBy;
	
	@Column(name="tindakan_created_date")
	private Timestamp tindakanCreatedDate;
	
	@Column(name="tindakan_updated_by")
	private String tindakanUpdatedBy;
	
	@Column(name="tindakan_updated_date")
	private Timestamp tindakanUpdatedDate;
	
	@Column(name="tindakan_revised")
	private int tindakanRevised;
	
	@Column(name="tindakan_deleted_by")
	private String tindakanDeletedBy;
	
	@Column(name="tindakan_deleted_date")
	private Timestamp tindakanDeletedDate;
	
	public int getTindakanID() {
		return tindakanID;
	}

	public void setTindakanID(int tindakanID) {
		this.tindakanID = tindakanID;
	}

	public String getTindakanJenis() {
		return tindakanJenis;
	}

	public void setTindakanJenis(String tindakanJenis) {
		this.tindakanJenis = tindakanJenis;
	}

	public String getTindakanKategori() {
		return tindakanKategori;
	}

	public void setTindakanKategori(String tindakanKategori) {
		this.tindakanKategori = tindakanKategori;
	}

	public String getTindakanKode() {
		return tindakanKode;
	}

	public void setTindakanKode(String tindakanKode) {
		this.tindakanKode = tindakanKode;
	}

	public String getTindakanNama() {
		return tindakanNama;
	}

	public void setTindakanNama(String tindakanNama) {
		this.tindakanNama = tindakanNama;
	}

	public String getTindakanKeterangan() {
		return tindakanKeterangan;
	}

	public MKelas getKelas() {
		return this.kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public Integer getTindakanHarga() {
		return tindakanHarga;
	}

	public void setTindakanHarga(Integer tindakanHarga) {
		this.tindakanHarga = tindakanHarga;
	}

	public void setTindakanKeterangan(String tindakanKeterangan) {
		this.tindakanKeterangan = tindakanKeterangan;
	}

	public String getTindakanAktif() {
		return tindakanAktif;
	}

	public void setTindakanAktif(String tindakanAktif) {
		this.tindakanAktif = tindakanAktif;
	}

	public String getTindakanCreatedBy() {
		return tindakanCreatedBy;
	}

	public void setTindakanCreatedBy(String tindakanCreatedBy) {
		this.tindakanCreatedBy = tindakanCreatedBy;
	}

	public Timestamp getTindakanCreatedDate() {
		return tindakanCreatedDate;
	}

	public void setTindakanCreatedDate(Timestamp tindakanCreatedDate) {
		this.tindakanCreatedDate = tindakanCreatedDate;
	}

	public String getTindakanUpdatedBy() {
		return tindakanUpdatedBy;
	}

	public void setTindakanUpdatedBy(String tindakanUpdatedBy) {
		this.tindakanUpdatedBy = tindakanUpdatedBy;
	}

	public Timestamp getTindakanUpdatedDate() {
		return tindakanUpdatedDate;
	}

	public void setTindakanUpdatedDate(Timestamp tindakanUpdatedDate) {
		this.tindakanUpdatedDate = tindakanUpdatedDate;
	}

	public int getTindakanRevised() {
		return tindakanRevised;
	}

	public void setTindakanRevised(int tindakanRevised) {
		this.tindakanRevised = tindakanRevised;
	}

	public Timestamp getTindakanDeletedDate() {
		return tindakanDeletedDate;
	}

	public void setTindakanDeletedDate(Timestamp tindakanDeletedDate) {
		this.tindakanDeletedDate = tindakanDeletedDate;
	}

	public String getTindakanDeletedBy() {
		return tindakanDeletedBy;
	}

	public void setTindakanDeletedBy(String tindakanDeletedBy) {
		this.tindakanDeletedBy = tindakanDeletedBy;
	}
}
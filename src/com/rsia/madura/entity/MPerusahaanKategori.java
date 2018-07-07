package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_perusahaan_kategori")
public class MPerusahaanKategori {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="perusahaankategori_id")
	private int perusahaanKategoriId;
	
	@Column(name="perusahaanategori_Kode")
	private String perusahaanKategoriKode;
	
	@Column(name="perusahaankategori_nama")
	private String perusahaanKategoriNama;
	
	@Column(name="perusahaankategori_parent")
	private String perusahaanKategoriParent;
	
	@Column(name="perusahaankategori_parent_kode")
	private String perusahaanKategoriParentKode;
	
	@Column(name="perusahaankategori_aktif")
	private char perusahaanAktif;
	
	@Column(name="perusahaankategori_created_by")
	private String perusahaanKategoriCreatedBy;
	
	@Column(name="perusahaankategori_created_date")
	private Timestamp perusahaanKategoriCreatedDate;
	
	@Column(name="perusahaankategori_updated_by")
	private String perusahaanKategoriUpdatedBy;
	
	@Column(name="perusahaankategori_updated_date")
	private Timestamp perusahaanKategoriUpdatedDate;
	
	@Column(name="perusahaankategori_revised")
	private int perusahaanKategoriRevised;
	
	@Column(name="perusahaankategori_keterangan")
	private String perusahaanKategoriKeterangan;
	
	@Column(name="perusahaankategori_deleted_date")
	private Timestamp perusahaanKategoriDeletedDate;

	public int getPerusahaanKategoriId() {
		return perusahaanKategoriId;
	}

	public void setPerusahaanKategoriId(int perusahaanKategoriId) {
		this.perusahaanKategoriId = perusahaanKategoriId;
	}

	public String getPerusahaanKategoriKode() {
		return perusahaanKategoriKode;
	}

	public void setPerusahaanKategoriKode(String perusahaanKategoriKode) {
		this.perusahaanKategoriKode = perusahaanKategoriKode;
	}

	public String getPerusahaanKategoriNama() {
		return perusahaanKategoriNama;
	}

	public void setPerusahaanKategoriNama(String perusahaanKategoriNama) {
		this.perusahaanKategoriNama = perusahaanKategoriNama;
	}

	public String getPerusahaanKategoriParent() {
		return perusahaanKategoriParent;
	}

	public void setPerusahaanKategoriParent(String perusahaanKategoriParent) {
		this.perusahaanKategoriParent = perusahaanKategoriParent;
	}

	public String getPerusahaanKategoriParentKode() {
		return perusahaanKategoriParentKode;
	}

	public void setPerusahaanKategoriParentKode(String perusahaanKategoriParentKode) {
		this.perusahaanKategoriParentKode = perusahaanKategoriParentKode;
	}

	public char getPerusahaanAktif() {
		return perusahaanAktif;
	}

	public void setPerusahaanAktif(char perusahaanAktif) {
		this.perusahaanAktif = perusahaanAktif;
	}

	public String getPerusahaanKategoriCreatedBy() {
		return perusahaanKategoriCreatedBy;
	}

	public void setPerusahaanKategoriCreatedBy(String perusahaanKategoriCreatedBy) {
		this.perusahaanKategoriCreatedBy = perusahaanKategoriCreatedBy;
	}

	public Timestamp getPerusahaanKategoriCreatedDate() {
		return perusahaanKategoriCreatedDate;
	}

	public void setPerusahaanKategoriCreatedDate(Timestamp perusahaanKategoriCreatedDate) {
		this.perusahaanKategoriCreatedDate = perusahaanKategoriCreatedDate;
	}

	public String getPerusahaanKategoriUpdatedBy() {
		return perusahaanKategoriUpdatedBy;
	}

	public void setPerusahaanKategoriUpdatedBy(String perusahaanKategoriUpdatedBy) {
		this.perusahaanKategoriUpdatedBy = perusahaanKategoriUpdatedBy;
	}

	public Timestamp getPerusahaanKategoriUpdatedDate() {
		return perusahaanKategoriUpdatedDate;
	}

	public void setPerusahaanKategoriUpdatedDate(Timestamp perusahaanKategoriUpdatedDate) {
		this.perusahaanKategoriUpdatedDate = perusahaanKategoriUpdatedDate;
	}

	public int getPerusahaanKategoriRevised() {
		return perusahaanKategoriRevised;
	}

	public void setPerusahaanKategoriRevised(int perusahaanKategoriRevised) {
		this.perusahaanKategoriRevised = perusahaanKategoriRevised;
	}

	public String getPerusahaanKategoriKeterangan() {
		return perusahaanKategoriKeterangan;
	}

	public void setPerusahaanKategoriKeterangan(String perusahaanKategoriKeterangan) {
		this.perusahaanKategoriKeterangan = perusahaanKategoriKeterangan;
	}

	public Timestamp getPerusahaanKategoriDeletedDate() {
		return perusahaanKategoriDeletedDate;
	}

	public void setPerusahaanKategoriDeletedDate(Timestamp perusahaanKategoriDeletedDate) {
		this.perusahaanKategoriDeletedDate = perusahaanKategoriDeletedDate;
	}

	@Override
	public String toString() {
		return "MPerusahaanKategori [perusahaanKategoriId=" + perusahaanKategoriId + ", perusahaanKategoriKode="
				+ perusahaanKategoriKode + ", perusahaanKategoriNama=" + perusahaanKategoriNama
				+ ", perusahaanKategoriParent=" + perusahaanKategoriParent + ", perusahaanKategoriParentKode="
				+ perusahaanKategoriParentKode + ", perusahaanAktif=" + perusahaanAktif
				+ ", perusahaanKategoriCreatedBy=" + perusahaanKategoriCreatedBy + ", perusahaanKategoriCreatedDate="
				+ perusahaanKategoriCreatedDate + ", perusahaanKategoriUpdatedBy=" + perusahaanKategoriUpdatedBy
				+ ", perusahaanKategoriUpdatedDate=" + perusahaanKategoriUpdatedDate + ", perusahaanKategoriRevised="
				+ perusahaanKategoriRevised + ", perusahaanKategoriKeterangan=" + perusahaanKategoriKeterangan
				+ ", perusahaanKategoriDeletedDate=" + perusahaanKategoriDeletedDate + "]";
	}
	
	
}
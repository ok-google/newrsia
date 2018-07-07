package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_barang_kategori")
public class MBarangKategori {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="barangkategori_id")
	private int barangKategoriId;
	
	@Column(name="barangkategori_kode")
	private String barangKategoriKode;
	
	@Column(name="barangkategori_nama")
	private String barangKategoriNama;
	
	@Column(name="barangkategori_parent")
	private int barangKategoriParent;
	
	@Column(name="barangkategori_keterangan")
	private String barangKategoriKeterangan;
	
	@Column(name="barangkategori_aktif")
	private String barangKategoriAktif;

	@Column(name=" barangkategori_created_by")
	private String barangKategoriCreatedBy;
	
	@Column(name="barangkategori_created_date")
	private Timestamp barangKategoriCreatedDate;
	
	@Column(name="barangkategori_updated_by")
	private String barangKategoriUpdatedBy;
	
	@Column(name="barangkategori_updated_date")
	private Timestamp barangKategoriUpdatedDate;
	
	@Column(name="barangkategori_revised")
	private int barangKategoriRevised;
	
	@Column(name="barang_kategori_deleted_date")
	private Timestamp barangKategoriDeletedDate;

	public int getBarangKategoriId() {
		return barangKategoriId;
	}

	public void setbarangKategoriId(int idBarangKategori) {
		barangKategoriId = idBarangKategori;
	}

	public String getBarangKategoriKode() {
		return barangKategoriKode;
	}

	public void setbarangKategoriKode(String kodeBarangKategori) {
		barangKategoriKode = kodeBarangKategori;
	}

	public String getBarangKategoriNama() {
		return barangKategoriNama;
	}

	public void setbarangKategoriNama(String namaBarangKategori) {
		barangKategoriNama = namaBarangKategori;
	}

	public int getBarangKategoriParent() {
		return barangKategoriParent;
	}

	public void setbarangKategoriParent(int parentBarangKategori) {
		barangKategoriParent = parentBarangKategori;
	}

	public String getBarangKategoriKeterangan() {
		return barangKategoriKeterangan;
	}

	public void setbarangKategoriKeterangan(String keteranganBarangKategori) {
		barangKategoriKeterangan = keteranganBarangKategori;
	}

	public String getBarangKategoriAktif() {
		return barangKategoriAktif;
	}

	public void setbarangKategoriAktif(String aktifBarangKategori) {
		barangKategoriAktif = aktifBarangKategori;
	}

	public String getBarangKategoriCreatedBy() {
		return barangKategoriCreatedBy;
	}

	public void setbarangKategoriCreatedBy(String creatBarangKategori) {
		barangKategoriCreatedBy = creatBarangKategori;
	}

	public Timestamp getBarangKategoriCreatedDate() {
		return barangKategoriCreatedDate;
	}

	public void setbarangKategoriCreatedDate(Timestamp createDateBarangKategori) {
		barangKategoriCreatedDate = createDateBarangKategori;
	}

	public String getBarangKategoriUpdatedBy() {
		return barangKategoriUpdatedBy;
	}

	public void setbarangKategoriUpdatedBy(String updateBarangKategori) {
		barangKategoriUpdatedBy = updateBarangKategori;
	}

	public Timestamp getBarangKategoriUpdatedDate() {
		return barangKategoriUpdatedDate;
	}

	public void setbarangKategoriUpdatedDate(Timestamp datebarangKategoriUpdatedBy) {
		barangKategoriUpdatedDate = datebarangKategoriUpdatedBy;
	}

	public int getBarangKategoriRevised() {
		return barangKategoriRevised;
	}

	public void setbarangKategoriRevised(int revisedBarangKategori) {
		barangKategoriRevised = revisedBarangKategori;
	}

	public Timestamp getBarangKategoriDeletedDate() {
		return barangKategoriDeletedDate;
	}

	public void setbarangKategoriDeletedDate(Timestamp deleteDateBarangKategori) {
		barangKategoriDeletedDate = deleteDateBarangKategori;
	}

	@Override
	public String toString() {
		return "MBarangKategori [barangKategoriId=" + barangKategoriId + ", barangKategoriKode=" + barangKategoriKode
				+ ", barangKategoriNama=" + barangKategoriNama + ", barangKategoriParent=" + barangKategoriParent
				+ ", barangKategoriKeterangan=" + barangKategoriKeterangan + ", barangKategoriAktif="
				+ barangKategoriAktif + ", barangKategoriCreatedBy=" + barangKategoriCreatedBy + ", barangKategoriCreatedDate="
				+ barangKategoriCreatedDate + ", barangKategoriUpdatedBy=" + barangKategoriUpdatedBy
				+ ", barangKategoriUpdatedDate=" + barangKategoriUpdatedDate + ", barangKategoriRevised="
				+ barangKategoriRevised + ", barangKategoriDeletedDate=" + barangKategoriDeletedDate + "]";
	}
	
}


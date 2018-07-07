package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="m_barangdet")
public class MBarangDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="barangdet_id")
	private int barangDetId;
	
	@Column(name="barangdet_master_id")
	private int barangDetMasterId;
	
	@Column(name="barangdet_barang_id")
	private int barangDetBarangId;
	
	@Column(name="barangdet_barang_nama")
	private String barangDetBarangNama;
	
	@Column(name="barangdet_satuan_id")
	private int barangDetSatuanId;
	
	@Column(name="barangdet_satuan_nama")
	private String barangDetSatuanNama;
	
	@Column(name=" barangdet_keterangan")
	private String barangDetKeterangan;
	
	@Column(name="barangdet_jumlah")
	private int barangDetJumlah;
	
	@Column(name="barangdet_created_by")
	private String barangDetCreatedBy;
	
	@Column(name=" barangdet_created_date")
	private Timestamp barangDetCreatedDate;
	
	@Column(name="barangdet_updated_by")
	private String barangDetUpdatedBy;
	
	@Column(name=" barangdet_updated_date")
	private Timestamp barangDetUpdatedDate;
	
	@Column(name="barangdet_revised")
	private int barangDetRevised;
	
	@Column(name="barangdet_deleted_date")
	private Timestamp barangDetDeletedDate;
	
	@ManyToOne
	private MBarang barang;

	public int getBarangDetId() {
		return barangDetId;
	}

	public void setBarangDetId(int barangDetId) {
		barangDetId = barangDetId;
	}

	public int getBarangDetMasterId() {
		return barangDetMasterId;
	}

	public void setBarangDetMasterId(int barangDetMasterId) {
		barangDetMasterId = barangDetMasterId;
	}

	public int getBarangDetBarangId() {
		return barangDetBarangId;
	}

	public void setBarangDetBarangId(int barangDetBarangId) {
		barangDetBarangId = barangDetBarangId;
	}

	public String getBarangDetBarangNama() {
		return barangDetBarangNama;
	}

	public void setBarangDetBarangNama(String barangDetBarangNama) {
		barangDetBarangNama = barangDetBarangNama;
	}

	public int getBarangDetSatuanId() {
		return barangDetSatuanId;
	}

	public void setBarangDetSatuanId(int barangDetSatuanId) {
		barangDetSatuanId = barangDetSatuanId;
	}

	public String getBarangDetSatuanNama() {
		return barangDetSatuanNama;
	}

	public void setBarangDetSatuanNama(String barangDetSatuanNama) {
		barangDetSatuanNama = barangDetSatuanNama;
	}

	public String getBarangDetKeterangan() {
		return barangDetKeterangan;
	}

	public void setBarangDetKeterangan(String barangDetKeterangan) {
		barangDetKeterangan = barangDetKeterangan;
	}

	public int getBarangDetJumlah() {
		return barangDetJumlah;
	}

	public void setBarangDetJumlah(int barangDetJumlah) {
		barangDetJumlah = barangDetJumlah;
	}

	public String getBarangDetCreatedBy() {
		return barangDetCreatedBy;
	}

	public void setBarangDetCreatedBy(String barangDetCreatedBy) {
		barangDetCreatedBy = barangDetCreatedBy;
	}

	public Timestamp getBarangDetCreatedDate() {
		return barangDetCreatedDate;
	}

	public void setBarangDetCreatedDate(Timestamp barangDetCreatedDate) {
		barangDetCreatedDate = barangDetCreatedDate;
	}

	public String getBarangDetUpdatedBy() {
		return barangDetUpdatedBy;
	}

	public void setBarangDetUpdatedBy(String barangDetUpdatedBy) {
		barangDetUpdatedBy = barangDetUpdatedBy;
	}

	public Timestamp getBarangDetUpdatedDate() {
		return barangDetUpdatedDate;
	}

	public void setBarangDetUpdatedDate(Timestamp barangDetUpdatedDate) {
		barangDetUpdatedDate = barangDetUpdatedDate;
	}

	public int getBarangDetRevised() {
		return barangDetRevised;
	}

	public void setBarangDetRevised(int barangDetRevised) {
		barangDetRevised = barangDetRevised;
	}

	public Timestamp getBarangDetDeletedDate() {
		return barangDetDeletedDate;
	}

	public void setBarangDetDeletedDate(Timestamp barangDetDeletedDate) {
		barangDetDeletedDate = barangDetDeletedDate;
	}

	public MBarang getBarang() {
		return barang;
	}

	public void setBarang(MBarang barang) {
		this.barang = barang;
	}

	@Override
	public String toString() {
		return "MBarangDetail [barangDetId=" + barangDetId + ", barangDetMasterId=" + barangDetMasterId + ", barangDetBarangId=" + barangDetBarangId
				+ ", barangDetBarangNama=" + barangDetBarangNama + ", barangDetSatuanId=" + barangDetSatuanId + ", barangDetSatuanNama=" + barangDetSatuanNama
				+ ", barangDetKeterangan=" + barangDetKeterangan + ", barangDetJumlah=" + barangDetJumlah + ", barangDetCreatedBy=" + barangDetCreatedBy
				+ ", barangDetCreatedDate=" + barangDetCreatedDate + ", barangDetUpdatedBy=" + barangDetUpdatedBy + ", barangDetUpdatedDate=" + barangDetUpdatedDate
				+ ", barangDetRevised=" + barangDetRevised + ", barangDetDeletedDate=" + barangDetDeletedDate + ", barang=" + barang + "]";
	}
	
	
}

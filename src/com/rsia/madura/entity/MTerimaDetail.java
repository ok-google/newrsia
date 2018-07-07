package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_terimadet")
public class MTerimaDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="terimadet_id")
	private int terimaDetailId;
	
	@Column(name="terimadet_terima_id")
	private int terimaDetailTerimaId;
	
	@Column(name="terimadet_barang_id")
	private int terimaDetailBarangId;
	
	@Column(name="terimadet_barang_nama")
	private String terimaDetailBarangNama;
	 
	@Column(name="terimadet_kadaluarsa")
	private Date terimaDetailKadaluarsa;
	  
	@Column(name="terimadet_satuan")
	private int terimaDetailSatuan;
	  
	@Column(name="terimadet_satuan_nama")
	private String terimaDetailSatuanNama;
	  
	@Column(name="terimadet_jumlah")
	private int terimaDetailJumlah;
	
	@Column(name="terimadet_harga")
	private double terimaDetailHarga;
	  
	@Column(name="terimadet_diskon")
	private int terimaDetailDiskon;
	  
	@Column(name="terimadet_subtotal")
	private double terimaDetailSubTotal;
	  
	@Column(name="terimadet_jumlah_diorder")
	private int terimaDetailJumlahDiOrder;
	 
	@Column(name="terimadet_ppn")
	private int terimaDetailPPN;

	@Column(name="terimadet_status")
	private int terimaDetailStatus;

	@Column(name="terimadet_batch")
	private String terimaDetailBatch;
	 
	@Column(name="terimadet_created_by")
	private String terimaDetailCreatedBy;
	
	@Column(name="terimadet_created_date")
	private Timestamp terimaDetailCreatedDate;
	
	@Column(name="terimadet_updated_by")
	private String terimaDetailUpdatedBy;
	
	@Column(name="terimadet_updated_date")
	private Timestamp terimaDetailUpdatedDate;
	
	@Column(name="terimadet_revised")
	private String terimaDetailRevised;
	
	@Column(name="terimadet_deleted_date")
	private Timestamp terimaDetailDeletedDate;
	
	@ManyToOne
	private MTerima terima;
	
	public int getTerimaDetailId() {
		return terimaDetailId;
	}

	public void setTerimaDetailId(int terimaDetailId) {
		this.terimaDetailId = terimaDetailId;
	}

	public int getTerimaDetailTerimaId() {
		return terimaDetailTerimaId;
	}

	public void setTerimaDetailTerimaId(int terimaDetailTerimaId) {
		this.terimaDetailTerimaId = terimaDetailTerimaId;
	}

	public int getTerimaDetailBarangId() {
		return terimaDetailBarangId;
	}

	public void setTerimaDetailBarangId(int terimaDetailBarangId) {
		this.terimaDetailBarangId = terimaDetailBarangId;
	}

	public String getTerimaDetailBarangNama() {
		return terimaDetailBarangNama;
	}

	public void setTerimaDetailBarangNama(String terimaDetailBarangNama) {
		this.terimaDetailBarangNama = terimaDetailBarangNama;
	}

	public Date getTerimaDetailKadaluarsa() {
		return terimaDetailKadaluarsa;
	}

	public void setTerimaDetailKadaluarsa(Date terimaDetailKadaluarsa) {
		this.terimaDetailKadaluarsa = terimaDetailKadaluarsa;
	}

	public int getTerimaDetailSatuan() {
		return terimaDetailSatuan;
	}

	public void setTerimaDetailSatuan(int terimaDetailSatuan) {
		this.terimaDetailSatuan = terimaDetailSatuan;
	}

	public String getTerimaDetailSatuanNama() {
		return terimaDetailSatuanNama;
	}

	public void setTerimaDetailSatuanNama(String terimaDetailSatuanNama) {
		this.terimaDetailSatuanNama = terimaDetailSatuanNama;
	}

	public int getTerimaDetailJumlah() {
		return terimaDetailJumlah;
	}

	public void setTerimaDetailJumlah(int terimaDetailJumlah) {
		this.terimaDetailJumlah = terimaDetailJumlah;
	}

	public double getTerimaDetailHarga() {
		return terimaDetailHarga;
	}

	public void setTerimaDetailHarga(double terimaDetailHarga) {
		this.terimaDetailHarga = terimaDetailHarga;
	}

	public int getTerimaDetailDiskon() {
		return terimaDetailDiskon;
	}

	public void setTerimaDetailDiskon(int terimaDetailDiskon) {
		this.terimaDetailDiskon = terimaDetailDiskon;
	}

	public double getTerimaDetailSubTotal() {
		return terimaDetailSubTotal;
	}

	public void setTerimaDetailSubTotal(double terimaDetailSubTotal) {
		this.terimaDetailSubTotal = terimaDetailSubTotal;
	}

	public int getTerimaDetailJumlahDiOrder() {
		return terimaDetailJumlahDiOrder;
	}

	public void setTerimaDetailJumlahDiOrder(int terimaDetailJumlahDiOrder) {
		this.terimaDetailJumlahDiOrder = terimaDetailJumlahDiOrder;
	}

	public int getTerimaDetailPPN() {
		return terimaDetailPPN;
	}

	public void setTerimaDetailPPN(int terimaDetailPPN) {
		this.terimaDetailPPN = terimaDetailPPN;
	}

	public int getTerimaDetailStatus() {
		return terimaDetailStatus;
	}

	public void setTerimaDetailStatus(int terimaDetailStatus) {
		this.terimaDetailStatus = terimaDetailStatus;
	}

	public String getTerimaDetailBatch() {
		return terimaDetailBatch;
	}

	public void setTerimaDetailBatch(String terimaDetailBatch) {
		this.terimaDetailBatch = terimaDetailBatch;
	}

	public String getTerimaDetailCreatedBy() {
		return terimaDetailCreatedBy;
	}

	public void setTerimaDetailCreatedBy(String terimaDetailCreatedBy) {
		this.terimaDetailCreatedBy = terimaDetailCreatedBy;
	}

	public Timestamp getTerimaDetailCreatedDate() {
		return terimaDetailCreatedDate;
	}

	public void setTerimaDetailCreatedDate(Timestamp terimaDetailCreatedDate) {
		this.terimaDetailCreatedDate = terimaDetailCreatedDate;
	}

	public String getTerimaDetailUpdatedBy() {
		return terimaDetailUpdatedBy;
	}

	public void setTerimaDetailUpdatedBy(String terimaDetailUpdatedBy) {
		this.terimaDetailUpdatedBy = terimaDetailUpdatedBy;
	}

	public Timestamp getTerimaDetailUpdatedDate() {
		return terimaDetailUpdatedDate;
	}

	public void setTerimaDetailUpdatedDate(Timestamp terimaDetailUpdatedDate) {
		this.terimaDetailUpdatedDate = terimaDetailUpdatedDate;
	}

	public String getTerimaDetailRevised() {
		return terimaDetailRevised;
	}

	public void setTerimaDetailRevised(String terimaDetailRevised) {
		this.terimaDetailRevised = terimaDetailRevised;
	}

	public Timestamp getTerimaDetailDeletedDate() {
		return terimaDetailDeletedDate;
	}

	public void setTerimaDetailDeletedDate(Timestamp terimaDetailDeletedDate) {
		this.terimaDetailDeletedDate = terimaDetailDeletedDate;
	}

	public MTerima getTerima() {
		return terima;
	}

	public void setTerima(MTerima terima) {
		this.terima = terima;
	}

	@Override
	public String toString() {
		return "MTerimaDetail [terimaDetailId=" + terimaDetailId + ", terimaDetailTerimaId=" + terimaDetailTerimaId
				+ ", terimaDetailBarangId=" + terimaDetailBarangId + ", terimaDetailBarangNama="
				+ terimaDetailBarangNama + ", terimaDetailKadaluarsa=" + terimaDetailKadaluarsa
				+ ", terimaDetailSatuan=" + terimaDetailSatuan + ", terimaDetailSatuanNama=" + terimaDetailSatuanNama
				+ ", terimaDetailJumlah=" + terimaDetailJumlah + ", terimaDetailHarga=" + terimaDetailHarga
				+ ", terimaDetailDiskon=" + terimaDetailDiskon + ", terimaDetailSubTotal=" + terimaDetailSubTotal
				+ ", terimaDetailJumlahDiOrder=" + terimaDetailJumlahDiOrder + ", terimaDetailPPN=" + terimaDetailPPN
				+ ", terimaDetailStatus=" + terimaDetailStatus + ", terimaDetailBatch=" + terimaDetailBatch
				+ ", terimaDetailCreatedBy=" + terimaDetailCreatedBy + ", terimaDetailCreatedDate="
				+ terimaDetailCreatedDate + ", terimaDetailUpdatedBy=" + terimaDetailUpdatedBy
				+ ", terimaDetailUpdatedDate=" + terimaDetailUpdatedDate + ", terimaDetailRevised="
				+ terimaDetailRevised + ", terimaDetailDeletedDate=" + terimaDetailDeletedDate + ", terima=" + terima
				+ "]";
	}
	
	
	
	
}

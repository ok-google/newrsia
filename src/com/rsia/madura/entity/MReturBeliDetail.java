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
@Table(name="t_retur_beliDetail")
public class MReturBeliDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returbelidetail_id")
	private int ReturBeliDetailId;
	
	@Column(name="returbelidetail_returbeli_id")
	private int ReturBeliDetailReturId;
	
	@Column(name="returbelidetail_barang_id")
	private int ReturBeliDetailBarangId;
	
	@Column(name="returbelidetail_barang_nama")
	private String ReturbeliBarangNama;
	
	@Column(name="returbelidetail_satuan_id")
	private int ReturBeliDetailSatuanId;
	
	@Column(name="returbelidetail_satuan_nama")
	private String ReturbeliSatuanNama;
	  
	@Column(name="returbelidetail_kadaluarsa")
	private Date ReturBeliDetailKadaluarsa;
	
	@Column(name="returbelidetail_jumlah")
	private int ReturBeliDetailJumlah;
	
	@Column(name="returbelidetail_harga")
	private int ReturBeliDetailHarga;
	
	@Column(name="returbelidetail_diskon")
	private int ReturBeliDetailDiskon;
	
	@Column(name="returbelidetail_subtotal")
	private int ReturBeliDetailSubTotal;
	
	@Column(name="returbelidetail_created_by")
	private String ReturBeliDetailCreatedBy;
	
	@Column(name="returbelidetail_created_date")
	private Timestamp ReturBeliDetailCreatedDate;
	
	@Column(name="returbelidetail_updated_by")
	private String ReturBeliDetailUpdatedBy;
	
	@Column(name="returbelidetail_updated_date")
	private Timestamp ReturBeliDetailUpdatedDate;
	
	@Column(name="returbelidetail_revised")
	private int ReturBeliDetailRevised;
	
	@Column(name="reg_company_id")
	private int RegCompanyId;
	  
	@Column(name="returbelidetail_deleted_date")
	private Timestamp ReturBeliDetailDeletedDate;
	
	@ManyToOne
	private MReturBeli returBeli;

	public int getReturBeliDetailId() {
		return ReturBeliDetailId;
	}

	public void setReturBeliDetailId(int returBeliId) {
		ReturBeliDetailId = returBeliId;
	}

	public int getReturBeliDetailReturId() {
		return ReturBeliDetailReturId;
	}

	public void setReturBeliDetailReturId(int returBeliReturId) {
		ReturBeliDetailReturId = returBeliReturId;
	}

	public int getReturBeliDetailBarangId() {
		return ReturBeliDetailBarangId;
	}

	public void setReturBeliDetailBarangId(int returBeliBarangId) {
		ReturBeliDetailBarangId = returBeliBarangId;
	}

	public String getReturbeliBarangNama() {
		return ReturbeliBarangNama;
	}

	public void setReturbeliBarangNama(String returbeliBarangNama) {
		ReturbeliBarangNama = returbeliBarangNama;
	}

	public int getReturBeliDetailSatuanId() {
		return ReturBeliDetailSatuanId;
	}

	public void setReturBeliDetailSatuanId(int returBeliSatuanId) {
		ReturBeliDetailSatuanId = returBeliSatuanId;
	}

	public String getReturbeliSatuanNama() {
		return ReturbeliSatuanNama;
	}

	public void setReturbeliSatuanNama(String returbeliSatuanNama) {
		ReturbeliSatuanNama = returbeliSatuanNama;
	}

	public Date getReturBeliDetailKadaluarsa() {
		return ReturBeliDetailKadaluarsa;
	}

	public void setReturBeliDetailKadaluarsa(Date returBeliKadaluarsa) {
		ReturBeliDetailKadaluarsa = returBeliKadaluarsa;
	}

	public int getReturBeliDetailJumlah() {
		return ReturBeliDetailJumlah;
	}

	public void setReturBeliDetailJumlah(int returBeliJumlah) {
		ReturBeliDetailJumlah = returBeliJumlah;
	}

	public int getReturBeliDetailHarga() {
		return ReturBeliDetailHarga;
	}

	public void setReturBeliDetailHarga(int returBeliHarga) {
		ReturBeliDetailHarga = returBeliHarga;
	}

	public int getReturBeliDetailDiskon() {
		return ReturBeliDetailDiskon;
	}

	public void setReturBeliDetailDiskon(int returBeliDiskon) {
		ReturBeliDetailDiskon = returBeliDiskon;
	}

	public int getReturBeliDetailSubTotal() {
		return ReturBeliDetailSubTotal;
	}

	public void setReturBeliDetailSubTotal(int returBeliSubTotal) {
		ReturBeliDetailSubTotal = returBeliSubTotal;
	}

	public String getReturBeliDetailCreatedBy() {
		return ReturBeliDetailCreatedBy;
	}

	public void setReturBeliDetailCreatedBy(String returBeliCreatedBy) {
		ReturBeliDetailCreatedBy = returBeliCreatedBy;
	}

	public Timestamp getReturBeliDetailCreatedDate() {
		return ReturBeliDetailCreatedDate;
	}

	public void setReturBeliDetailCreatedDate(Timestamp returBeliCreatedDate) {
		ReturBeliDetailCreatedDate = returBeliCreatedDate;
	}

	public String getReturBeliDetailUpdatedBy() {
		return ReturBeliDetailUpdatedBy;
	}

	public void setReturBeliDetailUpdatedBy(String returBeliUpdatedBy) {
		ReturBeliDetailUpdatedBy = returBeliUpdatedBy;
	}

	public Timestamp getReturBeliDetailUpdatedDate() {
		return ReturBeliDetailUpdatedDate;
	}

	public void setReturBeliDetailUpdatedDate(Timestamp returBeliUpdatedDate) {
		ReturBeliDetailUpdatedDate = returBeliUpdatedDate;
	}

	public int getReturBeliDetailRevised() {
		return ReturBeliDetailRevised;
	}

	public void setReturBeliDetailRevised(int returBeliRevised) {
		ReturBeliDetailRevised = returBeliRevised;
	}

	public int getRegCompanyId() {
		return RegCompanyId;
	}

	public void setRegCompanyId(int regCompanyId) {
		RegCompanyId = regCompanyId;
	}

	public Timestamp getReturBeliDetailDeletedDate() {
		return ReturBeliDetailDeletedDate;
	}

	public void setReturBeliDetailDeletedDate(Timestamp returBeliDeletedDate) {
		ReturBeliDetailDeletedDate = returBeliDeletedDate;
	}

	public MReturBeli getReturBeli() {
		return returBeli;
	}

	public void setReturBeli(MReturBeli returBeli) {
		this.returBeli = returBeli;
	}

	@Override
	public String toString() {
		return "MReturBeliDetailDetail [ReturBeliDetailId=" + ReturBeliDetailId + ", ReturBeliDetailReturId=" + ReturBeliDetailReturId
				+ ", ReturBeliDetailBarangId=" + ReturBeliDetailBarangId + ", ReturbeliBarangNama=" + ReturbeliBarangNama
				+ ", ReturBeliDetailSatuanId=" + ReturBeliDetailSatuanId + ", ReturbeliSatuanNama=" + ReturbeliSatuanNama
				+ ", ReturBeliDetailKadaluarsa=" + ReturBeliDetailKadaluarsa + ", ReturBeliDetailJumlah=" + ReturBeliDetailJumlah
				+ ", ReturBeliDetailHarga=" + ReturBeliDetailHarga + ", ReturBeliDetailDiskon=" + ReturBeliDetailDiskon + ", ReturBeliDetailSubTotal="
				+ ReturBeliDetailSubTotal + ", ReturBeliDetailCreatedBy=" + ReturBeliDetailCreatedBy + ", ReturBeliDetailCreatedDate="
				+ ReturBeliDetailCreatedDate + ", ReturBeliDetailUpdatedBy=" + ReturBeliDetailUpdatedBy + ", ReturBeliDetailUpdatedDate="
				+ ReturBeliDetailUpdatedDate + ", ReturBeliDetailRevised=" + ReturBeliDetailRevised + ", RegCompanyId=" + RegCompanyId
				+ ", ReturBeliDetailDeletedDate=" + ReturBeliDetailDeletedDate + ", returBeli=" + returBeli + "]";
	}
	
	
}


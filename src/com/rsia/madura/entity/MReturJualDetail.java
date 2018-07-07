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
@Table(name="t_retur_jualdetail")
public class MReturJualDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returjualdetail_id")
	private int ReturJualDetailId;

	@Column(name="returjualdetail_returjual_id")
	private int ReturJualDetailReturId;
	
	@Column(name="returjualdetail_barang_id")
	private int ReturJualDetailBarangId;
	 
	@Column(name="returjualdetail_barang_nama")
	private String ReturJualDetailBarangNama;
	 
	@Column(name="returjualdetail_satuan_id")
	private int ReturJualDetailSatuanId;
	  
	@Column(name="returjualdetail_satuan_nama")
	private String ReturJualDetailSatuanNama;
	
	@Column(name="returjualdetail_kadaluarsa")
	private Date ReturJualDetailKadaluarsa;
	  
	@Column(name="returjualdetail_jumlah")
	private int ReturJualDetailJumlah;
	
	@Column(name="returjualdetail_harga")
	private int ReturJualDetailHarga;
	
	@Column(name="returjualdetail_diskon")
	private int ReturJualDetailDiskon;
	
	@Column(name="returjualdetail_subtotal")
	private int ReturJualDetailSubTotal;
	  
	@Column(name="returjualdetail_terima_id")
	private int ReturJualDetailTerimaId;
	
	@Column(name="returjualdetail_terima_no")
	private String ReturJualDetailTerimaNo;
	
	@Column(name="returjualdetail_depo_id")
	private int ReturJualDepoId;
	
	@Column(name="returjualdetail_depo_nama")
	private String ReturJualDepoNama;
	 
	@Column(name="returjualdetail_status")
	private int ReturJualDetailStatus;
	
	@Column(name="returjualdetail_created_by")
	private String ReturJualDetailCreatedBy;

	@Column(name="returjualdetail_created_date")
	private Timestamp ReturJualDetailCreatedDate;
	
	@Column(name="returjualdetail_updated_by")
	private String ReturJualDetailUpdatedBy;

	@Column(name="returjualdetail_updated_date")
	private Timestamp ReturJualDetailUpdatedDate;
	
	@Column(name="returjualdetail_revised")
	private int ReturJualDetailRevised;
	
	@Column(name="reg_company_id")
	private int RegCompanyId;
	
	@Column(name="reg_apps_id")
	private int RegAppsId;
	
	@Column(name="returjualdetail_deleted_date")
	private Timestamp ReturJualDetaiDeletedDate;
	
	@ManyToOne
	private MReturJual returJual;

	public int getReturJualDetailId() {
		return ReturJualDetailId;
	}

	public void setReturJualDetailId(int returJualDetailId) {
		this.ReturJualDetailId = returJualDetailId;
	}

	public int getReturJualDetailReturId() {
		return ReturJualDetailReturId;
	}

	public void setReturJualDetailReturId(int returJualDetailReturId) {
		this.ReturJualDetailReturId = returJualDetailReturId;
	}

	public int getReturJualDetailBarangId() {
		return ReturJualDetailBarangId;
	}

	public void setReturJualDetailBarangId(int returJualDetailBarangId) {
		this.ReturJualDetailBarangId = returJualDetailBarangId;
	}

	public String getReturJualDetailBarangNama() {
		return ReturJualDetailBarangNama;
	}

	public void setReturJualDetailBarangNama(String returJualDetailBarangNama) {
		this.ReturJualDetailBarangNama = returJualDetailBarangNama;
	}

	public int getReturJualDetailSatuanId() {
		return ReturJualDetailSatuanId;
	}

	public void setReturJualDetailSatuanId(int returJualDetailSatuanId) {
		this.ReturJualDetailSatuanId = returJualDetailSatuanId;
	}

	public String getReturJualDetailSatuanNama() {
		return ReturJualDetailSatuanNama;
	}

	public void setReturJualDetailSatuanNama(String returJualDetailSatuanNama) {
		this.ReturJualDetailSatuanNama = returJualDetailSatuanNama;
	}

	public Date getReturJualDetailKadaluarsa() {
		return ReturJualDetailKadaluarsa;
	}

	public void setReturJualDetailKadaluarsa(Date returJualDetailKadaluarsa) {
		this.ReturJualDetailKadaluarsa = returJualDetailKadaluarsa;
	}

	public int getReturJualDetailJumlah() {
		return ReturJualDetailJumlah;
	}

	public void setReturJualDetailJumlah(int returJualDetailJumlah) {
		this.ReturJualDetailJumlah = returJualDetailJumlah;
	}

	public int getReturJualDetailHarga() {
		return ReturJualDetailHarga;
	}

	public void setReturJualDetailHarga(int returJualDetailHarga) {
		this.ReturJualDetailHarga = returJualDetailHarga;
	}

	public int getReturJualDetailDiskon() {
		return ReturJualDetailDiskon;
	}

	public void setReturJualDetailDiskon(int returJualDetailDiskon) {
		this.ReturJualDetailDiskon = returJualDetailDiskon;
	}

	public int getReturJualDetailSubTotal() {
		return ReturJualDetailSubTotal;
	}

	public void setReturJualDetailSubTotal(int returJualDetailSubTotal) {
		this.ReturJualDetailSubTotal = returJualDetailSubTotal;
	}

	public int getReturJualDetailTerimaId() {
		return ReturJualDetailTerimaId;
	}

	public void setReturJualDetailTerimaId(int returJualDetailTerimaId) {
		this.ReturJualDetailTerimaId = returJualDetailTerimaId;
	}

	public String getReturJualDetailTerimaNo() {
		return ReturJualDetailTerimaNo;
	}

	public void setReturJualDetailTerimaNo(String returJualDetailTerimaNo) {
		this.ReturJualDetailTerimaNo = returJualDetailTerimaNo;
	}

	public int getReturJualDepoId() {
		return ReturJualDepoId;
	}

	public void setReturJualDepoId(int returJualDepoId) {
		this.ReturJualDepoId = returJualDepoId;
	}

	public String getReturJualDepoNama() {
		return ReturJualDepoNama;
	}

	public void setReturJualDepoNama(String returJualDepoNama) {
		this.ReturJualDepoNama = returJualDepoNama;
	}

	public int getReturJualDetailStatus() {
		return ReturJualDetailStatus;
	}

	public void setReturJualDetailStatus(int returJualDetailStatus) {
		this.ReturJualDetailStatus = returJualDetailStatus;
	}

	public String getReturJualDetailCreatedBy() {
		return ReturJualDetailCreatedBy;
	}

	public void setReturJualDetailCreatedBy(String returJualDetailCreatedBy) {
		this.ReturJualDetailCreatedBy = returJualDetailCreatedBy;
	}

	public Timestamp getReturJualDetailCreatedDate() {
		return ReturJualDetailCreatedDate;
	}

	public void setReturJualDetailCreatedDate(Timestamp returJualDetailCreatedDate) {
		this.ReturJualDetailCreatedDate = returJualDetailCreatedDate;
	}

	public String getReturJualDetailUpdatedBy() {
		return ReturJualDetailUpdatedBy;
	}

	public void setReturJualDetailUpdatedBy(String returJualDetailUpdatedBy) {
		this.ReturJualDetailUpdatedBy = returJualDetailUpdatedBy;
	}

	public Timestamp getReturJualDetailUpdatedDate() {
		return ReturJualDetailUpdatedDate;
	}

	public void setReturJualDetailUpdatedDate(Timestamp returJualDetailUpdatedDate) {
		ReturJualDetailUpdatedDate = returJualDetailUpdatedDate;
	}

	public int getReturJualDetailRevised() {
		return ReturJualDetailRevised;
	}

	public void setReturJualDetailRevised(int returJualDetailRevised) {
		ReturJualDetailRevised = returJualDetailRevised;
	}

	public int getRegCompanyId() {
		return RegCompanyId;
	}

	public void setRegCompanyId(int regCompanyId) {
		RegCompanyId = regCompanyId;
	}

	public int getRegAppsId() {
		return RegAppsId;
	}

	public void setRegAppsId(int regAppsId) {
		RegAppsId = regAppsId;
	}

	public Timestamp getReturJualDetaiDeletedDate() {
		return ReturJualDetaiDeletedDate;
	}

	public void setReturJualDetaiDeletedDate(Timestamp returJualDetaiDeletedDate) {
		ReturJualDetaiDeletedDate = returJualDetaiDeletedDate;
	}

	public MReturJual getReturJual() {
		return returJual;
	}

	public void setReturJual(MReturJual returJual) {
		this.returJual = returJual;
	}

	@Override
	public String toString() {
		return "MReturJualDetail [ReturJualDetailId=" + ReturJualDetailId + ", ReturJualDetailReturId="
				+ ReturJualDetailReturId + ", ReturJualDetailBarangId=" + ReturJualDetailBarangId
				+ ", ReturJualDetailBarangNama=" + ReturJualDetailBarangNama + ", ReturJualDetailSatuanId="
				+ ReturJualDetailSatuanId + ", ReturJualDetailSatuanNama=" + ReturJualDetailSatuanNama
				+ ", ReturJualDetailKadaluarsa=" + ReturJualDetailKadaluarsa + ", ReturJualDetailJumlah="
				+ ReturJualDetailJumlah + ", ReturJualDetailHarga=" + ReturJualDetailHarga + ", ReturJualDetailDiskon="
				+ ReturJualDetailDiskon + ", ReturJualDetailSubTotal=" + ReturJualDetailSubTotal
				+ ", ReturJualDetailTerimaId=" + ReturJualDetailTerimaId + ", ReturJualDetailTerimaNo="
				+ ReturJualDetailTerimaNo + ", ReturJualDepoId=" + ReturJualDepoId + ", ReturJualDepoNama="
				+ ReturJualDepoNama + ", ReturJualDetailStatus=" + ReturJualDetailStatus + ", ReturJualDetailCreatedBy="
				+ ReturJualDetailCreatedBy + ", ReturJualDetailCreatedDate=" + ReturJualDetailCreatedDate
				+ ", ReturJualDetailUpdatedBy=" + ReturJualDetailUpdatedBy + ", ReturJualDetailUpdatedDate="
				+ ReturJualDetailUpdatedDate + ", ReturJualDetailRevised=" + ReturJualDetailRevised + ", RegCompanyId="
				+ RegCompanyId + ", RegAppsId=" + RegAppsId + ", ReturJualDetaiDeletedDate=" + ReturJualDetaiDeletedDate
				+ ", returJual=" + returJual + "]";
	}

	
}

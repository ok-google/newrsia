package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_resepdet")
public class MResepDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resepdet_id")
	private int resepdet_id;
	
	@Column(name="resepdet_resep_id")
	private int resepdetResepId;
	
	@Column(name="resepdet_barang_id")
	private int resepdetBarangId;
	
	@Column(name="resepdet_barang_nama")
	private String resepdetBarangNama;
	
	@Column(name="resepdet_satuan_id")
	private int resepdetSatuanId;
	  
	@Column(name="resepdet_satuan_nama")
	private String resepdetSatuanNama;
	
	@Column(name="resepdet_jumlah")
	private int resepdetJumlah;
	  
	@Column(name="resepdet_aturan_pakai")
	private String resepdetAturanPakai;
	 
	@Column(name="resepdet_keterangan")
	private String resepdetKeterangan;
	  
	@Column(name="resepdet_created_by")
	private String resepdetCreatedBy;
	
	@Column(name="resepdet_created_date")
	private Timestamp resepdetCreatedDate;

	@Column(name="resepdet_updated_by")
	private String resepdetUpdatedBy;
	
	@Column(name="resepdet_updated_date")
	private Timestamp resepdetUpdatedDate;
	
	@Column(name="resepdet_revised")
	private int resepdetRevised;
	  
	@Column(name="reg_company_id")
	private int regCompanyId;
	  
	@Column(name="reg_apps_id")
	private int regAppsId;
	  
	@Column(name="resepdet_aktif")
	private char resepdetAktif;
	  
	@Column(name="resepdet_deleted_date")
	private Timestamp resepdetDeletedDate;

	public int getResepdet_id() {
		return resepdet_id;
	}

	public void setResepdet_id(int resepdet_id) {
		this.resepdet_id = resepdet_id;
	}

	public int getResepdetResepId() {
		return resepdetResepId;
	}

	public void setResepdetResepId(int resepdetResepId) {
		this.resepdetResepId = resepdetResepId;
	}

	public int getResepdetBarangId() {
		return resepdetBarangId;
	}

	public void setResepdetBarangId(int resepdetBarangId) {
		this.resepdetBarangId = resepdetBarangId;
	}

	public String getResepdetBarangNama() {
		return resepdetBarangNama;
	}

	public void setResepdetBarangNama(String resepdetBarangNama) {
		this.resepdetBarangNama = resepdetBarangNama;
	}

	public int getResepdetSatuanId() {
		return resepdetSatuanId;
	}

	public void setResepdetSatuanId(int resepdetSatuanId) {
		this.resepdetSatuanId = resepdetSatuanId;
	}

	public String getResepdetSatuanNama() {
		return resepdetSatuanNama;
	}

	public void setResepdetSatuanNama(String resepdetSatuanNama) {
		this.resepdetSatuanNama = resepdetSatuanNama;
	}

	public int getResepdetJumlah() {
		return resepdetJumlah;
	}

	public void setResepdetJumlah(int resepdetJumlah) {
		this.resepdetJumlah = resepdetJumlah;
	}

	public String getResepdetAturanPakai() {
		return resepdetAturanPakai;
	}

	public void setResepdetAturanPakai(String resepdetAturanPakai) {
		this.resepdetAturanPakai = resepdetAturanPakai;
	}

	public String getResepdetKeterangan() {
		return resepdetKeterangan;
	}

	public void setResepdetKeterangan(String resepdetKeterangan) {
		this.resepdetKeterangan = resepdetKeterangan;
	}

	public String getResepdetCreatedBy() {
		return resepdetCreatedBy;
	}

	public void setResepdetCreatedBy(String resepdetCreatedBy) {
		this.resepdetCreatedBy = resepdetCreatedBy;
	}

	public Timestamp getResepdetCreatedDate() {
		return resepdetCreatedDate;
	}

	public void setResepdetCreatedDate(Timestamp resepdetCreatedDate) {
		this.resepdetCreatedDate = resepdetCreatedDate;
	}

	public String getResepdetUpdatedBy() {
		return resepdetUpdatedBy;
	}

	public void setResepdetUpdatedBy(String resepdetUpdatedBy) {
		this.resepdetUpdatedBy = resepdetUpdatedBy;
	}

	public Timestamp getResepdetUpdatedDate() {
		return resepdetUpdatedDate;
	}

	public void setResepdetUpdatedDate(Timestamp resepdetUpdatedDate) {
		this.resepdetUpdatedDate = resepdetUpdatedDate;
	}

	public int getResepdetRevised() {
		return resepdetRevised;
	}

	public void setResepdetRevised(int resepdetRevised) {
		this.resepdetRevised = resepdetRevised;
	}

	public int getRegCompanyId() {
		return regCompanyId;
	}

	public void setRegCompanyId(int regCompanyId) {
		this.regCompanyId = regCompanyId;
	}

	public int getRegAppsId() {
		return regAppsId;
	}

	public void setRegAppsId(int regAppsId) {
		this.regAppsId = regAppsId;
	}

	public char getResepdetAktif() {
		return resepdetAktif;
	}

	public void setResepdetAktif(char resepdetAktif) {
		this.resepdetAktif = resepdetAktif;
	}

	public Timestamp getResepdetDeletedDate() {
		return resepdetDeletedDate;
	}

	public void setResepdetDeletedDate(Timestamp resepdetDeletedDate) {
		this.resepdetDeletedDate = resepdetDeletedDate;
	}

	@Override
	public String toString() {
		return "t_ResepDetail [resepdet_id=" + resepdet_id + ", resepdetResepId=" + resepdetResepId
				+ ", resepdetBarangId=" + resepdetBarangId + ", resepdetBarangNama=" + resepdetBarangNama
				+ ", resepdetSatuanId=" + resepdetSatuanId + ", resepdetSatuanNama=" + resepdetSatuanNama
				+ ", resepdetJumlah=" + resepdetJumlah + ", resepdetAturanPakai=" + resepdetAturanPakai
				+ ", resepdetKeterangan=" + resepdetKeterangan + ", resepdetCreatedBy=" + resepdetCreatedBy
				+ ", resepdetCreatedDate=" + resepdetCreatedDate + ", resepdetUpdatedBy=" + resepdetUpdatedBy
				+ ", resepdetUpdatedDate=" + resepdetUpdatedDate + ", resepdetRevised=" + resepdetRevised
				+ ", regCompanyId=" + regCompanyId + ", regAppsId=" + regAppsId + ", resepdetAktif=" + resepdetAktif
				+ ", resepdetDeletedDate=" + resepdetDeletedDate + "]";
	}
	
	
}

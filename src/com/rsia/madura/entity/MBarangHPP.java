package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ms_baranghpp")
public class MBarangHPP {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="baranghpp_id")
	private int barangHPPId;
	
	@Column(name="baranghpp_barang_id")
	private int barangHPPBarangId;

	@Column(name="baranghpp_satuan_id")
	private int barangHPPSatuanId;
	
	@Column(name="baranghpp_satuankonversi_id")
	private int barangHPPSatuanKonversiId;

	@Column(name="baranghpp_tanggal")
	private Date barangHPPTanggal;
	
	@Column(name="baranghpp_validfrom")
	private Date barangHPPValidFrom;
	  
	@Column(name="baranghpp_validto")
	private Date barangHPPValidTo;
	
	@Column(name="baranghpp_harga")
	private float barangHPPHarga;
	
	@Column(name="baranghpp_diskon")
	private float barangHPPDiskon;
	
	@Column(name="baranghpp_hpp")
	private float barangHPPHPP;
	
	@Column(name="baranghpp_terima_id")
	private int barangHPPTerimaId;
	
	@Column(name="baranghpp_opname_id")
	private int barangHPPOpnameId;
	
	@Column(name="baranghpp_created_by")
	private String barangHPPCreatedBy;
	
	@Column(name="baranghpp_created_date")
	private Timestamp barangHPPCreatedDate;
	
	@Column(name="baranghpp_updated_by")
	private String barangHPPUpdatedBy;
	
	@Column(name="baranghpp_updated_date")
	private Timestamp barangHPPUpdatedDate;
	
	@Column(name=" baranghpp_revised")
	private int barangHPPRevised;
	 
	@Column(name="baranghpp_deleted_date")
	private Timestamp barangHPPDeletedDate;

	public int getBarangHPPId() {
		return barangHPPId;
	}

	public void setBarangHPPId(int barangHPPId) {
		barangHPPId = barangHPPId;
	}

	public int getBarangHPPBarangId() {
		return barangHPPBarangId;
	}

	public void setBarangHPPBarangId(int barangHPPBarangId) {
		barangHPPBarangId = barangHPPBarangId;
	}

	public int getBarangHPPSatuanId() {
		return barangHPPSatuanId;
	}

	public void setBarangHPPSatuanId(int barangHPPSatuanId) {
		barangHPPSatuanId = barangHPPSatuanId;
	}

	public int getBarangHPPSatuanKonversiId() {
		return barangHPPSatuanKonversiId;
	}

	public void setBarangHPPSatuanKonversiId(int barangHPPSatuanKonversiId) {
		barangHPPSatuanKonversiId = barangHPPSatuanKonversiId;
	}

	public Date getBarangHPPTanggal() {
		return barangHPPTanggal;
	}

	public void setBarangHPPTanggal(Date barangHPPTanggal) {
		barangHPPTanggal = barangHPPTanggal;
	}

	public Date getBarangHPPValidFrom() {
		return barangHPPValidFrom;
	}

	public void setBarangHPPValidFrom(Date barangHPPValidFrom) {
		barangHPPValidFrom = barangHPPValidFrom;
	}

	public Date getBarangHPPValidTo() {
		return barangHPPValidTo;
	}

	public void setBarangHPPValidTo(Date barangHPPValidTo) {
		barangHPPValidTo = barangHPPValidTo;
	}

	public float getBarangHPPHarga() {
		return barangHPPHarga;
	}

	public void setBarangHPPHarga(float barangHPPHarga) {
		barangHPPHarga = barangHPPHarga;
	}

	public float getBarangHPPDiskon() {
		return barangHPPDiskon;
	}

	public void setBarangHPPDiskon(float barangHPPDiskon) {
		barangHPPDiskon = barangHPPDiskon;
	}

	public float getBarangHPPHPP() {
		return barangHPPHPP;
	}

	public void setBarangHPPHPP(float barangHPPHPP) {
		barangHPPHPP = barangHPPHPP;
	}

	public int getBarangHPPTerimaId() {
		return barangHPPTerimaId;
	}

	public void setBarangHPPTerimaId(int barangHPPTerimaId) {
		barangHPPTerimaId = barangHPPTerimaId;
	}

	public int getBarangHPPOpnameId() {
		return barangHPPOpnameId;
	}

	public void setBarangHPPOpnameId(int barangHPPOpnameId) {
		barangHPPOpnameId = barangHPPOpnameId;
	}

	public String getBarangHPPCreatedBy() {
		return barangHPPCreatedBy;
	}

	public void setBarangHPPCreatedBy(String barangHPPCreatedBy) {
		barangHPPCreatedBy = barangHPPCreatedBy;
	}

	public Timestamp getBarangHPPCreatedDate() {
		return barangHPPCreatedDate;
	}

	public void setBarangHPPCreatedDate(Timestamp barangHPPCreatedDate) {
		barangHPPCreatedDate = barangHPPCreatedDate;
	}

	public String getBarangHPPUpdatedBy() {
		return barangHPPUpdatedBy;
	}

	public void setBarangHPPUpdatedBy(String barangHPPUpdatedBy) {
		barangHPPUpdatedBy = barangHPPUpdatedBy;
	}

	public Timestamp getBarangHPPUpdatedDate() {
		return barangHPPUpdatedDate;
	}

	public void setBarangHPPUpdatedDate(Timestamp barangHPPUpdatedDate) {
		barangHPPUpdatedDate = barangHPPUpdatedDate;
	}

	public int getBarangHPPRevised() {
		return barangHPPRevised;
	}

	public void setBarangHPPRevised(int barangHPPRevised) {
		barangHPPRevised = barangHPPRevised;
	}

	public Timestamp getBarangHPPDeletedDate() {
		return barangHPPDeletedDate;
	}

	public void setBarangHPPDeletedDate(Timestamp barangHPPDeletedDate) {
		barangHPPDeletedDate = barangHPPDeletedDate;
	}

	@Override
	public String toString() {
		return "MBarangHPP [barangHPPId=" + barangHPPId + ", barangHPPBarangId=" + barangHPPBarangId
				+ ", barangHPPSatuanId=" + barangHPPSatuanId + ", barangHPPSatuanKonversiId=" + barangHPPSatuanKonversiId
				+ ", barangHPPTanggal=" + barangHPPTanggal + ", barangHPPValidFrom=" + barangHPPValidFrom + ", barangHPPValidTo="
				+ barangHPPValidTo + ", barangHPPHarga=" + barangHPPHarga + ", barangHPPDiskon=" + barangHPPDiskon
				+ ", barangHPPHPP=" + barangHPPHPP + ", barangHPPTerimaId=" + barangHPPTerimaId + ", barangHPPOpnameId="
				+ barangHPPOpnameId + ", barangHPPCreatedBy=" + barangHPPCreatedBy + ", barangHPPCreatedDate="
				+ barangHPPCreatedDate + ", barangHPPUpdatedBy=" + barangHPPUpdatedBy + ", barangHPPUpdatedDate="
				+ barangHPPUpdatedDate + ", barangHPPRevised=" + barangHPPRevised + ", barangHPPDeletedDate="
				+ barangHPPDeletedDate + "]";
	}
	
}

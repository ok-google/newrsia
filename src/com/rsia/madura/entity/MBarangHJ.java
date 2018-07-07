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
@Table(name="m_baranghj")
public class MBarangHJ {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="baranghj_id")
	private int barangHJId;
	
	@Column(name="baranghj_jenisharga_id")
	private int barangHJJenisHargaId;

	@Column(name="baranghj_barang_id")
	private int barangHJBarangId;
	
	@Column(name="baranghj_satuan_id")
	private int barangHJSatuanId;
	
	@Column(name="baranghj_satuankonversi_id")
	private int barangHJSatuanKonversiId;

	@Column(name="baranghj_tanggal")
	private Date barangHJTanggal;
	
	@Column(name="baranghj_validfrom")
	private Date barangHJValidFrom;
	  
	@Column(name="baranghj_validto")
	private Date barangHJValidTo;
	
	@Column(name="baranghj_hj")
	private int barangHJHJ;
	
	@Column(name=" baranghj_default")
	private String barangHJDefault;
	
	@Column(name="baranghj_created_by")
	private String barangHJCreatedBy;
	
	@Column(name="baranghj_created_date")
	private Timestamp barangHJCreatedDate;
	
	@Column(name=" baranghj_updated_by")
	private String barangHJUpdatedBy;
	
	@Column(name="baranghj_updated_date ")
	private Timestamp barangHJUpdatedDate;
	
	@Column(name="baranghj_revised")
	private int barangHJRevised;
	
	@Column(name="baranghj_terima_id")
	private int barangHJTerimaId;
	 
	@Column(name="baranghj_opname_id")
	private int barangHJOpnameId;
	 
	@Column(name="baranghj_deleted_date")
	private Timestamp barangHJDeletedDate;

	public int getBarangHJId() {
		return barangHJId;
	}

	public void setBarangHJId(int barangHJId) {
		barangHJId = barangHJId;
	}

	public int getBarangHJJenisHargaId() {
		return barangHJJenisHargaId;
	}

	public void setBarangHJJenisHargaId(int barangHJJenisHargaId) {
		barangHJJenisHargaId = barangHJJenisHargaId;
	}

	public int getBarangHJBarangId() {
		return barangHJBarangId;
	}

	public void setBarangHJBarangId(int barangHJBarangId) {
		barangHJBarangId = barangHJBarangId;
	}

	public int getBarangHJSatuanId() {
		return barangHJSatuanId;
	}

	public void setBarangHJSatuanId(int barangHJSatuanId) {
		barangHJSatuanId = barangHJSatuanId;
	}

	public int getBarangHJSatuanKonversiId() {
		return barangHJSatuanKonversiId;
	}

	public void setBarangHJSatuanKonversiId(int barangHJSatuanKonversiId) {
		barangHJSatuanKonversiId = barangHJSatuanKonversiId;
	}

	public Date getBarangHJTanggal() {
		return barangHJTanggal;
	}

	public void setBarangHJTanggal(Date barangHJTanggal) {
		barangHJTanggal = barangHJTanggal;
	}

	public Date getBarangHJValidFrom() {
		return barangHJValidFrom;
	}

	public void setBarangHJValidFrom(Date barangHJValidFrom) {
		barangHJValidFrom = barangHJValidFrom;
	}

	public Date getBarangHJValidTo() {
		return barangHJValidTo;
	}

	public void setBarangHJValidTo(Date barangHJValidTo) {
		barangHJValidTo = barangHJValidTo;
	}

	public int getBarangHJHJ() {
		return barangHJHJ;
	}

	public void setBarangHJHJ(int barangHJHJ) {
		barangHJHJ = barangHJHJ;
	}

	public String getBarangHJDefault() {
		return barangHJDefault;
	}

	public void setBarangHJDefault(String barangHJDefault) {
		barangHJDefault = barangHJDefault;
	}

	public String getBarangHJCreatedBy() {
		return barangHJCreatedBy;
	}

	public void setBarangHJCreatedBy(String barangHJCreatedBy) {
		barangHJCreatedBy = barangHJCreatedBy;
	}

	public Timestamp getBarangHJCreatedDate() {
		return barangHJCreatedDate;
	}

	public void setBarangHJCreatedDate(Timestamp barangHJCreatedDate) {
		barangHJCreatedDate = barangHJCreatedDate;
	}

	public String getBarangHJUpdatedBy() {
		return barangHJUpdatedBy;
	}

	public void setBarangHJUpdatedBy(String barangHJUpdatedBy) {
		barangHJUpdatedBy = barangHJUpdatedBy;
	}

	public Timestamp getBarangHJUpdatedDate() {
		return barangHJUpdatedDate;
	}

	public void setBarangHJUpdatedDate(Timestamp barangHJUpdatedDate) {
		barangHJUpdatedDate = barangHJUpdatedDate;
	}

	public int getBarangHJRevised() {
		return barangHJRevised;
	}

	public void setBarangHJRevised(int barangHJRevised) {
		barangHJRevised = barangHJRevised;
	}

	public int getBarangHJTerimaId() {
		return barangHJTerimaId;
	}

	public void setBarangHJTerimaId(int barangHJTerimaId) {
		barangHJTerimaId = barangHJTerimaId;
	}

	public int getBarangHJOpnameId() {
		return barangHJOpnameId;
	}

	public void setBarangHJOpnameId(int barangHJOpnameId) {
		barangHJOpnameId = barangHJOpnameId;
	}

	public Timestamp getBarangHJDeletedDate() {
		return barangHJDeletedDate;
	}

	public void setBarangHJDeletedDate(Timestamp barangHJDeletedDate) {
		barangHJDeletedDate = barangHJDeletedDate;
	}

	@Override
	public String toString() {
		return "MBarangHJ [barangHJId=" + barangHJId + ", barangHJJenisHargaId=" + barangHJJenisHargaId + ", barangHJBarangId="
				+ barangHJBarangId + ", barangHJSatuanId=" + barangHJSatuanId + ", barangHJSatuanKonversiId=" + barangHJSatuanKonversiId
				+ ", barangHJTanggal=" + barangHJTanggal + ", barangHJValidFrom=" + barangHJValidFrom + ", barangHJValidTo=" + barangHJValidTo
				+ ", barangHJHJ=" + barangHJHJ + ", barangHJDefault=" + barangHJDefault + ", barangHJCreatedBy=" + barangHJCreatedBy
				+ ", barangHJCreatedDate=" + barangHJCreatedDate + ", barangHJUpdatedBy=" + barangHJUpdatedBy
				+ ", barangHJUpdatedDate=" + barangHJUpdatedDate + ", barangHJRevised=" + barangHJRevised
				+ ", barangHJTerimaId=" + barangHJTerimaId + ", barangHJOpnameId=" + barangHJOpnameId
				+ ", barangHJDeletedDate=" + barangHJDeletedDate + "]";
	}
}

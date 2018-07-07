package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MBarang_jenis")
public class MJenisBarang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="barangjenis_id")
	private int barangJenisId;
	
	@Column(name="barangjenis_kode")
	private String barangJenisKode;
	
	@Column(name="barangjenis_nama")
	private String barangJenisNama;
	
	@Column(name="barangjenis_parent")
	private Integer barangJenisParent;
	
	@Column(name="barangjenis_keterangan")
	private String barangJenisKeterangan;
	
	@Column(name="barangjenis_aktif")
	private String barangJenisAktif;
	
	@Column(name="barangjenis_created_by")
	private String barangJenisCreatedBy;
	
	@Column(name="barangjenis_created_date")
	private Timestamp barangJenisCreatedDate;
	
	@Column(name="barangjenis_updated_by")
	private String barangJenisUpdatedBy;
	
	@Column(name="barangjenis_updated_date")
	private Timestamp barangJenisUpdatedDate;
	
	@Column(name="barangjenis_revised")
	private int barangJenisRevised;
	
	@Column(name="barangjenis_group")
	private String barangJenisGroup;
	
	@Column(name="barang_jenis_deleted_date")
	private Timestamp barangJenisDeletedDate;

	public int getBarangJenisId() {
		return barangJenisId;
	}

	public void setBarangJenisId(int idBarangJenis) {
		barangJenisId = idBarangJenis;
	}

	public String getBarangJenisKode() {
		return barangJenisKode;
	}

	public void setBarangJenisKode(String kodeJB) {
		barangJenisKode = kodeJB;
	}

	public String getBarangJenisNama() {
		return barangJenisNama;
	}

	public void setBarangJenisNama(String namaJB) {
		barangJenisNama = namaJB;
	}

	public int getBarangJenisParent() {
		return barangJenisParent;
	}

	public void setBarangJenisParent(int parentBJ) {
		barangJenisParent = parentBJ;
	}

	public String getBarangJenisKeterangan() {
		return barangJenisKeterangan;
	}

	public void setBarangJenisKeterangan(String keteranganBJ) {
		barangJenisKeterangan = keteranganBJ;
	}

	public String getBarangJenisAktif() {
		return barangJenisAktif;
	}

	public void setBarangJenisAktif(String aktifBJ) {
		barangJenisAktif = aktifBJ;
	}

	public String getBarangJenisCreatedBy() {
		return barangJenisCreatedBy;
	}

	public void setBarangJenisCreatedBy(String createByBJ) {
		barangJenisCreatedBy = createByBJ;
	}

	public Timestamp getBarangJenisCreatedDate() {
		return barangJenisCreatedDate;
	}

	public void setBarangJenisCreatedDate(Timestamp createdDateBJ) {
		barangJenisCreatedDate = createdDateBJ;
	}

	public String getBarangJenisUpdatedBy() {
		return barangJenisUpdatedBy;
	}

	public void setBarangJenisUpdatedBy(String updateByBJ) {
		barangJenisUpdatedBy = updateByBJ;
	}

	public Timestamp getBarangJenisUpdatedDate() {
		return barangJenisUpdatedDate;
	}

	public void setBarangJenisUpdatedDate(Timestamp updatedateBJ) {
		barangJenisUpdatedDate = updatedateBJ;
	}

	public int getRevisedBJ() {
		return barangJenisRevised;
	}

	public void setRevisedBJ(int barangJenisRevised) {
		this.barangJenisRevised = barangJenisRevised;
	}

	public String getGroupBJ() {
		return barangJenisGroup;
	}

	public void setGroupBJ(String barangJenisGroup) {
		this.barangJenisGroup = barangJenisGroup;
	}

	public Timestamp getBarangJenisDeletedDate() {
		return barangJenisDeletedDate;
	}

	public void setBarangJenisDeletedDate(Timestamp deleteDateBJ) {
		barangJenisDeletedDate = deleteDateBJ;
	}

	@Override
	public String toString() {
		return "MJenisBarang [barangJenisId=" + barangJenisId + ", barangJenisKode=" + barangJenisKode + ", barangJenisNama=" + barangJenisNama
				+ ", barangJenisParent=" + barangJenisParent + ", barangJenisKeterangan=" + barangJenisKeterangan + ", barangJenisAktif=" + barangJenisAktif + ", barangJenisCreatedBy="
				+ barangJenisCreatedBy + ", barangJenisCreatedDate=" + barangJenisCreatedDate + ", barangJenisUpdatedBy=" + barangJenisUpdatedBy + ", barangJenisUpdatedDate="
				+ barangJenisUpdatedDate + ", barangJenisRevised=" + barangJenisRevised + ", barangJenisGroup=" + barangJenisGroup + ", barangJenisDeletedDate=" + barangJenisDeletedDate
				+ "]";
	}

}


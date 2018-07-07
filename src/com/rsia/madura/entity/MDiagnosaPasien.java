/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 16:38:01
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:40:56
*/

package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_diagnosa_pasien")
public class MDiagnosaPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "diagnosapasien_id")
	private Integer diagnosapasienID;

    @Transient
    private Integer remove;
	
	// diagnosa input manual tidak ambil dari icd
	@Column(name = "diagnosapasien_nama")
	private String diagnosapasienNamaDiagnosa;

	@Column(name = "diagnosapasien_jenis")
	private String diagnosapasienJenis;

	@Column(name = "diagnosapasien_keterangan")
	private String diagnosapasienKeterangan;

	@Column(name = "diagnosapasien_aktif")
	private String diagnosapasienAktif;

	@Column(name = "diagnosapasien_created_by")
	private String diagnosapasienCreatedBy;

	@Column(name = "diagnosapasien_created_date")
	private Timestamp diagnosapasienCreatedDate;

	@Column(name = "diagnosapasien_updated_by")
	private String diagnosapasienUpdatedBy;

	@Column(name = "diagnosapasien_updated_date")
	private Timestamp diagnosapasienUpdatedDate;

	@Column(name = "diagnosapasien_revised")
	private Integer diagnosapasienRevised;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "diagnosapasien_tanggal")
	private Date diagnosapasienTanggal;

	@Column(name = "diagnosapasien_kasus")
	private String diagnosapasienKasus;

	@Column(name = "reg_company_id")
	private Integer regCompanyID;

	@Column(name = "reg_apps_id")
	private Integer regAppsID;

	@ManyToOne
	private MPendaftaran pendaftaran;

	@ManyToOne
	private MIcd icd;

	@ManyToOne
	private MPegawai pegawai;
	
	public Integer getDiagnosapasienID() {
		return diagnosapasienID;
	}

	public void setDiagnosapasienID(Integer diagnosapasienID) {
		this.diagnosapasienID = diagnosapasienID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	public String getDiagnosapasienNamaDiagnosa() {
		return diagnosapasienNamaDiagnosa;
	}

	public void setDiagnosapasienNamaDiagnosa(String diagnosapasienNamaDiagnosa) {
		this.diagnosapasienNamaDiagnosa = diagnosapasienNamaDiagnosa;
	}

	public String getDiagnosapasienJenis() {
		return diagnosapasienJenis;
	}

	public void setDiagnosapasienJenis(String diagnosapasienJenis) {
		this.diagnosapasienJenis = diagnosapasienJenis;
	}

	public String getDiagnosapasienKeterangan() {
		return diagnosapasienKeterangan;
	}

	public void setDiagnosapasienKeterangan(String diagnosapasienKeterangan) {
		this.diagnosapasienKeterangan = diagnosapasienKeterangan;
	}

	public String getDiagnosapasienAktif() {
		return diagnosapasienAktif;
	}

	public void setDiagnosapasienAktif(String diagnosapasienAktif) {
		this.diagnosapasienAktif = diagnosapasienAktif;
	}

	public String getDiagnosapasienCreatedBy() {
		return diagnosapasienCreatedBy;
	}

	public void setDiagnosapasienCreatedBy(String diagnosapasienCreatedBy) {
		this.diagnosapasienCreatedBy = diagnosapasienCreatedBy;
	}

	public Timestamp getDiagnosapasienCreatedDate() {
		return diagnosapasienCreatedDate;
	}

	public void setDiagnosapasienCreatedDate(Timestamp diagnosapasienCreatedDate) {
		this.diagnosapasienCreatedDate = diagnosapasienCreatedDate;
	}

	public String getDiagnosapasienUpdatedBy() {
		return diagnosapasienUpdatedBy;
	}

	public void setDiagnosapasienUpdatedBy(String diagnosapasienUpdatedBy) {
		this.diagnosapasienUpdatedBy = diagnosapasienUpdatedBy;
	}

	public Timestamp getDiagnosapasienUpdatedDate() {
		return diagnosapasienUpdatedDate;
	}

	public void setDiagnosapasienUpdatedDate(Timestamp diagnosapasienUpdatedDate) {
		this.diagnosapasienUpdatedDate = diagnosapasienUpdatedDate;
	}

	public Integer getDiagnosapasienRevised() {
		return diagnosapasienRevised;
	}

	public void setDiagnosapasienRevised(Integer diagnosapasienRevised) {
		this.diagnosapasienRevised = diagnosapasienRevised;
	}

	public Date getDiagnosapasienTanggal() {
		return diagnosapasienTanggal;
	}

	public void setDiagnosapasienTanggal(Date diagnosapasienTanggal) {
		this.diagnosapasienTanggal = diagnosapasienTanggal;
	}

	public String getDiagnosapasienKasus() {
		return diagnosapasienKasus;
	}

	public void setDiagnosapasienKasus(String diagnosapasienKasus) {
		this.diagnosapasienKasus = diagnosapasienKasus;
	}

	public Integer getRegCompanyID() {
		return regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID) {
		this.regCompanyID = regCompanyID;
	}

	public Integer getRegAppsID() {
		return regAppsID;
	}

	public void setRegAppsID(Integer regAppsID) {
		this.regAppsID = regAppsID;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	public MIcd getIcd() {
		return icd;
	}

	public void setIcd(MIcd icd) {
		this.icd = icd;
	}

	public MPegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(MPegawai pegawai) {
		this.pegawai = pegawai;
	}
}
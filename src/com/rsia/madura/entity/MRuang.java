/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 00:15:29
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="m_ruang")
public class MRuang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ruang_id")
	private Integer ruangID;

	@Column(name = "ruang_kode")
	private String ruangKode;

	@Column(name = "ruang_nama")
	private String ruangNama;

	@Column(name = "ruang_keterangan")
	private String ruangKeterangan;

	@Column(name = "ruang_kepala")
	private String ruangKepala;

	@ManyToOne
	private MKelas kelas;

	@Column(name = "m_pelayanan_id")
	private Integer mPelayananID;

	@Column(name = "tarif_sarana")
	private Double tarifSarana;

	@Column(name = "tarif_cetak_kartu")
	private Double tarifCetakKartu;

	@Column(name = "tarif_konsultasi")
	private Double tarifKonsultasi;

	@Column(name = "ruang_aktif")
	private String ruangAktif;

	@Column(name = "ruang_revised")
	private Integer ruangRevised;

	@Column(name = "ruang_created_by")
	private String ruangCreatedBy;

	@Column(name = "ruang_created_date")
	private Timestamp ruangCreatedDate;

	@Column(name = "ruang_updated_by")
	private String ruangUpdatedBy;

	@Column(name = "ruang_updated_date")
	private Timestamp ruangUpdatedDate;

	@Column(name = "ruang_deleted_date")
	private Timestamp ruangDeletedDate;

	@Column(name = "ruang_deleted_by")
	private String ruangDeletedBy;

	public Integer getRuangID() {
		return ruangID;
	}

	public void setRuangID(Integer ruangID) {
		this.ruangID = ruangID;
	}

	public String getRuangKode() {
		return ruangKode;
	}

	public void setRuangKode(String ruangKode) {
		this.ruangKode = ruangKode;
	}

	public String getRuangNama() {
		return ruangNama;
	}

	public void setRuangNama(String ruangNama) {
		this.ruangNama = ruangNama;
	}

	public String getRuangKeterangan() {
		return ruangKeterangan;
	}

	public void setRuangKeterangan(String ruangKeterangan) {
		this.ruangKeterangan = ruangKeterangan;
	}

	public String getRuangKepala() {
		return ruangKepala;
	}

	public void setRuangKepala(String ruangKepala) {
		this.ruangKepala = ruangKepala;
	}

	public MKelas getKelas() {
		return this.kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public Integer getMPelayananID() {
		return mPelayananID;
	}

	public void setMPelayananID(Integer mPelayananID) {
		this.mPelayananID = mPelayananID;
	}

	public Double getTarifSarana() {
		return tarifSarana;
	}

	public void setTarifSarana(Double tarifSarana) {
		this.tarifSarana = tarifSarana;
	}

	public Double getTarifCetakKartu() {
		return tarifCetakKartu;
	}

	public void setTarifCetakKartu(Double tarifCetakKartu) {
		this.tarifCetakKartu = tarifCetakKartu;
	}

	public Double getTarifKonsultasi() {
		return tarifKonsultasi;
	}

	public void setTarifKonsultasi(Double tarifKonsultasi) {
		this.tarifKonsultasi = tarifKonsultasi;
	}

	public String getRuangAktif() {
		return ruangAktif;
	}

	public void setRuangAktif(String ruangAktif) {
		this.ruangAktif = ruangAktif;
	}

	public String getRuangCreatedBy() {
		return ruangCreatedBy;
	}

	public void setRuangCreatedBy(String ruangCreatedBy) {
		this.ruangCreatedBy = ruangCreatedBy;
	}

	public Timestamp getRuangCreatedDate() {
		return ruangCreatedDate;
	}

	public void setRuangCreatedDate(Timestamp ruangCreatedDate) {
		this.ruangCreatedDate = ruangCreatedDate;
	}

	public String getRuangUpdatedBy() {
		return ruangUpdatedBy;
	}

	public void setRuangUpdatedBy(String ruangUpdatedBy) {
		this.ruangUpdatedBy = ruangUpdatedBy;
	}


	public Timestamp getRuangUpdatedDate() {
		return ruangUpdatedDate;
	}

	public void setRuangUpdatedDate(Timestamp ruangUpdatedDate) {
		this.ruangUpdatedDate = ruangUpdatedDate;
	}

	public Integer getRuangRevised() {
		return ruangRevised;
	}

	public void setRuangRevised(Integer ruangRevised) {
		this.ruangRevised = ruangRevised;
	}

	public Timestamp getRuangDeletedDate() {
		return ruangDeletedDate;
	}

	public void setRuangDeletedDate(Timestamp ruangDeletedDate) {
		this.ruangDeletedDate = ruangDeletedDate;
	}

	public String getRuangDeletedBy() {
		return ruangDeletedBy;
	}

	public void setRuangDeletedBy(String ruangDeletedBy) {
		this.ruangDeletedBy = ruangDeletedBy;
	}

	@Override
	public String toString() {
		return "MRuang[ ruangID" + ruangID + ", ruangKode" + ruangKode + ", ruangNama" + ruangNama + ", ruangKeterangan" 
				+ ruangKeterangan + ", ruangKepala" + ruangKepala + ", kelas" + kelas + ", mPelayananID" 
				+ mPelayananID + ", tarifSarana" + tarifSarana + ", tarifCetakKartu" + tarifCetakKartu + ", tarifKonsultasi" 
				+ tarifKonsultasi + ", ruangAktif" + ruangAktif + ", ruangRevised" 
				+ ruangRevised + ", ruangCreatedBy" + ruangCreatedBy + ", ruangCreatedDate" 
				+ ruangCreatedDate + ", ruangUpdatedBy" + ruangUpdatedBy + ", ruangUpdatedDate" 
				+ ruangUpdatedDate + ", ruangDeletedDate" + ruangDeletedDate + ", ruangDeletedBy" + ruangDeletedBy +"]";
	}
}


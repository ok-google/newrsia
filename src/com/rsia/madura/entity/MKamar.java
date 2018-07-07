/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:05:26 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-28 09:40:33
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

@Entity
@Table(name = "m_kamar")
public class MKamar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "kamar_id")
	private Integer kamarID;

	@Column(name = "kamar_no")
	private String kamarNo;

	@ManyToOne
	private MRuang ruang;

	@ManyToOne
	private MKelas kelas;

	@Column(name = "kamar_keterangan")
	private String kamarKeterangan;

	@Column(name = "kamar_aktif")
	private String kamarAktif;

	@Column(name = "kamar_created_by")
	private String kamarCreatedBy;

	@Column(name = "kamar_created_date")
	private Timestamp kamarCreatedDate;

	@Column(name = "kamar_updated_by")
	private String kamarUpdatedBy;

	@Column(name = "kamar_updated_date")
	private Timestamp kamarUpdatedDate;

	@Column(name = "kamar_revised")
	private Integer kamarRevised;

	@Column(name = "kamar_kategori")
	private String kamarKategori;

	@Column(name = "kamar_deleted_date")
	private Timestamp kamarDeletedDate;

	@Column(name = "jumlah_bed")
	private Integer jumlahBed;

	@Column(name = "tarif")
	private Integer tarif;

	@Column(name = "jenis_pelayanan")
	private String jenisPelayanan;

	public Integer getKamarID() {
		return kamarID;
	}

	public void setKamarID(Integer kamarID) {
		this.kamarID = kamarID;
	}

	public String getKamarNo() {
		return kamarNo;
	}

	public void setKamarNo(String kamarNo) {
		this.kamarNo = kamarNo;
	}

	public MRuang getRuang() {
		return ruang;
	}

	public void setRuang(MRuang ruang) {
		this.ruang = ruang;
	}

	public MKelas getKelas() {
		return kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public String getKamarKeterangan() {
		return kamarKeterangan;
	}

	public void setKamarKeterangan(String kamarKeterangan) {
		this.kamarKeterangan = kamarKeterangan;
	}

	public String getKamarAktif() {
		return kamarAktif;
	}

	public void setKamarAktif(String kamarAktif) {
		this.kamarAktif = kamarAktif;
	}

	public String getKamarCreatedBy() {
		return kamarCreatedBy;
	}

	public void setKamarCreatedBy(String kamarCreatedBy) {
		this.kamarCreatedBy = kamarCreatedBy;
	}

	public Timestamp getKamarCreatedDate() {
		return kamarCreatedDate;
	}

	public void setKamarCreatedDate(Timestamp kamarCreatedDate) {
		this.kamarCreatedDate = kamarCreatedDate;
	}

	public String getKamarUpdatedBy() {
		return kamarUpdatedBy;
	}

	public void setKamarUpdatedBy(String kamarUpdatedBy) {
		this.kamarUpdatedBy = kamarUpdatedBy;
	}

	public Timestamp getKamarUpdatedDate() {
		return kamarUpdatedDate;
	}

	public void setKamarUpdatedDate(Timestamp kamarUpdatedDate) {
		this.kamarUpdatedDate = kamarUpdatedDate;
	}

	public Integer getKamarRevised() {
		return kamarRevised;
	}

	public void setKamarRevised(Integer kamarRevised) {
		this.kamarRevised = kamarRevised;
	}

	public String getKamarKategori() {
		return kamarKategori;
	}

	public void setKamarKategori(String kamarKategori) {
		this.kamarKategori = kamarKategori;
	}

	public Timestamp getKamarDeletedDate() {
		return kamarDeletedDate;
	}

	public void setKamarDeletedDate(Timestamp kamarDeletedDate) {
		this.kamarDeletedDate = kamarDeletedDate;
	}

	public Integer getJumlahBed() {
		return jumlahBed;
	}

	public void setJumlahBed(Integer jumlahBed) {
		this.jumlahBed = jumlahBed;
	}

	public Integer getTarif() {
		return tarif;
	}

	public void setTarif(Integer tarif) {
		this.tarif = tarif;
	}

	public String getJenisPelayanan() {
		return jenisPelayanan;
	}

	public void setJenisPelayanan(String jenisPelayanan) {
		this.jenisPelayanan = jenisPelayanan;
	}

}

/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 07:50:08
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:49:49
*/
package com.rsia.madura.entity;

import java.util.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@Table(name="t_riwayat_periksa")
public class MRiwayatPeriksa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "periksa_id")
	private Integer periksaID;

    @Transient // means "not a DB field"
    private Integer remove; // boolean flag

	@Column(name = "periksa_pendaftaran_id")
	private Integer periksaPendaftaranID;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "periksa_tanggal")
	private Date periksaTanggal;

	@Column(name = "periksa_tb")
	private Double periksaTb;

	@Column(name = "periksa_bb")
	private Double periksaBb;

	@Column(name = "periksa_jantung")
	private Integer periksaJantung;

	@Column(name = "periksa_tensi")
	private String periksaTensi;

	@Column(name = "periksa_suhu")
	private Integer periksaSuhu;

	@Column(name = "periksa_nafas")
	private Integer periksaNafas;

	@Column(name = "periksa_pemeriksa")
	private Integer periksaPemeriksa;

	@Column(name = "periksa_aktif")
	private String periksaAktif;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "periksa_created_date")
	private Date periksaCreatedDate;

	@Column(name = "periksa_created_by")
	private String periksaCreatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "periksa_updated_date")
	private Date periksaUpdatedDate;

	@Column(name = "periksa_updated_by")
	private String periksaUpdatedBy;

	@Column(name = "periksa_revised")
	private Integer periksaRevised;

	@Column(name = "periksa_pasien_id")
	private Integer periksaPasienID;

	@Column(name = "periksa_pasien_norm")
	private String periksaPasienNorm;

	@Column(name = "periksa_unit_id")
	private Integer periksaUnitID;

	@Column(name = "periksa_keluhan")
	private String periksaKeluhan;

	@Column(name = "periksa_keterangan")
	private String periksaKeterangan;

	@ManyToOne
	private MPendaftaran pendaftaran;

	@ManyToOne
	private MPegawai pegawai;
	
	public Integer getPeriksaID(){
		return periksaID;
	}

	public void setPeriksaID(Integer periksaID) {
		this.periksaID = periksaID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	public Integer getPeriksaPendaftaranID(){
		return periksaPendaftaranID;
	}

	public void setPeriksaPendaftaranID(Integer periksaPendaftaranID) {
		this.periksaPendaftaranID = periksaPendaftaranID;
	}

	public Date getPeriksaTanggal(){
		return periksaTanggal;
	}

	public void setPeriksaTanggal(Date periksaTanggal) {
		this.periksaTanggal = periksaTanggal;
	}

	public Double getPeriksaTb(){
		return periksaTb;
	}

	public void setPeriksaTb(Double periksaTb) {
		this.periksaTb = periksaTb;
	}

	public Double getPeriksaBb(){
		return periksaBb;
	}

	public void setPeriksaBb(Double periksaBb) {
		this.periksaBb = periksaBb;
	}

	public Integer getPeriksaJantung(){
		return periksaJantung;
	}

	public void setPeriksaJantung(Integer periksaJantung) {
		this.periksaJantung = periksaJantung;
	}

	public String getPeriksaTensi(){
		return periksaTensi;
	}

	public void setPeriksaTensi(String periksaTensi) {
		this.periksaTensi = periksaTensi;
	}

	public Integer getPeriksaSuhu(){
		return periksaSuhu;
	}

	public void setPeriksaSuhu(Integer periksaSuhu) {
		this.periksaSuhu = periksaSuhu;
	}

	public Integer getPeriksaNafas(){
		return periksaNafas;
	}

	public void setPeriksaNafas(Integer periksaNafas) {
		this.periksaNafas = periksaNafas;
	}

	public Integer getPeriksaPemeriksa(){
		return periksaPemeriksa;
	}

	public void setPeriksaPemeriksa(Integer periksaPemeriksa) {
		this.periksaPemeriksa = periksaPemeriksa;
	}

	public String getPeriksaAktif(){
		return periksaAktif;
	}

	public void setPeriksaAktif(String periksaAktif) {
		this.periksaAktif = periksaAktif;
	}

	public Date getPeriksaCreatedDate(){
		return periksaCreatedDate;
	}

	public void setPeriksaCreatedDate(Date periksaCreatedDate) {
		this.periksaCreatedDate = periksaCreatedDate;
	}

	public String getPeriksaCreatedBy(){
		return periksaCreatedBy;
	}

	public void setPeriksaCreatedBy(String periksaCreatedBy) {
		this.periksaCreatedBy = periksaCreatedBy;
	}

	public Date getPeriksaUpdatedDate(){
		return periksaUpdatedDate;
	}

	public void setPeriksaUpdatedDate(Date periksaUpdatedDate) {
		this.periksaUpdatedDate = periksaUpdatedDate;
	}

	public String getPeriksaUpdatedBy(){
		return periksaUpdatedBy;
	}

	public void setPeriksaUpdatedBy(String periksaUpdatedBy) {
		this.periksaUpdatedBy = periksaUpdatedBy;
	}

	public Integer getPeriksaRevised(){
		return periksaRevised;
	}

	public void setPeriksaRevised(Integer periksaRevised) {
		this.periksaRevised = periksaRevised;
	}

	public Integer getPeriksaPasienID(){
		return periksaPasienID;
	}

	public void setPeriksaPasienID(Integer periksaPasienID) {
		this.periksaPasienID = periksaPasienID;
	}

	public String getPeriksaPasienNorm(){
		return periksaPasienNorm;
	}

	public void setPeriksaPasienNorm(String periksaPasienNorm) {
		this.periksaPasienNorm = periksaPasienNorm;
	}

	public Integer getPeriksaUnitID(){
		return periksaUnitID;
	}

	public void setPeriksaUnitID(Integer periksaUnitID) {
		this.periksaUnitID = periksaUnitID;
	}

	public String getPeriksaKeluhan(){
		return periksaKeluhan;
	}

	public void setPeriksaKeluhan(String periksaKeluhan) {
		this.periksaKeluhan = periksaKeluhan;
	}

	public String getPeriksaKeterangan(){
		return periksaKeterangan;
	}

	public void setPeriksaKeterangan(String periksaKeterangan) {
		this.periksaKeterangan = periksaKeterangan;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	public MPegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(MPegawai pegawai) {
		this.pegawai = pegawai;
	}


	@Override
	public String toString() {
		return "tRiwayatPeriksa [periksaID=" + periksaID + ", pendaftaran=" + pendaftaran + "]";
	}

}
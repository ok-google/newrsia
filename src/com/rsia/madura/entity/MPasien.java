/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:08:32 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:08:32 
 */
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_pasien")

public class MPasien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pasien_id")
	private Integer pasienID;

	@Column(name = "pasien_norm", unique = true, updatable = true)
	private String pasienNorm;

	@Column(name = "pasien_nik")
	private String pasienNik;

	@Column(name = "pasien_sebut")
	private String pasienSebut;

	@Column(name = "pasien_nama")
	private String pasienNama;

	@Column(name = "pasien_kelamin")
	private String pasienKelamin;

	@Column(name = "pasien_alamat")
	private String pasienAlamat;

	@Column(name = "kecamatan_id")
	private Integer kecamatanID;

	@Column(name = "kota_id")
	private Integer kotaID;

	@Column(name = "propinsi_id")
	private Integer propinsiID;

	@Column(name = "pasien_notelp")
	private String pasienNotelp;

	@Column(name = "pasien_nohp")
	private String pasienNohp;

	@Column(name = "pasien_goldarah")
	private String pasienGoldarah;

	@Column(name = "pasien_bb")
	private Double pasienBb;

	@Column(name = "pasien_tb")
	private Double pasienTb;

	@Column(name = "pasien_aktif")
	private String pasienAktif;

	@Column(name = "pasien_created_by")
	private String pasienCreatedBy;

	@Column(name = "pasien_created_date")
	private Timestamp pasienCreatedDate;

	@Column(name = "pasien_updated_by")
	private String pasienUpdatedBy;

	@Column(name = "pasien_updated_date")
	private Timestamp pasienUpdatedDate;
	
	@Column(name = "pasien_deleted_by")
	private String pasienDeletedBy;

	@Column(name = "pasien_deleted_date")
	private Timestamp pasienDeletedDate;

	@Column(name = "kota_id_tempatlahir")
	private Integer kotaIDTempatlahir;

	@Column(name = "pasien_tanggallahir")
	private Timestamp pasienTanggallahir;

	@Column(name = "kelurahan_id")
	private Integer kelurahanID;

	@Column(name = "status_id")
	private Integer statusID;

	@Column(name = "pasien_keterangan")
	private String pasienKeterangan;

	@Column(name = "pasien_domisili")
	private String pasienDomisili;

	@Column(name = "pasien_pekerjaan")
	private String pasienPekerjaan;

	@Column(name = "pasien_statusnikah")
	private String pasienStatusnikah;

	@Column(name = "agama_id")
	private Integer agamaID;

	@Column(name = "pendidikan_id")
	private Integer pendidikanID;

	@Column(name = "pekerjaan_id")
	private Integer pekerjaanID;

	@Column(name = "pasien_alergi")
	private String pasienAlergi;

	@Column(name = "wali_nama")
	private String waliNama;

	@Column(name = "wali_alamat")
	private String waliAlamat;

	@Column(name = "wali_hubungan")
	private String waliHubungan;

	@Column(name = "wali_telepon")
	private String waliTelepon;

	@Column(name = "wali_kelamin")
	private String waliKelamin;

	@Column(name = "wali_tgllahir")
	private Timestamp waliTgllahir;

	public Integer getPasienID() {
		return pasienID;
	}
	
	public void setPasienID(Integer pasienID) {
		this.pasienID = pasienID;
	}

	public String getPasienNorm() {
		return pasienNorm;
	}

	public void setPasienNorm(String pasienNorm) {
		this.pasienNorm = pasienNorm;
	}

	public String getPasienNik() {
		return pasienNik;
	}

	public void setPasienNik(String pasienNik) {
		this.pasienNik = pasienNik;
	}

	public String getPasienSebut() {
		return pasienSebut;
	}

	public void setPasienSebut(String pasienSebut) {
		this.pasienSebut = pasienSebut;
	}

	public String getPasienNama() {
		return pasienNama;
	}

	public void setPasienNama(String pasienNama) {
		this.pasienNama = pasienNama;
	}

	public String getPasienKelamin() {
		return pasienKelamin;
	}

	public void setPasienKelamin(String pasienKelamin) {
		this.pasienKelamin = pasienKelamin;
	}

	public String getPasienAlamat() {
		return pasienAlamat;
	}

	public void setPasienAlamat(String pasienAlamat) {
		this.pasienAlamat = pasienAlamat;
	}

	public Integer getKecamatanID() {
		return kecamatanID;
	}

	public void setKecamatanID(Integer kecamatanID) {
		this.kecamatanID = kecamatanID;
	}

	public Integer getKotaID() {
		return kotaID;
	}

	public void setKotaID(Integer kotaID) {
		this.kotaID = kotaID;
	}

	public Integer getPropinsiID() {
		return propinsiID;
	}

	public void setPropinsiID(Integer propinsiID) {
		this.propinsiID = propinsiID;
	}

	public String getPasienNotelp() {
		return pasienNotelp;
	}

	public void setPasienNotelp(String pasienNotelp) {
		this.pasienNotelp = pasienNotelp;
	}

	public String getPasienNohp() {
		return pasienNohp;
	}

	public void setPasienNohp(String pasienNohp) {
		this.pasienNohp = pasienNohp;
	}

	public String getPasienGoldarah() {
		return pasienGoldarah;
	}

	public void setPasienGoldarah(String pasienGoldarah) {
		this.pasienGoldarah = pasienGoldarah;
	}

	public Double getPasienBb() {
		return pasienBb;
	}

	public void setPasienBb(Double pasienBb) {
		this.pasienBb = pasienBb;
	}

	public Double getPasienTb() {
		return pasienTb;
	}

	public void setPasienTb(Double pasienTb) {
		this.pasienTb = pasienTb;
	}

	public String getPasienAktif() {
		return pasienAktif;
	}

	public void setPasienAktif(String pasienAktif) {
		this.pasienAktif = pasienAktif;
	}

	public String getPasienCreatedBy() {
		return pasienCreatedBy;
	}

	public void setPasienCreatedBy(String pasienCreatedBy) {
		this.pasienCreatedBy = pasienCreatedBy;
	}

	public Timestamp getPasienCreatedDate() {
		return pasienCreatedDate;
	}

	public void setPasienCreatedDate(Timestamp pasienCreatedDate) {
		this.pasienCreatedDate = pasienCreatedDate;
	}

	public String getPasienUpdatedBy() {
		return pasienUpdatedBy;
	}

	public void setPasienUpdatedBy(String pasienUpdatedBy) {
		this.pasienUpdatedBy = pasienUpdatedBy;
	}

	public Timestamp getPasienUpdatedDate() {
		return pasienUpdatedDate;
	}

	public void setPasienUpdatedDate(Timestamp pasienUpdatedDate) {
		this.pasienUpdatedDate = pasienUpdatedDate;
	}

	public String getPasienDeletedBy() {
		return pasienDeletedBy;
	}

	public void setPasienDeletedBy(String pasienDeletedBy) {
		this.pasienDeletedBy = pasienDeletedBy;
	}
	
	public Timestamp getPasienDeletedDate() {
		return pasienDeletedDate;
	}

	public void setPasienDeletedDate(Timestamp pasienDeletedDate) {
		this.pasienDeletedDate = pasienDeletedDate;
	}

	public Integer getKotaIDTempatlahir() {
		return kotaIDTempatlahir;
	}

	public void setKotaIDTempatlahir(Integer kotaIDTempatlahir) {
		this.kotaIDTempatlahir = kotaIDTempatlahir;
	}

	public Timestamp getPasienTanggallahir() {
		return pasienTanggallahir;
	}

	public void setPasienTanggallahir(Timestamp pasienTanggallahir) {
		this.pasienTanggallahir = pasienTanggallahir;
	}

	public Integer getKelurahanID() {
		return kelurahanID;
	}

	public void setKelurahanID(Integer kelurahanID) {
		this.kelurahanID = kelurahanID;
	}

	public Integer getSstatusID() {
		return statusID;
	}

	public void setStatusID(Integer statusID) {
		this.statusID = statusID;
	}

	public String getPasienKeterangan() {
		return pasienKeterangan;
	}

	public void setPasienKeterangan(String pasienKeterangan) {
		this.pasienKeterangan = pasienKeterangan;
	}

	public String getPasienDomisili() {
		return pasienDomisili;
	}

	public void setPasienDomisili(String pasienDomisili) {
		this.pasienDomisili = pasienDomisili;
	}

	public String getPasienPekerjaan() {
		return pasienPekerjaan;
	}

	public void setPasienPekerjaan(String pasienPekerjaan) {
		this.pasienPekerjaan = pasienPekerjaan;
	}

	public String getPasienStatusnikah() {
		return pasienStatusnikah;
	}

	public void setPasienStatusnikah(String pasienStatusnikah) {
		this.pasienStatusnikah = pasienStatusnikah;
	}

	public Integer getAgamaID() {
		return agamaID;
	}

	public void setAgamaID(Integer agamaID) {
		this.agamaID = agamaID;
	}

	public Integer getPendidikanID() {
		return pendidikanID;
	}

	public void setPendidikanID(Integer pendidikanID) {
		this.pendidikanID = pendidikanID;
	}

	public Integer getPekerjaanID() {
		return pekerjaanID;
	}

	public void setPekerjaanID(Integer pekerjaanID) {
		this.pekerjaanID = pekerjaanID;
	}

	public String getPasienAlergi() {
		return pasienAlergi;
	}

	public void setPasienAlergi(String pasienAlergi) {
		this.pasienAlergi = pasienAlergi;
	}

	public String getWaliNama() {
		return waliNama;
	}

	public void setWaliNama(String waliNama) {
		this.waliNama = waliNama;
	}

	public String getWaliAlamat() {
		return waliAlamat;
	}

	public void setWaliAlamat(String waliAlamat) {
		this.waliAlamat = waliAlamat;
	}

	public String getWaliHubungan() {
		return waliHubungan;
	}

	public void setWaliHubungan(String waliHubungan) {
		this.waliHubungan = waliHubungan;
	}

	public String getWaliTelepon() {
		return waliTelepon;
	}

	public void setWaliTelepon(String waliTelepon) {
		this.waliTelepon = waliTelepon;
	}

	public String getWaliKelamin() {
		return waliKelamin;
	}

	public void setWaliKelamin(String waliKelamin) {
		this.waliKelamin = waliKelamin;
	}

	public Timestamp getWaliTgllahir() {
		return waliTgllahir;
	}

	public void setWaliTgllahir(Timestamp waliTgllahir) {
		this.waliTgllahir = waliTgllahir;
	}

	@Override
	public String toString() {
		return "mPasien [pasienID=" + pasienID + ", pasienNorm=" + pasienNorm + ", pasienNik=" + pasienNik
				+ ", pasienNama=" + pasienNama + ", pasienKelamin=" + pasienKelamin + ", pasienAlamat="
				+ pasienAlamat + ", kecamatanID=" + kecamatanID + ", kotaID=" + kotaID + ", propinsiID="
				+ propinsiID + ", pasienNotelp=" + pasienNotelp + ", pasienNohp=" + pasienNohp
				+ ", pasienGoldarah=" + pasienGoldarah + ", pasienBb=" + pasienBb + ", pasienTb=" + pasienTb
				+ ", pasienAktif=" + pasienAktif + ", pasienCreatedBy=" + pasienCreatedBy
				+ ", pasienCreatedDate=" + pasienCreatedDate + ", pasienUpdatedBy=" + pasienUpdatedBy
				+ ", pasienUpdatedDate=" + pasienUpdatedDate + ", kotaIDTempatlahir=" + kotaIDTempatlahir
				+ ", pasienTanggallahir=" + pasienTanggallahir + ", kelurahanID=" + kelurahanID
				+ ", statusID=" + statusID + ", pasienKeterangan=" + pasienKeterangan + ", pasienDomisili="
				+ pasienDomisili + ", pasienPekerjaan=" + pasienPekerjaan + ", pasienStatusnikah="
				+ pasienStatusnikah + ", agamaID=" + agamaID + ", pendidikanID=" + pendidikanID
				+ ", pekerjaanID=" + pekerjaanID + ", pasienAlergi=" + pasienAlergi + ", pasienDeletedDate="
				+ pasienDeletedDate + "]";
	}

}

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
@Table(name="m_perusahaan")
public class MPerusahaan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="perusahaan_id")
	private int perusahaan_id;
	
	@Column(name="m_perusahaankategori_id")
	private int perusahaanKategoriId;
	
	@Column(name="perusahaan_kode")
	private String perusahaanKode;
	
	@Column(name="perusahaan_nama")
	private String perusahaanNama;
	
	@Column(name="perusahaan_alamat")
	private String perusahaanAlamat;
	
	@Column(name="m_kota_id")
	private int kotaId;
	
	@Column(name="m_propinsi_id")
	private int provinsiId;
	
	@Column(name="perusahaan_notelp")
	private String perusahaanNoTelp;
	
	@Column(name="perusahaan_fax")
	private String perusahaanFax;
	
	@Column(name="perusahaan_email")
	private String perusahaanEmail;
	
	@Column(name="perusahaan_website")
	private String perusahaanWebsite;
	
	@Column(name="perusahaan_cp")
	private String perusahaanContactPerson;
	
	@Column(name="perusahaan_nocp")
	private String perusahaanContactPersonNo;
	
	@Column(name="perusahaan_koderek_utang")
	private int perusahaanKodeHutang;
	
	@Column(name="perusahaan_koderek_piutang")
	private int perusahaanKodePiutang;
	
	@Column(name="perusahaan_no_kontrak")
	private String perusahaanNomerKontrak;
	
	@Column(name="perusahaan_tgl_kontrak")
	private Date perusahaanTglKontrak;
	
	@Column(name="perusahaan_tgl_mulai")
	private Date perusahaanTglMulai;
	
	@Column(name="perusahaan_tgl_akhir")
	private Date perusahaanTglAkhir;
	
	@Column(name="perusahaan_npwp")
	private String perusahaanNPWP;
	
	@Column(name="perusahaan_keterangan")
	private String perusahaanKeterangan;
	
	@Column(name="perusahaan_siup")
	private String perusahaanSIUP;
	
	@Column(name="perusahaan_bidang")
	private String perusahaanBidang;
	
	@Column(name="perusahaan_aktif")
	private char perusahaanAktif;
	
	@Column(name="perusahaan_created_by")
	private String perusahaatCreatedBy;
	
	@Column(name="perusahaan_created_date")
	private Timestamp perusahaanCreatedDate;
	
	@Column(name="perusahaan_updated_by")
	private String perusahaatUpdatedBy;
	
	@Column(name="perusahaan_updated_date")
	private Timestamp perusahaanUpdatedDate;
	
	@Column(name="perusahaan_revised")
	private int perusahaanRevised;
	
	@Column(name="perusahaan_deleted_date")
	private Timestamp perusahaanDeletedDate;

	public int getPerusahaan_id() {
		return perusahaan_id;
	}

	public void setPerusahaan_id(int perusahaan_id) {
		this.perusahaan_id = perusahaan_id;
	}

	public int getPerusahaanKategoriId() {
		return perusahaanKategoriId;
	}

	public void setPerusahaanKategoriId(int perusahaanKategoriId) {
		this.perusahaanKategoriId = perusahaanKategoriId;
	}

	public String getPerusahaanKode() {
		return perusahaanKode;
	}

	public void setPerusahaanKode(String perusahaanKode) {
		this.perusahaanKode = perusahaanKode;
	}

	public String getPerusahaanNama() {
		return perusahaanNama;
	}

	public void setPerusahaanNama(String perusahaanNama) {
		this.perusahaanNama = perusahaanNama;
	}

	public String getPerusahaanAlamat() {
		return perusahaanAlamat;
	}

	public void setPerusahaanAlamat(String perusahaanAlamat) {
		this.perusahaanAlamat = perusahaanAlamat;
	}

	public int getKotaId() {
		return kotaId;
	}

	public void setKotaId(int kotaId) {
		this.kotaId = kotaId;
	}

	public int getProvinsiId() {
		return provinsiId;
	}

	public void setProvinsiId(int provinsiId) {
		this.provinsiId = provinsiId;
	}

	public String getPerusahaanNoTelp() {
		return perusahaanNoTelp;
	}

	public void setPerusahaanNoTelp(String perusahaanNoTelp) {
		this.perusahaanNoTelp = perusahaanNoTelp;
	}

	public String getPerusahaanFax() {
		return perusahaanFax;
	}

	public void setPerusahaanFax(String perusahaanFax) {
		this.perusahaanFax = perusahaanFax;
	}

	public String getPerusahaanEmail() {
		return perusahaanEmail;
	}

	public void setPerusahaanEmail(String perusahaanEmail) {
		this.perusahaanEmail = perusahaanEmail;
	}

	public String getPerusahaanWebsite() {
		return perusahaanWebsite;
	}

	public void setPerusahaanWebsite(String perusahaanWebsite) {
		this.perusahaanWebsite = perusahaanWebsite;
	}

	public String getPerusahaanContactPerson() {
		return perusahaanContactPerson;
	}

	public void setPerusahaanContactPerson(String perusahaanContactPerson) {
		this.perusahaanContactPerson = perusahaanContactPerson;
	}

	public String getPerusahaanContactPersonNo() {
		return perusahaanContactPersonNo;
	}

	public void setPerusahaanContactPersonNo(String perusahaanContactPersonNo) {
		this.perusahaanContactPersonNo = perusahaanContactPersonNo;
	}

	public int getPerusahaanKodeHutang() {
		return perusahaanKodeHutang;
	}

	public void setPerusahaanKodeHutang(int perusahaanKodeHutang) {
		this.perusahaanKodeHutang = perusahaanKodeHutang;
	}

	public int getPerusahaanKodePiutang() {
		return perusahaanKodePiutang;
	}

	public void setPerusahaanKodePiutang(int perusahaanKodePiutang) {
		this.perusahaanKodePiutang = perusahaanKodePiutang;
	}

	public String getPerusahaanNomerKontrak() {
		return perusahaanNomerKontrak;
	}

	public void setPerusahaanNomerKontrak(String perusahaanNomerKontrak) {
		this.perusahaanNomerKontrak = perusahaanNomerKontrak;
	}

	public Date getPerusahaanTglKontrak() {
		return perusahaanTglKontrak;
	}

	public void setPerusahaanTglKontrak(Date perusahaanTglKontrak) {
		this.perusahaanTglKontrak = perusahaanTglKontrak;
	}

	public Date getPerusahaanTglMulai() {
		return perusahaanTglMulai;
	}

	public void setPerusahaanTglMulai(Date perusahaanTglMulai) {
		this.perusahaanTglMulai = perusahaanTglMulai;
	}

	public Date getPerusahaanTglAkhir() {
		return perusahaanTglAkhir;
	}

	public void setPerusahaanTglAkhir(Date perusahaanTglAkhir) {
		this.perusahaanTglAkhir = perusahaanTglAkhir;
	}

	public String getPerusahaanNPWP() {
		return perusahaanNPWP;
	}

	public void setPerusahaanNPWP(String perusahaanNPWP) {
		this.perusahaanNPWP = perusahaanNPWP;
	}

	public String getPerusahaanKeterangan() {
		return perusahaanKeterangan;
	}

	public void setPerusahaanKeterangan(String perusahaanKeterangan) {
		this.perusahaanKeterangan = perusahaanKeterangan;
	}

	public String getPerusahaanSIUP() {
		return perusahaanSIUP;
	}

	public void setPerusahaanSIUP(String perusahaanSIUP) {
		this.perusahaanSIUP = perusahaanSIUP;
	}

	public String getPerusahaanBidang() {
		return perusahaanBidang;
	}

	public void setPerusahaanBidang(String perusahaanBidang) {
		this.perusahaanBidang = perusahaanBidang;
	}

	public char getPerusahaanAktif() {
		return perusahaanAktif;
	}

	public void setPerusahaanAktif(char perusahaanAktif) {
		this.perusahaanAktif = perusahaanAktif;
	}

	public String getPerusahaatCreatedBy() {
		return perusahaatCreatedBy;
	}

	public void setPerusahaatCreatedBy(String perusahaatCreatedBy) {
		this.perusahaatCreatedBy = perusahaatCreatedBy;
	}

	public Timestamp getPerusahaanCreatedDate() {
		return perusahaanCreatedDate;
	}

	public void setPerusahaanCreatedDate(Timestamp perusahaanCreatedDate) {
		this.perusahaanCreatedDate = perusahaanCreatedDate;
	}

	public String getPerusahaatUpdatedBy() {
		return perusahaatUpdatedBy;
	}

	public void setPerusahaatUpdatedBy(String perusahaatUpdatedBy) {
		this.perusahaatUpdatedBy = perusahaatUpdatedBy;
	}

	public Timestamp getPerusahaanUpdatedDate() {
		return perusahaanUpdatedDate;
	}

	public void setPerusahaanUpdatedDate(Timestamp perusahaanUpdatedDate) {
		this.perusahaanUpdatedDate = perusahaanUpdatedDate;
	}

	public int getPerusahaanRevised() {
		return perusahaanRevised;
	}

	public void setPerusahaanRevised(int perusahaanRevised) {
		this.perusahaanRevised = perusahaanRevised;
	}

	public Timestamp getPerusahaanDeletedDate() {
		return perusahaanDeletedDate;
	}

	public void setPerusahaanDeletedDate(Timestamp perusahaanDeletedDate) {
		this.perusahaanDeletedDate = perusahaanDeletedDate;
	}

	@Override
	public String toString() {
		return "MPerusahaan [perusahaan_id=" + perusahaan_id + ", perusahaanKategoriId=" + perusahaanKategoriId
				+ ", perusahaanKode=" + perusahaanKode + ", perusahaanNama=" + perusahaanNama + ", perusahaanAlamat="
				+ perusahaanAlamat + ", kotaId=" + kotaId + ", provinsiId=" + provinsiId + ", perusahaanNoTelp="
				+ perusahaanNoTelp + ", perusahaanFax=" + perusahaanFax + ", perusahaanEmail=" + perusahaanEmail
				+ ", perusahaanWebsite=" + perusahaanWebsite + ", perusahaanContactPerson=" + perusahaanContactPerson
				+ ", perusahaanContactPersonNo=" + perusahaanContactPersonNo + ", perusahaanKodeHutang="
				+ perusahaanKodeHutang + ", perusahaanKodePiutang=" + perusahaanKodePiutang
				+ ", perusahaanNomerKontrak=" + perusahaanNomerKontrak + ", perusahaanTglKontrak="
				+ perusahaanTglKontrak + ", perusahaanTglMulai=" + perusahaanTglMulai + ", perusahaanTglAkhir="
				+ perusahaanTglAkhir + ", perusahaanNPWP=" + perusahaanNPWP + ", perusahaanKeterangan="
				+ perusahaanKeterangan + ", perusahaanSIUP=" + perusahaanSIUP + ", perusahaanBidang=" + perusahaanBidang
				+ ", perusahaanAktif=" + perusahaanAktif + ", perusahaatCreatedBy=" + perusahaatCreatedBy
				+ ", perusahaanCreatedDate=" + perusahaanCreatedDate + ", perusahaatUpdatedBy=" + perusahaatUpdatedBy
				+ ", perusahaanUpdatedDate=" + perusahaanUpdatedDate + ", perusahaanRevised=" + perusahaanRevised
				+ ", perusahaanDeletedDate=" + perusahaanDeletedDate + "]";
	}
	
	
}

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
@Table(name="t_stokobat")
public class MStokObat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stokobat_id")
	private int stokobatId;
	
	@Column(name="stokobat_depo_id")
	private int stokObatDepoId;
	
	@Column(name="stokobat_depo_nama")
	private String stokObatDepoNama;
	
	@Column(name="stokobat_barang_id")
	private int stokObatBarangId;
	
	@Column(name="stokobat_barang_nama")
	private String stokObatBarangNama;
	
	@Column(name="stokobat_satuankonversi_id")
	private int stokObatKonversiId;
	
	@Column(name="stokobat_satuan_id")
	private int stokObatSatuanId;
	
	@Column(name="stokobat_satuan_nama")
	private String stokObatStuanNama;
	
	@Column(name="stokobat_kadaluarsa")
	private Date stokObatKadaluarsa;
	
	@Column(name="stokobat_jumlah")
	private int stokObatJumlah;
	
	@Column(name="stokobat_terima_id")
	private int stokObatTerimaId;
	
	@Column(name="stokobat_terima_tanggal")
	private Timestamp stokObatTerimaTanggal;
	
	@Column(name="stokobat_terimadet_id")
	private int stokObatTerimaDetId;
	
	@Column(name="stokobat_opname_id")
	private int stokObatOpnameId;
	
	@Column(name="stokobat_opname_tanggal")
	private Timestamp stokObatOpnameTanggal;
	
	@Column(name="stokobat_opnamedet_id")
	private int stokObatOpnameDetId;
	
	@Column(name="stokobat_hpp")
	private int stokObatHpp;
	
	@Column(name="stokobat_aktif")
	private char stokObatAktif;
	
	@Column(name="stokobat_keterangan")
	private String stokObatKeterangan;
	
	@Column(name="stokobat_created_by")
	private String stokObatCreatedBy;
	
	@Column(name="stokobat_created_date")
	private Timestamp stokObatCreatedDate;
	
	@Column(name="stokobat_updated_by")
	private String stokObatUpdatedBy;
	
	@Column(name="stokobat_updated_date")
	private Timestamp stokObatUpdatedDate;
	
	@Column(name="stokobat_revised")
	private int stokObatRevised;
	
	@Column(name="stokobat_terima_no")
	private String stokObatTerimaNo;
	
	@Column(name="stokobat_opname_no")
	private String stokObatOpnameNo;
	
	@Column(name="stokobat_deleted_date")
	private Timestamp stokObatDeletedDate;

	public int getStokobatId() {
		return stokobatId;
	}

	public void setStokobatId(int stokobatId) {
		this.stokobatId = stokobatId;
	}

	public int getStokObatDepoId() {
		return stokObatDepoId;
	}

	public void setStokObatDepoId(int stokObatDepoId) {
		this.stokObatDepoId = stokObatDepoId;
	}

	public String getStokObatDepoNama() {
		return stokObatDepoNama;
	}

	public void setStokObatDepoNama(String stokObatDepoNama) {
		this.stokObatDepoNama = stokObatDepoNama;
	}

	public int getStokObatBarangId() {
		return stokObatBarangId;
	}

	public void setStokObatBarangId(int stokObatBarangId) {
		this.stokObatBarangId = stokObatBarangId;
	}

	public String getStokObatBarangNama() {
		return stokObatBarangNama;
	}

	public void setStokObatBarangNama(String stokObatBarangNama) {
		this.stokObatBarangNama = stokObatBarangNama;
	}

	public int getStokObatKonversiId() {
		return stokObatKonversiId;
	}

	public void setStokObatKonversiId(int stokObatKonversiId) {
		this.stokObatKonversiId = stokObatKonversiId;
	}

	public int getStokObatSatuanId() {
		return stokObatSatuanId;
	}

	public void setStokObatSatuanId(int stokObatSatuanId) {
		this.stokObatSatuanId = stokObatSatuanId;
	}

	public String getStokObatStuanNama() {
		return stokObatStuanNama;
	}

	public void setStokObatStuanNama(String stokObatStuanNama) {
		this.stokObatStuanNama = stokObatStuanNama;
	}

	public Date getStokObatKadaluarsa() {
		return stokObatKadaluarsa;
	}

	public void setStokObatKadaluarsa(Date stokObatKadaluarsa) {
		this.stokObatKadaluarsa = stokObatKadaluarsa;
	}

	public int getStokObatJumlah() {
		return stokObatJumlah;
	}

	public void setStokObatJumlah(int stokObatJumlah) {
		this.stokObatJumlah = stokObatJumlah;
	}

	public int getStokObatTerimaId() {
		return stokObatTerimaId;
	}

	public void setStokObatTerimaId(int stokObatTerimaId) {
		this.stokObatTerimaId = stokObatTerimaId;
	}

	public Timestamp getStokObatTerimaTanggal() {
		return stokObatTerimaTanggal;
	}

	public void setStokObatTerimaTanggal(Timestamp stokObatTerimaTanggal) {
		this.stokObatTerimaTanggal = stokObatTerimaTanggal;
	}

	public int getStokObatTerimaDetId() {
		return stokObatTerimaDetId;
	}

	public void setStokObatTerimaDetId(int stokObatTerimaDetId) {
		this.stokObatTerimaDetId = stokObatTerimaDetId;
	}

	public int getStokObatOpnameId() {
		return stokObatOpnameId;
	}

	public void setStokObatOpnameId(int stokObatOpnameId) {
		this.stokObatOpnameId = stokObatOpnameId;
	}

	public Timestamp getStokObatOpnameTanggal() {
		return stokObatOpnameTanggal;
	}

	public void setStokObatOpnameTanggal(Timestamp stokObatOpnameTanggal) {
		this.stokObatOpnameTanggal = stokObatOpnameTanggal;
	}

	public int getStokObatOpnameDetId() {
		return stokObatOpnameDetId;
	}

	public void setStokObatOpnameDetId(int stokObatOpnameDetId) {
		this.stokObatOpnameDetId = stokObatOpnameDetId;
	}

	public int getStokObatHpp() {
		return stokObatHpp;
	}

	public void setStokObatHpp(int stokObatHpp) {
		this.stokObatHpp = stokObatHpp;
	}

	public char getStokObatAktif() {
		return stokObatAktif;
	}

	public void setStokObatAktif(char stokObatAktif) {
		this.stokObatAktif = stokObatAktif;
	}

	public String getStokObatKeterangan() {
		return stokObatKeterangan;
	}

	public void setStokObatKeterangan(String stokObatKeterangan) {
		this.stokObatKeterangan = stokObatKeterangan;
	}

	public String getStokObatCreatedBy() {
		return stokObatCreatedBy;
	}

	public void setStokObatCreatedBy(String stokObatCreatedBy) {
		this.stokObatCreatedBy = stokObatCreatedBy;
	}

	public Timestamp getStokObatCreatedDate() {
		return stokObatCreatedDate;
	}

	public void setStokObatCreatedDate(Timestamp stokObatCreatedDate) {
		this.stokObatCreatedDate = stokObatCreatedDate;
	}

	public String getStokObatUpdatedBy() {
		return stokObatUpdatedBy;
	}

	public void setStokObatUpdatedBy(String stokObatUpdatedBy) {
		this.stokObatUpdatedBy = stokObatUpdatedBy;
	}

	public Timestamp getStokObatUpdatedDate() {
		return stokObatUpdatedDate;
	}

	public void setStokObatUpdatedDate(Timestamp stokObatUpdatedDate) {
		this.stokObatUpdatedDate = stokObatUpdatedDate;
	}

	public int getStokObatRevised() {
		return stokObatRevised;
	}

	public void setStokObatRevised(int stokObatRevised) {
		this.stokObatRevised = stokObatRevised;
	}

	public String getStokObatTerimaNo() {
		return stokObatTerimaNo;
	}

	public void setStokObatTerimaNo(String stokObatTerimaNo) {
		this.stokObatTerimaNo = stokObatTerimaNo;
	}

	public String getStokObatOpnameNo() {
		return stokObatOpnameNo;
	}

	public void setStokObatOpnameNo(String stokObatOpnameNo) {
		this.stokObatOpnameNo = stokObatOpnameNo;
	}

	public Timestamp getStokObatDeletedDate() {
		return stokObatDeletedDate;
	}

	public void setStokObatDeletedDate(Timestamp stokObatDeletedDate) {
		this.stokObatDeletedDate = stokObatDeletedDate;
	}

	@Override
	public String toString() {
		return "MStokObat [stokobatId=" + stokobatId + ", stokObatDepoId=" + stokObatDepoId + ", stokObatDepoNama="
				+ stokObatDepoNama + ", stokObatBarangId=" + stokObatBarangId + ", stokObatBarangNama="
				+ stokObatBarangNama + ", stokObatKonversiId=" + stokObatKonversiId + ", stokObatSatuanId="
				+ stokObatSatuanId + ", stokObatStuanNama=" + stokObatStuanNama + ", stokObatKadaluarsa="
				+ stokObatKadaluarsa + ", stokObatJumlah=" + stokObatJumlah + ", stokObatTerimaId=" + stokObatTerimaId
				+ ", stokObatTerimaTanggal=" + stokObatTerimaTanggal + ", stokObatTerimaDetId=" + stokObatTerimaDetId
				+ ", stokObatOpnameId=" + stokObatOpnameId + ", stokObatOpnameTanggal=" + stokObatOpnameTanggal
				+ ", stokObatOpnameDetId=" + stokObatOpnameDetId + ", stokObatHpp=" + stokObatHpp + ", stokObatAktif="
				+ stokObatAktif + ", stokObatKeterangan=" + stokObatKeterangan + ", stokObatCreatedBy="
				+ stokObatCreatedBy + ", stokObatCreatedDate=" + stokObatCreatedDate + ", stokObatUpdatedBy="
				+ stokObatUpdatedBy + ", stokObatUpdatedDate=" + stokObatUpdatedDate + ", stokObatRevised="
				+ stokObatRevised + ", stokObatTerimaNo=" + stokObatTerimaNo + ", stokObatOpnameNo=" + stokObatOpnameNo
				+ ", stokObatDeletedDate=" + stokObatDeletedDate + "]";
	}
	
	
}

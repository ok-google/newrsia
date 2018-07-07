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
@Table(name="t_barangtrans")
public class MBarangTrans {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="barangTransId")
	private int barangTransId;
	
	@Column(name="barangtrans_depo_id")
	private int barangTransDepoId;
	
	@Column(name="barangtrans_depo_nama")
	private int barangTransDepoNama;

	@Column(name="barangtrans_barang_id")
	private int barangTransBarangId;
	
	@Column(name="barangtrans_barang_nama")
	private String barangTransBarangNama;
	
	@Column(name="barangtrans_satuan_id")
	private int barangTransSatuanId;
	
	@Column(name="barangtrans_satuan_nama")
	private String barangTransSatuanNama;
	
	@Column(name="barangtrans_satuan_terkecil_id")
	private int barangTransSatuanTerkecilId;
	
	@Column(name="barangtrans_satuan_terkecil_nama")
	private String barangTransSatuanTerkecilNama;
	
	@Column(name="barangtrans_transjumlah")
	private int barangTransJumlah;
	
	@Column(name="barangtrans_kadaluarsa")
	private Date barangTransKadaluarsa;
	
	@Column(name="barangtrans_jenis")
	private String barangTransJenis;
	
	@Column(name="barangtrans_tanggal")
	private Timestamp barangTransTanggal;
	
	@Column(name="barangtrans_terima_id")
	private int barangTransTerimaId;
	
	@Column(name="barangtrans_terima_no")
	private int barangTransTerimaNo;
	
	@Column(name="barangtrans_transid")
	private int barangTransTransId;
	  
	@Column(name="barangtrans_transdetid")
	private int barangTransDetailId;
	
	@Column(name="barangtrans_perusahaan_id")
	private int barangTransPerusahaanId;
	
	@Column(name="barangtrans_perusahaan_nama")
	private String barangTransPerusahaanNama;
	
	@Column(name="barangtrans_stok_awal")
	private int barangTransStokAwal;
	
	@Column(name="barangtrans_stok_akhir")
	private int barangTransStokAkhir;
	
	@Column(name="barangtrans_masuk")
	private int barangTransMasuk;
	
	@Column(name="barangtrans_keluar")
	private int barangTransKeluar;
	
	@Column(name="barangtrans_created_by")
	private String barangTransCreatedBy;
	
	@Column(name="barangtrans_created_date")
	private Timestamp barangTransCreatedDate;
	
	@Column(name="barangtrans_updated_by")
	private String barangTransUpdatedBy;
	
	@Column(name="barangtrans_updated_date")
	private Timestamp barangTransUpdatedDate;
	
	@Column(name="barangtrans_revised")
	private int barangTransRevised;
	
	@Column(name="barangtrans_unit_id")
	private int barangTransUnitId;
	
	@Column(name="barangtrans_deleted_date")
	private Timestamp barangTransDeletedDate;

	public int getBarangTransId() {
		return barangTransId;
	}

	public void setBarangTransId(int barangTransId) {
		this.barangTransId = barangTransId;
	}

	public int getBarangTransDepoId() {
		return barangTransDepoId;
	}

	public void setBarangTransDepoId(int barangTransDepoId) {
		this.barangTransDepoId = barangTransDepoId;
	}

	public int getBarangTransDepoNama() {
		return barangTransDepoNama;
	}

	public void setBarangTransDepoNama(int barangTransDepoNama) {
		this.barangTransDepoNama = barangTransDepoNama;
	}

	public int getBarangTransBarangId() {
		return barangTransBarangId;
	}

	public void setBarangTransBarangId(int barangTransBarangId) {
		this.barangTransBarangId = barangTransBarangId;
	}

	public String getBarangTransBarangNama() {
		return barangTransBarangNama;
	}

	public void setBarangTransBarangNama(String barangTransBarangNama) {
		this.barangTransBarangNama = barangTransBarangNama;
	}

	public int getBarangTransSatuanId() {
		return barangTransSatuanId;
	}

	public void setBarangTransSatuanId(int barangTransSatuanId) {
		this.barangTransSatuanId = barangTransSatuanId;
	}

	public String getBarangTransSatuanNama() {
		return barangTransSatuanNama;
	}

	public void setBarangTransSatuanNama(String barangTransSatuanNama) {
		this.barangTransSatuanNama = barangTransSatuanNama;
	}

	public int getBarangTransSatuanTerkecilId() {
		return barangTransSatuanTerkecilId;
	}

	public void setBarangTransSatuanTerkecilId(int barangTransSatuanTerkecilId) {
		this.barangTransSatuanTerkecilId = barangTransSatuanTerkecilId;
	}

	public String getBarangTransSatuanTerkecilNama() {
		return barangTransSatuanTerkecilNama;
	}

	public void setBarangTransSatuanTerkecilNama(String barangTransSatuanTerkecilNama) {
		this.barangTransSatuanTerkecilNama = barangTransSatuanTerkecilNama;
	}

	public int getBarangTransJumlah() {
		return barangTransJumlah;
	}

	public void setBarangTransJumlah(int barangTransJumlah) {
		this.barangTransJumlah = barangTransJumlah;
	}

	public Date getBarangTransKadaluarsa() {
		return barangTransKadaluarsa;
	}

	public void setBarangTransKadaluarsa(Date barangTransKadaluarsa) {
		this.barangTransKadaluarsa = barangTransKadaluarsa;
	}

	public String getBarangTransJenis() {
		return barangTransJenis;
	}

	public void setBarangTransJenis(String barangTransJenis) {
		this.barangTransJenis = barangTransJenis;
	}

	public Timestamp getBarangTransTanggal() {
		return barangTransTanggal;
	}

	public void setBarangTransTanggal(Timestamp barangTransTanggal) {
		this.barangTransTanggal = barangTransTanggal;
	}

	public int getBarangTransTerimaId() {
		return barangTransTerimaId;
	}

	public void setBarangTransTerimaId(int barangTransTerimaId) {
		this.barangTransTerimaId = barangTransTerimaId;
	}

	public int getBarangTransTerimaNo() {
		return barangTransTerimaNo;
	}

	public void setBarangTransTerimaNo(int barangTransTerimaNo) {
		this.barangTransTerimaNo = barangTransTerimaNo;
	}

	public int getBarangTransTransId() {
		return barangTransTransId;
	}

	public void setBarangTransTransId(int barangTransTransId) {
		this.barangTransTransId = barangTransTransId;
	}

	public int getBarangTransDetailId() {
		return barangTransDetailId;
	}

	public void setBarangTransDetailId(int barangTransDetailId) {
		this.barangTransDetailId = barangTransDetailId;
	}

	public int getBarangTransPerusahaanId() {
		return barangTransPerusahaanId;
	}

	public void setBarangTransPerusahaanId(int barangTransPerusahaanId) {
		this.barangTransPerusahaanId = barangTransPerusahaanId;
	}

	public String getBarangTransPerusahaanNama() {
		return barangTransPerusahaanNama;
	}

	public void setBarangTransPerusahaanNama(String barangTransPerusahaanNama) {
		this.barangTransPerusahaanNama = barangTransPerusahaanNama;
	}

	public int getBarangTransStokAwal() {
		return barangTransStokAwal;
	}

	public void setBarangTransStokAwal(int barangTransStokAwal) {
		this.barangTransStokAwal = barangTransStokAwal;
	}

	public int getBarangTransStokAkhir() {
		return barangTransStokAkhir;
	}

	public void setBarangTransStokAkhir(int barangTransStokAkhir) {
		this.barangTransStokAkhir = barangTransStokAkhir;
	}

	public int getBarangTransMasuk() {
		return barangTransMasuk;
	}

	public void setBarangTransMasuk(int barangTransMasuk) {
		this.barangTransMasuk = barangTransMasuk;
	}

	public int getBarangTransKeluar() {
		return barangTransKeluar;
	}

	public void setBarangTransKeluar(int barangTransKeluar) {
		this.barangTransKeluar = barangTransKeluar;
	}

	public String getBarangTransCreatedBy() {
		return barangTransCreatedBy;
	}

	public void setBarangTransCreatedBy(String barangTransCreatedBy) {
		this.barangTransCreatedBy = barangTransCreatedBy;
	}

	public Timestamp getBarangTransCreatedDate() {
		return barangTransCreatedDate;
	}

	public void setBarangTransCreatedDate(Timestamp barangTransCreatedDate) {
		this.barangTransCreatedDate = barangTransCreatedDate;
	}

	public String getBarangTransUpdatedBy() {
		return barangTransUpdatedBy;
	}

	public void setBarangTransUpdatedBy(String barangTransUpdatedBy) {
		this.barangTransUpdatedBy = barangTransUpdatedBy;
	}

	public Timestamp getBarangTransUpdatedDate() {
		return barangTransUpdatedDate;
	}

	public void setBarangTransUpdatedDate(Timestamp barangTransUpdatedDate) {
		this.barangTransUpdatedDate = barangTransUpdatedDate;
	}

	public int getBarangTransRevised() {
		return barangTransRevised;
	}

	public void setBarangTransRevised(int barangTransRevised) {
		this.barangTransRevised = barangTransRevised;
	}

	public int getBarangTransUnitId() {
		return barangTransUnitId;
	}

	public void setBarangTransUnitId(int barangTransUnitId) {
		this.barangTransUnitId = barangTransUnitId;
	}

	public Timestamp getBarangTransDeletedDate() {
		return barangTransDeletedDate;
	}

	public void setBarangTransDeletedDate(Timestamp barangTransDeletedDate) {
		this.barangTransDeletedDate = barangTransDeletedDate;
	}

	@Override
	public String toString() {
		return "t_BarangTrans [barangTransId=" + barangTransId + ", barangTransDepoId=" + barangTransDepoId
				+ ", barangTransDepoNama=" + barangTransDepoNama + ", barangTransBarangId=" + barangTransBarangId
				+ ", barangTransBarangNama=" + barangTransBarangNama + ", barangTransSatuanId=" + barangTransSatuanId
				+ ", barangTransSatuanNama=" + barangTransSatuanNama + ", barangTransSatuanTerkecilId="
				+ barangTransSatuanTerkecilId + ", barangTransSatuanTerkecilNama=" + barangTransSatuanTerkecilNama
				+ ", barangTransJumlah=" + barangTransJumlah + ", barangTransKadaluarsa=" + barangTransKadaluarsa
				+ ", barangTransJenis=" + barangTransJenis + ", barangTransTanggal=" + barangTransTanggal
				+ ", barangTransTerimaId=" + barangTransTerimaId + ", barangTransTerimaNo=" + barangTransTerimaNo
				+ ", barangTransTransId=" + barangTransTransId + ", barangTransDetailId=" + barangTransDetailId
				+ ", barangTransPerusahaanId=" + barangTransPerusahaanId + ", barangTransPerusahaanNama="
				+ barangTransPerusahaanNama + ", barangTransStokAwal=" + barangTransStokAwal + ", barangTransStokAkhir="
				+ barangTransStokAkhir + ", barangTransMasuk=" + barangTransMasuk + ", barangTransKeluar="
				+ barangTransKeluar + ", barangTransCreatedBy=" + barangTransCreatedBy + ", barangTransCreatedDate="
				+ barangTransCreatedDate + ", barangTransUpdatedBy=" + barangTransUpdatedBy
				+ ", barangTransUpdatedDate=" + barangTransUpdatedDate + ", barangTransRevised=" + barangTransRevised
				+ ", barangTransUnitId=" + barangTransUnitId + ", barangTransDeletedDate=" + barangTransDeletedDate
				+ "]";
	}
	
	
}

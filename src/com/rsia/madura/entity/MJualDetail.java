package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_jualdet")
public class MJualDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jualDetailId")
	private int jualDetailId;
	
	@Column(name="jualdet_jual_id")
	private int jualDetailJualId;
	
	@Column(name="jualdet_depo_id")
	private int jualDetailDepoId;
	
	@Column(name="jualdet_barang_id")
	private int jualDetailBarangId;
	
	@Column(name="jualdet_barang_nama")
	private String jualDetailBarangNama;
	
	@Column(name="jualdet_satuan_id")
	private int jualDetailSatuanId;
	
	@Column(name="jualdet_satuan_nama")
	private String jualDetailSatuanNama;
	
	@Column(name="jualdet_kadaluarsa_date")
	private Date jualDetailKadaluarsa;
	
	@Column(name="jualdet_jenisharga_id")
	private int jualDetailJenisHargaId;
	
	@Column(name="jualdet_harga")
	private int jualDetailHarga;
	
	@Column(name="jualdet_jumlah")
	private int jualDetailJumlah;
	
	@Column(name="jualdet_diskon")
	private int jualDetailDiskon;
	
	@Column(name="jualdet_subtotal")
	private int jualDetailSubTotal;
	
	@Column(name="jualdet_created_by")
	private String jualDetailCreatedBy;
	
	@Column(name="jualdet_created_date")
	private Timestamp jualDetailCreatedDate;
	
	@Column(name="jualdet_updated_by")
	private String jualDetailUpdatedBy;
	
	@Column(name="jualdet_updated_date")
	private Timestamp jualDetailUpdatedDate;
	
	@Column(name="jualdet_revised")
	private int jualDetailRevised;
	
	@Column(name="jualdet_deleted_date")
	private Timestamp jualDetailDeletedDate;
	
	@Column(name="jualdet_depo_nama")
	private String jualDetailDepoNama;
	
	@Column(name="jualdet_terima_no")
	private String jualDetailTerimaNo;
	
	@Column(name="jualdet_terima_id")
	private int jualDetailTerimaId;
	
	@Column(name="jualdet_status")
	private int jualDetailStatus;
	
	@Column(name="jualdet_paket")
	private char jualDetailPaket;
	
	@ManyToOne
	private MJual jual;

	public int getJualDetailId() {
		return jualDetailId;
	}

	public void setJualDetailId(int jualDetailId) {
		this.jualDetailId = jualDetailId;
	}

	public int getJualDetailJualId() {
		return jualDetailJualId;
	}

	public void setJualDetailJualId(int jualDetailJualId) {
		this.jualDetailJualId = jualDetailJualId;
	}

	public int getJualDetailDepoId() {
		return jualDetailDepoId;
	}

	public void setJualDetailDepoId(int jualDetailDepoId) {
		this.jualDetailDepoId = jualDetailDepoId;
	}

	public int getJualDetailBarangId() {
		return jualDetailBarangId;
	}

	public void setJualDetailBarangId(int jualDetailBarangId) {
		this.jualDetailBarangId = jualDetailBarangId;
	}

	public String getJualDetailBarangNama() {
		return jualDetailBarangNama;
	}

	public void setJualDetailBarangNama(String jualDetailBarangNama) {
		this.jualDetailBarangNama = jualDetailBarangNama;
	}

	public int getJualDetailSatuanId() {
		return jualDetailSatuanId;
	}

	public void setJualDetailSatuanId(int jualDetailSatuanId) {
		this.jualDetailSatuanId = jualDetailSatuanId;
	}

	public String getJualDetailSatuanNama() {
		return jualDetailSatuanNama;
	}

	public void setJualDetailSatuanNama(String jualDetailSatuanNama) {
		this.jualDetailSatuanNama = jualDetailSatuanNama;
	}

	public Date getJualDetailKadaluarsa() {
		return jualDetailKadaluarsa;
	}

	public void setJualDetailKadaluarsa(Date jualDetailKadaluarsa) {
		this.jualDetailKadaluarsa = jualDetailKadaluarsa;
	}

	public int getJualDetailJenisHargaId() {
		return jualDetailJenisHargaId;
	}

	public void setJualDetailJenisHargaId(int jualDetailJenisHargaId) {
		this.jualDetailJenisHargaId = jualDetailJenisHargaId;
	}

	public int getJualDetailHarga() {
		return jualDetailHarga;
	}

	public void setJualDetailHarga(int jualDetailHarga) {
		this.jualDetailHarga = jualDetailHarga;
	}

	public int getJualDetailJumlah() {
		return jualDetailJumlah;
	}

	public void setJualDetailJumlah(int jualDetailJumlah) {
		this.jualDetailJumlah = jualDetailJumlah;
	}

	public int getJualDetailDiskon() {
		return jualDetailDiskon;
	}

	public void setJualDetailDiskon(int jualDetailDiskon) {
		this.jualDetailDiskon = jualDetailDiskon;
	}

	public int getJualDetailSubTotal() {
		return jualDetailSubTotal;
	}

	public void setJualDetailSubTotal(int jualDetailSubTotal) {
		this.jualDetailSubTotal = jualDetailSubTotal;
	}

	public String getJualDetailCreatedBy() {
		return jualDetailCreatedBy;
	}

	public void setJualDetailCreatedBy(String jualDetailCreatedBy) {
		this.jualDetailCreatedBy = jualDetailCreatedBy;
	}

	public Timestamp getJualDetailCreatedDate() {
		return jualDetailCreatedDate;
	}

	public void setJualDetailCreatedDate(Timestamp jualDetailCreatedDate) {
		this.jualDetailCreatedDate = jualDetailCreatedDate;
	}

	public String getJualDetailUpdatedBy() {
		return jualDetailUpdatedBy;
	}

	public void setJualDetailUpdatedBy(String jualDetailUpdatedBy) {
		this.jualDetailUpdatedBy = jualDetailUpdatedBy;
	}

	public Timestamp getJualDetailUpdatedDate() {
		return jualDetailUpdatedDate;
	}

	public void setJualDetailUpdatedDate(Timestamp jualDetailUpdatedDate) {
		this.jualDetailUpdatedDate = jualDetailUpdatedDate;
	}

	public int getJualDetailRevised() {
		return jualDetailRevised;
	}

	public void setJualDetailRevised(int jualDetailRevised) {
		this.jualDetailRevised = jualDetailRevised;
	}

	public Timestamp getJualDetailDeletedDate() {
		return jualDetailDeletedDate;
	}

	public void setJualDetailDeletedDate(Timestamp jualDetailDeletedDate) {
		this.jualDetailDeletedDate = jualDetailDeletedDate;
	}

	public String getJualDetailDepoNama() {
		return jualDetailDepoNama;
	}

	public void setJualDetailDepoNama(String jualDetailDepoNama) {
		this.jualDetailDepoNama = jualDetailDepoNama;
	}

	public String getJualDetailTerimaNo() {
		return jualDetailTerimaNo;
	}

	public void setJualDetailTerimaNo(String jualDetailTerimaNo) {
		this.jualDetailTerimaNo = jualDetailTerimaNo;
	}

	public int getJualDetailTerimaId() {
		return jualDetailTerimaId;
	}

	public void setJualDetailTerimaId(int jualDetailTerimaId) {
		this.jualDetailTerimaId = jualDetailTerimaId;
	}

	public int getJualDetailStatus() {
		return jualDetailStatus;
	}

	public void setJualDetailStatus(int jualDetailStatus) {
		this.jualDetailStatus = jualDetailStatus;
	}

	public char getJualDetailPaket() {
		return jualDetailPaket;
	}

	public void setJualDetailPaket(char jualDetailPaket) {
		this.jualDetailPaket = jualDetailPaket;
	}

	public MJual getJual() {
		return jual;
	}

	public void setJual(MJual jual) {
		this.jual = jual;
	}

	@Override
	public String toString() {
		return "MJualDetail [jualDetailId=" + jualDetailId + ", jualDetailJualId=" + jualDetailJualId
				+ ", jualDetailDepoId=" + jualDetailDepoId + ", jualDetailBarangId=" + jualDetailBarangId
				+ ", jualDetailBarangNama=" + jualDetailBarangNama + ", jualDetailSatuanId=" + jualDetailSatuanId
				+ ", jualDetailSatuanNama=" + jualDetailSatuanNama + ", jualDetailKadaluarsa=" + jualDetailKadaluarsa
				+ ", jualDetailJenisHargaId=" + jualDetailJenisHargaId + ", jualDetailHarga=" + jualDetailHarga
				+ ", jualDetailJumlah=" + jualDetailJumlah + ", jualDetailDiskon=" + jualDetailDiskon
				+ ", jualDetailSubTotal=" + jualDetailSubTotal + ", jualDetailCreatedBy=" + jualDetailCreatedBy
				+ ", jualDetailCreatedDate=" + jualDetailCreatedDate + ", jualDetailUpdatedBy=" + jualDetailUpdatedBy
				+ ", jualDetailUpdatedDate=" + jualDetailUpdatedDate + ", jualDetailRevised=" + jualDetailRevised
				+ ", jualDetailDeletedDate=" + jualDetailDeletedDate + ", jualDetailDepoNama=" + jualDetailDepoNama
				+ ", jualDetailTerimaNo=" + jualDetailTerimaNo + ", jualDetailTerimaId=" + jualDetailTerimaId
				+ ", jualDetailStatus=" + jualDetailStatus + ", jualDetailPaket=" + jualDetailPaket + ", jual=" + jual
				+ "]";
	}
	
	
}

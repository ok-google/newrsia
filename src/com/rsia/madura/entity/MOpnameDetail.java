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
@Table(name="t_opnamedet")
public class MOpnameDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="opnamedet_id")
	private int opnameDetailId;
	
	@Column(name="opnamedet_opname_id")
	private int opnameDetailOpnameId;
	
	@Column(name="opnamedet_barang_id")
	private int opnameDetailBarangId;
	
	@Column(name="opnamedet_barang_nama")
	private String opnameDetailBarangNama;

	@Column(name="opnamedet_satuan_id")
	private int opnameDetailSatuanId;
	
	@Column(name="opnamedet_satuan_nama")
	private String opnameDetailSatuanNama;
	
	@Column(name="opnamedet_kadaluarsa")
	private Date opnameDetailKadaluarsa;
	
	@Column(name="opnamedet_stok_awal")
	private int opnameDetailStokAwal;
	
	@Column(name="opnamedet_stok_koreksi")
	private int opnameDetailStokKoreksi;

	@Column(name="opnamedet_stok_akhir")
	private int opnameDetailStok_akhir;

	@Column(name="opnamedet_keterangan")
	private String opnameDetailKeterangan;
	
	@Column(name="opnamedet_aktif")
	private String opnameDetailAktif;
	
	@Column(name="opnamedet_created_by")
	private String opnameDetailCreatedBy;
	
	@Column(name="opnamedet_created_date")
	private Timestamp opnameDetailCreatedDate;
	
	@Column(name="opnamedet_updated_by")
	private String opnameDetailUpdatedBy;
	
	@Column(name="opnamedet_updated_date")
	private Timestamp opnameDetailUpdatedDate;
	
	@Column(name="opnamedet_revised")
	private int opnameDetailRevised;
	
	@Column(name="opnamedet_deleted_date")
	private Timestamp opnameDetailDeletedDate;
	  
	@Column(name="opnamedet_harga")
	private int opnameDetailHarga;
	
	@Column(name="opnamedet_status")
	private int opnameDetailStatus;
	  
	@Column(name="opnamedet_terima_id")
	private int opnameDetailTerimaId;
	
	@Column(name="opnamedet_terima_no")
	private String opnameDetailTerimaNo;
	
	@ManyToOne
	private MOpname opname;

	public MOpname getOpname() {
		return opname;
	}

	public void setOpname(MOpname opname) {
		this.opname = opname;
	}

	public int getOpnameDetailId() {
		return opnameDetailId;
	}

	public void setOpnameDetailId(int opnameDetailId) {
		this.opnameDetailId = opnameDetailId;
	}

	public int getOpnameDetailOpnameId() {
		return opnameDetailOpnameId;
	}

	public void setOpnameDetailOpnameId(int opnameDetailOpnameId) {
		this.opnameDetailOpnameId = opnameDetailOpnameId;
	}

	public int getOpnameDetailBarangId() {
		return opnameDetailBarangId;
	}

	public void setOpnameDetailBarangId(int opnameDetailBarangId) {
		this.opnameDetailBarangId = opnameDetailBarangId;
	}

	public String getOpnameDetailBarangNama() {
		return opnameDetailBarangNama;
	}

	public void setOpnameDetailBarangNama(String opnameDetailBarangNama) {
		this.opnameDetailBarangNama = opnameDetailBarangNama;
	}

	public int getOpnameDetailSatuanId() {
		return opnameDetailSatuanId;
	}

	public void setOpnameDetailSatuanId(int opnameDetailSatuanId) {
		this.opnameDetailSatuanId = opnameDetailSatuanId;
	}

	public String getOpnameDetailSatuanNama() {
		return opnameDetailSatuanNama;
	}

	public void setOpnameDetailSatuanNama(String opnameDetailSatuanNama) {
		this.opnameDetailSatuanNama = opnameDetailSatuanNama;
	}

	public Date getOpnameDetailKadaluarsa() {
		return opnameDetailKadaluarsa;
	}

	public void setOpnameDetailKadaluarsa(Date opnameDetailKadaluarsa) {
		this.opnameDetailKadaluarsa = opnameDetailKadaluarsa;
	}

	public int getOpnameDetailStokAwal() {
		return opnameDetailStokAwal;
	}

	public void setOpnameDetailStokAwal(int opnameDetailStokAwal) {
		this.opnameDetailStokAwal = opnameDetailStokAwal;
	}

	public int getOpnameDetailStokKoreksi() {
		return opnameDetailStokKoreksi;
	}

	public void setOpnameDetailStokKoreksi(int opnameDetailStokKoreksi) {
		this.opnameDetailStokKoreksi = opnameDetailStokKoreksi;
	}

	public int getOpnameDetailStok_akhir() {
		return opnameDetailStok_akhir;
	}

	public void setOpnameDetailStok_akhir(int opnameDetailStok_akhir) {
		this.opnameDetailStok_akhir = opnameDetailStok_akhir;
	}

	public String getOpnameDetailKeterangan() {
		return opnameDetailKeterangan;
	}

	public void setOpnameDetailKeterangan(String opnameDetailKeterangan) {
		this.opnameDetailKeterangan = opnameDetailKeterangan;
	}

	public String getOpnameDetailAktif() {
		return opnameDetailAktif;
	}

	public void setOpnameDetailAktif(String opnameDetailAktif) {
		this.opnameDetailAktif = opnameDetailAktif;
	}

	public String getOpnameDetailCreatedBy() {
		return opnameDetailCreatedBy;
	}

	public void setOpnameDetailCreatedBy(String opnameDetailCreatedBy) {
		this.opnameDetailCreatedBy = opnameDetailCreatedBy;
	}

	public Timestamp getOpnameDetailCreatedDate() {
		return opnameDetailCreatedDate;
	}

	public void setOpnameDetailCreatedDate(Timestamp opnameDetailCreatedDate) {
		this.opnameDetailCreatedDate = opnameDetailCreatedDate;
	}

	public String getOpnameDetailUpdatedBy() {
		return opnameDetailUpdatedBy;
	}

	public void setOpnameDetailUpdatedBy(String opnameDetailUpdatedBy) {
		this.opnameDetailUpdatedBy = opnameDetailUpdatedBy;
	}

	public Timestamp getOpnameDetailUpdatedDate() {
		return opnameDetailUpdatedDate;
	}

	public void setOpnameDetailUpdatedDate(Timestamp opnameDetailUpdatedDate) {
		this.opnameDetailUpdatedDate = opnameDetailUpdatedDate;
	}

	public int getOpnameDetailRevised() {
		return opnameDetailRevised;
	}

	public void setOpnameDetailRevised(int opnameDetailRevised) {
		this.opnameDetailRevised = opnameDetailRevised;
	}

	public Timestamp getOpnameDetailDeletedDate() {
		return opnameDetailDeletedDate;
	}

	public void setOpnameDetailDeletedDate(Timestamp opnameDetailDeletedDate) {
		this.opnameDetailDeletedDate = opnameDetailDeletedDate;
	}

	public int getOpnameDetailHarga() {
		return opnameDetailHarga;
	}

	public void setOpnameDetailHarga(int opnameDetailHarga) {
		this.opnameDetailHarga = opnameDetailHarga;
	}

	public int getOpnameDetailStatus() {
		return opnameDetailStatus;
	}

	public void setOpnameDetailStatus(int opnameDetailStatus) {
		this.opnameDetailStatus = opnameDetailStatus;
	}

	public int getOpnameDetailTerimaId() {
		return opnameDetailTerimaId;
	}

	public void setOpnameDetailTerimaId(int opnameDetailTerimaId) {
		this.opnameDetailTerimaId = opnameDetailTerimaId;
	}

	public String getOpnameDetailTerimaNo() {
		return opnameDetailTerimaNo;
	}

	public void setOpnameDetailTerimaNo(String opnameDetailTerimaNo) {
		this.opnameDetailTerimaNo = opnameDetailTerimaNo;
	}

	@Override
	public String toString() {
		return "MOpnameDetail [opnameDetailId=" + opnameDetailId + ", opnameDetailOpnameId=" + opnameDetailOpnameId
				+ ", opnameDetailBarangId=" + opnameDetailBarangId + ", opnameDetailBarangNama="
				+ opnameDetailBarangNama + ", opnameDetailSatuanId=" + opnameDetailSatuanId
				+ ", opnameDetailSatuanNama=" + opnameDetailSatuanNama + ", opnameDetailKadaluarsa="
				+ opnameDetailKadaluarsa + ", opnameDetailStokAwal=" + opnameDetailStokAwal
				+ ", opnameDetailStokKoreksi=" + opnameDetailStokKoreksi + ", opnameDetailStok_akhir="
				+ opnameDetailStok_akhir + ", opnameDetailKeterangan=" + opnameDetailKeterangan + ", opnameDetailAktif="
				+ opnameDetailAktif + ", opnameDetailCreatedBy=" + opnameDetailCreatedBy + ", opnameDetailCreatedDate="
				+ opnameDetailCreatedDate + ", opnameDetailUpdatedBy=" + opnameDetailUpdatedBy
				+ ", opnameDetailUpdatedDate=" + opnameDetailUpdatedDate + ", opnameDetailRevised="
				+ opnameDetailRevised + ", opnameDetailDeletedDate=" + opnameDetailDeletedDate + ", opnameDetailHarga="
				+ opnameDetailHarga + ", opnameDetailStatus=" + opnameDetailStatus + ", opnameDetailTerimaId="
				+ opnameDetailTerimaId + ", opnameDetailTerimaNo=" + opnameDetailTerimaNo + ", opname=" + opname + "]";
	}
	
	
	
}

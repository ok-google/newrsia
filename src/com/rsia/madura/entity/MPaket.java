/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   PRADESGA
* @Last Modified time: 2018-04-10 11:31:43
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;

@Entity
@Table(name="m_paket")
public class MPaket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paket_id")
	private int paketID;
	
	@Column(name="paket_nama")
	private String paketNama;
	
	@Column(name="paket_keterangan")
	private String paketKeterangan;
	
	@Column(name="paket_harga")
	private int paketHarga;
	
	@Column(name="paket_aktif")
	private String paketAktif;

	@Column(name="paket_created_by")
	private String paketCreatedBy;
	
	@Column(name="paket_created_date")
	private Timestamp paketCreatedDate;
	
	@Column(name="paket_updated_by")
	private String paketUpdatedBy;
	  
	@Column(name="paket_updated_date")
	private Timestamp paketUpdatedDate;
	
	@Column(name="paket_jenis")
	private String paketJenis;
	
	@Column(name="paket_revised")
	private int paketRevised;
	  
	@Column(name="paket_deleted_date")
	private Timestamp paketDeletedDate;

	@Column(name="paket_deleted_by")
	private String paketDeletedBy;

	@ManyToOne
	private MKelas kelas;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "paket", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<MPaketDetail> paketDetail;

	public MPaket() {

	}

	public int getPaketID() {
		return paketID;
	}

	public void setPaketID(int paketID) {
		this.paketID = paketID;
	}

	public String getPaketNama() {
		return paketNama;
	}

	public void setPaketNama(String paketNama) {
		this.paketNama = paketNama;
	}

	public String getPaketKeterangan() {
		return paketKeterangan;
	}

	public void setPaketKeterangan(String paketKeterangan) {
		this.paketKeterangan = paketKeterangan;
	}

	public int getPaketHarga() {
		return paketHarga;
	}

	public void setPaketHarga(int paketHarga) {
		this.paketHarga = paketHarga;
	}

	public String getPaketAktif() {
		return paketAktif;
	}

	public void setPaketAktif(String paketAktif) {
		this.paketAktif = paketAktif;
	}

	public String getPaketCreatedBy() {
		return paketCreatedBy;
	}

	public void setPaketCreatedBy(String paketCreatedBy) {
		this.paketCreatedBy = paketCreatedBy;
	}

	public Timestamp getPaketCreatedDate() {
		return paketCreatedDate;
	}

	public void setPaketCreatedDate(Timestamp paketCreatedDate) {
		this.paketCreatedDate = paketCreatedDate;
	}

	public String getPaketUpdatedBy() {
		return paketUpdatedBy;
	}

	public void setPaketUpdatedBy(String paketUpdatedBy) {
		this.paketUpdatedBy = paketUpdatedBy;
	}

	public Timestamp getPaketUpdatedDate() {
		return paketUpdatedDate;
	}

	public void setPaketUpdatedDate(Timestamp paketUpdatedDate) {
		this.paketUpdatedDate = paketUpdatedDate;
	}

	public String getPaketJenis() {
		return paketJenis;
	}

	public void setPaketJenis(String paketJenis) {
		this.paketJenis = paketJenis;
	}

	public int getPaketRevised() {
		return paketRevised;
	}

	public void setPaketRevised(int paketRevised) {
		this.paketRevised = paketRevised;
	}

	public Timestamp getPaketDeletedDate() {
		return paketDeletedDate;
	}

	public void setPaketDeletedDate(Timestamp paketDeletedDate) {
		this.paketDeletedDate = paketDeletedDate;
	}

	public String getPaketDeletedBy() {
		return paketDeletedBy;
	}

	public void setPaketDeletedBy(String paketDeletedBy) {
		this.paketDeletedBy = paketDeletedBy;
	}

	public MKelas getKelas() {
		return this.kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public List<MPaketDetail> getPaketDetail() {
		return paketDetail;
	}

	public void setPaketDetail(List<MPaketDetail> paketDetail) {
		this.paketDetail = paketDetail;
	}

	@Override
	public String toString() {
		return "mPaket [orderID=" + paketID + ", paketNama=" + paketNama + ", paketDetail=" + paketDetail + ", kelases=" + kelas +"]";
	}
}
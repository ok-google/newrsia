/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-16 11:56:02
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.*;
@Entity
@Table(name="m_paket_detail")
public class MPaketDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paket_detail_id")
	private Integer paketDetailID;

	@Column(name = "paket_detail_detail")
	private int paketDetailHarga;

	@Column(name = "paket_detail_nama")
	private String paketDetailNama;

	@Column(name = "paket_detail_type")
	private String paketDetailType;

	@Column(name = "paket_detail_jumlah")
	private int paketDetailJumlah;

	@Column(name = "paket_detail_total")
	private int paketDetailTotal;

	@Column(name="paket_detail_created_by")
	private String paketDetailCreatedBy;

	@Column(name = "paket_detail_created_date")
	private Timestamp paketDetailCreatedDate;
	
	@Column(name = "paket_detail_updated_by")
	private String paketDetailUpdatedBy;
	  
	@Column(name = "paket_detail_updated_date")
	private Timestamp paketDetailUpdatedDate;

	@Column(name="paket_detail_deleted_date")
	private Timestamp paketDetailDeletedDate;

	@Column(name="paket_detail_deleted_by")
	private String paketDetailDeletedBy;

	@ManyToOne
	private MPaket paket;

	@ManyToOne
	private MRuang ruangs;

	@ManyToOne
	private MTindakan tindakans;

	@ManyToOne
	private MPenunjang penunjangs;
	
	@ManyToOne
	private MObat obats;

	public Integer getPaketDetailID() {
		return paketDetailID;
	}

	public void setPaketDetailID(Integer paketDetailID) {
		this.paketDetailID = paketDetailID;
	}

	public int getPaketDetailHarga() {
		return paketDetailHarga;
	}

	public void setPaketDetailHarga(int paketDetailHarga) {
		this.paketDetailHarga = paketDetailHarga;
	}

	public String getPaketDetailNama() {
		return paketDetailNama;
	}

	public void setPaketDetailNama(String paketDetailNama) {
		this.paketDetailNama = paketDetailNama;
	}

	public String getPaketDetailType() {
		return paketDetailType;
	}

	public void setPaketDetailType(String paketDetailType) {
		this.paketDetailType = paketDetailType;
	}

	public int getPaketDetailJumlah() {
		return paketDetailJumlah;
	}

	public void setPaketDetailJumlah(int paketDetailJumlah) {
		this.paketDetailJumlah = paketDetailJumlah;
	}

	public int getPaketDetailTotal() {
		return paketDetailTotal;
	}

	public void setPaketDetailTotal(int paketDetailTotal) {
		this.paketDetailTotal = paketDetailTotal;
	}

	public String getPaketDetailCreatedBy() {
		return paketDetailCreatedBy;
	}

	public void setPaketDetailCreatedBy(String paketDetailCreatedBy) {
		this.paketDetailCreatedBy = paketDetailCreatedBy;
	}

	public Timestamp getPaketDetailCreatedDate() {
		return paketDetailCreatedDate;
	}

	public void setPaketDetailCreatedDate(Timestamp paketDetailCreatedDate) {
		this.paketDetailCreatedDate = paketDetailCreatedDate;
	}

	public String getPaketDetailUpdatedBy() {
		return paketDetailUpdatedBy;
	}

	public void setPaketDetailUpdatedBy(String paketDetailUpdatedBy) {
		this.paketDetailUpdatedBy = paketDetailUpdatedBy;
	}

	public Timestamp getPaketDetailUpdatedDate() {
		return paketDetailUpdatedDate;
	}

	public void setPaketDetailUpdatedDate(Timestamp paketDetailUpdatedDate) {
		this.paketDetailUpdatedDate = paketDetailUpdatedDate;
	}

	public String getPaketDetailDeletedBy() {
		return paketDetailDeletedBy;
	}

	public void setPaketDetailDeletedBy(String paketDetailDeletedBy) {
		this.paketDetailDeletedBy = paketDetailDeletedBy;
	}

	public Timestamp getPaketDetailDeletedDate() {
		return paketDetailDeletedDate;
	}

	public void setPaketDetailDeletedDate(Timestamp paketDetailDeletedDate) {
		this.paketDetailDeletedDate = paketDetailDeletedDate;
	}

	public MRuang getRuangs() {
		return this.ruangs;
	}

	public void setRuangs(MRuang ruangs) {
		this.ruangs = ruangs;
	}

	public MTindakan getTindakans() {
		return this.tindakans;
	}

	public void setTindakans(MTindakan tindakans) {
		this.tindakans = tindakans;
	}
	
	public MPaket getPaket() {
		return paket;
	}

	public void setPaket(MPaket paket) {
		this.paket = paket;
	}

	public MObat getObats() {
		return this.obats;
	}

	public void setObats(MObat obats) {
		this.obats = obats;
	}

	public MPenunjang getPenunjangs() {
		return this.penunjangs;
	}

	public void setPenunjangs(MPenunjang penunjangs) {
		this.penunjangs = penunjangs;
	}

	@Override
	public String toString() {
		return "mPaketDetail [paketDetailID=" + paketDetailID + ", paketDetailHarga=" + paketDetailHarga +", paketDetailTotal=" 
				+ paketDetailTotal + ",paketDetailType=" + paketDetailType + " ]";
	}
}
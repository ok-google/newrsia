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
@Table(name="t_transaksi_item")
public class MTransaksiItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaksi_item_id")
	private int transaksiItemID;
	
	@Column(name="transaksi_item_nama")
	private String transaksiItemNama;
	
	@Column(name="transaksi_item_jumlah")
	private Integer transaksiItemJumlah;

	@Column(name="transaksi_item_harga")
	private Integer transaksiItemHarga;

	@Column(name="transaksi_item_aktif")
	private String transaksiItemAktif;

	@Column(name="transaksi_item_created_by")
	private String transaksiItemCreatedBy;
	
	@Column(name="transaksi_item_created_date")
	private Timestamp transaksiItemCreatedDate;
	
	@Column(name="transaksi_item_updated_by")
	private String transaksiItemUpdatedBy;
	
	@Column(name="transaksi_item_updated_date")
	private Timestamp transaksiItemUpdatedDate;
	
	@Column(name="transaksi_item_revised")
	private Integer transaksiItemRevised;
	  
	@Column(name="transaksi_item_deleted_date")
	private Timestamp transaksiItemDeletedDate;

	@ManyToOne
	private MTransaksiPasien transaksi;

	public int getTransaksiItemID() {
		return transaksiItemID;
	}

	public void setTransaksiItemID(int transaksiItemID) {
		this.transaksiItemID = transaksiItemID;
	}

	public String getTransaksiItemNama() {
		return transaksiItemNama;
	}

	public void setTransaksiItemNama(String transaksiItemNama) {
		this.transaksiItemNama = transaksiItemNama;
	}

	public Integer getTransaksiItemJumlah() {
		return transaksiItemJumlah;
	}

	public void setTransaksiItemJumlah(Integer transaksiItemJumlah) {
		this.transaksiItemJumlah = transaksiItemJumlah;
	}

	public Integer getTransaksiItemHarga() {
		return transaksiItemHarga;
	}

	public void setTransaksiItemHarga(Integer transaksiItemHarga) {
		this.transaksiItemHarga = transaksiItemHarga;
	}

	public String getTransaksiItemAktif() {
		return transaksiItemAktif;
	}

	public void setTransaksiItemAktif(String transaksiItemAktif) {
		this.transaksiItemAktif = transaksiItemAktif;
	}

	public String getTransaksiItemCreatedBy() {
		return transaksiItemCreatedBy;
	}

	public void setTransaksiItemCreatedBy(String transaksiItemCreatedBy) {
		this.transaksiItemCreatedBy = transaksiItemCreatedBy;
	}

	public Timestamp getTransaksiItemCreatedDate() {
		return transaksiItemCreatedDate;
	}

	public void setTransaksiItemCreatedDate(Timestamp transaksiItemCreatedDate) {
		this.transaksiItemCreatedDate = transaksiItemCreatedDate;
	}

	public String getTransaksiItemUpdatedBy() {
		return transaksiItemUpdatedBy;
	}

	public void setTransaksiItemUpdatedBy(String transaksiItemUpdatedBy) {
		this.transaksiItemUpdatedBy = transaksiItemUpdatedBy;
	}

	public Timestamp getTransaksiItemUpdatedDate() {
		return transaksiItemUpdatedDate;
	}

	public void setTransaksiItemUpdatedDate(Timestamp transaksiItemUpdatedDate) {
		this.transaksiItemUpdatedDate = transaksiItemUpdatedDate;
	}

	public Integer getTransaksiItemRevised() {
		return transaksiItemRevised;
	}

	public void setTransaksiItemRevised(Integer transaksiItemRevised) {
		this.transaksiItemRevised = transaksiItemRevised;
	}

	public Timestamp getTransaksiItemDeletedDate() {
		return transaksiItemDeletedDate;
	}

	public void setTransaksiItemDeletedDate(Timestamp transaksiItemDeletedDate) {
		this.transaksiItemDeletedDate = transaksiItemDeletedDate;
	}

	public MTransaksiPasien getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(MTransaksiPasien transaksi) {
		this.transaksi = transaksi;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

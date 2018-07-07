/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 15:20:14
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:40:26
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
import javax.persistence.Transient;

@Entity
@Table(name="t_pakai")
public class MPakai {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pakai_id")
	private int pakaiID;

    @Transient
    private Integer remove;

	// ganti relasi ke Msatuan
	@Column(name="pakai_satuan")
	private String pakaiSatuan;

	@Column(name="pakai_jumlah")
	private Integer pakaiJumlah;
	
	@Column(name="pakai_harga")
	private Integer pakaiHarga;
	
	@Column(name="pakai_keterangan")
	private String pakaiKeterangan;

	@Column(name="pakai_created_by")
	private String pakaiCreatedBy;
	
	@Column(name="pakai_created_date")
	private Timestamp pakaiCreatedDate;
	
	@Column(name="pakai_updated_by")
	private String pakaiUpdatedBy;
	
	@Column(name="pakai_updated_date")
	private Timestamp pakaiUpdatedDate;
	
	@Column(name="pakai_revised")
	private int pakaiRevised;
	
	@Column(name="pakai_deleted_by")
	private String pakaiDeletedBy;
	
	@Column(name="pakai_deleted_date")
	private Timestamp pakaiDeletedDate;

	@ManyToOne
	private MBarang barang;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public int getPakaiID() {
		return pakaiID;
	}

	public void setPakaiID(int pakaiID) {
		this.pakaiID = pakaiID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}


	public String getPakaiSatuan() {
		return pakaiSatuan;
	}

	public void setPakaiSatuan(String pakaiSatuan) {
		this.pakaiSatuan = pakaiSatuan;
	}

	public Integer getPakaiJumlah() {
		return pakaiJumlah;
	}

	public void setPakaiJumlah(Integer pakaiJumlah) {
		this.pakaiJumlah = pakaiJumlah;
	}

	public Integer getPakaiHarga() {
		return pakaiHarga;
	}

	public void setPakaiHarga(Integer pakaiHarga) {
		this.pakaiHarga = pakaiHarga;
	}

	public String getPakaiKeterangan() {
		return pakaiKeterangan;
	}

	public void setPakaiKeterangan(String pakaiKeterangan) {
		this.pakaiKeterangan = pakaiKeterangan;
	}

	public String getPakaiCreatedBy() {
		return pakaiCreatedBy;
	}

	public void setPakaiCreatedBy(String pakaiCreatedBy) {
		this.pakaiCreatedBy = pakaiCreatedBy;
	}

	public Timestamp getPakaiCreatedDate() {
		return pakaiCreatedDate;
	}

	public void setPakaiCreatedDate(Timestamp pakaiCreatedDate) {
		this.pakaiCreatedDate = pakaiCreatedDate;
	}

	public String getPakaiUpdatedBy() {
		return pakaiUpdatedBy;
	}

	public void setPakaiUpdatedBy(String pakaiUpdatedBy) {
		this.pakaiUpdatedBy = pakaiUpdatedBy;
	}

	public Timestamp getPakaiUpdatedDate() {
		return pakaiUpdatedDate;
	}

	public void setPakaiUpdatedDate(Timestamp pakaiUpdatedDate) {
		this.pakaiUpdatedDate = pakaiUpdatedDate;
	}

	public Integer getPakaiRevised() {
		return pakaiRevised;
	}

	public void setPakaiRevised(Integer pakaiRevised) {
		this.pakaiRevised = pakaiRevised;
	}

	public MBarang getBarang() {
		return barang;
	}

	public void setBarang(MBarang barang) {
		this.barang = barang;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

}
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
@Table(name="m_kasir")
public class MKasir {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kasir_id")
	private int kasirID;
	
	@Column(name="kasir_nama")
	private String kasirNama;
	
	@Column(name="kasir_keterangan")
	private String kasirKeterangan;
	
	@Column(name="kasir_aktif")
	private String kasirAktif;

	// pendaftaran
	@ManyToOne
	private MPendaftaran pendaftaran;
	
	// tagihan
	@Column(name="kasir_tagihan")
	private Integer kasierTagihan;

	@Column(name="kasir_potongan") // nominal
	private Integer kasierPotongan;

	@Column(name="kasir_diskon") // persen
	private Integer kasierDiskon;

	// kasirBayar (one to many)
	
	@Column(name="kasir_created_by")
	private String kasirCreatedBy;
	
	@Column(name="kasir_created_date")
	private Timestamp kasirCreatedDate;
	
	@Column(name="kasir_updated_by")
	private String kasirUpdatedBy;
	
	@Column(name="kasir_updated_date")
	private Timestamp kasirUpdatedDate;
	
	@Column(name="kasir_revised")
	private Integer kasirRevised;
	  
	@Column(name="kasir_deleted_date")
	private Timestamp kasirDeletedDate;


	public int getKasirID() {
		return kasirID;
	}

	public void setKasirID(int kasirID) {
		this.kasirID = kasirID;
	}

	public String getKasirNama() {
		return kasirNama;
	}

	public void setKasirNama(String kasirNama) {
		this.kasirNama = kasirNama;
	}

	public String getKasirKeterangan() {
		return kasirKeterangan;
	}

	public void setKasirKeterangan(String kasirKeterangan) {
		this.kasirKeterangan = kasirKeterangan;
	}

	public String getKasirAktif() {
		return kasirAktif;
	}

	public void setKasirAktif(String kasirAktif) {
		this.kasirAktif = kasirAktif;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	public Integer getKasierTagihan() {
		return kasierTagihan;
	}

	public void setKasierTagihan(Integer kasierTagihan) {
		this.kasierTagihan = kasierTagihan;
	}

	public Integer getKasierPotongan() {
		return kasierPotongan;
	}

	public void setKasierPotongan(Integer kasierPotongan) {
		this.kasierPotongan = kasierPotongan;
	}

	public Integer getKasierDiskon	() {
		return kasierDiskon;
	}

	public void setKasierDiskon(Integer kasierDiskon) {
		this.kasierDiskon = kasierDiskon;
	}



	public String getKasirCreatedBy() {
		return kasirCreatedBy;
	}

	public void setKasirCreatedBy(String kasirCreatedBy) {
		this.kasirCreatedBy = kasirCreatedBy;
	}

	public Timestamp getKasirCreatedDate() {
		return kasirCreatedDate;
	}

	public void setKasirCreatedDate(Timestamp kasirCreatedDate) {
		this.kasirCreatedDate = kasirCreatedDate;
	}

	public String getKasirUpdatedBy() {
		return kasirUpdatedBy;
	}

	public void setKasirUpdatedBy(String kasirUpdatedBy) {
		this.kasirUpdatedBy = kasirUpdatedBy;
	}

	public Timestamp getKasirUpdatedDate() {
		return kasirUpdatedDate;
	}

	public void setKasirUpdatedDate(Timestamp kasirUpdatedDate) {
		this.kasirUpdatedDate = kasirUpdatedDate;
	}

	public Integer getKasirRevised() {
		return kasirRevised;
	}

	public void setKasirRevised(Integer kasirRevised) {
		this.kasirRevised = kasirRevised;
	}

	public Timestamp getKasirDeletedDate() {
		return kasirDeletedDate;
	}

	public void setKasirDeletedDate(Timestamp kasirDeletedDate) {
		this.kasirDeletedDate = kasirDeletedDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

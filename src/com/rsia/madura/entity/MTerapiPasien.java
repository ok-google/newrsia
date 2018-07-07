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
@Table(name="t_terapi_pasien")
public class MTerapiPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="terapi_id")
	private Integer terapiID;

    @Transient
    private Integer remove;

	@Column(name="terapi_jumlah")
	private Integer terapiJumlah;
	
	@Column(name="terapi_harga")
	private Integer terapiHarga;
	
	@Column(name="terapi_dosis")
	private String terapiDosis;

	@Column(name="terapi_keterangan")
	private String terapiKeterangan;

	@Column(name="terapi_aktif")
	private String terapiAktif;

	@Column(name="terapi_created_by")
	private String terapiCreatedBy;
	
	@Column(name="terapi_created_date")
	private Timestamp terapiCreatedDate;
	
	@Column(name="terapi_updated_by")
	private String terapiUpdatedBy;
	
	@Column(name="terapi_updated_date")
	private Timestamp terapiUpdatedDate;
	
	@Column(name="terapi_revised")
	private int terapiRevised;

	@ManyToOne
	private MBarang barang;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public Integer getTerapiID() {
		return terapiID;
	}

	public void setTerapiID(Integer terapiID) {
		this.terapiID = terapiID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	public Integer getTerapiJumlah() {
		return terapiJumlah;
	}

	public void setTerapiJumlah(Integer terapiJumlah) {
		this.terapiJumlah = terapiJumlah;
	}

	public Integer getTerapiHarga() {
		return terapiHarga;
	}

	public void setTerapiHarga(Integer terapiHarga) {
		this.terapiHarga = terapiHarga;
	}

	public String getTerapiDosis() {
		return terapiDosis;
	}

	public void setTerapiDosis(String terapiDosis) {
		this.terapiDosis = terapiDosis;
	}

	public String getTerapiKeterangan() {
		return terapiKeterangan;
	}

	public void setTerapiKeterangan(String terapiKeterangan) {
		this.terapiKeterangan = terapiKeterangan;
	}

	public String getTerapiAktif() {
		return terapiAktif;
	}

	public void setTerapiAktif(String terapiAktif) {
		this.terapiAktif = terapiAktif;
	}

	public String getTerapiCreatedBy() {
		return terapiCreatedBy;
	}

	public void setTerapiCreatedBy(String terapiCreatedBy) {
		this.terapiCreatedBy = terapiCreatedBy;
	}

	public Timestamp getTerapiCreatedDate() {
		return terapiCreatedDate;
	}

	public void setTerapiCreatedDate(Timestamp terapiCreatedDate) {
		this.terapiCreatedDate = terapiCreatedDate;
	}

	public String getTerapiUpdatedBy() {
		return terapiUpdatedBy;
	}

	public void setTerapiUpdatedBy(String terapiUpdatedBy) {
		this.terapiUpdatedBy = terapiUpdatedBy;
	}

	public Timestamp getTerapiUpdatedDate() {
		return terapiUpdatedDate;
	}

	public void setTerapiUpdatedDate(Timestamp terapiUpdatedDate) {
		this.terapiUpdatedDate = terapiUpdatedDate;
	}

	public Integer getTerapiRevised() {
		return terapiRevised;
	}

	public void setTerapiRevised(Integer terapiRevised) {
		this.terapiRevised = terapiRevised;
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
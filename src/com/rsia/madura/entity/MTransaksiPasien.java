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
import javax.persistence.Transient;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyCollection;

@Entity
@Table(name="t_transaksi_pasien")
public class MTransaksiPasien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaksi_id")
	private Integer transaksiID;
	
	@Column(name="transaksi_nomor")
	private String transaksiNomor;
	
	@Column(name="transaksi_keterangan")
	private String transaksiKeterangan;
	
	@Column(name="transaksi_aktif")
	private String transaksiAktif;

	// pendaftaran
	@ManyToOne
	private MPendaftaran pendaftaran;
	
	@Column(name="transaksi_tagihan")
	private Integer transaksiTagihan;

	@Column(name="transaksi_potongan") // nominal
	private Integer transaksiPotongan;

	@Column(name="transaksi_diskon") // persen
	private Integer transaksiDiskon;

	@Column(name="transaksi_status")
	private String transaksiStatus;
	
	@Column(name="transaksi_created_by")
	private String transaksiCreatedBy;
	
	@Column(name="transaksi_created_date")
	private Timestamp transaksiCreatedDate;
	
	@Column(name="transaksi_updated_by")
	private String transaksiUpdatedBy;
	
	@Column(name="transaksi_updated_date")
	private Timestamp transaksiUpdatedDate;
	
	@Column(name="transaksi_revised")
	private Integer transaksiRevised;
	  
	@Column(name="transaksi_deleted_date")
	private Timestamp transaksiDeletedDate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transaksi", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MTransaksiBayar> bayar;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transaksi", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MTransaksiItem> item;

    @Transient
	private Integer uangBayar;
	
	@Transient
	private Integer harusBayar;

	public Integer getTransaksiID() {
		return transaksiID;
	}

	public void setTransaksiID(Integer transaksiID) {
		this.transaksiID = transaksiID;
	}

	public String getTransaksiNomor() {
		return transaksiNomor;
	}

	public void setTransaksiNomor(String transaksiNomor) {
		this.transaksiNomor = transaksiNomor;
	}

	public String getTransaksiKeterangan() {
		return transaksiKeterangan;
	}

	public void setTransaksiKeterangan(String transaksiKeterangan) {
		this.transaksiKeterangan = transaksiKeterangan;
	}

	public String getTransaksiAktif() {
		return transaksiAktif;
	}

	public void setTransaksiAktif(String transaksiAktif) {
		this.transaksiAktif = transaksiAktif;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	public Integer getTransaksiTagihan() {
		return transaksiTagihan;
	}

	public void setTransaksiTagihan(Integer transaksiTagihan) {
		this.transaksiTagihan = transaksiTagihan;
	}

	public Integer getTransaksiPotongan() {
		return transaksiPotongan;
	}

	public void setTransaksiPotongan(Integer transaksiPotongan) {
		this.transaksiPotongan = transaksiPotongan;
	}

	public Integer getTransaksiDiskon() {
		return transaksiDiskon;
	}

	public void setTransaksiDiskon(Integer transaksiDiskon) {
		this.transaksiDiskon = transaksiDiskon;
	}

	public String getTransaksiStatus() {
		return transaksiStatus;
	}

	public void setTransaksiStatus(String transaksiStatus) {
		this.transaksiStatus = transaksiStatus;
	}

	public String getTransaksiCreatedBy() {
		return transaksiCreatedBy;
	}

	public void setTransaksiCreatedBy(String transaksiCreatedBy) {
		this.transaksiCreatedBy = transaksiCreatedBy;
	}

	public Timestamp getTransaksiCreatedDate() {
		return transaksiCreatedDate;
	}

	public void setTransaksiCreatedDate(Timestamp transaksiCreatedDate) {
		this.transaksiCreatedDate = transaksiCreatedDate;
	}

	public String getTransaksiUpdatedBy() {
		return transaksiUpdatedBy;
	}

	public void setTransaksiUpdatedBy(String transaksiUpdatedBy) {
		this.transaksiUpdatedBy = transaksiUpdatedBy;
	}

	public Timestamp getTransaksiUpdatedDate() {
		return transaksiUpdatedDate;
	}

	public void setTransaksiUpdatedDate(Timestamp transaksiUpdatedDate) {
		this.transaksiUpdatedDate = transaksiUpdatedDate;
	}

	public Integer getTransaksiRevised() {
		return transaksiRevised;
	}

	public void setTransaksiRevised(Integer transaksiRevised) {
		this.transaksiRevised = transaksiRevised;
	}

	public Timestamp getTransaksiDeletedDate() {
		return transaksiDeletedDate;
	}

	public void setTransaksiDeletedDate(Timestamp transaksiDeletedDate) {
		this.transaksiDeletedDate = transaksiDeletedDate;
	}

	public List<MTransaksiBayar> getBayar() {
		return bayar;
	}

	public void setBayar(List<MTransaksiBayar> bayar) {
		this.bayar = bayar;
	}

	public List<MTransaksiItem> getItem() {
		return item;
	}

	public void setItem(List<MTransaksiItem> item) {
		this.item = item;
	}

	public Integer getUangBayar() {
		return uangBayar;
	}

	public void setUangBayar(Integer uangBayar) {
		this.uangBayar = uangBayar;
	}

	public Integer getHarusBayar() {
		return harusBayar;
	}

	public void setHarusBayar(Integer harusBayar) {
		this.harusBayar = harusBayar;
	}
	
	@Override
	public String toString() {
		return "MTransaksiPasien [transaksiID=" + transaksiID + " transaksiNomor=" + transaksiNomor + " transaksiKeterangan=" 
				+ transaksiKeterangan + " transaksiAktif=" + transaksiAktif + " pendaftaran=" 
				+ pendaftaran + " transaksiTagihan=" + transaksiTagihan + " transaksiPotongan=" 
				+ transaksiPotongan + " transaksiDiskon=" + transaksiDiskon + " transaksiStatus=" 
				+ transaksiStatus + " transaksiCreatedBy=" + transaksiCreatedBy + " transaksiCreatedDate=" 
				+ transaksiCreatedDate + " transaksiUpdatedBy=" + transaksiUpdatedBy + " transaksiUpdatedDate=" 
				+ transaksiUpdatedDate + " transaksiRevised=" + transaksiRevised + " transaksiDeletedDate=" 
				+ transaksiDeletedDate + "]";
	}
	
}

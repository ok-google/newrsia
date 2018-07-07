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
@Table(name="t_transaksi_bayar")
public class MTransaksiBayar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaksi_bayar_id")
	private int transaksiBayarID;
	
	@Column(name="transaksi_bayar_nomor")
	private String transaksiBayarNomor;
	
	@Column(name="transaksi_bayar_keterangan")
	private String transaksiBayarKeterangan;
	
	@Column(name="transaksi_bayar_jenis")
	private String transaksiBayarJenis;

	@Column(name="transaksi_bayar_aktif")
	private String transaksiBayarAktif;

	@Column(name="transaksi_bayar_nominal")
	private Integer transaksiBayarNominal;

	@Column(name="transaksi_bayar_created_by")
	private String transaksiBayarCreatedBy;
	
	@Column(name="transaksi_bayar_created_date")
	private Timestamp transaksiBayarCreatedDate;
	
	@Column(name="transaksi_bayar_updated_by")
	private String transaksiBayarUpdatedBy;
	
	@Column(name="transaksi_bayar_updated_date")
	private Timestamp transaksiBayarUpdatedDate;
	
	@Column(name="transaksi_bayar_revised")
	private Integer transaksiBayarRevised;
	  
	@Column(name="transaksi_bayar_deleted_date")
	private Timestamp transaksiBayarDeletedDate;

	@ManyToOne
	private MTransaksiPasien transaksi;

	public int getTransaksiBayarID() {
		return transaksiBayarID;
	}

	public void setTransaksiBayarID(int transaksiBayarID) {
		this.transaksiBayarID = transaksiBayarID;
	}

	public String getTransaksiBayarNomor() {
		return transaksiBayarNomor;
	}

	public void setTransaksiBayarNomor(String transaksiBayarNomor) {
		this.transaksiBayarNomor = transaksiBayarNomor;
	}

	public String getTransaksiBayarJenis() {
		return transaksiBayarJenis;
	}

	public void setTransaksiBayarJenis(String transaksiBayarJenis) {
		this.transaksiBayarJenis = transaksiBayarJenis;
	}

	public String getTransaksiBayarAktif() {
		return transaksiBayarAktif;
	}

	public void setTransaksiBayarAktif(String transaksiBayarAktif) {
		this.transaksiBayarAktif = transaksiBayarAktif;
	}

	public Integer getTransaksiBayarNominal() {
		return transaksiBayarNominal;
	}

	public void setTransaksiBayarNominal(Integer transaksiBayarNominal) {
		this.transaksiBayarNominal = transaksiBayarNominal;
	}

	public String getTransaksiBayarCreatedBy() {
		return transaksiBayarCreatedBy;
	}

	public void setTransaksiBayarCreatedBy(String transaksiBayarCreatedBy) {
		this.transaksiBayarCreatedBy = transaksiBayarCreatedBy;
	}

	public Timestamp getTransaksiBayarCreatedDate() {
		return transaksiBayarCreatedDate;
	}

	public void setTransaksiBayarCreatedDate(Timestamp transaksiBayarCreatedDate) {
		this.transaksiBayarCreatedDate = transaksiBayarCreatedDate;
	}

	public String getTransaksiBayarUpdatedBy() {
		return transaksiBayarUpdatedBy;
	}

	public void setTransaksiBayarUpdatedBy(String transaksiBayarUpdatedBy) {
		this.transaksiBayarUpdatedBy = transaksiBayarUpdatedBy;
	}

	public Timestamp getTransaksiBayarUpdatedDate() {
		return transaksiBayarUpdatedDate;
	}

	public void setTransaksiBayarUpdatedDate(Timestamp transaksiBayarUpdatedDate) {
		this.transaksiBayarUpdatedDate = transaksiBayarUpdatedDate;
	}

	public Integer getTransaksiBayarRevised() {
		return transaksiBayarRevised;
	}

	public void setTransaksiBayarRevised(Integer transaksiBayarRevised) {
		this.transaksiBayarRevised = transaksiBayarRevised;
	}

	public Timestamp getTransaksiBayarDeletedDate() {
		return transaksiBayarDeletedDate;
	}

	public void setTransaksiBayarDeletedDate(Timestamp transaksiBayarDeletedDate) {
		this.transaksiBayarDeletedDate = transaksiBayarDeletedDate;
	}

	public MTransaksiPasien getTransaksi() {
		return transaksi;
	}

	public void setTransaksi(MTransaksiPasien transaksi) {
		this.transaksi = transaksi;
	}
	
	@Override
	public String toString() {
		return "MTransaksiBayar =[transaksiBayarID=" +transaksiBayarID +"transaksiBayarNomor=" 
				+transaksiBayarNomor +"transaksiBayarKeterangan=" +transaksiBayarKeterangan +"transaksiBayarJenis=" 
				+transaksiBayarJenis +"transaksiBayarAktif=" +transaksiBayarAktif +"transaksiBayarNominal=" 
				+transaksiBayarNominal +"transaksiBayarCreatedBy=" +transaksiBayarCreatedBy +"transaksiBayarCreatedDate=" 
				+transaksiBayarCreatedDate +"transaksiBayarUpdatedBy=" +transaksiBayarUpdatedBy +"transaksiBayarUpdatedDate=" 
				+transaksiBayarUpdatedDate +"transaksiBayarRevised=" +transaksiBayarRevised +"transaksiBayarDeletedDate=" 
				+transaksiBayarDeletedDate +"transaksi=" +transaksi +"]";
	}
	
}

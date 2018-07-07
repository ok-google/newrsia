package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_returbeli")
public class MReturBeli {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returbeli_id")
	private int returBeliId;
	
	@Column(name="returbeli_no")
	private String returBeliNo;
	  
	@Column(name="returbeli_terima_id")
	private int returBeliTerimaId;
	  
	@Column(name="returbeli_tanggal")
	private Date returBeliTanggal;
	  
	@Column(name="returbeli_perusahaan_id")
	private int returBeliPerusahaanId;
	  
	@Column(name="returbeli_keterangan")
	private String returBeliKeterangan;
	  
	@Column(name="returbeli_status")
	private int returBeliStatus;
	  
	@Column(name="returbeli_aktif")
	private char returBeliAktif;
	  
	@Column(name="returbeli_created_by")
	private String returBeliCreatedBy;
	  
	@Column(name="returbeli_created_date")
	private Timestamp returBeliCreatedDate;
	
	@Column(name="returbeli_updated_by")
	private String returBeliUpdatedBy;
	  
	@Column(name="returbeli_updated_date")
	private Timestamp returBeliUpdatedDate;
	  
	@Column(name="returbeli_revised")
	private int returBeliRevised;
	  
	@Column(name="returbeli_perusahaan_nama")
	private String returBeliPerusahaanNama;
	
	@Column(name="returbeli_perusahaan_alamat")
	private String returBeliPerusahaanAlamat;
	  
	@Column(name="returbeli_perusahaan_notelp")
	private String returBeliPerusahaanNoTelp;
	  
	@Column(name="returbeli_total")
	private int returBeliTotal;
	
	@Column(name="returbeli_group")
	private String returBeliGroup;
	  
	@Column(name="returbeli_totalppn")
	private int returBeliTotalPPN;
	  
	@Column(name="returbeli_ppn")
	private char returBeliPPN;
	
	@Column(name="returbeli_deleted_date")
	private Timestamp returBeliDeletedDate;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "returBeli", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<MReturBeliDetail> detail;

	public int getReturBeliId() {
		return returBeliId;
	}

	public void setReturBeliId(int returBeliId) {
		this.returBeliId = returBeliId;
	}

	public String getReturBeliNo() {
		return returBeliNo;
	}

	public void setReturBeliNo(String returBeliNo) {
		this.returBeliNo = returBeliNo;
	}

	public int getReturBeliTerimaId() {
		return returBeliTerimaId;
	}

	public void setReturBeliTerimaId(int returBeliTerimaId) {
		this.returBeliTerimaId = returBeliTerimaId;
	}

	public Date getReturBeliTanggal() {
		return returBeliTanggal;
	}

	public void setReturBeliTanggal(Date returBeliTanggal) {
		this.returBeliTanggal = returBeliTanggal;
	}

	public int getReturBeliPerusahaanId() {
		return returBeliPerusahaanId;
	}

	public void setReturBeliPerusahaanId(int returBeliPerusahaanId) {
		this.returBeliPerusahaanId = returBeliPerusahaanId;
	}

	public String getReturBeliKeterangan() {
		return returBeliKeterangan;
	}

	public void setReturBeliKeterangan(String returBeliKeterangan) {
		this.returBeliKeterangan = returBeliKeterangan;
	}

	public int getReturBeliStatus() {
		return returBeliStatus;
	}

	public void setReturBeliStatus(int returBeliStatus) {
		this.returBeliStatus = returBeliStatus;
	}

	public char getReturBeliAktif() {
		return returBeliAktif;
	}

	public void setReturBeliAktif(char returBeliAktif) {
		this.returBeliAktif = returBeliAktif;
	}

	public String getReturBeliCreatedBy() {
		return returBeliCreatedBy;
	}

	public void setReturBeliCreatedBy(String returBeliCreatedBy) {
		this.returBeliCreatedBy = returBeliCreatedBy;
	}

	public Timestamp getReturBeliCreatedDate() {
		return returBeliCreatedDate;
	}

	public void setReturBeliCreatedDate(Timestamp returBeliCreatedDate) {
		this.returBeliCreatedDate = returBeliCreatedDate;
	}

	public String getReturBeliUpdatedBy() {
		return returBeliUpdatedBy;
	}

	public void setReturBeliUpdatedBy(String returBeliUpdatedBy) {
		this.returBeliUpdatedBy = returBeliUpdatedBy;
	}

	public Timestamp getReturBeliUpdatedDate() {
		return returBeliUpdatedDate;
	}

	public void setReturBeliUpdatedDate(Timestamp returBeliUpdatedDate) {
		this.returBeliUpdatedDate = returBeliUpdatedDate;
	}

	public int getReturBeliRevised() {
		return returBeliRevised;
	}

	public void setReturBeliRevised(int returBeliRevised) {
		this.returBeliRevised = returBeliRevised;
	}

	public String getReturBeliPerusahaanNama() {
		return returBeliPerusahaanNama;
	}

	public void setReturBeliPerusahaanNama(String returBeliPerusahaanNama) {
		this.returBeliPerusahaanNama = returBeliPerusahaanNama;
	}

	public String getReturBeliPerusahaanAlamat() {
		return returBeliPerusahaanAlamat;
	}

	public void setReturBeliPerusahaanAlamat(String returBeliPerusahaanAlamat) {
		this.returBeliPerusahaanAlamat = returBeliPerusahaanAlamat;
	}

	public String getReturBeliPerusahaanNoTelp() {
		return returBeliPerusahaanNoTelp;
	}

	public void setReturBeliPerusahaanNoTelp(String returBeliPerusahaanNoTelp) {
		this.returBeliPerusahaanNoTelp = returBeliPerusahaanNoTelp;
	}

	public int getReturBeliTotal() {
		return returBeliTotal;
	}

	public void setReturBeliTotal(int returBeliTotal) {
		this.returBeliTotal = returBeliTotal;
	}

	public String getReturBeliGroup() {
		return returBeliGroup;
	}

	public void setReturBeliGroup(String returBeliGroup) {
		this.returBeliGroup = returBeliGroup;
	}

	public int getReturBeliTotalPPN() {
		return returBeliTotalPPN;
	}

	public void setReturBeliTotalPPN(int returBeliTotalPPN) {
		this.returBeliTotalPPN = returBeliTotalPPN;
	}

	public char getReturBeliPPN() {
		return returBeliPPN;
	}

	public void setReturBeliPPN(char returBeliPPN) {
		this.returBeliPPN = returBeliPPN;
	}

	public Timestamp getReturBeliDeletedDate() {
		return returBeliDeletedDate;
	}

	public void setReturBeliDeletedDate(Timestamp returBeliDeletedDate) {
		this.returBeliDeletedDate = returBeliDeletedDate;
	}

	public List<MReturBeliDetail> getDetail() {
		return detail;
	}

	public void setDetail(List<MReturBeliDetail> detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "MReturBeli [returBeliId=" + returBeliId + ", returBeliNo=" + returBeliNo + ", returBeliTerimaId="
				+ returBeliTerimaId + ", returBeliTanggal=" + returBeliTanggal + ", returBeliPerusahaanId="
				+ returBeliPerusahaanId + ", returBeliKeterangan=" + returBeliKeterangan + ", returBeliStatus="
				+ returBeliStatus + ", returBeliAktif=" + returBeliAktif + ", returBeliCreatedBy=" + returBeliCreatedBy
				+ ", returBeliCreatedDate=" + returBeliCreatedDate + ", returBeliUpdatedBy=" + returBeliUpdatedBy
				+ ", returBeliUpdatedDate=" + returBeliUpdatedDate + ", returBeliRevised=" + returBeliRevised
				+ ", returBeliPerusahaanNama=" + returBeliPerusahaanNama + ", returBeliPerusahaanAlamat="
				+ returBeliPerusahaanAlamat + ", returBeliPerusahaanNoTelp=" + returBeliPerusahaanNoTelp
				+ ", returBeliTotal=" + returBeliTotal + ", returBeliGroup=" + returBeliGroup + ", returBeliTotalPPN="
				+ returBeliTotalPPN + ", returBeliPPN=" + returBeliPPN + ", returBeliDeletedDate="
				+ returBeliDeletedDate + ", detail=" + detail + "]";
	}

	
}

package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Date;

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
@Table(name="t_opname")
public class MOpname {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="opname_id")
	private int opnameId;
	
	@Column(name="opname_no")
	private String opnameNo;
	
	@Column(name="opname_tanggal")
	private Date opnameTanggal;
	
	@Column(name="opname_keterangan")
	private String opnameKeterangan;
	
	@Column(name="opname_aktif")
	private char opnameAktif;
	
	@Column(name="opname_created_by")
	private String opnameCreatedBy;
	
	@Column(name="opname_created_date")
	private Timestamp opnameCreatedDate;
	
	@Column(name="opname_updated_by")
	private String opnameUpdatedBy;
	
	@Column(name="opname_updated_date")
	private Timestamp opnameUpdatedDate;
	
	@Column(name="opname_revised")
	private int opnameRevised;
	
	@Column(name="opname_depo_id")
	private int opnameDepoId;
	
	@Column(name="opname_status")
	private String opnameStatus;
	
	@Column(name="opname_depo_nama")
	private String opnameDepoNama;
	
	@Column(name="opname_group")
	private String opnameGroup;
	
	@Column(name="opname_deleted_date")
	private Timestamp opnameDeletedDate;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "opname", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<MOpnameDetail> detail;

	public int getOpnameId() {
		return opnameId;
	}

	public void setOpnameId(int opnameId) {
		this.opnameId = opnameId;
	}

	public String getOpnameNo() {
		return opnameNo;
	}

	public void setOpnameNo(String opnameNo) {
		this.opnameNo = opnameNo;
	}

	public Date getOpnameTanggal() {
		return opnameTanggal;
	}

	public void setOpnameTanggal(Date opnameTanggal) {
		this.opnameTanggal = opnameTanggal;
	}

	public String getOpnameKeterangan() {
		return opnameKeterangan;
	}

	public void setOpnameKeterangan(String opnameKeterangan) {
		this.opnameKeterangan = opnameKeterangan;
	}

	public char getOpnameAktif() {
		return opnameAktif;
	}

	public void setOpnameAktif(char opnameAktif) {
		this.opnameAktif = opnameAktif;
	}

	public String getOpnameCreatedBy() {
		return opnameCreatedBy;
	}

	public void setOpnameCreatedBy(String opnameCreatedBy) {
		this.opnameCreatedBy = opnameCreatedBy;
	}

	public Timestamp getOpnameCreatedDate() {
		return opnameCreatedDate;
	}

	public void setOpnameCreatedDate(Timestamp opnameCreatedDate) {
		this.opnameCreatedDate = opnameCreatedDate;
	}

	public String getOpnameUpdatedBy() {
		return opnameUpdatedBy;
	}

	public void setOpnameUpdatedBy(String opnameUpdatedBy) {
		this.opnameUpdatedBy = opnameUpdatedBy;
	}

	public Timestamp getOpnameUpdatedDate() {
		return opnameUpdatedDate;
	}

	public void setOpnameUpdatedDate(Timestamp opnameUpdatedDate) {
		this.opnameUpdatedDate = opnameUpdatedDate;
	}

	public int getOpnameRevised() {
		return opnameRevised;
	}

	public void setOpnameRevised(int opnameRevised) {
		this.opnameRevised = opnameRevised;
	}

	public int getOpnameDepoId() {
		return opnameDepoId;
	}

	public void setOpnameDepoId(int opnameDepoId) {
		this.opnameDepoId = opnameDepoId;
	}

	public String getOpnameStatus() {
		return opnameStatus;
	}

	public void setOpnameStatus(String opnameStatus) {
		this.opnameStatus = opnameStatus;
	}

	public String getOpnameDepoNama() {
		return opnameDepoNama;
	}

	public void setOpnameDepoNama(String opnameDepoNama) {
		this.opnameDepoNama = opnameDepoNama;
	}

	public String getOpnameGroup() {
		return opnameGroup;
	}

	public void setOpnameGroup(String opnameGroup) {
		this.opnameGroup = opnameGroup;
	}

	public Timestamp getOpnameDeletedDate() {
		return opnameDeletedDate;
	}

	public void setOpnameDeletedDate(Timestamp opnameDeletedDate) {
		this.opnameDeletedDate = opnameDeletedDate;
	}

	public List<MOpnameDetail> getDetail() {
		return detail;
	}

	public void setDetail(List<MOpnameDetail> detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "MOpname [opnameId=" + opnameId + ", opnameNo=" + opnameNo + ", opnameTanggal=" + opnameTanggal
				+ ", opnameKeterangan=" + opnameKeterangan + ", opnameAktif=" + opnameAktif + ", opnameCreatedBy="
				+ opnameCreatedBy + ", opnameCreatedDate=" + opnameCreatedDate + ", opnameUpdatedBy=" + opnameUpdatedBy
				+ ", opnameUpdatedDate=" + opnameUpdatedDate + ", opnameRevised=" + opnameRevised + ", opnameDepoId="
				+ opnameDepoId + ", opnameStatus=" + opnameStatus + ", opnameDepoNama=" + opnameDepoNama
				+ ", opnameGroup=" + opnameGroup + ", opnameDeletedDate=" + opnameDeletedDate + ", detail=" + detail
				+ "]";
	}
	
	
	
}

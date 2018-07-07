package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_agama")
public class MAgama {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="agama_id")
	private int agama_id;
	
	@Column(name="agama_nama")
	private String agamaNama;
	
	@Column(name="agama_keterangan")
	private String agamaKeterangan;
	
	@Column(name="agama_aktif")
	private String agamaAktif;
	
	@Column(name="agama_created_by")
	private String agamaCreatedBy;
	
	@Column(name="agama_created_date")
	private Timestamp agamaCreatedDate;
	
	@Column(name="agama_updated_by")
	private String agamaUpdatedBy;
	
	@Column(name="agama_updated_date")
	private Timestamp agamaUpdatedDate;
	
	@Column(name="agama_revised")
	private Integer agamaRevised;
	  
	@Column(name="agama_deleted_date")
	private Timestamp agamaDeletedDate;

	public int getAgama_id() {
		return agama_id;
	}

	public void setAgama_id(int agama_id) {
		this.agama_id = agama_id;
	}

	public String getAgamaNama() {
		return agamaNama;
	}

	public void setAgamaNama(String agamaNama) {
		this.agamaNama = agamaNama;
	}

	public String getAgamaKeterangan() {
		return agamaKeterangan;
	}

	public void setAgamaKeterangan(String agamaKeterangan) {
		this.agamaKeterangan = agamaKeterangan;
	}

	public String getAgamaAktif() {
		return agamaAktif;
	}

	public void setAgamaAktif(String agamaAktif) {
		this.agamaAktif = agamaAktif;
	}

	public String getAgamaCreatedBy() {
		return agamaCreatedBy;
	}

	public void setAgamaCreatedBy(String agamaCreatedBy) {
		this.agamaCreatedBy = agamaCreatedBy;
	}

	public Timestamp getAgamaCreatedDate() {
		return agamaCreatedDate;
	}

	public void setAgamaCreatedDate(Timestamp agamaCreatedDate) {
		this.agamaCreatedDate = agamaCreatedDate;
	}

	public String getAgamaUpdatedBy() {
		return agamaUpdatedBy;
	}

	public void setAgamaUpdatedBy(String agamaUpdatedBy) {
		this.agamaUpdatedBy = agamaUpdatedBy;
	}

	public Timestamp getAgamaUpdatedDate() {
		return agamaUpdatedDate;
	}

	public void setAgamaUpdatedDate(Timestamp agamaUpdatedDate) {
		this.agamaUpdatedDate = agamaUpdatedDate;
	}

	public Integer getAgamaRevised() {
		return agamaRevised;
	}

	public void setAgamaRevised(Integer agamaRevised) {
		this.agamaRevised = agamaRevised;
	}

	public Timestamp getAgamaDeletedDate() {
		return agamaDeletedDate;
	}

	public void setAgamaDeletedDate(Timestamp agamaDeletedDate) {
		this.agamaDeletedDate = agamaDeletedDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

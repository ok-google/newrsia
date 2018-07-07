/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:09:37 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:09:37 
 */
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_propinsi")
public class MProvinsi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="propinsi_id")
	private int propinsi_id;
	
	@Column(name="propinsi_kode")
	private String propinsiKode;
	
	@Column(name="propinsi_nama")
	private String propinsiNama;
	
	@Column(name="propinsi_aktif")
	private String propinsiAktif;
	
	@Column(name="propinsi_created_by")
	private String propinsiCreatedBy;
	
	@Column(name="propinsi_created_date")
	private Timestamp propinsiCreatedDate;
	
	@Column(name="propinsi_updated_by")
	private String propinsiUpdatedBy;
	
	@Column(name="propinsi_updated_date")
	private Timestamp propinsiUpdatedDate;
	
	@Column(name="propinsi_revised")
	private Integer propinsiRevised;
	
	@Column(name="propinsi_deleted_date")
	private Timestamp propinsideletedDate;

	public int getPropinsi_id() {
		return propinsi_id;
	}

	public void setPropinsi_id(int propinsi_id) {
		this.propinsi_id = propinsi_id;
	}

	public String getPropinsiKode() {
		return propinsiKode;
	}

	public void setPropinsiKode(String propinsiKode) {
		this.propinsiKode = propinsiKode;
	}

	public String getPropinsiNama() {
		return propinsiNama;
	}

	public void setPropinsiNama(String propinsiNama) {
		this.propinsiNama = propinsiNama;
	}

	public String getPropinsiAktif() {
		return propinsiAktif;
	}

	public void setPropinsiAktif(String propinsiAktif) {
		this.propinsiAktif = propinsiAktif;
	}

	public String getPropinsiCreatedBy() {
		return propinsiCreatedBy;
	}

	public void setPropinsiCreatedBy(String propinsiCreatedBy) {
		this.propinsiCreatedBy = propinsiCreatedBy;
	}

	public Timestamp getPropinsiCreatedDate() {
		return propinsiCreatedDate;
	}

	public void setPropinsiCreatedDate(Timestamp propinsiCreatedDate) {
		this.propinsiCreatedDate = propinsiCreatedDate;
	}

	public String getPropinsiUpdatedBy() {
		return propinsiUpdatedBy;
	}

	public void setPropinsiUpdatedBy(String propinsiUpdatedBy) {
		this.propinsiUpdatedBy = propinsiUpdatedBy;
	}

	public Timestamp getPropinsiUpdatedDate() {
		return propinsiUpdatedDate;
	}

	public void setPropinsiUpdatedDate(Timestamp propinsiUpdatedDate) {
		this.propinsiUpdatedDate = propinsiUpdatedDate;
	}

	public Integer getPropinsiRevised() {
		return propinsiRevised;
	}

	public void setPropinsiRevised(Integer propinsiRevised) {
		this.propinsiRevised = propinsiRevised;
	}

	public Timestamp getPropinsideletedDate() {
		return propinsideletedDate;
	}

	public void setPropinsideletedDate(Timestamp propinsideletedDate) {
		this.propinsideletedDate = propinsideletedDate;
	}

	@Override
	public String toString() {
		return "MProvinsi [propinsi_id=" + propinsi_id + ", propinsiKode=" + propinsiKode + ", propinsiNama="
				+ propinsiNama + ", propinsiAktif=" + propinsiAktif + ", propinsiCreatedBy=" + propinsiCreatedBy
				+ ", propinsiCreatedDate=" + propinsiCreatedDate + ", propinsiUpdatedBy=" + propinsiUpdatedBy
				+ ", propinsiUpdatedDate=" + propinsiUpdatedDate + ", propinsiRevised=" + propinsiRevised
				+ ", propinsideletedDate=" + propinsideletedDate + "]";
	}
	
	
}

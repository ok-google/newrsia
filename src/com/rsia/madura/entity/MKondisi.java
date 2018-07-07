/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:06:45 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-30 15:05:51
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
@Table(name="m_kondisi")
public class MKondisi {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kondisi_id")
	private int kondisiID;
	
	// nama kolom: snake_case
	@Column(name="kondisi_kode")
	// nama property: camelCase
	private String kondisiKode;
	
	@Column(name="kondisi_nama")
	private String kondisiNama;
	
	@Column(name="kondisi_aktif")
	private String kondisiAktif;
	
	@Column(name="kondisi_created_by")
	private String kondisiCreatedBy;
	
	@Column(name="kondisi_created_date")
	private Timestamp kondisiCreatedDate;
	
	@Column(name="kondisi_updated_by")
	private String kondisiUpdatedBy;
	
	@Column(name="kondisi_updated_date")
	private Timestamp kondisiUpdatedDate;
	
	@Column(name="kondisi_revised")
	private int kondisiRevised;
	
	@Column(name="kondisi_keterangan")
	private String kondisiKeterangan;
	
	@Column(name="kondisi_deleted_date")
	private Timestamp kondisiDeletedDate;

	public int getKondisiID() {
		return kondisiID;
	}

	public void setKondisiID(int kondisiID) {
		this.kondisiID = kondisiID;
	}

	public String getKondisiKode() {
		return kondisiKode;
	}

	public void setKondisiKode(String kondisiKode) {
		this.kondisiKode = kondisiKode;
	}

	public String getKondisiNama() {
		return kondisiNama;
	}

	public void setKondisiNama(String kondisiNama) {
		this.kondisiNama = kondisiNama;
	}

	public String getKondisiAktif() {
		return kondisiAktif;
	}
	
	public void setKondisiAktif(String kondisiAktif) {
		this.kondisiAktif = kondisiAktif;
	}

	public String getKondisiCreatedBy() {
		return kondisiCreatedBy;
	}

	public void setKondisiCreatedBy(String kondisiCreatedBy) {
		this.kondisiCreatedBy = kondisiCreatedBy;
	}

	public Timestamp getKondisiCreatedDate() {
		return kondisiCreatedDate;
	}

	public void setKondisiCreatedDate(Timestamp kondisiCreatedDate) {
		this.kondisiCreatedDate = kondisiCreatedDate;
	}

	public String getKondisiUpdatedBy() {
		return kondisiUpdatedBy;
	}

	public void setKondisiUpdatedBy(String kondisiUpdatedBy) {
		this.kondisiUpdatedBy = kondisiUpdatedBy;
	}

	public Timestamp getKondisiUpdatedDate() {
		return kondisiUpdatedDate;
	}

	public void setKondisiUpdatedDate(Timestamp kondisiUpdatedDate) {
		this.kondisiUpdatedDate = kondisiUpdatedDate;
	}

	public int getKondisiRevised() {
		return kondisiRevised;
	}

	public void setKondisiRevised(int kondisiRevised) {
		this.kondisiRevised = kondisiRevised;
	}

	public String getKondisiKeterangan() {
		return kondisiKeterangan;
	}

	public void setKondisiKeterangan(String kondisiKeterangan) {
		this.kondisiKeterangan = kondisiKeterangan;
	}

	public Timestamp getKondisiDeletedDate() {
		return kondisiDeletedDate;
	}

	public void setKondisiDeletedDate(Timestamp kondisiDeletedDate) {
		this.kondisiDeletedDate = kondisiDeletedDate;
	}

	@Override
	public String toString() {
		return "MKondisi [kondisiID=" + kondisiID + ", kondisiKode=" + kondisiKode + ", kondisiNama="
				+ kondisiNama + ", kondisiAktif=" + kondisiAktif + ", kondisiCreatedBy=" + kondisiCreatedBy
				+ ", kondisiCreatedDate=" + kondisiCreatedDate + ", kondisiUpdatedBy=" + kondisiUpdatedBy
				+ ", kondisiUpdatedDate=" + kondisiUpdatedDate + ", kondisiRevised=" + kondisiRevised
				+ ", kondisiKeterangan=" + kondisiKeterangan + ", kondisiDeletedDate=" + kondisiDeletedDate + "]";
	}

}

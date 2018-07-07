/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:09:17 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:09:17 
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
@Table(name="m_pendidikan")
public class MPendidikan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pendidikan_id")
	private int pendidikanId;
	
	@Column(name="pendidikan_kode")
	private String pendidikanKode;
	
	@Column(name="pendidikan_nama")
	private String pendidikanNama;
	
	@Column(name="pendidikan_urut")
	private Integer pendidikanUrut;
	
	@Column(name="pendidikan_aktif")
	private char pendidikanAktif;
	
	@Column(name="pendidikan_created_by")
	private String pendidikanCreatedBy;
	
	@Column(name="pendidikan_created_date")
	private Timestamp pendidikanCreatedDate;
	
	@Column(name="pendidikan_updated_by")
	private String pendidikanUpdatedBy;
	
	@Column(name="pendidikan_updated_date")
	private Timestamp pendidikanUpdatedDate;
	
	@Column(name="pendidikan_revised")
	private Integer pendidikanRevised;
	
	@Column(name="pendidikan_keterangan")
	private String pendidikanKeterangan;
	
	@Column(name="pendidikan_deleted_date")
	private Timestamp pendidikanDeletedDate;

	public int getPendidikanId() {
		return pendidikanId;
	}

	public void setPendidikanId(int pendidikanId) {
		this.pendidikanId = pendidikanId;
	}

	public String getPendidikanKode() {
		return pendidikanKode;
	}

	public void setPendidikanKode(String pendidikanKode) {
		this.pendidikanKode = pendidikanKode;
	}

	public String getPendidikanNama() {
		return pendidikanNama;
	}

	public void setPendidikanNama(String pendidikanNama) {
		this.pendidikanNama = pendidikanNama;
	}

	public Integer getPendidikanUrut() {
		return pendidikanUrut;
	}

	public void setPendidikanUrut(Integer pendidikanUrut) {
		this.pendidikanUrut = pendidikanUrut;
	}

	public char getPendidikanAktif() {
		return pendidikanAktif;
	}

	public void setPendidikanAktif(char pendidikanAktif) {
		this.pendidikanAktif = pendidikanAktif;
	}

	public String getPendidikanCreatedBy() {
		return pendidikanCreatedBy;
	}

	public void setPendidikanCreatedBy(String pendidikanCreatedBy) {
		this.pendidikanCreatedBy = pendidikanCreatedBy;
	}

	public Timestamp getPendidikanCreatedDate() {
		return pendidikanCreatedDate;
	}

	public void setPendidikanCreatedDate(Timestamp pendidikanCreatedDate) {
		this.pendidikanCreatedDate = pendidikanCreatedDate;
	}

	public String getPendidikanUpdatedBy() {
		return pendidikanUpdatedBy;
	}

	public void setPendidikanUpdatedBy(String pendidikanUpdatedBy) {
		this.pendidikanUpdatedBy = pendidikanUpdatedBy;
	}

	public Timestamp getPendidikanUpdatedDate() {
		return pendidikanUpdatedDate;
	}

	public void setPendidikanUpdatedDate(Timestamp pendidikanUpdatedDate) {
		this.pendidikanUpdatedDate = pendidikanUpdatedDate;
	}

	public Integer getPendidikanRevised() {
		return pendidikanRevised;
	}

	public void setPendidikanRevised(Integer pendidikanRevised) {
		this.pendidikanRevised = pendidikanRevised;
	}

	public String getPendidikanKeterangan() {
		return pendidikanKeterangan;
	}

	public void setPendidikanKeterangan(String pendidikanKeterangan) {
		this.pendidikanKeterangan = pendidikanKeterangan;
	}

	public Timestamp getPendidikanDeletedDate() {
		return pendidikanDeletedDate;
	}

	public void setPendidikanDeletedDate(Timestamp pendidikanDeletedDate) {
		this.pendidikanDeletedDate = pendidikanDeletedDate;
	}

	@Override
	public String toString() {
		return "MPendidikan [pendidikanId=" + pendidikanId + ", pendidikanKode=" + pendidikanKode
				+ ", pendidikanNama=" + pendidikanNama + ", pendidikanUrut=" + pendidikanUrut + ", pendidikanAktif="
				+ pendidikanAktif + ", pendidikanCreatedBy=" + pendidikanCreatedBy + ", pendidikanCreatedDate="
				+ pendidikanCreatedDate + ", pendidikanUpdatedBy=" + pendidikanUpdatedBy + ", pendidikanUpdatedDate="
				+ pendidikanUpdatedDate + ", pendidikanRevised=" + pendidikanRevised + ", pendidikanKeterangan="
				+ pendidikanKeterangan + ", pendidikanDeletedDate=" + pendidikanDeletedDate + "]";
	}
}

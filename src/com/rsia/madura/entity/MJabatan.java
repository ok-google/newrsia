/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:04:47 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:04:47 
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
@Table(name="m_jabatan")
public class MJabatan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jabatan_id")
	private int jabatanId;
	
	@Column(name="jabatan_nama")
	private String jabatanNama;
	
	@Column(name="jabatan_jenis")
	private String jabatanJenis; //Struktural or Fungsional
	
	@Column(name="jabatan_keterangan")
	private String jabatanKeterangan;
	
	@Column(name="jabatan_aktif")
	private char jabatanAktif;
	
	@Column(name="jabatan_created_by")
	private String jabatanCreatedBy;
	
	@Column(name="jabatan_created_date")
	private Timestamp jabatanCreatedDate;
	
	@Column(name="jabatan_updated_by")
	private String jabatanUpdatedBy;
	
	@Column(name="jabatan_updated_date")
	private Timestamp jabatanUpdatedDate;
	
	@Column(name="jabatan_revised")
	private int jabatanRevised;
	
	@Column(name="jabatan_deleted_date")
	private Timestamp jabatanDeletedDate;

	public MJabatan() {
	
	}

	public int getJabatanId() {
		return jabatanId;
	}

	public void setJabatanId(int jabatanId) {
		this.jabatanId = jabatanId;
	}

	public String getJabatanNama() {
		return jabatanNama;
	}

	public void setJabatanNama(String jabatanNama) {
		this.jabatanNama = jabatanNama;
	}

	public String getJabatanJenis() {
		return jabatanJenis;
	}

	public void setJabatanJenis(String jabatanJenis) {
		this.jabatanJenis = jabatanJenis;
	}

	public String getJabatanKeterangan() {
		return jabatanKeterangan;
	}

	public void setJabatanKeterangan(String jabatanKeterangan) {
		this.jabatanKeterangan = jabatanKeterangan;
	}

	public char getJabatanAktif() {
		return jabatanAktif;
	}

	public void setJabatanAktif(char jabatanAktif) {
		this.jabatanAktif = jabatanAktif;
	}

	public String getJabatanCreatedBy() {
		return jabatanCreatedBy;
	}

	public void setJabatanCreatedBy(String jabatanCreatedBy) {
		this.jabatanCreatedBy = jabatanCreatedBy;
	}

	public Timestamp getJabatanCreatedDate() {
		return jabatanCreatedDate;
	}

	public void setJabatanCreatedDate(Timestamp jabatanCreatedDate) {
		this.jabatanCreatedDate = jabatanCreatedDate;
	}

	public String getJabatanUpdatedBy() {
		return jabatanUpdatedBy;
	}

	public void setJabatanUpdatedBy(String jabatanUpdatedBy) {
		this.jabatanUpdatedBy = jabatanUpdatedBy;
	}

	public Timestamp getJabatanUpdatedDate() {
		return jabatanUpdatedDate;
	}

	public void setJabatanUpdatedDate(Timestamp jabatanUpdatedDate) {
		this.jabatanUpdatedDate = jabatanUpdatedDate;
	}

	public int getJabatanRevised() {
		return jabatanRevised;
	}

	public void setJabatanRevised(int jabatanRevised) {
		this.jabatanRevised = jabatanRevised;
	}

	public Timestamp getJabatanDeletedDate() {
		return jabatanDeletedDate;
	}

	public void setJabatanDeletedDate(Timestamp jabatanDeletedDate) {
		this.jabatanDeletedDate = jabatanDeletedDate;
	}

	@Override
	public String toString() {
		return "MJabatan [jabatanId=" + jabatanId + ", jabatanNama=" + jabatanNama + ", jabatanJenis=" + jabatanJenis
				+ ", jabatanKeterangan=" + jabatanKeterangan + ", jabatanAktif=" + jabatanAktif + ", jabatanCreatedBy="
				+ jabatanCreatedBy + ", jabatanCreatedDate=" + jabatanCreatedDate + ", jabatanUpdatedBy="
				+ jabatanUpdatedBy + ", jabatanUpdatedDate=" + jabatanUpdatedDate + ", jabatanRevised=" + jabatanRevised
				+ ", jabatanDeletedDate=" + jabatanDeletedDate + "]";
	}
	
	
}

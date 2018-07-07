/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:07:13 
 * @Last Modified by:   Pradesga Indonesia
 * @Last Modified time: 2018-05-28 09:42:20
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
@Table(name="m_kota")
public class MKota {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kota_id")
	private int kota_id;
	
	@Column(name="kota_kode")
	private String kotaKode;
	
	@Column(name="kota_nama")
	private String kotaNama;
	
	@Column(name="kota_aktif")
	private String kotaAktif;
	
	@Column(name="kota_created_by")
	private String kotaCreatedBy;
	
	@Column(name="kota_created_date")
	private Timestamp kotaCreatedDate;
	
	@Column(name="kota_updated_by")
	private String kotaUpdatedBy;
	
	@Column(name="kota_updated_date")
	private Timestamp kotaUpdatedDate;
	
	@Column(name="kota_revised")
	private Integer kotaRevised;
	
	@Column(name="kota_deleted_date")
	private Timestamp kotadeletedDate;
	
	// ganti relasi
    @Column(name="m_propinsi_kode")
	private String propinsiKode  ;

	public MKota() {
		
	}

	public int getkota_id() {
		return kota_id;
	}

	public void setkota_id(int kota_id) {
		this.kota_id = kota_id;
	}

	public String getkotaKode() {
		return kotaKode;
	}

	public void setkotaKode(String kotaKode) {
		this.kotaKode = kotaKode;
	}

	public String getkotaNama() {
		return kotaNama;
	}

	public void setkotaNama(String kotaNama) {
		this.kotaNama = kotaNama;
	}

	public String getkotaAktif() {
		return kotaAktif;
	}

	public void setkotaAktif(String kotaAktif) {
		this.kotaAktif = kotaAktif;
	}

	public String getkotaCreatedBy() {
		return kotaCreatedBy;
	}

	public void setkotaCreatedBy(String kotaCreatedBy) {
		this.kotaCreatedBy = kotaCreatedBy;
	}

	public Timestamp getkotaCreatedDate() {
		return kotaCreatedDate;
	}

	public void setkotaCreatedDate(Timestamp kotaCreatedDate) {
		this.kotaCreatedDate = kotaCreatedDate;
	}

	public String getkotaUpdatedBy() {
		return kotaUpdatedBy;
	}

	public void setkotaUpdatedBy(String kotaUpdatedBy) {
		this.kotaUpdatedBy = kotaUpdatedBy;
	}

	public Timestamp getkotaUpdatedDate() {
		return kotaUpdatedDate;
	}

	public void setkotaUpdatedDate(Timestamp kotaUpdatedDate) {
		this.kotaUpdatedDate = kotaUpdatedDate;
	}

	public Integer getkotaRevised() {
		return kotaRevised;
	}

	public void setkotaRevised(Integer kotaRevised) {
		this.kotaRevised = kotaRevised;
	}

	public Timestamp getkotadeletedDate() {
		return kotadeletedDate;
	}

	public void setkotadeletedDate(Timestamp kotadeletedDate) {
		this.kotadeletedDate = kotadeletedDate;
	}

	public String getPropinsiKode() {
		return propinsiKode;
	}

	public void setPropinsiKode(String propinsiKode) {
		this.propinsiKode = propinsiKode;
	}

	@Override
	public String toString() {
		return "MKota [kota_id=" + kota_id + ", kotaKode=" + kotaKode + ", kotaNama=" + kotaNama + ", kotaAktif="
				+ kotaAktif + ", kotaCreatedBy=" + kotaCreatedBy + ", kotaCreatedDate=" + kotaCreatedDate
				+ ", kotaUpdatedBy=" + kotaUpdatedBy + ", kotaUpdatedDate=" + kotaUpdatedDate + ", kotaRevised="
				+ kotaRevised + ", kotadeletedDate=" + kotadeletedDate + ", propinsiKode=" + propinsiKode + "]";
	}
	
	
	
	
	
	
	
}

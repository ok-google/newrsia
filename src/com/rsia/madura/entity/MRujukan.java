/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:09:58 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:09:58 
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
@Table(name="m_rujukan")
public class MRujukan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rujukan_id")
	private int rujukanID;
	
	@Column(name="rujukan_jenis")
	private int rujukanJenis;
	
	@Column(name="rujukan_nama")
	private String rujukanNama;
	
	@Column(name="rujukan_alamat")
	private String rujukanAlamat;
	
	@Column(name="rujukan_kecamatan")
	private int rujukanKecamatan;
	
	@Column(name="rujukan_kota")
	private int rujukanKota;
	
	@Column(name="rujukan_propinsi")
	private int rujukanPropinsi;
	
	@Column(name="rujukan_telp")
	private String rujukanTelp;
	
	@Column(name="rujukan_email")
	private String rujukanEmail;
	
	@Column(name="rujukan_fax")
	private String rujukanFax;
	
	@Column(name="rujukan_cp")
	private String rujukanCp;
	
	@Column(name="rujukan_cp_telp")
	private String rujukanCpTelp;
	
	@Column(name="rujukan_aktif")
	private String rujukanAktif;
	
	@Column(name="rujukan_revised")
	private int rujukanRevised;
	
	@Column(name="rujukan_created_by")
	private String rujukanCreatedBy;
	
	@Column(name="rujukan_updated_by")
	private String rujukanUpdatedBy;
	
	@Column(name="rujukan_created_date")
	private Timestamp rujukanCreatedDate;
	
	@Column(name="rujukan_updated_date")
	private Timestamp rujukanUpdatedDate;
	
	@Column(name="rujukan_kode")
	private String rujukanKode;
	  
	@Column(name="rujukan_deleted_date")
	private Timestamp rujukanDeletedDate;

	public int getRujukanID() {
		return rujukanID;
	}

	public void setRujukanID(int rujukanID) {
		this.rujukanID = rujukanID;
	}

	public int getRujukanJenis() {
		return rujukanJenis;
	}

	public void setRujukanJenis(int rujukanJenis) {
		this.rujukanJenis = rujukanJenis;
	}

	public String getRujukanNama() {
		return rujukanNama;
	}

	public void setRujukanNama(String rujukanNama) {
		this.rujukanNama = rujukanNama;
	}

	public String getRujukanAlamat() {
		return rujukanAlamat;
	}

	public void setRujukanAlamat(String rujukanAlamat) {
		this.rujukanAlamat = rujukanAlamat;
	}

	public int getRujukanKecamatan() {
		return rujukanKecamatan;
	}

	public void setRujukanKecamatan(int rujukanKecamatan) {
		this.rujukanKecamatan = rujukanKecamatan;
	}

	public int getRujukanKota() {
		return rujukanKota;
	}

	public void setRujukanKota(int rujukanKota) {
		this.rujukanKota = rujukanKota;
	}

	public int getRujukanPropinsi() {
		return rujukanPropinsi;
	}

	public void setRujukanPropinsi(int rujukanPropinsi) {
		this.rujukanPropinsi = rujukanPropinsi;
	}

	public String getRujukanTelp() {
		return rujukanTelp;
	}

	public void setRujukanTelp(String rujukanTelp) {
		this.rujukanTelp = rujukanTelp;
	}

	public String getRujukanEmail() {
		return rujukanEmail;
	}

	public void setRujukanEmail(String rujukanEmail) {
		this.rujukanEmail = rujukanEmail;
	}

	public String getRujukanFax() {
		return rujukanFax;
	}

	public void setRujukanFax(String rujukanFax) {
		this.rujukanFax = rujukanFax;
	}

	public String getRujukanCp() {
		return rujukanCp;
	}

	public void setRujukanCp(String rujukanCp) {
		this.rujukanCp = rujukanCp;
	}

	public String getRujukanCpTelp() {
		return rujukanCpTelp;
	}

	public void setRujukanCpTelp(String rujukanCpTelp) {
		this.rujukanCpTelp = rujukanCpTelp;
	}

	public String getRujukanAktif() {
		return rujukanAktif;
	}

	public void setRujukanAktif(String rujukanAktif) {
		this.rujukanAktif = rujukanAktif;
	}

	public int getRujukanRevised() {
		return rujukanRevised;
	}

	public void setRujukanRevised(int rujukanRevised) {
		this.rujukanRevised = rujukanRevised;
	}

	public String getRujukanCreatedBy() {
		return rujukanCreatedBy;
	}

	public void setRujukanCreatedBy(String rujukanCreatedBy) {
		this.rujukanCreatedBy = rujukanCreatedBy;
	}

	public String getRujukanUpdatedBy() {
		return rujukanUpdatedBy;
	}

	public void setRujukanUpdatedBy(String rujukanUpdatedBy) {
		this.rujukanUpdatedBy = rujukanUpdatedBy;
	}

	public Timestamp getRujukanCreatedDate() {
		return rujukanCreatedDate;
	}

	public void setRujukanCreatedDate(Timestamp rujukanCreatedDate) {
		this.rujukanCreatedDate = rujukanCreatedDate;
	}

	public Timestamp getRujukanUpdatedDate() {
		return rujukanUpdatedDate;
	}

	public void setRujukanUpdatedDate(Timestamp rujukanUpdatedDate) {
		this.rujukanUpdatedDate = rujukanUpdatedDate;
	}

	public String getRujukanKode() {
		return rujukanKode;
	}

	public void setRujukanKode(String rujukanKode) {
		this.rujukanKode = rujukanKode;
	}

	public Timestamp getRujukanDeletedDate() {
		return rujukanDeletedDate;
	}

	public void setRujukanDeletedDate(Timestamp rujukanDeletedDate) {
		this.rujukanDeletedDate = rujukanDeletedDate;
	}	
}

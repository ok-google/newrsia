/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-28 10:17:57
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
@Table(name="m_obat")
public class MObat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "obat_id")
	private int obat_id;

	// ganti relsi
	@Column(name = "m_kategori_obat_id")
	private int m_kategori_obat_id;

	// ganti relasi
	@Column(name = "m_jenis_obat_id")
	private int m_jenis_obat_id;

	// jika sudah ada di obat (obat_id) hapus aaja
	@Column(name = "obat_kode")
	private String obat_kode;

	// jika sudah ada di obat (obat_id) hapus aaja
	@Column(name = "obat_nama")
	private String obat_nama;

	// ganti relasi
	@Column(name = "m_satuan_id")
	private int m_satuan_id;

	@Column(name = "obat_volume")
	private int obat_volume;

	// jika sudah ada di satuan (satuan_id) hapus aaja
	@Column(name = "obat_volume_satuan")
	private int obat_volume_satuan;

	@Column(name = "obat_keterangan")
	private String obat_keterangan;

	@Column(name = "obat_aktif")
	private String obat_aktif;

	@Column(name = "obat_created_by")
	private String obat_created_by;

	@Column(name = "obat_created_date")
	private Timestamp obat_created_date;

	@Column(name = "obat_updated_by")
	private String obat_updated_by;

	@Column(name = "obat_updated_date")
	private Timestamp obat_updated_date;

	@Column(name = "obat_revised")
	private int obat_revised;

	@Column(name = "obat_deleted_date")
	private Timestamp obat_deleted_date;

	@Column(name = "obat_deleted_by")
	private String obat_deleted_by;

	public int getObat_id() {
		return obat_id;
	}

	public void setObat_id(int obat_id) {
		this.obat_id = obat_id;
	}

	public int getM_kategori_obat_id() {
		return m_kategori_obat_id;
	}

	public void setM_kategori_obat_id(int m_kategori_obat_id) {
		this.m_kategori_obat_id = m_kategori_obat_id;
	}

	public int getM_jenis_obat_id() {
		return m_jenis_obat_id;
	}

	public void setM_jenis_obat_id(int m_jenis_obat_id) {
		this.m_jenis_obat_id = m_jenis_obat_id;
	}

	public String getObat_kode() {
		return obat_kode;
	}

	public void setObat_kode(String obat_kode) {
		this.obat_kode = obat_kode;
	}

	public String getObat_nama() {
		return obat_nama;
	}

	public void setObat_nama(String obat_nama) {
		this.obat_nama = obat_nama;
	}

	public int getM_satuan_id() {
		return m_satuan_id;
	}

	public void setM_satuan_id(int m_satuan_id) {
		this.m_satuan_id = m_satuan_id;
	}

	public int getObat_volume() {
		return obat_volume;
	}

	public void setObat_volume(int obat_volume) {
		this.obat_volume = obat_volume;
	}

	public int getObat_volume_satuan() {
		return obat_volume_satuan;
	}

	public void setObat_volume_satuan(int obat_volume_satuan) {
		this.obat_volume_satuan = obat_volume_satuan;
	}

	public String getObat_keterangan() {
		return obat_keterangan;
	}

	public void setObat_keterangan(String obat_keterangan) {
		this.obat_keterangan = obat_keterangan;
	}

	public String getObat_aktif() {
		return obat_aktif;
	}

	public void setObat_aktif(String obat_aktif) {
		this.obat_aktif = obat_aktif;
	}

	public String getObat_created_by() {
		return obat_created_by;
	}

	public void setObat_created_by(String obat_created_by) {
		this.obat_created_by = obat_created_by;
	}

	public Timestamp getObat_created_date() {
		return obat_created_date;
	}

	public void setObat_created_date(Timestamp obat_created_date) {
		this.obat_created_date = obat_created_date;
	}

	public String getObat_updated_by() {
		return obat_updated_by;
	}

	public void setObat_updated_by(String obat_updated_by) {
		this.obat_updated_by = obat_updated_by;
	}

	public Timestamp getObat_updated_date() {
		return obat_updated_date;
	}

	public void setObat_updated_date(Timestamp obat_updated_date) {
		this.obat_updated_date = obat_updated_date;
	}

	public int getObat_revised() {
		return obat_revised;
	}

	public void setObat_revised(int obat_revised) {
		this.obat_revised = obat_revised;
	}

	public Timestamp getObat_deleted_date() {
		return obat_deleted_date;
	}

	public void setObat_deleted_date(Timestamp obat_deleted_date) {
		this.obat_deleted_date = obat_deleted_date;
	}

	public String getObat_deleted_by() {
		return obat_deleted_by;
	}

	public void setObat_deleted_by(String obat_deleted_by) {
		this.obat_deleted_by = obat_deleted_by;
	}
}
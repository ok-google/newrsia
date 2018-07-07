/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-19 14:06:32
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-19 15:30:45
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Table(name="m_jenislayanan")
public class MJenisLayanan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "jenislayanan_id")
	private int jenislayananID;
	
	@Column(name= "jenislayanan_nomor")
	private String jenislayananNomor;
	
	@Column(name= "jenislayanan_nama")
	private String jenislayananNama;
	
	@Column(name= "jenislayanan_kategori")
	private String jenislayananKategori;
	
	@Column(name= "jenislayanan_aktif")
	private String jenislayananAktif;
	
	@Column(name= "jenislayanan_created_by")
	private String jenislayananCreatedBy;
	
	@Column(name= "jenislayanan_created_date")
	private Timestamp jenislayananCreatedDate;
	
	@Column(name= "jenislayanan_updated_by")
	private String jenislayananUpdatedBy;
	
	@Column(name= "jenislayanan_updated_date")
	private Timestamp jenislayananUpdatedDate;
	
	@Column(name= "jenislayanan_revised")
	private Integer jenislayananRevised;
	
	@Column(name= "reg_company_id")
	private Integer regCompanyID;
	
	@Column(name= "reg_apps_id")
	private Integer regAppsID;

	public int getJenislayananID() {
		return jenislayananID;
	}

	public void setJenislayananID(int jenislayananID) {
		this.jenislayananID = jenislayananID;
	}

	public String getJenislayananNomor() {
		return jenislayananNomor;
	}

	public void setJenislayananNomor(String jenislayananNomor) {
		this.jenislayananNomor = jenislayananNomor;
	}

	public String getJenislayananNama() {
		return jenislayananNama;
	}

	public void setJenislayananNama(String jenislayananNama) {
		this.jenislayananNama = jenislayananNama;
	}

	public String getJenislayananKategori() {
		return jenislayananKategori;
	}

	public void setJenislayananKategori(String jenislayananKategori) {
		this.jenislayananKategori = jenislayananKategori;
	}

	public String getJenislayananAktif() {
		return jenislayananAktif;
	}

	public void setJenislayananAktif(String jenislayananAktif) {
		this.jenislayananAktif = jenislayananAktif;
	}

	public String getJenislayananCreatedBy() {
		return jenislayananCreatedBy;
	}

	public void setJenislayananCreatedBy(String jenislayananCreatedBy) {
		this.jenislayananCreatedBy = jenislayananCreatedBy;
	}

	public Timestamp getJenislayananCreatedDate() {
		return jenislayananCreatedDate;
	}

	public void setJenislayananCreatedDate(Timestamp jenislayananCreatedDate) {
		this.jenislayananCreatedDate = jenislayananCreatedDate;
	}

	public String getJenislayananUpdatedBy() {
		return jenislayananUpdatedBy;
	}

	public void setJenislayananUpdatedBy(String jenislayananUpdatedBy) {
		this.jenislayananUpdatedBy = jenislayananUpdatedBy;
	}

	public Timestamp getJenislayananUpdatedDate() {
		return jenislayananUpdatedDate;
	}

	public void setJenislayananUpdatedDate(Timestamp jenislayananUpdatedDate) {
		this.jenislayananUpdatedDate = jenislayananUpdatedDate;
	}

	public Integer getJenislayananRevised() {
		return jenislayananRevised;
	}

	public void setJenislayananRevised(Integer jenislayananRevised) {
		this.jenislayananRevised = jenislayananRevised;
	}

	public Integer getRegCompanyID() {
		return regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID) {
		this.regCompanyID = regCompanyID;
	}

	public Integer geRJegAppsID() {
		return regAppsID;
	}

	public void setRegAppsID(Integer regAppsID) {
		this.regAppsID = regAppsID;
	}
}
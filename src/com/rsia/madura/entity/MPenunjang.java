/*
* @Author: PRADESGA
* @Date:   2018-04-07 01:44:50
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-25 12:57:05
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

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyCollection;

@Entity
@Table(name="m_penunjang")
public class MPenunjang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangmedis_id")
	private Integer penunjangmedisID;
	
	@Column(name="penunjangmedis_kode")
	private String penunjangmedisKode;
	
	@Column(name="penunjangmedis_nama")
	private String penunjangmedisNama;
	
	@Column(name="penunjangmedis_keterangan")
	private String penunjangmedisKeterangan;
	
	@Column(name="penunjangmedis_aktif")
	private String penunjangmedisAktif;

	@Column(name="penunjangmedis_template")
	private String penunjangmedisTemplate;

	@Column(name="penunjangmedis_urut")
	private String penunjangmedisUrut;
	
	@Column(name="penunjangmedis_group")
	private String penunjangmedisGroup;
	
	@Column(name="penunjangmedis_parent_id")
	private Integer penunjangmedisParentID;
	
	@Column(name="penunjangmedis_parent_kode")
	private Integer penunjangmedisParentKode;
	
	@Column(name="penunjangmedis_template_pr")
	private String penunjangmedisTemplatePr;
	
	@Column(name="penunjangmedis_label")
	private String penunjangmedisLabel;
	
	@Column(name="penunjangmedis_kegiatan")
	private Integer penunjangmedisKegiatan;
	
	@Column(name="penunjangmedis_created_by")
	private String penunjangmedisCreatedBy;
	
	@Column(name="penunjangmedis_created_date")
	private Timestamp penunjangmedisCreatedDate;
	
	@Column(name="penunjangmedis_updated_by")
	private String penunjangmedisUpdatedBy;
	
	@Column(name="penunjangmedis_updated_date")
	private Timestamp penunjangmedisUpdatedDate;
	
	@Column(name="penunjangmedis_revised")
	private int penunjangmedisRevised;
	
	@Column(name="penunjangmedis_deleted_by")
	private String penunjangmedisDeletedBy;
	
	@Column(name="penunjangmedis_deleted_date")
	private Timestamp penunjangmedisDeletedDate;

	@ManyToOne
	private MPenunjangGroup penunjangGroup;

	@ManyToOne
	private MJenisLayanan jenislayanan;

	@OneToMany(mappedBy = "penunjang", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MParamPeriksa> paramperiksa;

	@OneToMany(mappedBy = "penunjang", cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPenunjangKelas> penunjangkelas;

	public Integer getPenunjangmedisID() {
		return penunjangmedisID;
	}

	public void setPenunjangmedisID(Integer penunjangmedisID) {
		this.penunjangmedisID = penunjangmedisID;
	}

	public String getPenunjangmedisNama() {
		return penunjangmedisNama;
	}

	public void setPenunjangmedisNama(String penunjangmedisNama) {
		this.penunjangmedisNama = penunjangmedisNama;
	}

	public String getPenunjangmedisKeterangan() {
		return penunjangmedisKeterangan;
	}

	public void setPenunjangmedisKeterangan(String penunjangmedisKeterangan) {
		this.penunjangmedisKeterangan = penunjangmedisKeterangan;
	}

	public String getPenunjangmedisAktif() {
		return penunjangmedisAktif;
	}

	public void setPenunjangmedisAktif(String penunjangmedisAktif) {
		this.penunjangmedisAktif = penunjangmedisAktif;
	}

	public String getPenunjangmedisTemplate() {
		return penunjangmedisTemplate;
	}

	public void setPenunjangmedisTemplate(String penunjangmedisTemplate) {
		this.penunjangmedisTemplate = penunjangmedisTemplate;
	}

	public String getPenunjangmedisUrut() {
		return penunjangmedisUrut;
	}

	public void setPenunjangmedisUrut(String penunjangmedisUrut) {
		this.penunjangmedisUrut = penunjangmedisUrut;
	}

	public String getPenunjangmedisGroup() {
		return penunjangmedisGroup;
	}

	public void setPenunjangmedisGroup(String penunjangmedisGroup) {
		this.penunjangmedisGroup = penunjangmedisGroup;
	}

	public Integer getPenunjangmedisParentID() {
		return penunjangmedisParentID;
	}

	public void setPenunjangmedisParentID(Integer penunjangmedisParentID) {
		this.penunjangmedisParentID = penunjangmedisParentID;
	}

	public String getPenunjangmedisKode() {
		return penunjangmedisKode;
	}

	public void setPenunjangmedisKode(String penunjangmedisKode) {
		this.penunjangmedisKode = penunjangmedisKode;
	}

	public String getPenunjangmedisTemplatePr() {
		return penunjangmedisTemplatePr;
	}

	public void setPenunjangmedisTemplatePr(String penunjangmedisTemplatePr) {
		this.penunjangmedisTemplatePr = penunjangmedisTemplatePr;
	}

	public String getPenunjangmedisLabel() {
		return penunjangmedisLabel;
	}

	public void setPenunjangmedisLabel(String penunjangmedisLabel) {
		this.penunjangmedisLabel = penunjangmedisLabel;
	}

	public Integer getPenunjangmedisKegiatan() {
		return penunjangmedisKegiatan;
	}

	public void setPenunjangmedisKegiatan(Integer penunjangmedisKegiatan) {
		this.penunjangmedisKegiatan = penunjangmedisKegiatan;
	}

	public String getPenunjangmedisCreatedBy() {
		return penunjangmedisCreatedBy;
	}

	public void setPenunjangmedisCreatedBy(String penunjangmedisCreatedBy) {
		this.penunjangmedisCreatedBy = penunjangmedisCreatedBy;
	}

	public Timestamp getPenunjangmedisCreatedDate() {
		return penunjangmedisCreatedDate;
	}

	public void setPenunjangmedisCreatedDate(Timestamp penunjangmedisCreatedDate) {
		this.penunjangmedisCreatedDate = penunjangmedisCreatedDate;
	}

	public String getPenunjangmedisUpdatedBy() {
		return penunjangmedisUpdatedBy;
	}

	public void setPenunjangmedisUpdatedBy(String penunjangmedisUpdatedBy) {
		this.penunjangmedisUpdatedBy = penunjangmedisUpdatedBy;
	}

	public Timestamp getPenunjangmedisUpdatedDate() {
		return penunjangmedisUpdatedDate;
	}

	public void setPenunjangmedisUpdatedDate(Timestamp penunjangmedisUpdatedDate) {
		this.penunjangmedisUpdatedDate = penunjangmedisUpdatedDate;
	}

	public int getPenunjangmedisRevised() {
		return penunjangmedisRevised;
	}

	public void setPenunjangmedisRevised(int penunjangmedisRevised) {
		this.penunjangmedisRevised = penunjangmedisRevised;
	}

	public Timestamp getPenunjangmedisDeletedDate() {
		return penunjangmedisDeletedDate;
	}

	public void setPenunjangmedisDeletedDate(Timestamp penunjangmedisDeletedDate) {
		this.penunjangmedisDeletedDate = penunjangmedisDeletedDate;
	}

	public String getPenunjangmedisDeletedBy() {
		return penunjangmedisDeletedBy;
	}

	public void setPenunjangmedisDeletedBy(String penunjangmedisDeletedBy) {
		this.penunjangmedisDeletedBy = penunjangmedisDeletedBy;
	}

	public MPenunjangGroup getPenunjangGroup() {
		return penunjangGroup;
	}

	public void setPenunjangGroup(MPenunjangGroup penunjangGroup) {
		this.penunjangGroup = penunjangGroup;
	}

	@JsonManagedReference
	public List<MParamPeriksa> getParamperiksa() {
		return paramperiksa;
	}

	public void setParamperiksa(List<MParamPeriksa> paramperiksa) {
		this.paramperiksa = paramperiksa;
	}

	@JsonManagedReference
	public List<MPenunjangKelas> getPenunjangkelas() {
		return penunjangkelas;
	}

	public void setPenunjangkelas(List<MPenunjangKelas> penunjangkelas) {
		this.penunjangkelas = penunjangkelas;
	}

	public MJenisLayanan getJenislayanan() {
		return jenislayanan;
	}

	public void setJenislayanan(MJenisLayanan jenislayanan) {
		this.jenislayanan = jenislayanan;
	}


	@Override
	public String toString() {
		return "MPenunjang [penunjangmedisID=" + penunjangmedisID + ", penunjangmedisKode=" + penunjangmedisKode + ", penunjangmedisNama="
				+ penunjangmedisNama + ", penunjangmedisCreatedBy=" + penunjangmedisCreatedBy + ", jenislayanan=" + jenislayanan
				+ ", penunjangkelas=" + penunjangkelas + "]";
	}

}
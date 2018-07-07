/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-15 15:38:19
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-27 11:13:34
*/

package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name="m_parameter_periksa")
public class MParamPeriksa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paramperiksa_id")
	private Integer paramperiksaID;
	
	@Column(name="paramperiksa_kode")
	private String paramperiksaKode ;
	
	@Column(name="paramperiksa_nama")
	private String paramperiksaNama;
	
	@Column(name="paramperiksa_satuan")
	private String paramperiksaSatuan;
	
	@Column(name="paramperiksa_standar")
	private String paramperiksaStandar;
	
	@Column(name="paramperiksa_label")
	private String paramperiksaLabel;

	@Column(name="paramperiksa_group")
	private String paramperiksaGroup;

	@Column(name="paramperiksa_keterangan")
	private String paramperiksaKeterangan;

	@Column(name="paramperiksa_unit_id")
	private Integer paramperiksaUnitID;

	@Column(name="paramperiksa_aktif")
	private String paramperiksaAktif;

	@Column(name="paramperiksa_created_by")
	private String paramperiksaCreatedBy;

	@Column(name="paramperiksa_created_date")
	private Timestamp paramperiksaCreatedDate;

	@Column(name="paramperiksa_updated_by")
	private String paramperiksaUpdatedBy;

	@Column(name="paramperiksa_updated_date")
	private Timestamp paramperiksaUpdatedDate;

	@Column(name="paramperiksa_revised")
	private int paramperiksaRevised;

	@Column(name="paramperiksa_metode")
	private String paramperiksaMetode;

	@Column(name="paramperiksa_urut")
	private int paramperiksaUrut;

	@Column(name="paramperiksa_indent")
	private int paramperiksaIndent;

	@ManyToOne
	private MPenunjang penunjang;

	public Integer getParamperiksaID() {
		return paramperiksaID;
	}

	public void setParamperiksaID(Integer paramperiksaID) {
		this.paramperiksaID = paramperiksaID;
	}

	public String getParamperiksaKode() {
		return paramperiksaKode;
	}

	public void setParamperiksaKode(String paramperiksaKode) {
		this.paramperiksaKode = paramperiksaKode;
	}

	public String getParamperiksaNama() {
		return paramperiksaNama;
	}

	public void setParamperiksaNama(String paramperiksaNama) {
		this.paramperiksaNama = paramperiksaNama;
	}

	public String getParamperiksaSatuan() {
		return paramperiksaSatuan;
	}

	public void setParamperiksaSatuan(String paramperiksaSatuan) {
		this.paramperiksaSatuan = paramperiksaSatuan;
	}

	public String getParamperiksaStandar() {
		return paramperiksaStandar;
	}

	public void setParamperiksaStandar(String paramperiksaStandar) {
		this.paramperiksaStandar = paramperiksaStandar;
	}

	public String getParamperiksaLabel() {
		return paramperiksaLabel;
	}

	public void setParamperiksaLabel(String paramperiksaLabel) {
		this.paramperiksaLabel = paramperiksaLabel;
	}

	public String getParamperiksaGroup() {
		return paramperiksaGroup;
	}

	public void setParamperiksaGroup(String paramperiksaGroup) {
		this.paramperiksaGroup = paramperiksaGroup;
	}

	public String getParamperiksaKeterangan() {
		return paramperiksaKeterangan;
	}

	public void setParamperiksaKeterangan(String paramperiksaKeterangan) {
		this.paramperiksaKeterangan = paramperiksaKeterangan;
	}

	public Integer getParamperiksaUnitID() {
		return paramperiksaUnitID;
	}

	public void setParamperiksaUnitID(Integer paramperiksaUnitID) {
		this.paramperiksaUnitID = paramperiksaUnitID;
	}

	public String getParamperiksaAktif() {
		return paramperiksaAktif;
	}

	public void setParamperiksaAktif(String paramperiksaAktif) {
		this.paramperiksaAktif = paramperiksaAktif;
	}

	public String getParamperiksaCreatedBy() {
		return paramperiksaCreatedBy;
	}

	public void setParamperiksaCreatedBy(String paramperiksaCreatedBy) {
		this.paramperiksaCreatedBy = paramperiksaCreatedBy;
	}

	public Timestamp getParamperiksaCreatedDate() {
		return paramperiksaCreatedDate;
	}

	public void setParamperiksaCreatedDate(Timestamp paramperiksaCreatedDate) {
		this.paramperiksaCreatedDate = paramperiksaCreatedDate;
	}

	public String getParamperiksaUpdatedBy() {
		return paramperiksaUpdatedBy;
	}

	public void setParamperiksaUpdatedBy(String paramperiksaUpdatedBy) {
		this.paramperiksaUpdatedBy = paramperiksaUpdatedBy;
	}

	public Timestamp getParamperiksaUpdatedDate() {
		return paramperiksaUpdatedDate;
	}

	public void setParamperiksaUpdatedDate(Timestamp paramperiksaUpdatedDate) {
		this.paramperiksaUpdatedDate = paramperiksaUpdatedDate;
	}

	public int getParamperiksaRevised() {
		return paramperiksaRevised;
	}

	public void setParamperiksaRevised(int paramperiksaRevised) {
		this.paramperiksaRevised = paramperiksaRevised;
	}

	public String getParamperiksaMetode() {
		return paramperiksaMetode;
	}

	public void setParamperiksaMetode(String paramperiksaMetode) {
		this.paramperiksaMetode = paramperiksaMetode;
	}

	public int getParamperiksaUrut() {
		return paramperiksaUrut;
	}

	public void setParamperiksaUrut(int paramperiksaUrut) {
		this.paramperiksaUrut = paramperiksaUrut;
	}

	public int getParamperiksaIndent() {
		return paramperiksaIndent;
	}

	public void setParamperiksaIndent(int paramperiksaIndent) {
		this.paramperiksaIndent = paramperiksaIndent;
	}

	@JsonBackReference
	public MPenunjang getPenunjang() {
		return penunjang;
	}

	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

	@Override
	public String toString() {
		return "mParameterPeriksa [paramperiksaID=" + paramperiksaID + ",paramperiksaKode=" + paramperiksaKode 
				+ ",paramperiksaNama=" + paramperiksaNama + ",paramperiksaSatuan=" + paramperiksaSatuan 
				+ ",paramperiksaStandar=" + paramperiksaStandar + ",paramperiksaLabel=" + paramperiksaLabel 
				+ ",paramperiksaGroup=" + paramperiksaGroup + ",paramperiksaKeterangan=" + paramperiksaKeterangan 
				+ ",paramperiksaUnitID=" + paramperiksaUnitID + ",paramperiksaAktif=" + paramperiksaAktif 
				+ ",paramperiksaCreatedBy=" + paramperiksaCreatedBy + ",paramperiksaCreatedDate=" + paramperiksaCreatedDate 
				+ ",paramperiksaUpdatedBy=" + paramperiksaUpdatedBy + ",paramperiksaUpdatedDate=" + paramperiksaUpdatedDate 
				+ ",paramperiksaRevised=" + paramperiksaRevised + ",paramperiksaMetode=" + paramperiksaMetode 
				+ ",paramperiksaUrut=" + paramperiksaUrut + ",paramperiksaIndent=" + paramperiksaIndent + "]";
	}

}
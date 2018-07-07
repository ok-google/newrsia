/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 07:08:49
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:42:13
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@Table(name="t_soap")
public class MSoap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "soap_id")
	private Integer soapID;

    @Transient
    private Integer remove;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "soap_tanggal")
	private Date soapTanggal;
	
	@Column(name = "soap_subject")
	private String soapSubject;
	
	@Column(name = "soap_object")
	private String soapObject;
	
	@Column(name = "soap_assesment")
	private String soapAssesment;
	
	@Column(name = "soap_plan")
	private String soapPlan;
	
	@Column(name = "soap_created_by")
	private String soapCreatedBy;
	
	@Column(name = "soap_created_date")
	private Timestamp soapCreatedDate;
	
	@Column(name = "soap_updated_by")
	private String soapUpdatedBy;
	
	@Column(name = "soap_updated_date")
	private Timestamp soapUpdatedDate;
	
	@Column(name = "soap_revised")
	private Integer soapRevised;
	
	@Column(name = "soap_aktif")
	private String soapAktif;
	
	@Column(name = "reg_company_id")
	private Integer regCompanyID;
	
	@Column(name = "reg_apps_id")
	private Integer regAppsID;

	@ManyToOne
	private MPendaftaran pendaftaran;

	public Integer getSoapID() {
		return soapID;
	}

	public void setSoapID(Integer soapID){
		this.soapID = soapID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	public Date getSoapTanggal() {
		return soapTanggal;
	}

	public void setSoapTanggal(Date soapTanggal){
		this.soapTanggal = soapTanggal;
	}

	public String getSoapSubject() {
		return soapSubject;
	}

	public void setSoapSubject(String soapSubject){
		this.soapSubject = soapSubject;
	}

	public String getSoapObject() {
		return soapObject;
	}

	public void setSoapObject(String soapObject){
		this.soapObject = soapObject;
	}

	public String getSoapAssesment() {
		return soapAssesment;
	}

	public void setSoapAssesment(String soapAssesment){
		this.soapAssesment = soapAssesment;
	}

	public String getSoapPlan() {
		return soapPlan;
	}

	public void setSoapPlan(String soapPlan){
		this.soapPlan = soapPlan;
	}

	public String getSoapCreatedBy() {
		return soapCreatedBy;
	}

	public void setSoapCreatedBy(String soapCreatedBy){
		this.soapCreatedBy = soapCreatedBy;
	}

	public Timestamp getSoapCreatedDate() {
		return soapCreatedDate;
	}

	public void setSoapCreatedDate(Timestamp soapCreatedDate){
		this.soapCreatedDate = soapCreatedDate;
	}

	public String getSoapUpdatedBy() {
		return soapUpdatedBy;
	}

	public void setSoapUpdatedBy(String soapUpdatedBy){
		this.soapUpdatedBy = soapUpdatedBy;
	}

	public Timestamp getSoapUpdatedDate() {
		return soapUpdatedDate;
	}

	public void setSoapUpdatedDate(Timestamp soapUpdatedDate){
		this.soapUpdatedDate = soapUpdatedDate;
	}

	public Integer getSoapRevised() {
		return soapRevised;
	}

	public void setSoapRevised(Integer soapRevised){
		this.soapRevised = soapRevised;
	}

	public String getSoapAktif() {
		return soapAktif;
	}

	public void setSoapAktif(String soapAktif){
		this.soapAktif = soapAktif;
	}

	public Integer getRegCompanyID() {
		return regCompanyID;
	}

	public void setRegCompanyID(Integer regCompanyID){
		this.regCompanyID = regCompanyID;
	}

	public Integer getRegAppsID() {
		return regAppsID;
	}

	public void setRegAppsID(Integer regAppsID){
		this.regAppsID = regAppsID;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

}
package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@Table(name="t_resep")
public class MResep {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resepID")
	private Integer resepID;

    @Transient
    private Integer remove;
	
	@Column(name="resep_pasien_id")
	private Integer resepPasienId;
	  
	@Column(name="resep_pasien_norm")
	private String resepPasienNorm;
	  
	@Column(name="resep_tanggal")
	private Timestamp resepTanggal;

	@Column(name="resep_dokter_id")
	private Integer resepDokter;
	  
	@Column(name="resep_keterangan")
	private String resepKeterangan;
	  
	@Column(name="resep_aktif")
	private char resepAktif;
	  
	@Column(name="resep_status")
	private String resep_status;
	  
	@Column(name="resep_created_by")
	private String resepCreatedBy;
	  
	@Column(name="resep_created_date")
	private Timestamp resepCreatedDate;
	
	@Column(name="resep_updated_by")
	private String resepUpdatedBy;
	  
	@Column(name="resep_updated_date")
	private Timestamp resepUpdatedDate;
	
	@Column(name="resep_revised")
	private Integer resepRevised;
	  
	@Column(name="resep_deleted_date")
	private Timestamp resepDeletedDate;
	  
	@Column(name="resep_pasien_nama")
	private String resepPasienNama;
	
	@Column(name="resep_pasien_alamat")
	private String resepPasienAlamat;
	
	@Column(name="resep_dokter_nama")
	private String resepDokterNama;
	
	@Column(name="resep_no")
	private String resepNo;
	
	@Column(name="resep_data")
	private String resepData;
	  
	@Column(name="resep_unit_nama")
	private String resepUnitNama;
	  
	@Column(name="resep_dimension")
	private String resepDimension;
	  
	@Column(name="resep_pendaftaran_id")
	private Integer resepPendaftaranId;
	
	@Column(name="resep_ruang_nama")
	private String resepRuangNama;
	  
	@Column(name="reg_company_id")
	private Integer reg_company_id;
	  
	@Column(name="resep_apps_id")
	private Integer regAppsId;
	  
	@Column(name="resep_kamarpasien_id")
	private Integer resepKamarPasienId;
	
	@ManyToOne
	private MPendaftaran pendaftaran;

	public Integer getResepID() {
		return resepID;
	}

	public void setResepID(Integer resepID) {
		this.resepID = resepID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}


	public Integer getResepPasienId() {
		return resepPasienId;
	}

	public void setResepPasienId(Integer resepPasienId) {
		this.resepPasienId = resepPasienId;
	}

	public String getResepPasienNorm() {
		return resepPasienNorm;
	}

	public void setResepPasienNorm(String resepPasienNorm) {
		this.resepPasienNorm = resepPasienNorm;
	}

	public Timestamp getResepTanggal() {
		return resepTanggal;
	}

	public void setResepTanggal(Timestamp resepTanggal) {
		this.resepTanggal = resepTanggal;
	}

	public Integer getResepDokter() {
		return resepDokter;
	}

	public void setResepDokter(Integer resepDokter) {
		this.resepDokter = resepDokter;
	}

	public String getResepKeterangan() {
		return resepKeterangan;
	}

	public void setResepKeterangan(String resepKeterangan) {
		this.resepKeterangan = resepKeterangan;
	}

	public char getResepAktif() {
		return resepAktif;
	}

	public void setResepAktif(char resepAktif) {
		this.resepAktif = resepAktif;
	}

	public String getResep_status() {
		return resep_status;
	}

	public void setResep_status(String resep_status) {
		this.resep_status = resep_status;
	}

	public String getResepCreatedBy() {
		return resepCreatedBy;
	}

	public void setResepCreatedBy(String resepCreatedBy) {
		this.resepCreatedBy = resepCreatedBy;
	}

	public Timestamp getResepCreatedDate() {
		return resepCreatedDate;
	}

	public void setResepCreatedDate(Timestamp resepCreatedDate) {
		this.resepCreatedDate = resepCreatedDate;
	}

	public String getResepUpdatedBy() {
		return resepUpdatedBy;
	}

	public void setResepUpdatedBy(String resepUpdatedBy) {
		this.resepUpdatedBy = resepUpdatedBy;
	}

	public Timestamp getResepUpdatedDate() {
		return resepUpdatedDate;
	}

	public void setResepUpdatedDate(Timestamp resepUpdatedDate) {
		this.resepUpdatedDate = resepUpdatedDate;
	}

	public Integer getResepRevised() {
		return resepRevised;
	}

	public void setResepRevised(Integer resepRevised) {
		this.resepRevised = resepRevised;
	}

	public Timestamp getResepDeletedDate() {
		return resepDeletedDate;
	}

	public void setResepDeletedDate(Timestamp resepDeletedDate) {
		this.resepDeletedDate = resepDeletedDate;
	}

	public String getResepPasienNama() {
		return resepPasienNama;
	}

	public void setResepPasienNama(String resepPasienNama) {
		this.resepPasienNama = resepPasienNama;
	}

	public String getResepPasienAlamat() {
		return resepPasienAlamat;
	}

	public void setResepPasienAlamat(String resepPasienAlamat) {
		this.resepPasienAlamat = resepPasienAlamat;
	}

	public String getResepDokterNama() {
		return resepDokterNama;
	}

	public void setResepDokterNama(String resepDokterNama) {
		this.resepDokterNama = resepDokterNama;
	}

	public String getResepNo() {
		return resepNo;
	}

	public void setResepNo(String resepNo) {
		this.resepNo = resepNo;
	}

	public String getResepData() {
		return resepData;
	}

	public void setResepData(String resepData) {
		this.resepData = resepData;
	}

	public String getResepUnitNama() {
		return resepUnitNama;
	}

	public void setResepUnitNama(String resepUnitNama) {
		this.resepUnitNama = resepUnitNama;
	}

	public String getResepDimension() {
		return resepDimension;
	}

	public void setResepDimension(String resepDimension) {
		this.resepDimension = resepDimension;
	}

	public Integer getResepPendaftaranId() {
		return resepPendaftaranId;
	}

	public void setResepPendaftaranId(Integer resepPendaftaranId) {
		this.resepPendaftaranId = resepPendaftaranId;
	}

	public String getResepRuangNama() {
		return resepRuangNama;
	}

	public void setResepRuangNama(String resepRuangNama) {
		this.resepRuangNama = resepRuangNama;
	}

	public Integer getReg_company_id() {
		return reg_company_id;
	}

	public void setReg_company_id(Integer reg_company_id) {
		this.reg_company_id = reg_company_id;
	}

	public Integer getRegAppsId() {
		return regAppsId;
	}

	public void setRegAppsId(Integer regAppsId) {
		this.regAppsId = regAppsId;
	}

	public Integer getResepKamarPasienId() {
		return resepKamarPasienId;
	}

	public void setResepKamarPasienId(Integer resepKamarPasienId) {
		this.resepKamarPasienId = resepKamarPasienId;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}

	@Override
	public String toString() {
		return "t_Resep [resepID=" + resepID + ", resepPasienId=" + resepPasienId + ", resepPasienNorm="
				+ resepPasienNorm + ", resepTanggal=" + resepTanggal + ", resepDokter=" + resepDokter
				+ ", resepKeterangan=" + resepKeterangan + ", resepAktif=" + resepAktif + ", resep_status="
				+ resep_status + ", resepCreatedBy=" + resepCreatedBy + ", resepCreatedDate=" + resepCreatedDate
				+ ", resepUpdatedBy=" + resepUpdatedBy + ", resepUpdatedDate=" + resepUpdatedDate + ", resepRevised="
				+ resepRevised + ", resepDeletedDate=" + resepDeletedDate + ", resepPasienNama=" + resepPasienNama
				+ ", resepPasienAlamat=" + resepPasienAlamat + ", resepDokterNama=" + resepDokterNama + ", resepNo="
				+ resepNo + ", resepData=" + resepData + ", resepUnitNama=" + resepUnitNama + ", resepDimension="
				+ resepDimension + ", resepPendaftaranId=" + resepPendaftaranId + ", resepRuangNama=" + resepRuangNama
				+ ", reg_company_id=" + reg_company_id + ", regAppsId=" + regAppsId + ", resepKamarPasienId="
				+ resepKamarPasienId + "]";
	}
	
	
}

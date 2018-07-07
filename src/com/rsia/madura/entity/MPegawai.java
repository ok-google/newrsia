/*
 * @Author: Pradesga 
 * @Date: 2018-04-15 13:08:54 
 * @Last Modified by:   Pradesga 
 * @Last Modified time: 2018-04-15 13:08:54 
 */
package com.rsia.madura.entity;


import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.*;


import org.hibernate.type.TextType;

@Entity
@Table(name="m_pegawai")
public class MPegawai {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pegawai_id")
	private int pegawaiID;
	
	@Column(name="pegawai_no")
	private String pegawaiNo;
	
	/*@Column(name="m_jenis_pegawai_id")
	private int jenisPegawaiId;*/
	
	@Column(name="pegawai_nama")
	private String pegawaiNama;
	
	@Column(name="pegawai_kelamin")
	private String pegawaiKelamin;
	
	@Column(name="pegawai_tgllahir")
	private Date pegawaiTglLahir;
	
	@Column(name="pegawai_alamat")
	private String pegawaiAlamat;
	
	@Column(name="m_kota_id")
	private int kotaId;
	
	@Column(name="pegawai_aktif")
	private String pegawaiAktif;
	
	@Column(name="pegawai_created_by")
	private String pegawaiCreatedBy;
	
	@Column(name="pegawai_created_date")
	private Timestamp pegawaiCreatedDate;
	
	@Column(name="pegawai_updated_by")
	private String pegawaiUpdatedBy;
	
	@Column(name="pegawai_updated_date")
	private Timestamp pegawaiUpdatedDate;
	
	@Column(name="pegawai_revised")
	private int pegawaiRevised;
	
	@Column(name="m_kota_id_tempatlahir")
	private int tempatLahirId;
	
	@Column(name="pegawai_fungsional")
	private String pegawaiFungsional;
	
	@Column(name="pegawai_jabatan_nama")
	private String pegawaiJabatanNama;
	
	@Column(name="pegawai_medis")
	private int pegawaiMedis;
	
	@Column(name="pegawai_unit_id")
	private TextType pegawaiUnitId;
	
	@Column(name="pegawai_pendidikan_id")
	private int pegawaiPendidikanId;
	
	@Column(name="reg_apps_id")
	private int regAppsId;
	
	@Column(name="pegawai_tglmasuk")
	private Date pegawaiTglMasuk;
	
	@Column(name="pegawai_email")
	private String pegawaiEmail;
	
	@Column(name="pegawai_tglkeluar")
	private Date pegawaiTglKeluar;
	
	@Column(name="pegawai_no_hp")
	private String pegawaiNoHp;
	
	@Column(name="pegawai_bank_nama")
	private String pegawaiBankNama;
	
	@Column(name="pegawai_bank_akun")
	private String pegawaiBankAkun;
	
	@Column(name="pegawai_bank_rekening")
	private String pegawaiBankRekening;
	
	@Column(name="pegawai_deleted_date")
	private Timestamp pegawaiDeletedDate;

	public MPegawai() {
		
	}

	public int getPegawaiID() {
		return pegawaiID;
	}

	public void setPegawaiID(int pegawaiID) {
		this.pegawaiID = pegawaiID;
	}

	public String getPegawaiNo() {
		return pegawaiNo;
	}

	public void setPegawaiNo(String pegawaiNo) {
		this.pegawaiNo = pegawaiNo;
	}

	/*public int getJenisPegawaiId() {
		return jenisPegawaiId;
	}

	public void setJenisPegawaiId(int jenisPegawaiId) {
		this.jenisPegawaiId = jenisPegawaiId;
	}*/

	public String getPegawaiNama() {
		return pegawaiNama;
	}

	public void setPegawaiNama(String pegawaiNama) {
		this.pegawaiNama = pegawaiNama;
	}

	public String getPegawaiKelamin() {
		return pegawaiKelamin;
	}

	public void setPegawaiKelamin(String pegawaiKelamin) {
		this.pegawaiKelamin = pegawaiKelamin;
	}

	public Date getPegawaiTglLahir() {
		return pegawaiTglLahir;
	}

	public void setPegawaiTglLahir(Date pegawaiTglLahir) {
		this.pegawaiTglLahir = pegawaiTglLahir;
	}

	public String getPegawaiAlamat() {
		return pegawaiAlamat;
	}

	public void setPegawaiAlamat(String pegawaiAlamat) {
		this.pegawaiAlamat = pegawaiAlamat;
	}

	public int getKotaId() {
		return kotaId;
	}

	public void setKotaId(int kotaId) {
		this.kotaId = kotaId;
	}

	public String getPegawaiAktif() {
		return pegawaiAktif;
	}

	public void setPegawaiAktif(String pegawaiAktif) {
		this.pegawaiAktif = pegawaiAktif;
	}

	public String getPegawaiCreatedBy() {
		return pegawaiCreatedBy;
	}

	public void setPegawaiCreatedBy(String pegawaiCreatedBy) {
		this.pegawaiCreatedBy = pegawaiCreatedBy;
	}

	public Timestamp getPegawaiCreatedDate() {
		return pegawaiCreatedDate;
	}

	public void setPegawaiCreatedDate(Timestamp pegawaiCreatedDate) {
		this.pegawaiCreatedDate = pegawaiCreatedDate;
	}

	public String getPegawaiUpdatedBy() {
		return pegawaiUpdatedBy;
	}

	public void setPegawaiUpdatedBy(String pegawaiUpdatedBy) {
		this.pegawaiUpdatedBy = pegawaiUpdatedBy;
	}

	public Timestamp getPegawaiUpdatedDate() {
		return pegawaiUpdatedDate;
	}

	public void setPegawaiUpdatedDate(Timestamp pegawaiUpdatedDate) {
		this.pegawaiUpdatedDate = pegawaiUpdatedDate;
	}

	public int getPegawaiRevised() {
		return pegawaiRevised;
	}

	public void setPegawaiRevised(int pegawaiRevised) {
		this.pegawaiRevised = pegawaiRevised;
	}

	public int getTempatLahirId() {
		return tempatLahirId;
	}

	public void setTempatLahirId(int tempatLahirId) {
		this.tempatLahirId = tempatLahirId;
	}

	public String getPegawaiFungsional() {
		return pegawaiFungsional;
	}

	public void setPegawaiFungsional(String pegawaiFungsional) {
		this.pegawaiFungsional = pegawaiFungsional;
	}

	public String getPegawaiJabatanNama() {
		return pegawaiJabatanNama;
	}

	public void setPegawaiJabatanNama(String pegawaiJabatanNama) {
		this.pegawaiJabatanNama = pegawaiJabatanNama;
	}

	public int getPegawaiMedis() {
		return pegawaiMedis;
	}

	public void setPegawaiMedis(int pegawaiMedis) {
		this.pegawaiMedis = pegawaiMedis;
	}

	public TextType getPegawaiUnitId() {
		return pegawaiUnitId;
	}

	public void setPegawaiUnitId(TextType pegawaiUnitId) {
		this.pegawaiUnitId = pegawaiUnitId;
	}

	public int getPegawaiPendidikanId() {
		return pegawaiPendidikanId;
	}

	public void setPegawaiPendidikanId(int pegawaiPendidikanId) {
		this.pegawaiPendidikanId = pegawaiPendidikanId;
	}

	public int getRegAppsId() {
		return regAppsId;
	}

	public void setRegAppsId(int regAppsId) {
		this.regAppsId = regAppsId;
	}

	public Date getPegawaiTglMasuk() {
		return pegawaiTglMasuk;
	}

	public void setPegawaiTglMasuk(Date pegawaiTglMasuk) {
		this.pegawaiTglMasuk = pegawaiTglMasuk;
	}

	public String getPegawaiEmail() {
		return pegawaiEmail;
	}

	public void setPegawaiEmail(String pegawaiEmail) {
		this.pegawaiEmail = pegawaiEmail;
	}

	public Date getPegawaiTglKeluar() {
		return pegawaiTglKeluar;
	}

	public void setPegawaiTglKeluar(Date pegawaiTglKeluar) {
		this.pegawaiTglKeluar = pegawaiTglKeluar;
	}

	public String getPegawaiNoHp() {
		return pegawaiNoHp;
	}

	public void setPegawaiNoHp(String pegawaiNoHp) {
		this.pegawaiNoHp = pegawaiNoHp;
	}

	public String getPegawaiBankNama() {
		return pegawaiBankNama;
	}

	public void setPegawaiBankNama(String pegawaiBankNama) {
		this.pegawaiBankNama = pegawaiBankNama;
	}

	public String getPegawaiBankAkun() {
		return pegawaiBankAkun;
	}

	public void setPegawaiBankAkun(String pegawaiBankAkun) {
		this.pegawaiBankAkun = pegawaiBankAkun;
	}

	public String getPegawaiBankRekening() {
		return pegawaiBankRekening;
	}

	public void setPegawaiBankRekening(String pegawaiBankRekening) {
		this.pegawaiBankRekening = pegawaiBankRekening;
	}

	public Timestamp getPegawaiDeletedDate() {
		return pegawaiDeletedDate;
	}

	public void setPegawaiDeletedDate(Timestamp pegawaiDeletedDate) {
		this.pegawaiDeletedDate = pegawaiDeletedDate;
	}

	@Override
	public String toString() {
		return "MPegawai [pegawaiID=" + pegawaiID + ", pegawaiNo=" + pegawaiNo + ", pegawaiNama=" + pegawaiNama
				+ ", pegawaiKelamin=" + pegawaiKelamin + ", pegawaiTglLahir=" + pegawaiTglLahir + ", pegawaiAlamat="
				+ pegawaiAlamat + ", kotaId=" + kotaId + ", pegawaiAktif=" + pegawaiAktif + ", pegawaiCreatedBy="
				+ pegawaiCreatedBy + ", pegawaiCreatedDate=" + pegawaiCreatedDate + ", pegawaiUpdatedBy="
				+ pegawaiUpdatedBy + ", pegawaiUpdatedDate=" + pegawaiUpdatedDate + ", pegawaiRevised=" + pegawaiRevised
				+ ", tempatLahirId=" + tempatLahirId + ", pegawaiFungsional=" + pegawaiFungsional
				+ ", pegawaiJabatanNama=" + pegawaiJabatanNama + ", pegawaiMedis=" + pegawaiMedis + ", pegawaiUnitId="
				+ pegawaiUnitId + ", pegawaiPendidikanId=" + pegawaiPendidikanId + ", regAppsId=" + regAppsId
				+ ", pegawaiTglMasuk=" + pegawaiTglMasuk + ", pegawaiEmail=" + pegawaiEmail + ", pegawaiTglKeluar="
				+ pegawaiTglKeluar + ", pegawaiNoHp=" + pegawaiNoHp + ", pegawaiBankNama=" + pegawaiBankNama
				+ ", pegawaiBankAkun=" + pegawaiBankAkun + ", pegawaiBankRekening=" + pegawaiBankRekening
				+ ", pegawaiDeletedDate=" + pegawaiDeletedDate + "]";
	}

		
}

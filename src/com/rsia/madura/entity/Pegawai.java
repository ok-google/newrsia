package com.rsia.madura.entity;


import javax.persistence.*;

import org.hibernate.type.DateType;
import org.hibernate.type.TextType;

@Entity
@Table(name="m_pegawai")
public class Pegawai {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pegawai_id")
	private int pegawai_id;
	
	@Column(name="pegawai_no")
	private String pegawai_no;
	
	@Column(name="m_jenis_pegawai_id")
	private int m_jenis_pegawai_id;
	
	@Column(name="pegawai_nama")
	private String pegawai_nama;
	
	@Column(name="pegawai_kelamin")
	private char pegawai_kelamin;
	
	@Column(name="pegawai_tgllahir")
	private DateType pegawai_tgllahir;
	
	@Column(name="pegawai_alamat")
	private String pegawai_alamat;
	
	@Column(name="m_kota_id")
	private int m_kota_id;
	
	@Column(name="pegawai_aktif")
	private char pegawai_aktif;
	
	@Column(name="pegawai_created_by")
	private String pegawai_created_by;
	
	@Column(name="pegawai_created_date")
	private DateType pegawai_created_date;
	
	@Column(name="pegawai_updated_by")
	private String pegawai_updated_by;
	
	@Column(name="pegawai_updated_date")
	private DateType pegawai_updated_date;
	
	@Column(name="pegawai_revised")
	private int pegawai_revised;
	
	@Column(name="m_kota_id_tempatlahir")
	private int m_kota_id_tempatlahir;
	
	@Column(name="pegawai_fungsional")
	private String pegawai_fungsional;
	
	@Column(name="pegawai_jabatan_nama")
	private String pegawai_jabatan_nama;
	
	@Column(name="pegawai_medis")
	private int pegawai_medis;
	
	@Column(name="pegawai_unit_id")
	private TextType pegawai_unit_id;
	
	@Column(name="pegawai_pendidikan_id")
	private int pegawai_pendidikan_id;
	
	@Column(name="reg_apps_id")
	private int reg_apps_id;
	
	@Column(name="pegawai_tglmasuk")
	private DateType pegawai_tglmasuk;
	
	@Column(name="pegawai_email")
	private String pegawai_email;
	
	@Column(name="pegawai_tglkeluar")
	private DateType pegawai_tglkeluar;
	
	@Column(name="pegawai_no_hp")
	private String pegawai_no_hp;
	
	@Column(name="pegawai_bank_nama")
	private String pegawai_bank_nama;
	
	@Column(name="pegawai_bank_akun")
	private String pegawai_bank_akun;
	
	@Column(name="pegawai_bank_rekening")
	private String pegawai_bank_rekening;
	
	@Column(name="pegawai_deleted_date")
	private DateType pegawai_deleted_date;

	public int getPegawai_id() {
		return pegawai_id;
	}

	public void setPegawai_id(int pegawai_id) {
		this.pegawai_id = pegawai_id;
	}

	public String getPegawai_no() {
		return pegawai_no;
	}

	public void setPegawai_no(String pegawai_no) {
		this.pegawai_no = pegawai_no;
	}

	public int getM_jenis_pegawai_id() {
		return m_jenis_pegawai_id;
	}

	public void setM_jenis_pegawai_id(int m_jenis_pegawai_id) {
		this.m_jenis_pegawai_id = m_jenis_pegawai_id;
	}

	public String getPegawai_nama() {
		return pegawai_nama;
	}

	public void setPegawai_nama(String pegawai_nama) {
		this.pegawai_nama = pegawai_nama;
	}

	public char getPegawai_kelamin() {
		return pegawai_kelamin;
	}

	public void setPegawai_kelamin(char pegawai_kelamin) {
		this.pegawai_kelamin = pegawai_kelamin;
	}

	public DateType getPegawai_tgllahir() {
		return pegawai_tgllahir;
	}

	public void setPegawai_tgllahir(DateType pegawai_tgllahir) {
		this.pegawai_tgllahir = pegawai_tgllahir;
	}

	public String getPegawai_alamat() {
		return pegawai_alamat;
	}

	public void setPegawai_alamat(String pegawai_alamat) {
		this.pegawai_alamat = pegawai_alamat;
	}

	public int getM_kota_id() {
		return m_kota_id;
	}

	public void setM_kota_id(int m_kota_id) {
		this.m_kota_id = m_kota_id;
	}

	public char getPegawai_aktif() {
		return pegawai_aktif;
	}

	public void setPegawai_aktif(char pegawai_aktif) {
		this.pegawai_aktif = pegawai_aktif;
	}

	public String getPegawai_created_by() {
		return pegawai_created_by;
	}

	public void setPegawai_created_by(String pegawai_created_by) {
		this.pegawai_created_by = pegawai_created_by;
	}

	public DateType getPegawai_created_date() {
		return pegawai_created_date;
	}

	public void setPegawai_created_date(DateType pegawai_created_date) {
		this.pegawai_created_date = pegawai_created_date;
	}

	public String getPegawai_updated_by() {
		return pegawai_updated_by;
	}

	public void setPegawai_updated_by(String pegawai_updated_by) {
		this.pegawai_updated_by = pegawai_updated_by;
	}

	public DateType getPegawai_updated_date() {
		return pegawai_updated_date;
	}

	public void setPegawai_updated_date(DateType pegawai_updated_date) {
		this.pegawai_updated_date = pegawai_updated_date;
	}

	public int getPegawai_revised() {
		return pegawai_revised;
	}

	public void setPegawai_revised(int pegawai_revised) {
		this.pegawai_revised = pegawai_revised;
	}

	public int getM_kota_id_tempatlahir() {
		return m_kota_id_tempatlahir;
	}

	public void setM_kota_id_tempatlahir(int m_kota_id_tempatlahir) {
		this.m_kota_id_tempatlahir = m_kota_id_tempatlahir;
	}

	public String getPegawai_fungsional() {
		return pegawai_fungsional;
	}

	public void setPegawai_fungsional(String pegawai_fungsional) {
		this.pegawai_fungsional = pegawai_fungsional;
	}

	public String getPegawai_jabatan_nama() {
		return pegawai_jabatan_nama;
	}

	public void setPegawai_jabatan_nama(String pegawai_jabatan_nama) {
		this.pegawai_jabatan_nama = pegawai_jabatan_nama;
	}

	public int getPegawai_medis() {
		return pegawai_medis;
	}

	public void setPegawai_medis(int pegawai_medis) {
		this.pegawai_medis = pegawai_medis;
	}

	public TextType getPegawai_unit_id() {
		return pegawai_unit_id;
	}

	public void setPegawai_unit_id(TextType pegawai_unit_id) {
		this.pegawai_unit_id = pegawai_unit_id;
	}

	public int getPegawai_pendidikan_id() {
		return pegawai_pendidikan_id;
	}

	public void setPegawai_pendidikan_id(int pegawai_pendidikan_id) {
		this.pegawai_pendidikan_id = pegawai_pendidikan_id;
	}

	public int getReg_apps_id() {
		return reg_apps_id;
	}

	public void setReg_apps_id(int reg_apps_id) {
		this.reg_apps_id = reg_apps_id;
	}

	public DateType getPegawai_tglmasuk() {
		return pegawai_tglmasuk;
	}

	public void setPegawai_tglmasuk(DateType pegawai_tglmasuk) {
		this.pegawai_tglmasuk = pegawai_tglmasuk;
	}

	public String getPegawai_email() {
		return pegawai_email;
	}

	public void setPegawai_email(String pegawai_email) {
		this.pegawai_email = pegawai_email;
	}

	public DateType getPegawai_tglkeluar() {
		return pegawai_tglkeluar;
	}

	public void setPegawai_tglkeluar(DateType pegawai_tglkeluar) {
		this.pegawai_tglkeluar = pegawai_tglkeluar;
	}

	public String getPegawai_no_hp() {
		return pegawai_no_hp;
	}

	public void setPegawai_no_hp(String pegawai_no_hp) {
		this.pegawai_no_hp = pegawai_no_hp;
	}

	public String getPegawai_bank_nama() {
		return pegawai_bank_nama;
	}

	public void setPegawai_bank_nama(String pegawai_bank_nama) {
		this.pegawai_bank_nama = pegawai_bank_nama;
	}

	public String getPegawai_bank_akun() {
		return pegawai_bank_akun;
	}

	public void setPegawai_bank_akun(String pegawai_bank_akun) {
		this.pegawai_bank_akun = pegawai_bank_akun;
	}

	public String getPegawai_bank_rekening() {
		return pegawai_bank_rekening;
	}

	public void setPegawai_bank_rekening(String pegawai_bank_rekening) {
		this.pegawai_bank_rekening = pegawai_bank_rekening;
	}

	public DateType getPegawai_deleted_date() {
		return pegawai_deleted_date;
	}

	public void setPegawai_deleted_date(DateType pegawai_deleted_date) {
		this.pegawai_deleted_date = pegawai_deleted_date;
	}

	@Override
	public String toString() {
		return "Pegawai [pegawai_id=" + pegawai_id + 
				", pegawai_no=" + pegawai_no + 
				", m_jenis_pegawai_id=" + m_jenis_pegawai_id + 
				", pegawai_nama=" + pegawai_nama + 
				", pegawai_kelamin=" + pegawai_kelamin + 
				", pegawai_tgllahir=" + pegawai_tgllahir + 
				", pegawai_alamat=" + pegawai_alamat + 
				", m_kota_id=" + m_kota_id + 
				", pegawai_aktif=" + pegawai_aktif + 
				", pegawai_created_by=" + pegawai_created_by + 
				", pegawai_created_date=" + pegawai_created_date + 
				", pegawai_updated_by=" + pegawai_updated_by + 
				", pegawai_updated_date=" + pegawai_updated_date + 
				", pegawai_revised=" + pegawai_revised + 
				", m_kota_id_tempatlahir=" + m_kota_id_tempatlahir + 
				", pegawai_fungsional=" + pegawai_fungsional + 
				", pegawai_jabatan_nama=" + pegawai_jabatan_nama + 
				", pegawai_medis=" + pegawai_medis + 
				", pegawai_unit_id=" + pegawai_unit_id + 
				", pegawai_pendidikan_id=" + pegawai_pendidikan_id + 
				", reg_apps_id=" + reg_apps_id + 
				", pegawai_tglmasuk=" + pegawai_tglmasuk + 
				", pegawai_email=" + pegawai_email + 
				", pegawai_tglkeluar=" + pegawai_tglkeluar + 
				", pegawai_no_hp=" + pegawai_no_hp + 
				", pegawai_bank_nama=" + pegawai_bank_nama + 
				", pegawai_bank_akun=" + pegawai_bank_akun + 
				", pegawai_bank_rekening=" + pegawai_bank_rekening + 
				", pegawai_deleted_date=" + pegawai_deleted_date + 
				", getPegawai_id()=" + getPegawai_id() + ", getPegawai_no()=" + getPegawai_no() + 
				", getM_jenis_pegawai_id()=" + getM_jenis_pegawai_id() + 
				", getPegawai_nama()=" + getPegawai_nama() + 
				", getPegawai_kelamin()=" + getPegawai_kelamin() + 
				", getPegawai_tgllahir()=" + getPegawai_tgllahir() + 
				", getPegawai_alamat()=" + getPegawai_alamat() + 
				", getM_kota_id()=" + getM_kota_id() + 
				", getPegawai_aktif()=" + getPegawai_aktif() + 
				", getPegawai_created_by()=" + getPegawai_created_by() + 
				", getPegawai_created_date()=" + getPegawai_created_date() + 
				", getPegawai_updated_by()=" + getPegawai_updated_by() + 
				", getPegawai_updated_date()=" + getPegawai_updated_date() + 
				", getPegawai_revised()=" + getPegawai_revised() + 
				", getM_kota_id_tempatlahir()=" + getM_kota_id_tempatlahir() + 
				", getPegawai_fungsional()=" + getPegawai_fungsional() + 
				", getPegawai_jabatan_nama()=" + getPegawai_jabatan_nama() + 
				", getPegawai_medis()=" + getPegawai_medis() + 
				", getPegawai_unit_id()=" + getPegawai_unit_id() + 
				", getPegawai_pendidikan_id()=" + getPegawai_pendidikan_id() + 
				", getReg_apps_id()=" + getReg_apps_id() + 
				", getPegawai_tglmasuk()=" + getPegawai_tglmasuk() + 
				", getPegawai_email()=" + getPegawai_email() + 
				", getPegawai_tglkeluar()=" + getPegawai_tglkeluar() + 
				", getPegawai_no_hp()=" + getPegawai_no_hp() + 
				", getPegawai_bank_nama()=" + getPegawai_bank_nama() + 
				", getPegawai_bank_akun()=" + getPegawai_bank_akun() + 
				", getPegawai_bank_rekening()=" + getPegawai_bank_rekening() + 
				", getPegawai_deleted_date()=" + getPegawai_deleted_date() + 
				", getClass()=" + getClass() + 
				", hashCode()=" + hashCode() + 
				", toString()=" + super.toString() + 
				"]";
	}
}

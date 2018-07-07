package com.rsia.madura.entity;

import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyCollection;

@Entity
@Table(name="t_pendaftaran")
public class MPendaftaran {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pendaftaran_id")
	private int pendaftaranID;
	
	@Column(name="pendaftaran_no")
	private String pendaftaranNo;
	
	@Column(name="pendaftaran_nourut")
	private Integer pendaftaranNourut;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pendaftaran_mrs")
	private Date pendaftaranMrs;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pendaftaran_krs")
	private Date pendaftaranKrs;
	
	@Column(name="pendaftaran_aktif")
	private String pendaftaranAktif;
	
	@Column(name="pendaftaran_created_by")
	private String pendaftaranCreatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pendaftaran_created_date")
	private Date pendaftaranCreatedDate;
	
	@Column(name="pendaftaran_updated_by")
	private String pendaftaranUpdatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pendaftaran_updated_date")
	private Date pendaftaranUpdatedDate;
	
	@Column(name="pendaftaran_revised")
	private Integer pendaftaranRevised;
	
	@Column(name="pendaftaran_keterangan")
	private String pendaftaranKeterangan;
	
	@Column(name="pendaftaran_tarif")
	private Integer pendaftaranTarif;
	
	@Column(name="pendaftaran_status_kunjungan")
	private String pendaftaranStatusKunjungan;
	
	@Column(name="pendaftaran_jenis")
	private String pendaftaranJenis;
	
	@Column(name="pendaftaran_status_konsul")
	private String pendaftaranStatusKonsul;

	@Column(name="pendaftaran_poli")
	private String pendaftaranPoli;

	@Column(name="paket_id")
	private Integer paketID;

	@Column(name="pendaftaran_status")
	private String pendaftaranStatus;

	@Column(name="pendaftaran_cara_masuk")
	private String pendaftaranCaraMasuk;

	@Column(name="pendaftaran_selesai")
	private String pendaftaranSelesai;

	@Column(name="pendaftaran_deleted_by")
	private String pendaftaranDeletedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pendaftaran_deleted_date")
	private Date pendaftaranDeletedDate;

	// Tab fisik 
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MRiwayatPeriksa> riwayatperiksa;

	// Tab pemeriksaan -> tPeriksaPasien
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPeriksaPasien> periksapasien;

	// // Tab diagnosa -> tDiagnosaPasien ???
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MDiagnosaPasien> diagnosapasien;

	// // Tab prosedur -> ???
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MDiagnosa9> diagnosa9;
	
	// // Tab tindakan -> tTindakanPasien
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MTindakanPasien> tindakanpasien;

	// Tab terap -> 
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MTerapiPasien> terapi;
	
	// Tab resep -> tResep 
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MResep> resep;

	// Tab file -> penunjang
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MPenunjangTrans> penunjangtrans;

	// tab soap
	@OneToMany(mappedBy = "pendaftaran", cascade = CascadeType.ALL, orphanRemoval=true)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MSoap> soap;

	@ManyToOne
	private MPasien pasien;

	@ManyToOne
	private MKondisi kondisiMasuk;

	@ManyToOne
	private MKondisi kondisiKeluar;

	@ManyToOne
	private MRujukan rujukanMasuk;

	@ManyToOne
	private MRujukan rujukanKeluar;

	@ManyToOne
	private MPegawai pegawai;

	@ManyToOne
	private MTindakan tindakan;

	@ManyToOne
	private MKamar kamar;

	@ManyToOne
	private MKelas kelas;

	@ManyToOne
	private MRuang ruang;

	public MPendaftaran() {

	}

	public int getPendaftaranID() {
		return pendaftaranID;
	}

	public void setPendaftaranID(int pendaftaranID) {
		this.pendaftaranID = pendaftaranID;
	}

	public String getPendaftaranNo() {
		return pendaftaranNo;
	}

	public void setPendaftaranNo(String pendaftaranNo) {
		this.pendaftaranNo = pendaftaranNo;
	}

	public Integer getPendaftaranNourut() {
		return pendaftaranNourut;
	}

	public void setPendaftaranNourut(Integer pendaftaranNourut) {
		this.pendaftaranNourut = pendaftaranNourut;
	}

	public Date getPendaftaranMrs() {
		return pendaftaranMrs;
	}

	public void setPendaftaranMrs(Date pendaftaranMrs) {
		this.pendaftaranMrs = pendaftaranMrs;
	}

	public Date getPendaftaranKrs() {
		return pendaftaranKrs;
	}

	public void setPendaftaranKrs(Date pendaftaranKrs) {
		this.pendaftaranKrs = pendaftaranKrs;
	}

	public String getPendaftaranAktif() {
		return pendaftaranAktif;
	}

	public void setPendaftaranAktif(String pendaftaranAktif) {
		this.pendaftaranAktif = pendaftaranAktif;
	}

	public String getPendaftaranCreatedBy() {
		return pendaftaranCreatedBy;
	}

	public void setPendaftaranCreatedBy(String pendaftaranCreatedBy) {
		this.pendaftaranCreatedBy = pendaftaranCreatedBy;
	}

	public Date getPendaftaranCreatedDate() {
		return pendaftaranCreatedDate;
	}

	public void setPendaftaranCreatedDate(Date pendaftaranCreatedDate) {
		this.pendaftaranCreatedDate = pendaftaranCreatedDate;
	}

	public String getPendaftaranUpdatedBy() {
		return pendaftaranUpdatedBy;
	}

	public void setPendaftaranUpdatedBy(String pendaftaranUpdatedBy) {
		this.pendaftaranUpdatedBy = pendaftaranUpdatedBy;
	}

	public Date getPendaftaranUpdatedDate() {
		return pendaftaranUpdatedDate;
	}

	public void setPendaftaranUpdatedDate(Date pendaftaranUpdatedDate) {
		this.pendaftaranUpdatedDate = pendaftaranUpdatedDate;
	}

	public Integer getPendaftaranRevised() {
		return pendaftaranRevised;
	}

	public void setPendaftaranRevised(Integer pendaftaranRevised) {
		this.pendaftaranRevised = pendaftaranRevised;
	}

	public String getPendaftaranKeterangan() {
		return pendaftaranKeterangan;
	}

	public void setPendaftaranKeterangan(String pendaftaranKeterangan) {
		this.pendaftaranKeterangan = pendaftaranKeterangan;
	}

	public Integer getPendaftaranTarif() {
		return pendaftaranTarif;
	}

	public void setPendaftaranTarif(Integer pendaftaranTarif) {
		this.pendaftaranTarif = pendaftaranTarif;
	}

	public String getPendaftaranStatusKunjungan() {
		return pendaftaranStatusKunjungan;
	}

	public void setPendaftaranStatusKunjungan(String pendaftaranStatusKunjungan) {
		this.pendaftaranStatusKunjungan = pendaftaranStatusKunjungan;
	}

	public String getPendaftaranJenis() {
		return pendaftaranJenis;
	}

	public void setPendaftaranJenis(String pendaftaranJenis) {
		this.pendaftaranJenis = pendaftaranJenis;
	}

	public String getPendaftaranStatusKonsul() {
		return pendaftaranStatusKonsul;
	}

	public void setPendaftaranStatusKonsul(String pendaftaranStatusKonsul) {
		this.pendaftaranStatusKonsul = pendaftaranStatusKonsul;
	}

	public String getPendaftaranPoli() {
		return pendaftaranPoli;
	}

	public void setPendaftaranPoli(String pendaftaranPoli) {
		this.pendaftaranPoli = pendaftaranPoli;
	}

	public Integer getPaketID() {
		return paketID;
	}

	public void setPaketID(Integer paketID) {
		this.paketID = paketID;
	}

	public String getPendaftaranStatus() {
		return pendaftaranStatus;
	}

	public void setPendaftaranStatus(String pendaftaranStatus) {
		this.pendaftaranStatus = pendaftaranStatus;
	}

	public String getPendaftaranCaraMasuk() {
		return pendaftaranCaraMasuk;
	}

	public void setPendaftaranCaraMasuk(String pendaftaranCaraMasuk) {
		this.pendaftaranCaraMasuk = pendaftaranCaraMasuk;
	}

	public String getPendaftaranSelesai() {
		return pendaftaranSelesai;
	}

	public void setPendaftaranSelesai(String pendaftaranSelesai) {
		this.pendaftaranSelesai = pendaftaranSelesai;
	}

	public String getPendaftaranDeletedBy() {
		return pendaftaranDeletedBy;
	}

	public void setPendaftaranDeletedBy(String pendaftaranDeletedBy) {
		this.pendaftaranDeletedBy = pendaftaranDeletedBy;
	}

	public Date getPendaftaranDeletedDate() {
		return pendaftaranDeletedDate;
	}

	public void setPendaftaranDeletedDate(Date pendaftaranDeletedDate) {
		this.pendaftaranDeletedDate = pendaftaranDeletedDate;
	}

	// Tab fisik -> tRiwayatPeriksa
	@JsonIgnore
	public List<MRiwayatPeriksa> getRiwayatperiksa() {
		return riwayatperiksa;
	}

	public void setRiwayatperiksa(List<MRiwayatPeriksa> riwayatperiksa) {
		this.riwayatperiksa = riwayatperiksa;
	}
	// Tab pemeriksaan -> tPeriksaPasien
	@JsonIgnore
	public List<MPeriksaPasien> getPeriksapasien() {
		return periksapasien;
	}

	public void setPeriksapasien(List<MPeriksaPasien> periksapasien) {
		this.periksapasien = periksapasien;
	}

	// Tab diagnosa -> tDiagnosaPasien ???
	@JsonIgnore
	public List<MDiagnosaPasien> getDiagnosapasien() {
		return diagnosapasien;
	}

	public void setDiagnosapasien(List<MDiagnosaPasien> diagnosapasien) {
		this.diagnosapasien = diagnosapasien;
	}

	@JsonIgnore
	public List<MDiagnosa9> getDiagnosa9() {
		return diagnosa9;
	}

	public void setDiagnosa9(List<MDiagnosa9> diagnosa9) {
		this.diagnosa9 = diagnosa9;
	}
	
	// // Tab tindakan -> tTindakanPasien
	@JsonIgnore
	public List<MTindakanPasien> getTindakanpasien() {
		return tindakanpasien;
	}

	public void setTindakanpasien(List<MTindakanPasien> tindakanpasien) {
		this.tindakanpasien = tindakanpasien;
	}

	// Tab bph -> tTerapi ???
	@JsonIgnore
	public List<MTerapiPasien> getTerapi() {
		return terapi;
	}

	public void setTerapi(List<MTerapiPasien> terapi) {
		this.terapi = terapi;
	}
	
	// Tab resep -> tResep 
	@JsonIgnore
	public List<MResep> getResep() {
		return resep;
	}

	public void setResep(List<MResep> resep) {
		this.resep = resep;
	}

	// Tab file -> penunjang
	@JsonIgnore
	public List<MPenunjangTrans> getPenunjangtrans() {
		return penunjangtrans;
	}

	public void setPenunjangtrans(List<MPenunjangTrans> penunjangtrans) {
		this.penunjangtrans = penunjangtrans;
	}

	// tab soap
	@JsonIgnore
	public List<MSoap> getSoap() {
		return soap;
	}

	public void setSoap(List<MSoap> soap) {
		this.soap = soap;
	}

	public MPasien getPasien() {
		return pasien;
	}

	public void setPasien(MPasien pasien) {
		this.pasien = pasien;
	}

	public MKondisi getKondisiMasuk() {
		return kondisiMasuk;
	}

	public void setKondisiMasuk(MKondisi kondisiMasuk) {
		this.kondisiMasuk = kondisiMasuk;
	}

	public MKondisi getKondisiKeluar() {
		return kondisiKeluar;
	}

	public void setKondisiKeluar(MKondisi kondisiKeluar) {
		this.kondisiKeluar = kondisiKeluar;
	}

	public MTindakan getTindakan() {
		return tindakan;
	}

	public void setTindakan(MTindakan tindakan) {
		this.tindakan = tindakan;
	}

	public MRujukan getRujukanMasuk() {
		return rujukanMasuk;
	}

	public void setRujukanMasuk(MRujukan rujukanMasuk) {
		this.rujukanMasuk = rujukanMasuk;
	}

	public MRujukan getRujukanKeluar() {
		return rujukanKeluar;
	}

	public void setRujukanKeluar(MRujukan rujukanKeluar) {
		this.rujukanKeluar = rujukanKeluar;
	}

	public MPegawai getPegawai() {
		return pegawai;
	}

	public void setPegawai(MPegawai pegawai) {
		this.pegawai = pegawai;
	}

	public MKamar getKamar() {
		return kamar;
	}

	public void setKamar(MKamar kamar) {
		this.kamar = kamar;
	}

	public MKelas getKelas() {
		return kelas;
	}

	public void setKelas(MKelas kelas) {
		this.kelas = kelas;
	}

	public MRuang getRuang() {
		return ruang;
	}

	public void setRuang(MRuang ruang) {
		this.ruang = ruang;
	}

	@Override
	public String toString() {
		return "MPendaftaran [pendaftaranID" + pendaftaranID +", pendaftaranNo" + pendaftaranNo +", pendaftaranNourut" 
				+ pendaftaranNourut +", pendaftaranMrs" + pendaftaranMrs +", pendaftaranKrs" 
				+ pendaftaranKrs +", pendaftaranAktif" + pendaftaranAktif +", pendaftaranCreatedBy" 
				+ pendaftaranCreatedBy +", pendaftaranCreatedDate" + pendaftaranCreatedDate +", pendaftaranUpdatedBy" 
				+ pendaftaranUpdatedBy +", pendaftaranUpdatedDate" + pendaftaranUpdatedDate +", pendaftaranRevised" 
				+ pendaftaranRevised +", pendaftaranKeterangan" + pendaftaranKeterangan +", pendaftaranTarif" 
				+ pendaftaranTarif +", pendaftaranStatusKunjungan" + pendaftaranStatusKunjungan +", pendaftaranJenis" 
				+ pendaftaranJenis +", pendaftaranStatusKonsul" + pendaftaranStatusKonsul +", pendaftaranPoli" 
				+ kelas +", ruang" + ruang +"]";
	}
}


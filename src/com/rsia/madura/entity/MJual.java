package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_jual")
public class MJual {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="jual_id")
	private int jualId;
	
	@Column(name="jual_no")
	private String jualNo;
	
	@Column(name="jual_tanggal")
	private Date jual_tanggal;
	
	@Column(name="jual_pendaftaran_id")
	private int jualPendaftaranId;
	
	@Column(name="jual_pendaftaran_no")
	private String jualPendaftaranNo;
	
	@Column(name="jual_pasien_id")
	private int jualPasienId;
	
	@Column(name="jual_pasien_norm")
	private String jualPasienNorm;
	
	@Column(name="jual_pasien_unitasal")
	private int jualPasienUnitasal;
	
	@Column(name="jual_pegawai_id")
	private int jualPegawaiId;
	
	@Column(name="jual_dokter_id")
	private int jualDokterId;
	
	@Column(name="jual_diskon")
	private int jualDiskon;
	
	@Column(name="jual_total")
	private int jualTotal;
	
	@Column(name="jual_bayar_id")
	private int jualBayarId;
	
	@Column(name="jual_bayarjumlah")
	private int jualBayarJumlah;
	
	@Column(name="jual_bayarstatus")
	private int jualBayarStatus;
	
	@Column(name="jual_keterangan")
	private String jualKeterangan;
	
	@Column(name="jual_pasien_nama")
	private String jualPasienNama;
	
	@Column(name="jual_pasien_alamat")
	private String jualPasienAlamat;
	
	@Column(name="jual_jenispasien_id")
	private int jualJenisPasienId;
	
	@Column(name="jual_jenispasien_nama")
	private String jualJenisPasienNama;
	
	@Column(name="jual_dokter_nama")
	private String jualDokternNama;
	
	@Column(name="jual_pegawai_nama")
	private String jualPegawaiNama;
	
	@Column(name="jual_jenisharga_id")
	private int jualJenisHargaId;
	
	@Column(name="jual_ruang_id")
	private int jualRuangId;
	
	@Column(name="jual_kamarpasien_id")
	private int jualKamarPasienId;
	
	@Column(name="jual_totalbulat")
	private int jualTotalBulat;
	
	@Column(name="jual_depo_id")
	private int jualDepoId;
	
	@Column(name="jual_bayar_id_awal")
	private int jualBayarIdAwal;
	
	@Column(name="jual_bayar_id_awal_nama")
	private String jualBayarAwalNama;
	
	@Column(name="jual_pendaftaran_jenis")
	private String jualPendaftaranJenis;
	
	@Column(name="jual_batal_alsan")
	private String jualBatalAlasan;
	
	@Column(name="jual_detbackup")
	private String jualDetBackup;
	
	@Column(name="jual_kelas_id")
	private int jualKelasId;
	
	@Column(name="jual_aktif")
	private char jualAktif;
	
	@Column(name="jual_status")
	private char jualStatus;
	
	@Column(name="jual_created_by")
	private String jualCreatedBy;
	
	@Column(name="jual_created_date")
	private Timestamp juealCreatedDate;
	
	@Column(name="jual_updated_by")
	private String jualUpdatedBy;
	
	@Column(name="jual_updated_date")
	private Timestamp juealUpdatedDate;
	
	@Column(name="jual_deleted_date")
	private Timestamp juealDeletedDate;
	
	@Column(name="jual_revised")
	private int jualRevised;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "jual", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<MJualDetail> detail;

	public int getJualId() {
		return jualId;
	}

	public void setJualId(int jualId) {
		this.jualId = jualId;
	}

	public String getJualNo() {
		return jualNo;
	}

	public void setJualNo(String jualNo) {
		this.jualNo = jualNo;
	}

	public Date getJual_tanggal() {
		return jual_tanggal;
	}

	public void setJual_tanggal(Date jual_tanggal) {
		this.jual_tanggal = jual_tanggal;
	}

	public int getJualPendaftaranId() {
		return jualPendaftaranId;
	}

	public void setJualPendaftaranId(int jualPendaftaranId) {
		this.jualPendaftaranId = jualPendaftaranId;
	}

	public String getJualPendaftaranNo() {
		return jualPendaftaranNo;
	}

	public void setJualPendaftaranNo(String jualPendaftaranNo) {
		this.jualPendaftaranNo = jualPendaftaranNo;
	}

	public int getJualPasienId() {
		return jualPasienId;
	}

	public void setJualPasienId(int jualPasienId) {
		this.jualPasienId = jualPasienId;
	}

	public String getJualPasienNorm() {
		return jualPasienNorm;
	}

	public void setJualPasienNorm(String jualPasienNorm) {
		this.jualPasienNorm = jualPasienNorm;
	}

	public int getJualPasienUnitasal() {
		return jualPasienUnitasal;
	}

	public void setJualPasienUnitasal(int jualPasienUnitasal) {
		this.jualPasienUnitasal = jualPasienUnitasal;
	}

	public int getJualPegawaiId() {
		return jualPegawaiId;
	}

	public void setJualPegawaiId(int jualPegawaiId) {
		this.jualPegawaiId = jualPegawaiId;
	}

	public int getJualDokterId() {
		return jualDokterId;
	}

	public void setJualDokterId(int jualDokterId) {
		this.jualDokterId = jualDokterId;
	}

	public int getJualDiskon() {
		return jualDiskon;
	}

	public void setJualDiskon(int jualDiskon) {
		this.jualDiskon = jualDiskon;
	}

	public int getJualTotal() {
		return jualTotal;
	}

	public void setJualTotal(int jualTotal) {
		this.jualTotal = jualTotal;
	}

	public int getJualBayarId() {
		return jualBayarId;
	}

	public void setJualBayarId(int jualBayarId) {
		this.jualBayarId = jualBayarId;
	}

	public int getJualBayarJumlah() {
		return jualBayarJumlah;
	}

	public void setJualBayarJumlah(int jualBayarJumlah) {
		this.jualBayarJumlah = jualBayarJumlah;
	}

	public int getJualBayarStatus() {
		return jualBayarStatus;
	}

	public void setJualBayarStatus(int jualBayarStatus) {
		this.jualBayarStatus = jualBayarStatus;
	}

	public String getJualKeterangan() {
		return jualKeterangan;
	}

	public void setJualKeterangan(String jualKeterangan) {
		this.jualKeterangan = jualKeterangan;
	}

	public String getJualPasienNama() {
		return jualPasienNama;
	}

	public void setJualPasienNama(String jualPasienNama) {
		this.jualPasienNama = jualPasienNama;
	}

	public String getJualPasienAlamat() {
		return jualPasienAlamat;
	}

	public void setJualPasienAlamat(String jualPasienAlamat) {
		this.jualPasienAlamat = jualPasienAlamat;
	}

	public int getJualJenisPasienId() {
		return jualJenisPasienId;
	}

	public void setJualJenisPasienId(int jualJenisPasienId) {
		this.jualJenisPasienId = jualJenisPasienId;
	}

	public String getJualJenisPasienNama() {
		return jualJenisPasienNama;
	}

	public void setJualJenisPasienNama(String jualJenisPasienNama) {
		this.jualJenisPasienNama = jualJenisPasienNama;
	}

	public String getJualDokternNama() {
		return jualDokternNama;
	}

	public void setJualDokternNama(String jualDokternNama) {
		this.jualDokternNama = jualDokternNama;
	}

	public String getJualPegawaiNama() {
		return jualPegawaiNama;
	}

	public void setJualPegawaiNama(String jualPegawaiNama) {
		this.jualPegawaiNama = jualPegawaiNama;
	}

	public int getJualJenisHargaId() {
		return jualJenisHargaId;
	}

	public void setJualJenisHargaId(int jualJenisHargaId) {
		this.jualJenisHargaId = jualJenisHargaId;
	}

	public int getJualRuangId() {
		return jualRuangId;
	}

	public void setJualRuangId(int jualRuangId) {
		this.jualRuangId = jualRuangId;
	}

	public int getJualKamarPasienId() {
		return jualKamarPasienId;
	}

	public void setJualKamarPasienId(int jualKamarPasienId) {
		this.jualKamarPasienId = jualKamarPasienId;
	}

	public int getJualTotalBulat() {
		return jualTotalBulat;
	}

	public void setJualTotalBulat(int jualTotalBulat) {
		this.jualTotalBulat = jualTotalBulat;
	}

	public int getJualDepoId() {
		return jualDepoId;
	}

	public void setJualDepoId(int jualDepoId) {
		this.jualDepoId = jualDepoId;
	}

	public int getJualBayarIdAwal() {
		return jualBayarIdAwal;
	}

	public void setJualBayarIdAwal(int jualBayarIdAwal) {
		this.jualBayarIdAwal = jualBayarIdAwal;
	}

	public String getJualBayarAwalNama() {
		return jualBayarAwalNama;
	}

	public void setJualBayarAwalNama(String jualBayarAwalNama) {
		this.jualBayarAwalNama = jualBayarAwalNama;
	}

	public String getJualPendaftaranJenis() {
		return jualPendaftaranJenis;
	}

	public void setJualPendaftaranJenis(String jualPendaftaranJenis) {
		this.jualPendaftaranJenis = jualPendaftaranJenis;
	}

	public String getJualBatalAlasan() {
		return jualBatalAlasan;
	}

	public void setJualBatalAlasan(String jualBatalAlasan) {
		this.jualBatalAlasan = jualBatalAlasan;
	}

	public String getJualDetBackup() {
		return jualDetBackup;
	}

	public void setJualDetBackup(String jualDetBackup) {
		this.jualDetBackup = jualDetBackup;
	}

	public int getJualKelasId() {
		return jualKelasId;
	}

	public void setJualKelasId(int jualKelasId) {
		this.jualKelasId = jualKelasId;
	}

	public char getJualAktif() {
		return jualAktif;
	}

	public void setJualAktif(char jualAktif) {
		this.jualAktif = jualAktif;
	}

	public char getJualStatus() {
		return jualStatus;
	}

	public void setJualStatus(char jualStatus) {
		this.jualStatus = jualStatus;
	}

	public String getJualCreatedBy() {
		return jualCreatedBy;
	}

	public void setJualCreatedBy(String jualCreatedBy) {
		this.jualCreatedBy = jualCreatedBy;
	}

	public Timestamp getJuealCreatedDate() {
		return juealCreatedDate;
	}

	public void setJuealCreatedDate(Timestamp juealCreatedDate) {
		this.juealCreatedDate = juealCreatedDate;
	}

	public String getJualUpdatedBy() {
		return jualUpdatedBy;
	}

	public void setJualUpdatedBy(String jualUpdatedBy) {
		this.jualUpdatedBy = jualUpdatedBy;
	}

	public Timestamp getJuealUpdatedDate() {
		return juealUpdatedDate;
	}

	public void setJuealUpdatedDate(Timestamp juealUpdatedDate) {
		this.juealUpdatedDate = juealUpdatedDate;
	}

	public Timestamp getJuealDeletedDate() {
		return juealDeletedDate;
	}

	public void setJuealDeletedDate(Timestamp juealDeletedDate) {
		this.juealDeletedDate = juealDeletedDate;
	}

	public int getJualRevised() {
		return jualRevised;
	}

	public void setJualRevised(int jualRevised) {
		this.jualRevised = jualRevised;
	}

	public List<MJualDetail> getDetail() {
		return detail;
	}

	public void setDetail(List<MJualDetail> detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "MJual [jualId=" + jualId + ", jualNo=" + jualNo + ", jual_tanggal=" + jual_tanggal
				+ ", jualPendaftaranId=" + jualPendaftaranId + ", jualPendaftaranNo=" + jualPendaftaranNo
				+ ", jualPasienId=" + jualPasienId + ", jualPasienNorm=" + jualPasienNorm + ", jualPasienUnitasal="
				+ jualPasienUnitasal + ", jualPegawaiId=" + jualPegawaiId + ", jualDokterId=" + jualDokterId
				+ ", jualDiskon=" + jualDiskon + ", jualTotal=" + jualTotal + ", jualBayarId=" + jualBayarId
				+ ", jualBayarJumlah=" + jualBayarJumlah + ", jualBayarStatus=" + jualBayarStatus + ", jualKeterangan="
				+ jualKeterangan + ", jualPasienNama=" + jualPasienNama + ", jualPasienAlamat=" + jualPasienAlamat
				+ ", jualJenisPasienId=" + jualJenisPasienId + ", jualJenisPasienNama=" + jualJenisPasienNama
				+ ", jualDokternNama=" + jualDokternNama + ", jualPegawaiNama=" + jualPegawaiNama
				+ ", jualJenisHargaId=" + jualJenisHargaId + ", jualRuangId=" + jualRuangId + ", jualKamarPasienId="
				+ jualKamarPasienId + ", jualTotalBulat=" + jualTotalBulat + ", jualDepoId=" + jualDepoId
				+ ", jualBayarIdAwal=" + jualBayarIdAwal + ", jualBayarAwalNama=" + jualBayarAwalNama
				+ ", jualPendaftaranJenis=" + jualPendaftaranJenis + ", jualBatalAlasan=" + jualBatalAlasan
				+ ", jualDetBackup=" + jualDetBackup + ", jualKelasId=" + jualKelasId + ", jualAktif=" + jualAktif
				+ ", jualStatus=" + jualStatus + ", jualCreatedBy=" + jualCreatedBy + ", juealCreatedDate="
				+ juealCreatedDate + ", jualUpdatedBy=" + jualUpdatedBy + ", juealUpdatedDate=" + juealUpdatedDate
				+ ", juealDeletedDate=" + juealDeletedDate + ", jualRevised=" + jualRevised + ", detail=" + detail
				+ "]";
	}
	
	
	
	
}

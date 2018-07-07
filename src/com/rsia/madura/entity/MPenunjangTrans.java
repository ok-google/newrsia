/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-22 16:01:27
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-30 12:42:09
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
import javax.persistence.Transient;

@Entity
@Table(name="t_penunjang")
public class MPenunjangTrans {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangtrans_id")
	private Integer penunjangtransID;

    @Transient
    private Integer remove;

	@Column(name="penunjangtrans_hasil")
	private Integer penunjangtransHasil;

	@Column(name="penunjangtrans_jumlah")
	private Integer penunjangtransJumlah;

	@Column(name="penunjangtrans_harga")
	private Integer penunjangtransHarga;
	
	@ManyToOne
	private MPenunjang penunjang;	

	@ManyToOne
	private MPendaftaran pendaftaran;

	public Integer getPenunjangtransID() {
		return penunjangtransID;
	}

	public void setPenunjangtransID(Integer penunjangtransID) {
		this.penunjangtransID = penunjangtransID;
	}

	public Integer getRemove(){
		return remove;
	}

	public void setRemove(Integer remove) {
		this.remove = remove;
	}

	public Integer getPenunjangtransHasil() {
		return penunjangtransHasil;
	}

	public void setPenunjangtransHasil(Integer penunjangtransHasil) {
		this.penunjangtransHasil = penunjangtransHasil;
	}

	public Integer getPenunjangtransJumlah() {
		return penunjangtransJumlah;
	}

	public void setPenunjangtransJumlah(Integer penunjangtransJumlah) {
		this.penunjangtransJumlah = penunjangtransJumlah;
	}

	public Integer getPenunjangtransHarga() {
		return penunjangtransHarga;
	}

	public void setPenunjangtransHarga(Integer penunjangtransHarga) {
		this.penunjangtransHarga = penunjangtransHarga;
	}

	public MPenunjang getPenunjang() {
		return penunjang;
	}

	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

	public MPendaftaran getPendaftaran() {
		return pendaftaran;
	}

	public void setPendaftaran(MPendaftaran pendaftaran) {
		this.pendaftaran = pendaftaran;
	}
}
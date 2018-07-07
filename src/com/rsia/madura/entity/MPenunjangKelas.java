/*
* @Author: Pradesga Indonesia
* @Date:   2018-05-18 13:31:14
* @Last Modified by:   Pradesga Indonesia
* @Last Modified time: 2018-05-23 14:39:34
*/
package com.rsia.madura.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;

@Entity
@Table(name="m_penunjang_kelas")
public class MPenunjangKelas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="penunjangkelas_id")
	private int penunjangkelasID;

	@ManyToOne
	private MPenunjang penunjang;

	@ManyToOne
	private MKelas kelases;

	@Column(name="penunjangkelas_harga")
	private Integer penunjangkelasHarga;

	public int getPenunjangkelasID() {
		return penunjangkelasID;
	}

	public void setPenunjangkelasID(int penunjangkelasID) {
		this.penunjangkelasID = penunjangkelasID;
	}
	
	@JsonBackReference
	public MPenunjang getPenunjang() {
		return penunjang;
	}

	public void setPenunjang(MPenunjang penunjang) {
		this.penunjang = penunjang;
	}

	public MKelas getKelases() {
		return kelases;
	}

	public void setKelases(MKelas kelases) {
		this.kelases = kelases;
	}

	public Integer getPenunjangkelasHarga() {
		return penunjangkelasHarga;
	}

	public void setPenunjangkelasHarga(Integer penunjangkelasHarga) {
		this.penunjangkelasHarga = penunjangkelasHarga;
	}

}
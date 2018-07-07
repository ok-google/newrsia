package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_orderdet")
public class MOrderDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderdet_id")
	private int orderDetailId;
	
	@Column(name="orderdet_order_id")
	private int orderDetailOrderId;
	
	@Column(name="orderdet_barang_id")
	private int orderDetailBarangId;
	
	@Column(name="orderdet_barang_nama")
	private String orderDetailBarangNama;
	
	@Column(name="orderdet_satuan_id")
	private int orderDetailSatuanId;
	
	@Column(name="orderdet_satuan_nama")
	private String orderDetailSatuanNama;
	
	@Column(name="orderdet_jumlah")
	private int orderDetailJumlah;
	
	@Column(name="orderdet_harga")
	private double orderDetailHarga;
	
	@Column(name="orderdet_diskon")
	private int orderDetailDiskon;
	
	@Column(name="orderdet_subtotal")
	private double orderDetailSubTotal;
	
	@Column(name="orderdet_ppn")
	private String orderDetailPpn;
	
	@Column(name="orderdet_ppn_nilai")
	private int orderDetailPpnNiali;
	
	@Column(name="orderdet_created_by")
	private String orderDetailCreatedBy;
	
	@Column(name="orderdet_created_date")
	private Timestamp orderDetailCreatedDate;
	
	@Column(name="orderdet_updated_by")
	private String orderDetailUpdatedBy;
	
	@Column(name="orderdet_updated_date")
	private Timestamp orderDetailUpdatedDate;
	
	@Column(name="orderdet_deleted_date")
	private Timestamp orderDetailDeletedDate;
	
	@Column(name="orderdet_revised")
	private int orderDetailRevised;
	
	@ManyToOne
	private MOrder order;

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderDetailOrderId() {
		return orderDetailOrderId;
	}

	public void setOrderDetailOrderId(int orderDetailOrderId) {
		this.orderDetailOrderId = orderDetailOrderId;
	}

	public int getOrderDetailBarangId() {
		return orderDetailBarangId;
	}

	public void setOrderDetailBarangId(int orderDetailBarangId) {
		this.orderDetailBarangId = orderDetailBarangId;
	}

	public String getOrderDetailBarangNama() {
		return orderDetailBarangNama;
	}

	public void setOrderDetailBarangNama(String orderDetailBarangNama) {
		this.orderDetailBarangNama = orderDetailBarangNama;
	}

	public int getOrderDetailSatuanId() {
		return orderDetailSatuanId;
	}

	public void setOrderDetailSatuanId(int orderDetailSatuanId) {
		this.orderDetailSatuanId = orderDetailSatuanId;
	}

	public String getOrderDetailSatuanNama() {
		return orderDetailSatuanNama;
	}

	public void setOrderDetailSatuanNama(String orderDetailSatuanNama) {
		this.orderDetailSatuanNama = orderDetailSatuanNama;
	}

	public int getOrderDetailJumlah() {
		return orderDetailJumlah;
	}

	public void setOrderDetailJumlah(int orderDetailJumlah) {
		this.orderDetailJumlah = orderDetailJumlah;
	}

	public double getOrderDetailHarga() {
		return orderDetailHarga;
	}

	public void setOrderDetailHarga(double orderDetailHarga) {
		this.orderDetailHarga = orderDetailHarga;
	}

	public int getOrderDetailDiskon() {
		return orderDetailDiskon;
	}

	public void setOrderDetailDiskon(int orderDetailDiskon) {
		this.orderDetailDiskon = orderDetailDiskon;
	}

	public double getOrderDetailSubTotal() {
		return orderDetailSubTotal;
	}

	public void setOrderDetailSubTotal(double orderDetailSubTotal) {
		this.orderDetailSubTotal = orderDetailSubTotal;
	}

	public String getOrderDetailPpn() {
		return orderDetailPpn;
	}

	public void setOrderDetailPpn(String orderDetailPpn) {
		this.orderDetailPpn = orderDetailPpn;
	}

	public int getOrderDetailPpnNiali() {
		return orderDetailPpnNiali;
	}

	public void setOrderDetailPpnNiali(int orderDetailPpnNiali) {
		this.orderDetailPpnNiali = orderDetailPpnNiali;
	}

	public String getOrderDetailCreatedBy() {
		return orderDetailCreatedBy;
	}

	public void setOrderDetailCreatedBy(String orderDetailCreatedBy) {
		this.orderDetailCreatedBy = orderDetailCreatedBy;
	}

	public Timestamp getOrderDetailCreatedDate() {
		return orderDetailCreatedDate;
	}

	public void setOrderDetailCreatedDate(Timestamp orderDetailCreatedDate) {
		this.orderDetailCreatedDate = orderDetailCreatedDate;
	}

	public String getOrderDetailUpdatedBy() {
		return orderDetailUpdatedBy;
	}

	public void setOrderDetailUpdatedBy(String orderDetailUpdatedBy) {
		this.orderDetailUpdatedBy = orderDetailUpdatedBy;
	}

	public Timestamp getOrderDetailUpdatedDate() {
		return orderDetailUpdatedDate;
	}

	public void setOrderDetailUpdatedDate(Timestamp orderDetailUpdatedDate) {
		this.orderDetailUpdatedDate = orderDetailUpdatedDate;
	}

	public Timestamp getOrderDetailDeletedDate() {
		return orderDetailDeletedDate;
	}

	public void setOrderDetailDeletedDate(Timestamp orderDetailDeletedDate) {
		this.orderDetailDeletedDate = orderDetailDeletedDate;
	}

	public int getOrderDetailRevised() {
		return orderDetailRevised;
	}

	public void setOrderDetailRevised(int orderDetailRevised) {
		this.orderDetailRevised = orderDetailRevised;
	}

	public MOrder getOrder() {
		return order;
	}

	public void setOrder(MOrder order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "t_OrderDetail [orderDetailId=" + orderDetailId + ", orderDetailOrderId=" + orderDetailOrderId
				+ ", orderDetailBarangId=" + orderDetailBarangId + ", orderDetailBarangNama=" + orderDetailBarangNama
				+ ", orderDetailSatuanId=" + orderDetailSatuanId + ", orderDetailSatuanNama=" + orderDetailSatuanNama
				+ ", orderDetailJumlah=" + orderDetailJumlah + ", orderDetailHarga=" + orderDetailHarga
				+ ", orderDetailDiskon=" + orderDetailDiskon + ", orderDetailSubTotal=" + orderDetailSubTotal
				+ ", orderDetailPpn=" + orderDetailPpn + ", orderDetailPpnNiali=" + orderDetailPpnNiali
				+ ", orderDetailCreatedBy=" + orderDetailCreatedBy + ", orderDetailCreatedDate="
				+ orderDetailCreatedDate + ", orderDetailUpdatedBy=" + orderDetailUpdatedBy
				+ ", orderDetailUpdatedDate=" + orderDetailUpdatedDate + ", orderDetailDeletedDate="
				+ orderDetailDeletedDate + ", orderDetailRevised=" + orderDetailRevised + ", order=" + order + "]";
	}
	
	
	
	
}

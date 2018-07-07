<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
<table class="table table-striped table-bordered table-hover">
<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title">Update Data barangtrans </h3>
                    </div>
                    <form:form modelAttribute="barangTransModel" method="POST" action="/barangtrans/store">
                        <form:hidden path="barangTrans_id" />
                        <form:hidden path="barangTransCreatedDate" />
                        <form:hidden path="barangTransCreatedBy" />
                        <form:hidden path="agamaAktif" />
                        <div class="form-group">
                            <label>Nama Barang</label>
                            <form:input path="barangTransBarangNama" placeholder="nama barang" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Jumlah Barang</label>
                            <form:input path="barangTransJumlah" type="date" placeholder="jumlah barang" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Jenis Barang</label>
                            <form:input path="barangTransJenis" placeholder="jenis barang" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Tanggal</label>
                            <form:input path="barangTransTanggal" type="date" placeholder="Tanggal" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Perusahaan</label>
                            <form:input path="barangTransPerusahaanNama" placeholder="perusahaan" class="form-control"/>
                         </div><div class="form-group">
                            <label>Stok Awal</label>
                            <form:input path="barangTransStokAwal" placeholder="stok awal" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Stok Akhir</label>
                            <form:input path="barangTransStokAkhir" placeholder="stok akhir" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Barang Masuk</label>
                            <form:input path="barangTransMasuk" placeholder="barang masuk" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Barang Keluar</label>
                            <form:input path="barangTransKeluar" placeholder="barang Keluar" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
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
                        <h3 class="title"> Data barangtrans </h3>
                    </div>
                    <form:form modelAttribute="barangTransModel" method="POST" action="/barangtrans/update">
                    <form:hidden path="barangtrans_id" />
                        <form:hidden path="barangtransCreatedBy" />
                        <form:hidden path="barangtransCreatedDate" />
                        <form:hidden path="barangtransAktif" />
                        <div class="form-group">
                            <label>Nama Barang</label>
                            <form:input path="barangTransBarangNama"  class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Jumlah Barang</label>
                            <form:input path="barangTransJumlah" type="date" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Jenis Barang</label>
                            <form:input path="barangTransJenis" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Tanggal</label>
                            <form:input path="barangTransTanggal" type="date"  class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Perusahaan</label>
                            <form:input path="barangTransPerusahaanNama"  class="form-control"/>
                         </div><div class="form-group">
                            <label>Stok Awal</label>
                            <form:input path="barangTransStokAwal" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Stok Akhir</label>
                            <form:input path="barangTransStokAkhir" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Barang Masuk</label>
                            <form:input path="barangTransMasuk" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Barang Keluar</label>
                            <form:input path="barangTransKeluar" class="form-control"/>
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
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
                        <h3 class="title">Update Data Returjual </h3>
                    </div>
                    <form:form modelAttribute="retusModel" method="POST" action="/returjual/update">
                    <form:hidden path="retus_id" />
                        <form:hidden path="retusCreatedBy" />
                        <form:hidden path="retusCreatedDate" />
                        <form:hidden path="retusAktif" />    
                        <div class="form-group">
                            <label>Nomer</label>
                            <form:input path="returJualNo" placeholder="Nomer" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Returjual</label>
                            <form:input path="returJualTanggal" type="date" placeholder="tanggal returjual" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Retur Jual</label>
                            <form:input path="returJualJual" placeholder="retur jual" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Pasien Norm</label>
                            <form:input path="returJualPasienNorm" placeholder="pasien norm" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Nama Pasien</label>
                            <form:input path="returJualPasienNama" placeholder="nama pasien" class="form-control"/>
                         </div><div class="form-group">
                            <label>Alamat</label>
                            <form:input path="returJualPasienAlamat" placeholder="alamat" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Jenis Pasien</label>
                            <form:input path="returJualJenisPasienNama" placeholder="jenis pasien" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Diskon</label>
                            <form:input path="returJualDiskon" placeholder="diskon" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Cashback</label>
                            <form:input path="returJualCashback" placeholder="cashback" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Total</label>
                            <form:input path="returJualTotal" placeholder="total" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Status Bayar</label>
                            <form:input path="returJualBayarStatus" placeholder="status bayar" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Jumlah Bayar</label>
                            <form:input path="returJualBayarJumlah" placeholder="Jumlah Bayar" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Status</label>
                            <form:input path="returjual_status" placeholder="status" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Pembayar</label>
                            <form:input path="returJualBayarNama" placeholder="nama pembayar" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="returJualKeterangan" placeholder="keterangan" class="form-control"/>
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
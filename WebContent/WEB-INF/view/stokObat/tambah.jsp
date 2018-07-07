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
                        <h3 class="title"> Data Stok Obat </h3>
                    </div>
                    <form:form modelAttribute="stokObatModel" method="POST" action="/stokobat/store">
                        <div class="form-group">
                            <label>Stok Obat Depo Nama</label>
                            <form:input path="stokObatDepoNama" placeholder="stok obat depo nama" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Nama Obat</label>
                            <form:input path="stokObatBarangNama" placeholder="nama obat" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Nama Satuan</label>
                            <form:input path="stokObatStuanNama" placeholder="nama satuan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Kadaluarsa</label>
                            <form:input path="stokObatKadaluarsa" placeholder="kadaluarsa" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Jumlah Stok</label>
                            <form:input path="stokObatJumlah" placeholder="jumlah stok" class="form-control"/>
                         </div><div class="form-group">
                            <label>Tanggal Terima</label>
                            <form:input path="stokObatTerimaTanggal" placeholder="tanggal terima" type="date" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Tanggal Opname</label>
                            <form:input path="stokObatOpnameTanggal" placeholder="tanggal opname" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Stok Obat Hpp</label>
                            <form:input path="stokObatHpp" placeholder="stok obat hpp" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Nomer Terima</label>
                            <form:input path="stokObatTerimaNo" placeholder="nomer terima" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Nomer Opname</label>
                            <form:input path="stokObatOpnameNo" placeholder="nomer opname" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="stokObatKeterangan" placeholder="Keterangan" class="form-control"/>
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
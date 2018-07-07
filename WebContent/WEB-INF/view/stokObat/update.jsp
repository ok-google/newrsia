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
                        <h3 class="title">Update Data Stok Obat </h3>
                    </div>
                    <form:form modelAttribute="stokObatModel" method="POST" action="/stokobat/update">
                    <form:hidden path="stokObat_id" />
                        <form:hidden path="stokObatCreatedBy" />
                        <form:hidden path="stokObatCreatedDate" />
                        <form:hidden path="stokObatAktif" />
                        <div class="form-group">
                            <label>Stok Obat Depo Nama</label>
                            <form:input path="stokObatDepoNama" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Nama Obat</label>
                            <form:input path="stokObatBarangNama" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Nama Satuan</label>
                            <form:input path="stokObatStuanNama" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Kadaluarsa</label>
                            <form:input path="stokObatKadaluarsa" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Jumlah Stok</label>
                            <form:input path="stokObatJumlah" class="form-control"/>
                         </div><div class="form-group">
                            <label>Tanggal Terima</label>
                            <form:input path="stokObatTerimaTanggal" type="date" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Tanggal Opname</label>
                            <form:input path="stokObatOpnameTanggal" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Stok Obat Hpp</label>
                            <form:input path="stokObatHpp"  class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Nomer Terima</label>
                            <form:input path="stokObatTerimaNo" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Nomer Opname</label>
                            <form:input path="stokObatOpnameNo" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="stokObatKeterangan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <button type="submit" class="btn btn-primary">Update</button>
                        </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
<table class="table table-striped table-bordered table-hover">
<section class="section">
        <div class="card">
            <div class="card-header">
                <div class="header-block">
                    <h3 class="title"> Data Gaji </h3>
                </div>
            </div>
            <div class="card-block">
                <form:form modelAttribute="gajiModel" method="POST" action="/gaji/store">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label>No</label>
                                <form:input path="gajiNo" placeholder="Masukan Nomer" class="form-control boxed"/>
                            </div>
                             
                            <div class="form-group">
                                <label>Tanggal Penggajian</label>
                                <form:input path="gajiTglBayar" type="date" placeholder="Masukan Tgl gaji" class="form-control boxed"/>
                            </div>
                            
                            <div class="form-group">
                                <label>Gaji Bulanan</label>
                                <form:input path="gajiBulan" placeholder="Masukan Bulan gaji" class="form-control boxed"/>
                            </div>
                            <div class="form-group">
                                <label>Gaji Tahunan</label>
                                <form:input path="gajiTahun" placeholder="Masukan Gaji Tahunan" class="form-control boxed"/>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="form-group">
                                <label>Gaji Pokok</label>
                                <form:input path="gajiPokok" placeholder="Masukan Gaji Pokok" class="form-control boxed"/>
                            </div>
                            <div class="form-group">
                               <label>Pendapatan</label>
                               <form:input path="gajiPendapatan" placeholder="Masukan Pendapatan" class="form-control boxed"/>
                            </div>
                            <div class="form-group">
                                <label>Bonus Gaji</label>
                                <form:input path="gajiBonus" placeholder="Masukan Bonus Gaji" class="form-control boxed"/>
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <form:input path="gajiKeterangan" placeholder="Masukan Keterangan" class="form-control boxed"/>
                            </div>
                        </div>
                    </div>
                    <div class="form-group pull-right">
                        <button type="submit" class="btn btn-primary">Simpan</button>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
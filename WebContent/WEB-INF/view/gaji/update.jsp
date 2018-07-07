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
                        <h3 class="title"> Data Gaji </h3>
                    </div>
                    <form:form modelAttribute="gajiModel" method="POST" action="/gaji/update">
                        <form:hidden path="gaji_id" />
                        <form:hidden path="gajiCreatedBy" />
                        <form:hidden path="gajiCreatedDate" />
                        <form:hidden path="gajiAktif" />
                        <div class="form-group">
                            <label>No</label>
                            <form:input path="gajiNo" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Tanggal Penggajian</label>
                            <form:input path="gajiTglBayar" type="date" class="form-control"/>
                         </div>
                         
                         <div class="form-group">
                            <label>Gaji Bulanan</label>
                            <form:input path="gajiBulan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Gaji Tahunan</label>
                            <form:input path="gajiTahun" class="form-control"/>
                         </div>
                         <div classs="form-group">
                            <label>Gaji Pokok</label>
                            <form:input path="gajiPokok" class="form-control"/>
                         </div><div class="form-group">
                            <label>Pendapatan</label>
                            <form:input path="gajiPendapatan" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <label>Bonus Gaji</label>
                            <form:input path="gajiBonus" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="gajiKeterangan" class="form-control"/>
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
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

	<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Perusahaan Kategori </h3>
                    </div>
                    <button type="button" id="add_order" class="btn btn-success btn-sm" data-toggle="modal"
                    data-target="#form-detail">Tambah</button>
                    <form:form modelAttribute="perusahaanKategoriModel" method="POST" action="store" id="order-form">
                    	<div class="form-group">
	                       <button type="submit" id="simpan-order" class="btn btn-primary">Simpan</button>
	                   </div>
                       <div class="form-group">
                           <label>Nama Kategori</label>
                           <form:input path="perusahaanKategoriNama" placeholder="Masukan Nama Kategori" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Kode Kategori</label>
                           <form:input path="perusahaanKategoriKode" placeholder="Masukan Kode Kategori" class="form-control"/>
                       </div>

                    </form:form>
                </div>
            </div>
        </div>
	</section>
<jsp:include page="../app/footer.jsp" />
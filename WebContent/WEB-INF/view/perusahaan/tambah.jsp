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
                        <h3 class="title"> Data Perusahaan </h3>
                    </div>
                    <form:form modelAttribute="perusahaanModel" method="POST" action="store" id="perusahaan-form">
                    	<div class="form-group">
	                       <button type="submit" id="simpan-order" class="btn btn-primary">Simpan</button>
	                   </div>
                       <div class="form-group">
                           <label>Nama Perusahaan</label>
                           <form:input path="perusahaanNama" placeholder="Masukan Nama Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Kode Perusahaan</label>
                           <form:input path="perusahaanKode" placeholder="Masukan Kode Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Alamat Perusahaan</label>
                           <form:input path="perusahaanAlamat" placeholder="Masukan Alamat Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Nomer Telepon Perusahaan</label>
                           <form:input path="perusahaanNoTelp" placeholder="Masukan Telepon Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Fax Perusahaan</label>
                           <form:input path="perusahaanFax" placeholder="Masukan Fax Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>E-mail Perusahaan</label>
                           <form:input type="email" path="perusahaanEmail" placeholder="Masukan Email Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Website Perusahaan</label>
                           <form:input path="perusahaanWebsite" placeholder="Masukan Website Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Contact Person</label>
                           <form:input path="perusahaanContactPerson" placeholder="Masukan CP Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Nomer Contact Person</label>
                           <form:input path="perusahaanContacPersonNo" placeholder="Masukan No CP Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Kode Hutang</label>
                           <form:input path="perusahaanKodeHutang" placeholder="Masukan Kode Hutang" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Kode Piutang</label>
                           <form:input path="perusahaanKodePiutang" placeholder="Masukan Kode Piutang" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Nomer Kontrak</label>
                           <form:input path="perusahaanNomerKontrak" placeholder="Masukan Nomer Kontrak" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Tanggal Kontrak</label>
                           <form:input path="perusahaanTglKontrak" placeholder="Masukan Tanggal Kontrak" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Tanggal Mulai</label>
                           <form:input path="perusahaanTglMulai" placeholder="Masukan Tanggal Mulai Kontrak" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Tanggal Akhir</label>
                           <form:input path="perusahaanTglAkhir" placeholder="Masukan Tanggal Akhir Kontrak" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>NPWP</label>
                           <form:input path="perusahaanNPWP" placeholder="Masukan Nomer NPWP" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>SIUP</label>
                           <form:input path="perusahaanSIUP" placeholder="Masukan Nomer SIUP" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Bidang Perusahaan</label>
                           <form:input path="perusahaanBidang" placeholder="Masukan Bidang Perusahaan" class="form-control"/>
                       </div>
                       <div class="form-group">
                           <label>Keterangan</label>
                           <form:input path="perusahaanKeterangan" placeholder="Tambahkan Keterangan" class="form-control"/>
                       </div>
                    </form:form>
                </div>
            </div>
        </div>
	</section>
<jsp:include page="../app/footer.jsp" />
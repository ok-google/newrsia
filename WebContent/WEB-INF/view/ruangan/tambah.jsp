<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="row sameheight-container d-flex">
			<div class="col-md-8 mx-auto">
				<div class="card card-block sameheight-item">
					<div class="title-block" style="padding-bottom: 10px;border-bottom: 1px solid #ddd">
						<label class="title" style="margin-top: 10px;font-weight: bold;"> Data Ruang </label>
					</div>
					<form:form modelAttribute="ruangModel" method="POST" action="store">

						<div class="form-group">
							<label>Kode</label>
							<form:input path="ruangKode" placeholder="Masukan Kode" class="form-control boxed" />
						</div>

						<div class="form-group">
							<label>Nama</label>
							<form:input path="ruangNama" placeholder="Masukan Nama" class="form-control boxed" />
						</div>

						<div class="form-group">
							<label>Keterangan</label>
							<form:input path="ruangKeterangan" placeholder="Masukan Keterangan" class="form-control boxed" />
						</div>

						<div class="form-group">
							<label>Kepala</label>
							<form:input path="ruangKepala" placeholder="Masukan Kepala" class="form-control boxed" />
						</div>
						<div class="form-group">
							<form:select path="kelas.kelasID" class="form-control boxed">
								<option value="">--- Pilih Kelas ---</option>
								<form:options items="${kelases}" itemValue="kelasID" itemLabel="kelasNama" />
							</form:select>
						</div>
						<div class="form-group">
                            <button type="submit" class="btn btn-primary rounded-0" id="simpan-paket" onclick="$('form').submit()">Simpan</button>
                        </div>
					</form:form>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />
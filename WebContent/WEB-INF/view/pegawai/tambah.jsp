<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="row sameheight-container">
			<div class="col-md-12">
				<div class="card card-block sameheight-item">
					<div class="title-block">
						<h3 class="title"> Data Pegawai </h3>
					</div>
					<form:form modelAttribute="pegawaiModel" method="POST" action="/pegawai/store">		
						<div class="row">
							<div class="col-lg-6">
								<div class="form-group">
									<label  for="form_control_1">No Pegawai</label>
					                	<form:input path="pegawaiNo" placeholder="Masukan No Pegawai" class="form-control boxed" />
								</div>

								<div class="form-group">
									<label  for="form_control_1">Nama Pegawai</label>
					                	<form:input path="pegawaiNama" class="form-control boxed" placeholder="Masukan Nama Pegawai" />
								</div>

								<div class="form-group">
									<label  for="form_control_1">Jenis Kelamin</label>
				                	<form:select path="pegawaiKelamin" class="form-control boxed" >
				                        <form:option value='N' label="---Pilih Satu---" />
				                        <form:option value='L' label="Laki-Laki" />
				                        <form:option value='P' label="Perempuan" />
				                    </form:select>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Tanggal Lahir</label>
									<div class="input-group">
				                		<form:input path="pegawaiTglLahir" placeholder="Masukan Tanggal Lahir" class="form-control boxed datepicker" />
					                	<span class="input-group-addon"></span>
									</div>
								</div>
								
								<div class="form-group">
									<label for="exampleInputPassword1">Kota Lahir</label>
									<div class="select2-wrapper">
										<form:select path="tempatLahirId" class="form-control input-lg select2-single boxed" >
											<option value="">--Pilih Kota---</option>
											<c:forEach var="tempKota" items="${kota}">
						                      <form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
						                    </c:forEach>
										</form:select>
									</div>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Alamat</label>
									<form:input path="pegawaiAlamat" class="form-control boxed" placeholder="Masukan Alamat Pegawai boxed" />
								</div>
								
								<div class="form-group">
									<label for="exampleInputPassword1">Nama Kota</label>
									<div class="select2-wrapper">
										<form:select path="kotaId" class="form-control boxed input-lg select2-single" >
											<option></option>
											<c:forEach var="tempKota" items="${kota}">
		                                    	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
		                                    </c:forEach>
										</form:select>
									</div>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Nama Jabatan</label>
					                	<form:select path="pegawaiJabatanNama" class="form-control input-lg select2-single boxed" >
											<option value="">--- Pilih Jabatan ---</option>
											<c:forEach var="tempJabatan" items="${jabatan}">
		                                    	<form:option value="${tempJabatan.jabatanNama }" label="${tempJabatan.jabatanNama }" />
		                                    </c:forEach>
										</form:select>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Pendidikan</label>
					                	<form:select path="pegawaiPendidikanId" class="form-control boxed" >
					                        <option value="0"> ---Pilih Satu--- </option>
					                        <c:forEach var="tempPendidikan" items="${pendidikan}">
		                                    	<form:option value="${tempPendidikan.pendidikanKode }" label="${tempPendidikan.pendidikanNama }"/>
		                                    </c:forEach>
					                    </form:select>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="form-group">
									<label  for="form_control_1">Fungsional</label>
					                	<form:select path="pegawaiFungsional" class="form-control boxed">
					                        <form:option value="Null" label="---Pilih Satu---" />
					                        <form:option value="PJ" label="Penanggung Jawab" />
					                        <form:option value="Bukan PJ" label="Bukan" />
					                    </form:select>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Medis</label>
					                	<form:select path="pegawaiMedis" class="form-control boxed" >
					                        <form:option value="-1" label="---Pilih Satu---" />
					                        <form:option value="1" label="Ya" />
					                        <form:option value="0" label="Bukan" />
					                    </form:select>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Tanggal Masuk</label>
					                <form:input path="pegawaiTglMasuk" class="form-control boxed" placeholder="Masukan Tanggal Masuk" />
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Tanggal Keluar</label>
									<form:input path="pegawaiTglKeluar" class="form-control boxed" placeholder="Masukan Tanggal Keluar" />
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Email</label>
					                <form:input path="pegawaiEmail" class="form-control boxed" placeholder="Masukan Email" />
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Nomer HP</label>
					                <form:input path="pegawaiNoHp" class="form-control boxed" placeholder="Masukan Nomer Handphone" />
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Bank</label>
					                	<form:select path="pegawaiBankNama" class="form-control boxed">
					                        <form:option value="Null" label="---Pilih Satu---" />
					                        <form:option value="BNI" label="BNI" />
					                        <form:option value="BRI" label="BRI" />
					                        <form:option value="BCA" label="BCA" />
					                        <form:option value="Mandiri" label="Mandiri" />
					                        <form:option value="Lainnya" label="Lainnya" />
					                    </form:select>
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Akun Bank</label>
					                	<form:input path="pegawaiBankAkun" class="form-control boxed" placeholder="Masukan Nama Akun" />
								</div>
								
								<div class="form-group">
									<label  for="form_control_1">Nomer Rekening</label>
					                	<form:input path="pegawaiBankRekening" class="form-control boxed" placeholder="Masukan Nomer Rekening" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary"> Submit </button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />

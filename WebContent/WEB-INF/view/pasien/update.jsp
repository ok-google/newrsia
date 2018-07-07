<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="container" id="add_passien_form">
			<div class="card">
				<div class="card-header">
					<div class="header-block">
						<h3 class="title"> Update Pasien </h3>
					</div>
				</div>
				<div class="card-block">
					<form:form modelAttribute="pasienModel" method="POST" action="/pasien/update">
						<form:hidden path="pasienID" />
						<form:hidden path="pasienCreatedBy" />
						<form:hidden path="pasienCreatedDate" />
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
	                                <label>No RM</label>
	                                <form:input path="pasienNorm" placeholder="Masukan No RM" class="form-control"/>
	                             </div>
	                             
	                            <div class="form-group">
	                                <label>NIK</label>
	                                <form:input path="pasienNik" placeholder="Masukan NIK" class="form-control"/>
	                            </div>

	                            <div class="form-group">
	                                <label>Sebutan</label>
	                                <form:input path="pasienSebut" placeholder="Tuan/Nona/Nyonya/Anak" class="form-control" maxlength="5"/>
	                            </div>

	                            <div class="form-group">
	                                <label>Nama</label>
	                                <form:input path="pasienNama" placeholder="Masukan Nama" class="form-control"/>
	                            </div>
								
								<div class="form-group">
									<label>Kelamin</label>
									<div class="select2-wrapper">	
										<form:select path="pasienKelamin" items="${Jeniskelamin}" class="form-control"/>
									</div>
	                            </div>
	                            
	                            <div class="form-group">
	                                <label>Alamat</label>
	                                <form:input path="pasienAlamat" placeholder="Masukan Alamat" class="form-control"/>
	                            </div>
								
								<div class="form-group">
									<label>Provinsi</label>
									<div class="select2-wrapper">	
										<form:select path="propinsiID" class="form-control input-lg select2-single">
											<c:forEach var="prov" items="${provinsi}">
	                                         	<form:option value="${prov.propinsi_id }" label="${prov.propinsiNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
	                            </div>
	                            
								<div class="form-group">
									<label>Kota</label>
									<div class="select2-wrapper">
										<form:select path="kotaID" class="form-control input-lg select2-single">
											<c:forEach var="tempKota" items="${Kota}">
	                                         	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
	                                         </c:forEach>
										</form:select>
									</div>
	                            </div>

	                            <div class="form-group">
										<label>Kecamatan</label>
										<div class="select2-wrapper">
											<form:select path="kecamatanID" class="form-control input-lg select2-single">
												<c:forEach var="Kecamatan" items="${Kecamatan}">
		                                         	<form:option value="${Kecamatan.kecamatan_id }" label="${Kecamatan.kecamatanNama }" />
		                                         </c:forEach>
											</form:select>
										</div>
	                                </div>

									<div class="form-group">
										<label>Kelurahan</label>
										<div class="select2-wrapper">
											<form:select path="kelurahanID" class="form-control input-lg select2-single">
												<c:forEach var="kelurahan" items="${Kelurahan}">
		                                         	<form:option value="${kelurahan.kelurahan_id }" label="${kelurahan.kelurahanNama }" />
		                                         </c:forEach>
											</form:select>
										</div>
	                                </div>
	                                
	                                <div class="form-group">
										<label>Telepon</label>
	                                    <form:input path="pasienNotelp" placeholder="Telepon" class="form-control"/>
	                                </div>
									
									 <div class="form-group">
										<label>HP</label>
	                                    <form:input path="pasienNohp" placeholder="HP" class="form-control"/>
	                                </div>
	                                
							</div>
							<div class="col-md-6">
								
	                                <div class="form-group">
										<label>Golongan Darah</label>
										<div class="select2-wrapper">	
											<form:select path="pasienGoldarah" items="${Goldar}" class="form-control"/>
										</div>
	                                </div>

									<div class="form-group">
	                                    <label>BB</label>
	                                    <form:input path="pasienBb" placeholder="Masukan BB" class="form-control"/>
	                                </div>

	                                <div class="form-group">
	                                    <label>TB</label>
	                                    <form:input path="pasienTb" placeholder="Masukan TB" class="form-control"/>
	                                </div>
	                                
	                                												
									<div class="form-group">
										<label for="exampleInputPassword1">Kota Lahir</label>
										<div class="select2-wrapper">
											<form:select path="kotaIDTempatlahir" class="form-control input-lg select2-single">
												<c:forEach var="tempKota" items="${Kota}">
		                                         	<form:option value="${tempKota.kota_id }" label="${tempKota.kotaNama }" />
		                                         </c:forEach>
											</form:select>
										</div>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label>Domisili</label>
	                                    <form:input path="pasienDomisili" placeholder="Masukan Domisili" class="form-control"/>
	                                </div>
	                                
	                                <div class="form-group">
	                                    <label>Keterangan</label>
	                                    <form:input path="pasienKeterangan" placeholder="Masukan Keterangan" class="form-control"/>
	                                </div>	
	                                
	                                <div class="form-group">
	                                    <label>Status Pekerjaan</label>
	                                    <form:input path="pasienPekerjaan" placeholder="Masukan Pekerjaan" class="form-control"/>
	                                </div>
	                                
									<div class="form-group">
	                                    <label>Status Nikah</label>
	                                    <form:input path="pasienStatusnikah" placeholder="Masukan Status Nikah" class="form-control"/>
	                                </div>
	                                
	                                <div class="form-group">
										<label class="control-label" id="pendidikanID">Pekerjaan</label>
										<div class="select2-wrapper">
											<form:select path="pekerjaanID" class="form-control input-lg select2-single">
												<c:forEach var="pend" items="${Pendidikan}">
		                                         	<form:option value="${pend.pendidikanID }" label="${pend.pendidikanNama }" />
		                                         </c:forEach>
											</form:select>
										</div>
									</div>
									
									<div class="form-group">
										<label for="exampleInputPassword1">Agama</label>
										<div class="select2-wrapper">
											<form:select path="agamaID" items="${Agama}" class="form-control"/>
										</div>
	                                </div>

									<div class="form-group">
										<label class="control-label" id="pendidikanID">Pendidikan</label>
										<div class="select2-wrapper">
											<form:select path="pendidikanID" class="form-control input-lg select2-single">
												<c:forEach var="pend" items="${Pendidikan}">
		                                         	<form:option value="${pend.pendidikanID }" label="${pend.pendidikanNama }" />
		                                         </c:forEach>
											</form:select>
										</div>
									</div>
									
									<div class="form-group">
	                                    <label>Alergi</label>
	                                    <form:input path="pasienAlergi" placeholder="Masukan Alergi" class="form-control"/>
	                                </div>
							</div>
						</div>
	                    <div class="form-group">
							<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
							<button type="button" class="btn btn-danger d_pasien-button"><a style="color: white; text-decoration: none;" href="/pasien/"/>Batal</a></button>
						</div>
					</form:form>
				</div>
			</div>
		</div>	
	</section>
<jsp:include page="../app/footer.jsp" />
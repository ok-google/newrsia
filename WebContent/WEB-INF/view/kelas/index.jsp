<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
				<section class="section">
					<div class="form-kelas row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header bordered">
									<div class="header-block">
										<h3 class="title">Tambah Kelas Baru 
										</h3>
									</div>
									<div class="header-block pull-right">
										<button type="submit" class="btn btn-primary rounded-0" style="margin-right: 3px" id="simpan-paket" onclick="$('#kelasModel').submit()">Simpan</button>
										<a href="/kelas" class="pull-right btn btn-danger rounded-0">Batal</a>
									</div>
								</div>
								<div class="card-block">
									<section class="form-kelas-baru">
										<form:form modelAttribute="kelasModel" id="kelasModel" method="POST" action="/kelas/store">
											<div class="form-group">
												<label>Kode</label>
												<form:input path="kelasKode" placeholder="Masukan Kode" class="form-control boxed"/>
											</div>

											<div class="form-group">
												<label>Nama</label>
												<form:input path="kelasNama" placeholder="Masukan Nama" class="form-control boxed"/>
											</div>

											<div class="form-group">
												<label>Keterangan</label>
												<form:input path="kelasKeterangan" placeholder="Masukan Keterangan" class="form-control boxed"/>
											</div>
										</form:form>
									</section>
								</div>
							</div>
						</div>
					</div>
					<jsp:include page="inc/tabel.jsp" />
				</section>
<jsp:include page="../app/footer.jsp" />
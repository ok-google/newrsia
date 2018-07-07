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
						<h3 class="title"> Data Kota </h3>
					</div>
					<form:form modelAttribute="kotaModel" method="POST" action="/kota/update">
						<form:hidden path="kota_id" />
						<form:hidden path="kotaCreatedDate" />
						<form:hidden path="kotaCreatedBy" />
						<form:hidden path="kotaAktif" />
						
						<div class="form-group">
							<label for="exampleInputEmail1">Kode Kota</label>
								<form:input path="kotaKode"  placeholder="Masukan Kode Kota" class="form-control boxed" />
							</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nama Kota</label>
								<form:input path="kotaNama" placeholder="Masukan Nama Kota" class="form-control boxed" />
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nama Provinsi</label>
							<div class="select2-wrapper">
								<form:select  path="propinsiKode" class="form-control boxed input-lg select2-single">
									<form:option value=""></form:option>
									<option value="">--- Pilih Provinsi ---</option>
									<c:forEach var="tempProvinsi" items="${provinsi}">
                                     	<form:option value="${tempProvinsi.propinsiKode }" label="${tempProvinsi.propinsiNama }" />
                                     </c:forEach>
								</form:select>
							</div>
                         </div>
						
						<div class="form-group">
							<button type="submit" class="btn btn-primary rounded-0">Simpan</button>
						</div>
					
					</form:form>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />
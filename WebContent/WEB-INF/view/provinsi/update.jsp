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
						<h3 class="title"> Data Provinsi </h3>
					</div>
					<form:form modelAttribute="provinsiModel" method="POST" action="/provinsi/update">
						<form:hidden path="propinsi_id" />
						<form:hidden path="propinsiCreatedBy" />
						<form:hidden path="propinsiCreatedDate" />
						<form:hidden path="propinsiAktif" />
						
						<div class="form-group">
							<label for="exampleInputEmail1">Kode Provinsi</label>
							<form:input path="propinsiKode" class="form-control boxed"/>
							</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nama Provinsi</label>
							<form:input path="propinsiNama" class="form-control boxed"/>
							 </div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary rounded-0">Update</button>
						</div>
					</form:form>
					
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />
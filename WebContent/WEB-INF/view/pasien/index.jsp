<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="container"   id="add_passien_form">
			 
				 			 
			<div class="container">
				<div class="card">
					<div class="card-header">
						<div class="header-block">
							<h3 class="title"> Data Pasien </h3>
							<a class="btn btn-primary btn-sm rounded-0" href="/pasien/tambah"/>Tambah Data</a>
						</div>
					</div>
					
					<div class="card-block">
                        <jsp:include page="inc/tabel.jsp" />
					</div>
				</div>
			</div>
	</section>
<jsp:include page="../app/footer.jsp" />
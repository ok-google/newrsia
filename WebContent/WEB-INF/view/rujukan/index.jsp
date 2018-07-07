<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="section">
		<div class="card">
			<div class="card-header">
				<div class="header-block">
					<h3 class="title">Data Rujukan</h3>
					<a href="/rujukan/tambah" class="btn btn-primary btn-sm">Tambah</a>
				</div>
			</div>
			<div class="card-block">
				<div class="table-responsive">
					<jsp:include page="inc/tabel.jsp" />
				</div>
				<div class="fixed-table-pagination" style="display: block; margin-top:25px">
				     <form action="" method="get">
				            <div class="pull-right pagination" style="margin-right: 20px;">
				                 ${link }
				            </div>
				      </form>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />
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
						<h3 class="title"> Data Penunjang Medis Group</h3>
					</div>
					<form:form modelAttribute="penunjangGroupModel" method="POST" action="/penunjang-group/update">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<label for="form_control_1">Nama Penunjang</label>
									<form:hidden path="pmedisgroupID" />
						            <form:input path="pmedisgroupDetail" placeholder="Masukan Nama Penunjang" class="form-control boxed" />
								</div>
								<div class="form-group">
									<label for="form_control_1">Bentuk Laporan</label>
									<form:select path="pmedisgroupMaster" class="form-control boxed input-lg">
										<form:option value="" label="--- Pilih Laporan ---"></form:option>
										<c:forEach var="laporan" items="${laporan}" varStatus="loop">
											<form:option value="${laporan.key}" label="${laporan.value}" />
										</c:forEach>
									</form:select>
								</div>
							</div>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary mb-0"> Submit </button>
							<a href="/penunjang-group" class="btn btn-danger mb-0"> Batal </a>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />

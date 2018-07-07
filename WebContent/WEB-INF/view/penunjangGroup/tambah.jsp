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
						<h3 class="title"> Data Penunjang Medis Group </h3>
					</div>
					<form:form modelAttribute="penunjangGroupModel" method="POST" action="/penunjang-group/store">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group">
									<label>Nama Penunjang</label>
						            <form:input path="pmedisgroupDetail" placeholder="Masukan Nama Penunjang" class="form-control boxed" />
								</div>
								<div class="form-group">
									<label>Bentuk Laporan</label>
									<form:select path="pmedisgroupMaster" class="form-control boxed input-lg">
										<form:option value="" label="--- Pilih Laporan ---"></form:option>
										<c:forEach var="laporan" items="${laporan}" varStatus="loop">
											<option value="${laporan.key}">${laporan.value}</option>
										</c:forEach>
									</form:select>
								</div>
							</div>
						</div>
						<div class="form-group mb-0">
							<button type="submit" class="btn btn-primary mb-0"> Submit </button>
						</div>
					</form:form>  
				</div>
			</div>
		</div>
	</section>
	<section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-block">
                        <div class="card-title-block">
                            <h3 class="title"> List Penunjang Medis Group </h3>
                        </div>
                        <section class="example">
                        	<jsp:include page="inc/tabel.jsp" />
                        </section>
                    </div>
                </div>
            </div>
        </div>
        <div class="fixed-table-pagination" style="display: block; margin-top:25px">
             <form action="" method="get">
                    <div class="pull-right pagination" style="margin-right: 20px;">
                         
                    </div>
              </form>
        </div>
        <div class="clearfix"></div>
    </section>
<jsp:include page="../app/footer.jsp" />

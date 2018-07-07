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
					<form:form modelAttribute="kotaModel" method="POST" action="/kota/store">		
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
									<form:option value="" label="--- Pilih Provinsi ---"></form:option>
									
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
	<section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-block">
                        <div class="card-title-block">
                            <h3 class="title"> List Kota </h3>
                        </div>
                        <section class="example">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Kode Kota</th>
                                            <th>Nama Kota</th>
                                            <th>Keterangan</th>
                                            <th colspan="2">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="tempKota" items="${kota}">
                                        	<tr>
                                        		<td> ${tempKota.kotaKode } </td>
                                        		<td> ${tempKota.kotaNama } </td>
                                        		<td>  </td>
                                        		<td> <a href="/kota/update/${tempKota.kota_id}" class="btn btn-info rounded-0">Update</a>
                                        		 <a href="/kota/delete/${tempKota.kota_id}" class="btn btn-warning rounded-0">Delete</a></td>
                                        	</tr>
                                        
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>
        <div class="fixed-table-pagination" style="display: block; margin-top:25px">
             <form action="" method="get">
                    <div class="pull-right pagination" style="margin-right: 20px;">
                         ${link }
                    </div>
              </form>
        </div>
        <div class="clearfix"></div>
    </section>
<jsp:include page="../app/footer.jsp" />
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
						<h3 class="title"> Data Jenis Layanan </h3>
					</div>
					<form:form modelAttribute="jenislayananModel" method="POST" action="/jenis-layanan/store">
					
						<div class="form-group">
							<label>Nomor Jenis Layanan</label>
							<form:input path="jenislayanan_nomor" placeholder="Masukan Nomor Jenis Layanan" class="form-control boxed"/>
						</div>
						<div class="form-group">
							<label>Nama Jenis Layanan</label>
							<form:input path="jenislayanan_nama" placeholder="Masukan Nama Jenis Layanan" class="form-control boxed"/>
						</div>
						<div class="form-group">
							<label>Kategori Jenis Layanan</label>
							<form:input path="jenislayanan_kategori" placeholder="Masukan Kategori Jenis Layanan" class="form-control boxed"/>
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
                            <h3 class="title"> List Jenis Layanan </h3>
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
                         ${link }
                    </div>
              </form>
        </div>
                <div class="clearfix"></div>
    </section>
<jsp:include page="../app/footer.jsp" />
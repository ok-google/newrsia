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
						<h3 class="title">Kondisi Pasien</h3>
					</div>
					<form:form modelAttribute="kondisiModel" method="POST" action="/kondisi/store">
                        <div class="form-group">
                            <label>Kode</label>
                            <form:input path="kondisiKode" placeholder="Masukan Kode" class="form-control boxed"/>
                        </div>
                    
                        <div class="form-group">
                            <label>Nama</label>
                            <form:input path="kondisiNama" placeholder="Masukan Nama" class="form-control boxed"/>
                         </div>
                        
                        <div class="form-group">
                            <label>Keterangan</label>
                            <form:input path="kondisiKeterangan" placeholder="Masukan Keterangan" class="form-control boxed"/>
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
                            <h3 class="title"> List Kondisi </h3>
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
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />

			<article class="content forms-page">
                <section class="section">
                    <div class="container">
                        <div class="row">
                            <div class="col-6">
                                <small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
                            </div>
                            <div class="col-6">
                                <button type="button" class="btn btn-sm btn-success d_pasien-button" id="simpan-barang" style="float: right;">Simpan</button>
                            </div>
                        </div>
					<div class="container">
						<small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
						<form:form modelAttribute="barangModel" method="POST" action="store" id="barang-form">
						<div class="row card-block">
							<div class="col-6">
								<div class="form-group">
									<label class="control-label">Jenis Barang</label>
									
									<div>
										<label>
												<form:radiobutton path="barangJenisId" value="0"/>
												<span>Obat</span>
											</label>
										<label>
												<form:radiobutton path="barangJenisId" value="1"/>
												<span>Alat</span>
											</label>
										<label>
												<form:radiobutton path="barangJenisId" value="2"/>
												<span>Jasa</span>
											</label>
									</div>
								</div>
								
								<div class="form-group">
									<label for="exampleInputEmail1">Kode</label>
									<form:input path="barangKode" class="form-control boxed form-control-sm" />
								</div>
								
								<div class="form-group">
									<label for="exampleInputEmail1">Nama Barang<span style="color:red">*</span></label>
									<form:input path="barangNama" class="form-control boxed form-control-sm" />
								</div>
								
								<div class="form-group">
									<label class="control-label">Satuan Terkecil<span style="color:red">*</span></label>
								<form:input type="text" path="barangSatuanId" class="form-control boxed form-control-sm"  />
									<%--<form:select class="form-control boxed form-control-sm" path="barangSatuanId" >
										<c:forEach var="temp" items="${satuan}">
					                      <option value="${temp.satuanID }"> ${temp.satuanNama } </option>
						                </c:forEach>
									</form:select>--%>
								</div>
							</div>
								
							<div class="col-6">
								<div class="form-group">
									<label for="exampleInputEmail1">Keterangan</label>
									<form:input path="barangKeterangan" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Profit(%)<span style="color:red">*</span></label>
									<form:input path="barangProfit" type="number" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Stok Minimal</label>
									<form:input path="barangStokMin" type="number" class="form-control boxed form-control-sm" />
								</div>

								<label for="exampleInputEmail1">Harga HET</label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<form:input path="barangHet" type="number" class="form-control" />
									<span class="input-group-addon">,00</span>
								</div>
							</div>
						</div>
				</form:form>
			</div>
        </section>
    </article>				
<script type="text/javascript">
	$('#simpan-barang').click(function () {
		$('#barang-form').submit();
	});

</script>
				
<jsp:include page="../app/footer.jsp" />
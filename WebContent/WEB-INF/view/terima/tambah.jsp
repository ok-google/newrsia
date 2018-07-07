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
								<button type="button" class="btn btn-sm btn-success d_pasien-button" id="simpan-terima" style="float: right;">Simpan</button>
							</div>
						</div>
						<form:form modelAttribute="terimaModel" method="POST" action="/terima/store" id="terima-form">
						<div class="row card-block">
							<div class="col-6">
								<div class="form-group">
									<label for="exampleInputEmail1">No. Order</label>
									<form:input path="terimaOrderNo" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">No. Terima</label>
									<form:input path="terimaNo" class="form-control boxed form-control-sm" />
								</div>
								
								<div class="form-group">
		                            <label>Tanggal Terima</label>
		                            <form:input path="terimaTanggal" type="date" placeholder="Masukan Tgl Order" class="form-control" />
		                         </div>


		                         <div class="form-group">
		                            <label>Depo</label>
		                            <form:input path="terimaDepoId" placeholder="Depo" class="form-control" />
		                         </div>

								<div class="form-group">
									<label class="control-label">Supplier</label>
									<form:input path="terimaPerusahaanId" placeholder="Masukan Nama Perusahaan" class="form-control" />
									<%--
									<form:select class="form-control boxed form-control-sm" path="terimaPerusahaanId">
									<c:forEach var="tempPerusahaan" items="${perusahaan}">
                                         <option value="${tempPerusahaan.perusahaanID }">
                                         ${tempPerusahaan.perusahaanNama }
                                         </option>
                                     </c:forEach>
									</form:select>
									--%>
								</div>

								<div class="form-group">
		                            <label>Surat Jalan</label>
		                            <form:input path="terimaNoSuratJalan" placeholder="Masukan Nomer Surat Jalan" class="form-control" />
		                         </div>

		                         <div class="form-group">
		                            <label>Pengirim</label>
		                            <form:input path="terimaPengirim" placeholder="Masukan Nama Pengirim" class="form-control" />
		                         </div>
		                         
							</div>

							<div class="col-6">
								
								<div class="form-group">
									<label class="control-label">Pajak</label>
									<form:select class="form-control boxed form-control-sm" path="terimaTotalPPN">
											<option>Pilih..</option>
											<option value="10">10%</option>
											<option value="20">20%</option>
											<option value="30">30%</option>
											<option value="40">40%</option>
											<option value="50">50%</option>
											<option value="60">60%</option>
										</form:select>
								</div>
								<!--  <div class="form-group">
									<label for="exampleInputEmail1">Jumlah Item<span style="color:red">*</span></label>
									<form:input class="form-control boxed form-control-sm" path=""/>
								</div> -->
								<div class="form-group">
		                            <label>Total PPH</label>
		                            <form:input path="terimaTotalPPH" placeholder="Total PPH" class="form-control" />
		                         </div>
		                         
								<label for="exampleInputEmail1">Harga Total<span style="color:red">*</span></label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<form:input class="form-control" path="terimaTotal"/>
									<span class="input-group-addon">,00</span>
								</div>

								<label for="exampleInputEmail1">Cashback<span style="color:red">*</span></label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<form:input class="form-control" path="terimaCashback"/>
									<span class="input-group-addon">,00</span>
								</div>
							</div>
						</div>
						<div class="col col-12" style="padding:0">
							<div class="container">
								<div class="card card-success">
									<div class="card-header" style="min-height:0">
										<div class="header-block" style="padding: 5px 20px">
											<p class="title"> Detail Barang </p>
										</div>
									</div>
									<div class="card-block" style="background-color: #f4f4f4">
										<button type="button" class="btn btn-sm btn-success" style="float: right;"
										id="add_terima" data-toggle="modal" data-target="#form-detail">
											<span class="fa fa-plus"></span>&nbsp;Tambah
										</button>			
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Nama Barang</th>
														<th>Satuan</th>
														<th>Tgl. Expired</th>
														<th>Jumlah</th>
														<th>Harga</th>
														<th>Total</th>
													</tr>
												</thead>
												<tbody id="terima-list" class="table-form">
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
						</form:form>						
					</div>
				</section>
			</article>
			
	<div class="modal fade" id="form-detail" role="dialog">
		<div class="modal-dialog modal-lg">
			<div class="modal-content">
            	<div class="modal-header">
                     <h4 class="modal-title">Tambah Terima Barang</h4>
                     <button type="button" class="close" data-dismiss="modal"
                         aria-label="Close">
                         <span aria-hidden="true">�</span> <span class="sr-only">Close</span>
                     </button>
                 </div>
                 <div class="modal-body modal-tab-container">
                     <form>
                         <div class="form-group">
                             <label>Nama Barang</label>
                             <input type="text" name="terimaDetailBarangId" id="terimaDetailBarangId">
                         </div>
                         <div class="form-group">
                             <label>Satuan</label>
                             <input type="text" name="terimaDetailSatuan" id="terimaDetailSatuan">
                             <%--
                             <select name="terimaDetailSatuan" id="terimaDetailSatuan">
                                 <c:forEach var="tempSatuan" items="${satuan}">
                                         <option value="${tempSatuan.satuanID }">
                                         ${tempSatuan.satuanNama }
                                         </option>
                                     </c:forEach>
                             </select>
                             --%>
                         </div>
                         <div class="form-group">
                             <label>Jumlah</label>
                             <input type="text" name="terimaDetailJumlah" id="terimaDetailJumlah">
                         </div>
                         <div class="form-group">
                             <label>Harga</label>
                             <input type="text" name="terimaDetailHarga" id="terimaDetailHarga">
                         </div>
                         <div class="form-group">
                             <label>Sub Total</label>
                             <input type="text" name="terimaDetailSubTotal" id="terimaDetailSubTotal">
                         </div>
                         <input type="hidden" name="terima_mode" id="terima_mode">                                                                               
                         <input type="hidden" name="terima_edit" id="terima_edit">
                     </form>
                 </div>
                 <div class="modal-footer">
                      <button type="button" class="btn btn-secondary"
                          data-dismiss="modal">Close</button>
                      <button type="button" id="simpan-detail" class="btn btn-primary">Simpan</button>
                  </div>
         	</div>
		<!-- /.modal-content -->
		</div>
	</div>
	
	<jsp:include page="../app/footer.jsp" />
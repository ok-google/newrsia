<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../Head.jsp"></jsp:include>

<body>
	<div class="main-wrapper">
		<div class="app" id="app">

			<jsp:include page="../HeaderSidebar.jsp"></jsp:include>


			<!-- MAIN HERE -->
				<article class="content forms-page">
					<section class="section">
						<div class="row sameheight-container">
							<div class="col-md-3"></div>
							<div class="col-md-6">
								<div class="card card-block sameheight-item">
									<div class="title-block">
										<h3 class="title"> Data Stok </h3>
									</div>
									<form:form modelAttribute="stokObatModel" method="POST" action="store">
										<div class="form-group">
											<label for="exampleInputPassword1">Nama Depo</label>
												<form:input path="stokObatDepoNama" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										<!--  <div class="form-group">
											<label for="exampleInputPassword1">Nama Jenis Jabatan</label>
												<form:select path="jabatanJenis" placeholder="Masukan Jenis Jabatan" class="form-control form-control-sm" >
													<form:option value="NULL" label="--- Pilih Satu ---" />
													<form:option value="Fungsional" label="Fungsional" />
													<form:option value="Struktural" label="Struktural" />
												</form:select>
										</div>-->
										<div class="form-group">
											<label for="exampleInputPassword1">Nama Barang</label>
												<form:input path="stokObatBarangNama" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Nama Satuan</label>
												<form:input path="stokObatStuanNama" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Kadaluarsa</label>
												<form:input path="stokObatKadaluarsa" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Jumlah</label>
												<form:input path="stokObatJumlah" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Terima </label>
												<form:input path="stokObatTerimaNo" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Tanggal Terima</label>
												<form:input path="stokObatTerimaTanggal" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Opname </label>
												<form:input path="stokObatOpnameNo" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Tanggal Opname</label>
												<form:input path="stokObatTerimaTanggal" placeholder="Masukan Nama Jabatan" class="form-control"  />
										</div>
										
                                         <div class="form-group">
											<label for="exampleInputPassword1">Keterangan</label>
												<form:textarea path="jabatanKeterangan" placeholder="Masukan Keterangan" class="form-control" /> 
										</div>
										<div class="form-group">
											<button type="submit" class="btn btn-primary">Simpan</button>
										</div>
									</form:form>
								</div>
							</div>
						</div>
					</section>
				</article>
			<!-- END MAIN HERE -->
		</div>
	</div>
				
<script>
	$( ".select2-single, .select2-multiple" ).select2( {
		theme: "bootstrap",
		placeholder: "Sub Jenis Pegawai",
		maximumSelectionSize: 6,
		containerCssClass: ':all:'
	} );

	$( ":checkbox" ).on( "click", function() {
		$( this ).parent().nextAll( "select" ).prop( "disabled", !this.checked );
	});
</script>
   
</body>
</html>
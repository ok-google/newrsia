<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
	<section class="card">
		<div class="card-header bordered">
			<div class="header-block">
				<h3 class="title">Penunjang </h3>
			</div>
			<div class="header-block pull-right">
				<button type="button" id="simpan-penunjang" class="btn btn-primary float-right rounded-0 pull-right" style="margin: 0px;">Simpan</button>
			</div>
		</div>
		<div class="card card-success" style="box-shadow: none; border: none;">
			<form:form modelAttribute="penunjangModel" method="POST" id="penunjang-form" action="/penunjang/store">
				<div class="card-block row">
					<div class="col-lg-6">
						<div class="form-group">
							<label>Kode</label>
				            <form:input path="penunjangmedisKode" placeholder="Masukan Kode" class="form-control boxed" />
						</div>
						<div class="form-group">
							<label>Jenis</label>
							<form:select path="penunjangGroup.pmedisgroupID" id="jenis_penunjang" class="form-control boxed input-lg">
								<option value="">--- Pilih Jenis ---</option>
								<c:forEach var="penunjangGroup" items="${penunjangGroups}">
									<form:option value="${penunjangGroup.pmedisgroupID }" data-report="${penunjangGroup.pmedisgroupMaster }">${penunjangGroup.pmedisgroupDetail }</form:option>
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<label>Kategori</label>
							<form:select path="jenislayanan.jenislayananID" class="form-control boxed">
								<option value="">--- Pilih Kategori ---</option>
								<c:forEach var="jenislayanan" items="${jenisLayanans}">
									<form:option value="${jenislayanan.jenislayananID }" label="${jenislayanan.jenislayananNama }" />
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<label>Pemeriksaan</label>
				            <form:input path="penunjangmedisNama" placeholder="Masukan Nama Pemeriksaan" class="form-control boxed" />
						</div>
						<div class="form-group">
							<label>Keterangan</label>
				            <form:input path="penunjangmedisKeterangan" placeholder="Masukan Nama Keterangan" class="form-control boxed" />
						</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label>Parameter Periksa</label>
				            <form:input path="paramperiksa[0].paramperiksaNama" id="paramperiksaNama" placeholder="Masukan Kode" class="form-control boxed" />
						</div>
						<div class="form-group">
							<label>Nilai Normal</label>
				            <form:input path="paramperiksa[0].paramperiksaStandar" id="paramperiksaStandar" placeholder="Masukan Standar" class="form-control boxed" />
						</div>
						<div class="form-group">
							<label>Satuan</label>
				            <form:input path="paramperiksa[0].paramperiksaSatuan" id="paramperiksaSatuan" placeholder="Masukan Satuan" class="form-control boxed" />
						</div>
						<div class="form-group">
							<label>Kelas</label>
							<form:select path="penunjangkelas[0].kelases.kelasID" id="penunjangTarifKelas" class="form-control boxed">
								<option value="">--- Pilih Kelas ---</option>
								<c:forEach var="kelas" items="${kelases}">
									<form:option value="${kelas.kelasID }" label="${kelas.kelasNama }" />
								</c:forEach>
							</form:select>
						</div>
						<div class="form-group">
							<label>Harga</label>
				            <form:input path="penunjangkelas[0].penunjangkelasHarga" placeholder="Masukan Harga" class="form-control boxed" />
						</div>
					</div>
				</div>
			</form:form>
		</div>
	</section>
<jsp:include page="../app/footer.jsp" />

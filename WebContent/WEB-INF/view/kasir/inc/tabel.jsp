<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
	<div class="col-md-12">
		<div class="card">
			<div class="card-header">
				<div class="header-block">
					<h3 class="title"> List Kasir</h3>
					<a href="/kasir/tambah" class="btn btn-sm btn-primary rounded-0">Tambah</a>
				</div>
			</div>
			<div class="card-block">
				<section class="list-kasir">
					<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Kamar/Poli</th>
									<th>Dokter</th>
									<th>No.Pendaftaran</th>
									<th>Nama</th>
									<th>L/P</th>
									<th>Alamat Pasien</th>
									<th>Status</th>
									<th>Aksi</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="transaksi" items="${transaksies}">
									<tr>
										<td>
											<c:choose>
												<c:when test="${empty transaksi.pendaftaran.ruang.ruangID}">
													${transaksi.pendaftaran.pendaftaranPoli}
												</c:when>
												<c:otherwise>
													${transaksi.pendaftaran.kamar.ruang.ruangNama} - ${transaksi.pendaftaran.kamar.kamarNo}
												</c:otherwise>
											</c:choose>
										</td>
										<td>${transaksi.pendaftaran.pegawai.pegawaiNama}</td>
										<td>${transaksi.pendaftaran.pendaftaranNo}</td>
										<td>${transaksi.pendaftaran.pasien.pasienNama}</td>
										<td>${transaksi.pendaftaran.pasien.pasienKelamin}</td>
										<td>${transaksi.pendaftaran.pasien.pasienAlamat}</td>
										<td>${transaksi.transaksiStatus}</td>
										<td>
											<a href="/kasir/pembayaran?pendaftaran=${transaksi.pendaftaran.pendaftaranID}" class="btn btn-info rounded-0">Update</a>
										</td>
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
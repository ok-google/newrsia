<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<div class="header-block">
										<h3 class="title"> List Pelayanan </h3>
										<!-- <a href="/pelayanan/tambah" class="btn btn-primary btn-sm">Tambah</a> -->
									</div>
								</div>
								<div class="card-block">
									<section class="list-pelayanan">
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Tanggal MRS</th>
														<th>Nomor RM</th>
														<th>Nama</th>
														<th>Alamat</th>
														<th>Dokter</th>
														<th>Aksi</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="pelayanan" items="${pelayanans}">
														<tr>
															<td>${pelayanan.pendaftaranMrs}</td>
															<td>${pelayanan.pasien.pasienNorm}</td>
															<td>${pelayanan.pasien.pasienNama}</td>
															<td>${pelayanan.pasien.pasienAlamat}</td>
															<td>${pelayanan.pegawai.pegawaiNama}</td>
															<td>
																<a href="/pelayanan/update/${pelayanan.pendaftaranID}" class="btn btn-info rounded-0">Update</a>
																<a href="/pelayanan/delete/${pelayanan.pendaftaranID}" class="btn btn-warning rounded-0">Delete</a>
															</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
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
								</div>
							</div>
						</div>
					</div>
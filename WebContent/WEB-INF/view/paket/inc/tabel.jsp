<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<div class="header-block">
										<h3 class="title"> List Paket </h3>
										<a href="/paket/tambah" class="btn btn-sm btn-primary rounded-0">Tambah</a>
									</div>
								</div>
								<div class="card-block">
									<section class="list-paket">
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Nama Paket</th>
														<th>Kelas</th>
														<th>Keterangan</th>
														<th>Harga</th>
														<th>Jenis</th>
														<th>Aksi</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="paket" items="${paketan}">
														<tr>
															<td>${paket.paketNama}</td>
															<td>${paket.kelas.kelasNama}</td>
															<td>${paket.paketKeterangan}</td>
															<td>${paket.paketHarga}</td>
															<td>${paket.paketJenis}</td>
															<td>
																<a href="/paket/update/${paket.paketID}" class="btn btn-info rounded-0">Update</a>
																<a href="/paket/delete/${paket.paketID}" class="btn btn-warning rounded-0">Delete</a>
															</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										<div class="fixed-table-pagination" style="display: block; margin-top:25px">
										     <form action="" method="get">
										            <div class="pull-right pagination" style="margin-right: 20px;">
										                 ${links }
										            </div>
										      </form>
										</div>
									</section>
								</div>
							</div>
						</div>
					</div>
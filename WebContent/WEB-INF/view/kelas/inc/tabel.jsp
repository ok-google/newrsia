<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<div class="header-block">
										<h3 class="title"> List Data Kelas </h3>
									</div>
								</div>
								<div class="card-block">
									<section class="list-kelas">
										<div class="table-responsive">
											<table class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th>Kode</th>
														<th>Nama</th>
														<th>Keterangan</th>
														<th>Aksi</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="kelas" items="${kelases}">
														<tr>
															<td>${kelas.kelasKode}</td>
															<td>${kelas.kelasNama}</td>
															<td>${kelas.kelasKeterangan}</td>
															<td>
																<a href="/kelas/update/${kelas.kelasID}" class="btn btn-info rounded-0">Update</a>
																<a href="/kelas/delete/${kelas.kelasID}" class="btn btn-warning rounded-0">Delete</a>
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
									</section>
								</div>
							</div>
						</div>
					</div>
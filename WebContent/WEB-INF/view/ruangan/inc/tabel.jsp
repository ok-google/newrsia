<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
	<div class="col-md-12">
		<div class="card">
			<div class="card-header">
				<div class="header-block">
					<h3 class="title"> List Ruangan </h3>
					<a href="/ruangan/tambah" class="btn btn-primary btn-sm">Tambah</a>
				</div>
			</div>
			<div class="card-block">
				<section class="list-kelas">
					<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover">
							<thead>
								<tr>
									<th>Kode Ruangan</th>
									<th>Nama Ruangan</th>
									<th>Kelas Ruangan</th>
									<th>Penanggung Jawab</th>
									<th>Harga</th>
									<th>Aksi</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="temp" items="${ruangs}">
									<c:choose>
										<c:when test="${temp.ruangAktif  == 'Y' }">
											<tr>
												<td>${temp.ruangKode }</td>
												<td>${temp.ruangNama }</td>
												<td>${temp.kelas.kelasNama }</td>
												<td>${temp.ruangKepala }</td>
												<td>${temp.tarifSarana }</td>
												<td>
													<a href="ruangan/update/${temp.ruangID }" class="btn btn-info rounded-0">Update</a>
													<a href="ruangan/delete/${temp.ruangID }" class="btn btn-warning rounded-0">Delete</a>
												</td>
											</tr>
										</c:when>
									</c:choose>

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
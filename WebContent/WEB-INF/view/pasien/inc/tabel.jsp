<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table-responsive">
	<table class="table table-striped table-bordered table-hover table-sm">
		<thead>
			<tr>
				<th class="text-center">NO RM</th>
				<th class="text-center">Nama Pasien</th>
				<th class="text-center">Jenis Kelamin</th>
				<th class="text-center">Alamat</th>
				<th class="text-center">No Telp</th>
				<th class="text-center">Aksi</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="tempPasien" items="${pasiens}">
					<tr>
						<td> ${tempPasien.pasienNorm} </td>
						<td> ${tempPasien.pasienNama } </td>
						<td> ${tempPasien.pasienKelamin } </td> 
						<td> ${tempPasien.pasienAlamat } </td>
						<td> ${tempPasien.pasienNotelp } </td> 
						<td> 
							<a class="btn btn-warning btn-sm" href="/pasien/delete/${tempPasien.pasienID}">Delete</a>
							<a class="btn btn-info btn-sm" href="/pasien/update/${tempPasien.pasienID}">Update</a>
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
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="table-responsive">
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th>Nama Kamar</th>
				<th>Kelas</th>
				<th>Harga Total</th>
				<th>Jumlah Bed</th>
				<th>Jenis Layanan</th>
				<th>Aksi</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="temp" items="${kamar}">
				<c:choose>
					<c:when test="${temp.kamarAktif  == 'Y' }">
						<c:url var="updateLink" value="../form-update">
							<c:param name="Id" value="${temp.kamarID}" />
						</c:url>
						<c:url var="deleteLink" value="../delete">
							<c:param name="Id" value="${temp.kamarID}" />
						</c:url>

						<tr>
							<td>${temp.kamarNo }</td>
							<td>${temp.mKelasID }</td>
							<td>${temp.tarif }</td>
							<td>${temp.jumlahBed }</td>
							<td>${temp.jenisPelayanan }</td>
							<td><a href="${updateLink }" class="btn btn-info">Update</a>
								<a href="${deleteLink }" class="btn btn-warning">Delete</a>
							</td>
						</tr>
					</c:when>
				</c:choose>

			</c:forEach>
		</tbody>
	</table>
</div>
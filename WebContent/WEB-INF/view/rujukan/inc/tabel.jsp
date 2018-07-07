<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<table class="table table-striped table-bordered table-hover">
		<thead>
			<tr>
				<th>Jenis Rujukan</th>
				<th>Nama Rujukan</th>
				<th>Alamat</th>
				<th>Aksi</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="rujukan" items="${rujukans}">
				<tr>
					<td>${rujukan.rujukanJenis }</td>
					<td>${rujukan.rujukanNama }</td>
					<td>${rujukan.rujukanAlamat }</td>
					<td>
						<a href="/rujukan/update/${temp.ruangID }" class="btn btn-info rounded-0">Update</a>
						<a href="/rujukan/delete/${temp.ruangID }" class="btn btn-warning rounded-0">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
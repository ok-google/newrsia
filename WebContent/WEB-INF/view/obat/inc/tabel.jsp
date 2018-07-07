<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Kode</th>
				<th>Nama</th>
				<th>Volume</th>
				<th>Volume Satuan</th>
				<th>Keterangan</th>
				<th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="obat" items="${obats}">
            <tr>
              <td>${obat.obat_kode}</td>
					<td>${obat.obat_nama}</td>
					<td>${obat.obat_volume}</td>
					<td>${obat.obat_volume_satuan}</td>
					<td>${obat.obat_keterangan}</td>
					<td>
						<a href="/obat/update/${obat.obat_id}" class="btn btn-info">Update</a>
						<a href="/obat/delete/${obat.obat_id}" class="btn btn-warning">Delete</a>
					</td>
				</tr>
			</c:forEach>
    </tbody>
</table>
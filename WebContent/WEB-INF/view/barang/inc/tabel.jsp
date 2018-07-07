<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<table class="table table-sm table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th>Kode</th>
			<th>Nama Barang</th>
			<th>Jenis Barang</th>
			<th>Satuan Default</th>
			<th>Profit</th>
			<th>Harga HET(Rp)</th>
			<th>Harga Jual(Rp)</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="tempBarang" items="${result}">
            <tr>
              <td> ${tempBarang.barangKode } </td>
              <td> ${tempBarang.barangNama } </td>
              <td> ${tempBarang.barangJenis } </td>
              <td> ${tempBarang.barangSatuanNama } </td>
              <td> ${tempBarang.barangProfit } </td>
              <td> ${tempBarang.barangHet } </td>
              <%--<td> ${tempBarang.HargaJual } </td>--%>
              <td> <a href="/barang/update/${tempBarang.barangId}" class="btn btn-info">Update</a>
               <a href="/barang/delete/${tempBarang.barangId}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
	</tbody>
</table>
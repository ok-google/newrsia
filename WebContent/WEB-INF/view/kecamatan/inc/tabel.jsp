<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Kode Kecamatan</th>
            <th>Nama Kecamatan</th>
            <th>Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempKecamatan" items="${kecamatan}">
            <tr>
              <td> ${tempKecamatan.kecamatanKode } </td>
              <td> ${tempKecamatan.kecamatanNama } </td>
              <td>  </td>
              <td> <a href="/kecamatan/update/${tempKecamatan.kecamatan_id}" class="btn btn-info rounded-0">Update</a>
               <a href="/kecamatan/delete/${tempKecamatan.kecamatan_id}" class="btn btn-warning rounded-0">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Pasien Norm</th>
            <th>Tanggal Resep</th>
            <th>Status</th>
            <th>Nama Pasien</th>
            <th>Alamat Pasien</th>
            <th>Nama Dokter</th>
            <th>Nomer Resep</th>
            <th>Resep Data</th>
            <th>Resep Unit Nama</th>
            <th>Resep Dimension</th>
            <th>Ruangan</th>
            <th>Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempresep" items="${resep}">
            <tr>
              <td> ${tempresep.resepNo } </td>
              <td> ${tempresep.resepTanggal } </td>
              <td> ${tempresep.resepStatus } </td>
              <td> ${tempresep.resepPasienNama } </td>
              <td> ${tempresep.resepPasienAlamat } </td>
              <td> ${tempresep.resepDokterNama } </td>
              <td> ${tempresep.resepNo } </td>
              <td> ${tempresep.resepData } </td>
              <td> ${tempresep.resepUnitNama } </td>
              <td> ${tempresep.resepDimension } </td>
              <td> ${tempresep.resepRuangNama } </td>
              <td> ${tempresep.resepKeterangan } </td>
              <td> <a href="/resep/update/${tempresep.resepID}" class="btn btn-info">Update</a>
               <a href="/resep/delete/${tempresep.resepID}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
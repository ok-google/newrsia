<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Pegawai No</th>
            <th>Nama</th>
            <th>Jabatan</th>
            <th>Jenis Kelamin</th>
            <th>Fungsional</th>
            <th>Medis</th>
            <th>Email</th>
            <th>No Hp</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="tempPegawai" items="${pegawais}">
           	<tr>
           		<td> ${tempPegawai.pegawaiNo } </td>
           		<td> ${tempPegawai.pegawaiNama } </td>
           		<td> ${tempPegawai.pegawaiJabatanNama } </td>
           		<td> ${tempPegawai.pegawaiKelamin } </td>
           		<td> ${tempPegawai.pegawaiFungsional } </td>
           		<td> ${tempPegawai.pegawaiMedis } </td>
           		<td> ${tempPegawai.pegawaiEmail } </td>
           		<td> ${tempPegawai.pegawaiNoHp } </td>
           		<td> <a href="/pegawai/update/${tempPegawai.pegawaiID}" class="btn btn-info">Update</a>
           		 <a href="/pegawai/delete/${tempPegawai.pegawaiID}" class="btn btn-warning">Delete</a></td>
           	</tr>
        
        </c:forEach>
    </tbody>
</table>
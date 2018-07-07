<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Nama Depo</th>
            <th>Nama Obat</th>
            <th>Nama Satuan</th>
            <th>Kadaluarsa</th>
            <th>Jumlah</th>
            <th>Tanggal Terima</th>
            <th>Tanggal Opname</th>
            <th>Stok Obat Hpp</th>
            <th>Nomer Terima</th>
            <th>Nomer opname</th>
            <th>Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempstokobat" items="${stokobat}">
            <tr>
              <td> ${tempstokobat.stokObatDepoNama } </td>
              <td> ${tempstokobat.stokObatBarangNama } </td>
              <td> ${tempstokobat.stokObatStuanNama } </td>
              <td> ${tempstokobat.stokObatKadaluarsa } </td>
              <td> ${tempstokobat.stokObatJumlah } </td>
              <td> ${tempstokobat.stokObatTerimaTanggal } </td>
              <td> ${tempstokobat.stokObatOpnameTanggal } </td>
              <td> ${tempstokobat.stokObatTerimaNo } </td>
              <td> ${tempstokobat.stokObatOpnameNo } </td>
              <td> ${tempstokobat.stokObatKeterangan } </td>
              <td> <a href="/stokobat/update/${tempstokobat.stokobat_id}" class="btn btn-info">Update</a>
               <a href="/stokobat/delete/${tempstokobat.stokobat_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Nama Barang</th>
            <th>Jumlah Barang</th>
            <th>Jenis Barang</th>
            <th>Tanggal</th>
            <th>Perusahaan Barang</th>
            <th>Stok Awal</th>
            <th>Stok Akhir</th>
            <th>Barang Masuk</th>
            <th>Barang Keluar</th>
            <th>Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempbarangtrans" items="${barangtrans}">
            <tr>
              <td> ${tempbarangtrans.barangTransBarangNama } </td>
              <td> ${tempbarangtrans.barangTransJumlah } </td>
              <td> ${tempbarangtrans.barangTransJenis } </td>
              <td> ${tempbarangtrans.barangTransTanggal } </td>
              <td> ${tempbarangtrans.barangTransPerusahaanNama } </td>
              <td> ${tempbarangtrans.barangTransStokAwal } </td>
              <td> ${tempbarangtrans.barangTransStokAkhir } </td>
              <td> ${tempbarangtrans.barangTransMasuk } </td>
              <td> ${tempbarangtrans.barangTransKeluar } </td>
              <td> <a href="/barangtrans/update/${tempbarangtrans.barangtrans_id}" class="btn btn-info">Update</a>
               <a href="/barangtrans/delete/${tempbarangtrans.barangtrans_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th valign="middle">No</th>
            <th valign="middle">Tanggal</th>
            <th valign="middle">Jatuh Tempo</th>
            <th valign="middle">Perusahaan</th>
            <th valign="middle">Diskon</th>
            <th valign="middle">Cashback</th>
            <th valign="middle">Total Order</th>
            <th valign="middle">Jumlah Bayar</th>
            <th valign="middle">Jenis Barang</th>
            <th valign="middle">TTD Nama</th>
            <th valign="middle">Jabatan</th>
            <th valign="middle">Status Order</th>
            <th valign="middle">Order Group</th>
            <th valign="middle">Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody id="order-list" class="table-form">
         <c:forEach var="temporder" items="${order}">
            <tr>
              <td> ${temporder.orderNomer } </td>
              <td> ${temporder.orderTanggal } </td>
              <td> ${temporder.orderJatuhTempo } </td>
              <td> ${temporder.orderPerusahaan } </td>
              <td> ${temporder.orderDiskon } </td>
              <td> ${temporder.orderCashback } </td>
              <td> ${temporder.orderTotal } </td>
              <td> ${temporder.orderJumlahBayar } </td>
              <td> ${temporder.orderBarangJenis } </td>
              <td> ${temporder.orderTtdNama } </td>
              <td> ${temporder.orderTtdJabatanNama } </td>
              <td> ${temporder.orderStatus } </td>
              <td> ${temporder.orderGroup } </td>
              <td> ${temporder.orderKeterangan } </td>
              <td> <a href="/order/update/${temporder.order_id}" class="btn btn-info">Update</a>
               <a href="/order/delete/${temporder.order_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
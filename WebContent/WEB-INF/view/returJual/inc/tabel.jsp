<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>No</th>
            <th>Tanggal</th>
            <th>Returjual</th>
            <th>Pasien Norm</th>
            <th>Nama Pasien</th>
            <th>Alamat Pasien</th>
            <th>Jenis Pasien</th>
            <th>Diskon</th>
            <th>Cashback</th>
            <th>Total</th>
            <th>Jual Status</th>
            <th>Jumlah Bayar</th>
            <th>Status</th>
            <th>Total Bulat</th>
            <th>Pembayar</th>
            <th>Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempreturjual" items="${returjual}">
            <tr>
              <td> ${tempreturjual.returJualNo } </td>
              <td> ${tempreturjual.returJualTanggal } </td>
              <td> ${tempreturjual.returJualJual } </td>
              <td> ${tempreturjual.returJualPasienNorm } </td>
              <td> ${tempreturjual.returJualPasienNama } </td>
              <td> ${tempreturjual.returJualPasienAlamat } </td>
              <td> ${tempreturjual.returJualJenisPasienNama } </td>
              <td> ${tempreturjual.returJualDiskon } </td>
              <td> ${tempreturjual.returJualCashback } </td>
              <td> ${tempreturjual.returJualTotal } </td>
              <td> ${tempreturjual.returJualBayarStatus } </td>
              <td> ${tempreturjual.returJualBayarJumlah } </td>
              <td> ${tempreturjual.returJualTotalBulat } </td>
              <td> ${tempreturjual.returJualBayarNama } </td>
              <td> ${tempreturjual.returJualKeterangan } </td>
              <td> <a href="/returjual/update/${tempreturjual.returjual_id}" class="btn btn-info">Update</a>
               <a href="/returjual/delete/${tempreturjual.returjual_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
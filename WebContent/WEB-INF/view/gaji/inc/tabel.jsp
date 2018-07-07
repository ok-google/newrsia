<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th style="font-size: 14px;">No Gaji</th>
            <th style="font-size: 14px;">Tanggal Bayar Gaji</th>
            <th style="font-size: 14px;">Gaji Bulanan</th>
            <th style="font-size: 14px;">Gaji Tahunan</th>
            <th style="font-size: 14px;">Gaji Pokok</th>
            <th style="font-size: 14px;">Pendapatan Gaji</th>
            <th style="font-size: 14px;">Bonus Gaji</th>
            <th style="font-size: 14px;">Keterangan</th>
            <th colspan="2" style="font-size: 14px;">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempgaji" items="${gaji}">
            <tr>
              <td style="font-size: 12px;"> ${tempgaji.gajiNo } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiTglBayar } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiBulan } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiTahun } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiPokok } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiPendapatan } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiBonus } </td>
              <td style="font-size: 12px;"> ${tempgaji.gajiKeterangan } </td>
              <td style="font-size: 12px;"> <a href="/gaji/update/${tempgaji.gaji_id}" class="btn btn-info">Update</a>
               <a href="/gaji/delete/${tempgaji.gaji_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
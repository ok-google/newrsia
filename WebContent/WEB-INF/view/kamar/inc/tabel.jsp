<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th>Nama Kamar</th>
            <th>Kelas</th>
            <th>Harga Total</th>
            <th>Jumlah Bed</th>
            <th>Jenis Layanan</th>
            <th>Aksi</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="kamar" items="${kamars}">
            <tr>
                <td>${kamar.kamarNo }</td>
                <td>${kamar.kelas.kelasNama }</td>
                <td>${kamar.tarif }</td>
                <td>${kamar.jumlahBed }</td>
                <td>${kamar.jenisPelayanan }</td>
                <td><a href="/kamar/update/${kamar.kamarID}" class="btn btn-info">Update</a>
                    <a href="/kamar/delete/${kamar.kamarID}" class="btn btn-warning">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<div class="fixed-table-pagination" style="display: block; margin-top:25px">
     <form action="" method="get">
            <div class="pull-right pagination" style="margin-right: 20px;">
                 ${link }
            </div>
      </form>
</div>
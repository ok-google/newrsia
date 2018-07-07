<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th valign="middle">Nama Perusahaan</th>
            <th valign="middle">Kode Perusahaan</th>
            <th valign="middle">Alamat Perusahaan</th>
            <th valign="middle">Telepon Perusahaan</th>
            <th valign="middle">Fax Perusahaan</th>
            <th valign="middle">Email Perusahaan</th>
            <th valign="middle">Bidang Perusahaan</th>
            <th valign="middle">Contact Person</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempResult" items="${result}">
            <tr>
            <c:url var="updateLink" value="form-update">
           		<c:param name="perusahaanId" value="${tempResult.perusahaan_id}" />
           	</c:url>
           	<c:url var="deleteLink" value="delete">
           		<c:param name="perusahaanId" value="${tempResult.perusahaan_id}" />
           	</c:url>
              <td> ${tempResult.perusahaanNama } </td>
              <td> ${tempResult.perusahaanKode } </td>
              <td> ${tempResult.perusahaanAlamat } </td>
              <td> ${tempResult.perusahaanNoTelp } </td>
              <td> ${tempResult.perusahaanFax } </td>
              <td> ${tempResult.perusahaanEmail } </td>
              <td> ${tempResult.perusahaanBidang } </td>
              <td> ${tempResult.perusahaanContactPerson } </td>
              <td> <a href="${updateLink }" class="btn btn-info">Update</a>
               <a href="${updateLink }" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th valign="middle">Nama Kategori</th>
            <th valign="middle">Kode Kategori</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempResult" items="${result}">
            <tr>
            <c:url var="updateLink" value="form-update">
           		<c:param name="perusahaanKategoriId" value="${tempResult.perusahaanKategoriId}" />
           	</c:url>
           	<c:url var="deleteLink" value="delete">
           		<c:param name="perusahaanKategoriId" value="${tempResult.perusahaanKategoriId}" />
           	</c:url>
              <td> ${tempResult.perusahaanKategoriNama } </td>
              <td> ${tempResult.perusahaanKategoriKode } </td>
              <td> <a href="${updateLink }" class="btn btn-info">Update</a>
               <a href="${updateLink }" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
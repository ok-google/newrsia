<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table class="table table-striped table-bordered table-hover">
    <thead>
        <tr>
            <th valign="middle">No</th>
            <th valign="middle">Tanggal</th>
            <th valign="middle">Depo</th>
            <th valign="middle">Group</th>
            <th valign="middle">Status</th>
            <th valign="middle">Keterangan</th>
            <th colspan="2">Action</th>
        </tr>
    </thead>
    <tbody>
         <c:forEach var="tempOpname" items="${opname}">
            <tr>
              <td> ${tempOpname.opnameNo } </td>
              <td> ${tempOpname.opnameTanggal } </td>
              <td> ${tempOpname.opnameDepoNama } </td>
              <td> ${tempOpname.opnameGroup } </td>
              <td> ${tempOpname.opnameKeterangan } </td>
              <td> <a href="/opname/update/${tempOpname.order_id}" class="btn btn-info">Update</a>
               <a href="/opname/delete/${tempOpname.order_id}" class="btn btn-warning">Delete</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
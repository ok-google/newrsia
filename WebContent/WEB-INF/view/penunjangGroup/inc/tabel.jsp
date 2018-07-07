<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<div class="card">
		<div class="table-responsive">
			<table class="table table-striped table-bordered table-hover table-sm">
				<thead>
					<tr>
						<th>Nama Penunjang</th>
						<th>Bentuk Laporan</th>
						<th>Aksi</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="penunjangGroup" items="${penunjangGroups}">
						<tr>
							<td>${penunjangGroup.pmedisgroupDetail}</td>
							<td>${penunjangGroup.pmedisgroupMaster}</td>
							<td>
								<a href="/penunjang-group/update/${penunjangGroup.pmedisgroupID}" class="btn btn-info rounded-0 btn-sm">Update</a>
								<a href="/penunjang-group/delete/${penunjangGroup.pmedisgroupID}" class="btn btn-warning rounded-0 btn-sm">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
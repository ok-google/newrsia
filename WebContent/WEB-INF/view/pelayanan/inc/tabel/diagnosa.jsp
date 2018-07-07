<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tanggal</th>
                                    <th>Nama Diagnosa</th>
                                    <th>Jenis Diagnosa</th>
                                    <th>Kasus</th>
                                    <th>Keterangan</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-diagnosapasien-list" class="table-form">
                            	<c:forEach var="dp" items="${pelayananModel.diagnosapasien}" varStatus="loop">
									<tr id="diagnosapasien_${loop.index+1}">
                                            <td data-used="1" data-save="1" data-name="diagnosapasienTanggal" data-kolom-id="diagnosapasienTanggal"><fmt:formatDate value="${dp.diagnosapasienTanggal}" pattern="yyyy-MM-dd HH:mm" /></td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasienNamaDiagnosa" data-kolom-id="diagnosapasienNamaDiagnosa">${dp.diagnosapasienNamaDiagnosa}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasienJenis" data-kolom-id="diagnosapasienJenis">${dp.diagnosapasienJenis}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasienKasus" data-kolom-id="diagnosapasienKasus">${dp.diagnosapasienKasus}</td>
                                            <td data-used="1" data-save="1" data-name="diagnosapasienKeterangan" data-kolom-id="diagnosapasienKeterangan">${dp.diagnosapasienKeterangan}</td>
                                            <td>
									        <button type="button" class="btn btn-danger btn-sm" onclick="deleteDiagnosapasien(${loop.index+1})">Delete</button>&nbsp;
									        <button type="button" class="btn btn-primary btn-sm" onclick="editDiagnosapasien(${loop.index+1})">Edit</button>
									    </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="diagnosapasienID" data-kolom-id="diagnosapasienID">${dp.diagnosapasienID}</td>
									</tr>
								</c:forEach>

                            </tbody>
                        </table>
                    </div>
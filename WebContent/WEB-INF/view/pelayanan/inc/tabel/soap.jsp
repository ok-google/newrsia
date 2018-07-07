<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Tanggal</th>
                                    <th>Subject (Keluhan)</th>
                                    <th>Object (Pemeriksaaan)</th>
                                    <th>Assesment (Kesimpulan)</th>
                                    <th>Plan (Perencanaan)</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-soap-list" class="table-form">
                            	<c:forEach var="soap" items="${pelayananModel.soap}" varStatus="loop">
									<tr id="soap_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="soapTanggal" data-kolom-id="soapTanggal">${soap.soapTanggal}</td>
										<td data-used="1" data-save="1" data-name="soapSubject" data-kolom-id="soapSubject">${soap.soapSubject}</td>
										<td data-used="1" data-save="1" data-name="soapObject" data-kolom-id="soapObject">${soap.soapObject}</td>
										<td data-used="1" data-save="1" data-name="soapAssesment" data-kolom-id="soapAssesment">${soap.soapAssesment}</td>
										<td data-used="1" data-save="1" data-name="soapPlan" data-kolom-id="soapPlan">${soap.soapPlan}</td>
										<td> <button type="button" class="btn btn-danger btn-sm" onclick="deleteSoap(${loop.index+1})">Delete</button>&nbsp;<button type="button" class="btn btn-primary btn-sm" onclick="editSoap(${loop.index+1})">Edit</button></td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="soapID" data-kolom-id="soapID">${soap.soapID}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>
                    </div>
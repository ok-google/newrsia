<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Barang</th>
                                    <th>Satuan</th>
                                    <th>Jumlah</th>
                                    <th>Aturan Pakai</th>
                                    <th>Keterangan</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-resep-list" class="table-form">
                            	<c:forEach var="rsp" items="${pelayananModel.resep}" varStatus="loop">
									<tr id="resep_${loop.index+1}">
										<td>${rsp.resep.resepNo}</td>
										<td data-used="1" data-save="1" data-name="resepSatuan" data-kolom-id="resepSatuan">${rsp.resepDimension}</td>
										<td data-used="1" data-save="1" data-name="resepJumlah" data-kolom-id="resepJumlah">${rsp.resepJumlah}</td>
										<td data-used="1" data-save="1" data-name="resepAturan" data-kolom-id="resepAturan">${rsp.resepAturan}</td>
										<td data-used="1" data-save="1" data-name="resepKeterangan" data-kolom-id="resepKeterangan">${rsp.resepKeterangan}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteResep(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editResep(${loop.index+1})">Edit</button>
										</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="resepBarang" data-kolom-id="resepBarang">${rsp.resep.resepNo}</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="resepID" data-kolom-id="resepID">${rsp.pakaiID}</td>

									</tr>
								</c:forEach>
                            </tbody>
                        </table>
                    </div>
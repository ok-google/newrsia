<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Barang</th>
                                    <th>Dosis</th>
                                    <th>Jumlah</th>
                                    <th>Harga</th>
                                    <th>Sub Total</th>
                                    <th>Keterangan</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-pakai-list" class="table-form">
                            	<c:forEach var="trp" items="${pelayananModel.terapi}" varStatus="loop">
									<tr id="pakai_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="pakaiBarang" data-kolom-id="pakaiBarang"><% /**${trp.barang.NamaBarang} **/ %></td> 
										<td data-used="1" data-save="1" data-name="pakaiSatuan" data-kolom-id="pakaiSatuan">${trp.terapiDosis}</td>
										<td data-used="1" data-save="1" data-name="pakaiJumlah" data-kolom-id="pakaiJumlah">${trp.terapiJumlah}</td>
										<td data-used="1" data-save="1" data-name="pakaiHarga" data-kolom-id="pakaiHarga">${trp.terapiHarga}</td>
										<td data-used="1" data-save="1" data-name="pakaiSubtotal" data-kolom-id="pakaiSubtotal">${trp.terapiJumlah*p.pakaiHarga}</td>
										<td data-used="1" data-save="1" data-name="pakaiKeterangan" data-kolom-id="pakaiKeterangan">${trp.terapiKeterangan}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deletePakai(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editPakai(${loop.index+1})">Edit</button>
										</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="pakaiID" data-kolom-id="pakaiID">${trp.terapiID}</td>
									</tr>
								</c:forEach>
                            </tbody>
                        </table>
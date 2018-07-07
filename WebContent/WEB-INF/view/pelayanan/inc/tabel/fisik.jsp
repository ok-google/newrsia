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
									<th>Tinggi</th>
									<th>Berat</th>
									<th>Detak Jantung</th>
									<th>Tekanan Darah</th>
									<th>Suhu</th>
									<th>Nafas</th>
									<th>Keluhan</th>
									<th>Pemeriksa</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody id="pelayanan-riwayatperiksa-list" class="table-form">
								<c:forEach var="rp" items="${pelayananModel.riwayatperiksa}" varStatus="loop">
									<tr id="riwayatperiksa_${loop.index+1}">
										<td data-used="1" data-save="1" data-name="periksaTanggal" data-kolom-id="periksaTanggal"><fmt:formatDate value="${rp.periksaTanggal}" pattern="yyyy-MM-dd HH:mm" /></td>
										<td data-used="1" data-save="1" data-name="periksaTb" data-kolom-id="periksaTb">${rp.periksaTb}</td>
										<td data-used="1" data-save="1" data-name="periksaBb" data-kolom-id="periksaBb">${rp.periksaBb}</td>
										<td data-used="1" data-save="1" data-name="periksaJantung" data-kolom-id="periksaJantung">${rp.periksaJantung}</td>
										<td data-used="1" data-save="1" data-name="periksaTensi" data-kolom-id="periksaTensi">${rp.periksaTensi}</td>
										<td data-used="1" data-save="1" data-name="periksaSuhu" data-kolom-id="periksaSuhu">${rp.periksaSuhu}</td>
										<td data-used="1" data-save="1" data-name="periksaNafas" data-kolom-id="periksaNafas">${rp.periksaNafas}</td>
										<td data-used="1" data-save="1" data-name="periksaKeluhan" data-kolom-id="periksaKeluhan">${rp.periksaKeluhan}</td>
										<td>${rp.pegawai.pegawaiNama}</td>
										<td>
											<button type="button" class="btn btn-danger btn-sm" onclick="deleteRiwayatperiksa(${loop.index+1})">Delete</button>
											<button type="button" class="btn btn-primary btn-sm" onclick="editRiwayatperiksa(${loop.index+1})">Edit</button>
										</td>
										<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="pegawai">${rp.pegawai.pegawaiID}</td>
										<td style="display:none" data-used="1" data-save="1" data-name="periksaID" data-kolom-id="periksaID">${rp.periksaID}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
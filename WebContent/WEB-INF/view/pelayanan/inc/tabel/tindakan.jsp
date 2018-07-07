<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-hover">
            <thead>
                <tr>
                    <th>Nama Tindakan</th>
                    <th>Harga</th>
                    <th>Pelaksana</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody id="pelayanan-tindakan-list" class="table-form">
            	<c:choose>
            		<c:when test="${paket.paketDetail != null && empty pelayananModel.tindakanpasien}">
            			<c:set var = "itemIndex" value = "${0}"/>
						<c:forEach var="tp" items="${paket.paketDetail}" varStatus="loop">
							<c:if test="${tp.paketDetailType=='tindakan'}" >
								<c:set var = "itemIndex" value = "${itemIndex+1}"/>
								<tr id="tindakan_${itemIndex}">
									<td>${tp.tindakans.tindakanNama}</td>
									<td data-used="1" data-save="1" data-name="tindakanpasienHarga" data-kolom-id="tindakanpasienHarga">${tp.tindakans.tindakanHarga}</td>
									<td></td>
									<td>
										<button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan(${itemIndex})">Delete</button>
										<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan(${itemIndex})">Edit</button>
									</td>
									<td style="display:none" data-used="1" data-save="1" data-name="tindakan.tindakanID" data-kolom-id="tindakanID">${tp.tindakans.tindakanID}</td>
								</tr>
							</c:if>
						</c:forEach>
            		</c:when>
            		<c:otherwise>
						<c:forEach var="tp" items="${pelayananModel.tindakanpasien}" varStatus="loop">
							<tr id="tindakan_${loop.index+1}">
								<td>${tp.tindakan.tindakanNama}</td>
								<td data-used="1" data-save="1" data-name="tindakanpasienHarga" data-kolom-id="tindakanpasienHarga">${tp.tindakanpasienHarga}</td>
								<td>${tp.pegawai.pegawaiNama}</td>
								<td>
									<button type="button" class="btn btn-danger btn-sm" onclick="deleteTindakan(${loop.index+1})">Delete</button>
									<button type="button" class="btn btn-primary btn-sm" onclick="editTindakan(${loop.index+1})">Edit</button>
								</td>
								<td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="tindakanPegawaiID">${tp.pegawai.pegawaiID}</td>
								<td style="display:none" data-used="1" data-save="1" data-name="tindakan.tindakanID" data-kolom-id="tindakanID">${tp.tindakan.tindakanID}</td>
								<td style="display:none" data-used="1" data-save="1" data-name="tindakanpasienID" data-kolom-id="tindakanpasienID">${tp.tindakanpasienID}</td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
            </tbody>
        </table>
    </div>
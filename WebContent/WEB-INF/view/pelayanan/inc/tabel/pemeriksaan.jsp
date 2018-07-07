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
                                    <th>Nama Pemeriksaan</th>
                                    <th>Standar</th>
                                    <th>Nilai</th>
                                    <th>Dokter</th>
                                    <th>Keterangan</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody id="pelayanan-periksapasien-list" class="table-form">
                                <c:forEach var="pp" items="${pelayananModel.periksapasien}" varStatus="loop">
                                    <tr id="periksapasien_${loop.index+1}">
                                            <td data-used="1" data-save="1" data-name="periksapasienTanggal" data-kolom-id="periksapasienTanggal"><fmt:formatDate value="${pp.periksapasienTanggal}" pattern="yyyy-MM-dd HH:mm" /></td>
                                            <td data-used="1" data-save="1" data-name="periksapasienPeriksaNama" data-kolom-id="periksapasienPeriksaNama">${pp.periksapasienPeriksaNama}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasienPeriksaStandar" data-kolom-id="periksapasienPeriksaStandar">${pp.periksapasienPeriksaStandar}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasienPeriksaNilai" data-kolom-id="periksapasienPeriksaNilai">${pp.periksapasienPeriksaNilai}</td>
                                            <td>${pp.pegawai.pegawaiNama}</td>
                                            <td data-used="1" data-save="1" data-name="periksapasienPeriksaKeterangan" data-kolom-id="periksapasienPeriksaKeterangan">${pp.periksapasienPeriksaKeterangan}</td>
                                        <td>
                                            <button type="button" class="btn btn-danger btn-sm" onclick="deletePeriksapasien(${loop.index+1})">Delete</button>
                                            <button type="button" class="btn btn-primary btn-sm" onclick="editPeriksapasien(${loop.index+1})">Edit</button>
                                        </td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="pegawai.pegawaiID" data-kolom-id="periksaPegawaiID">${pp.pegawai.pegawaiID}</td>
                                        <td style="display:none" data-used="1" data-save="1" data-name="periksapasienID" data-kolom-id="periksapasienID">${pp.periksapasienID}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
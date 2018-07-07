<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <div class="modal fade" id="modal-pelayanan-periksapasien">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Pemeriksaan</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-periksapasien" class="from-horizontal">
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="periksapasienTanggal" id="periksapasienTanggal" class="form-control boxed datetimepicker">
                            </div>
                            <div class="form-group">
                                <label>Nama Pemeriksaan</label>
                                <div class="select2-wrapper">
                                    <select name="periksapasienPeriksaID" id="periksapasienPeriksaID" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Pemeriksaan ---</option>
                                        <c:forEach var="pr" items="${params}">
                                            <option value="${pr.paramperiksaID }">
                                                ${pr.paramperiksaNama }
                                            </option>   
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Standar</label>
                                <input type="text" name="periksapasienPeriksaStandar" id="periksapasienPeriksaStandar" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nilai</label>
                                <input type="text" name="periksapasienPeriksaNilai" id="periksapasienPeriksaNilai" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Dokter</label>
                                <div class="select2-wrapper">
                                    <select name="pegawai.pegawaiID" id="periksaPegawaiID" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Dokter ---</option>
                                        <c:forEach var="pegawai" items="${pegawais}">
                                            <option value="${pegawai.pegawaiID }">
                                                ${pegawai.pegawaiNama }
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="periksapasienPeriksaKeterangan" id="periksapasienPeriksaKeterangan" class="form-control boxed">
                            </div>
                            <input type="hidden" name="periksapasienID" id="periksapasienID">
                            <input type="hidden" name="periksapasien_mode" id="periksapasien_mode">
                            <input type="hidden" name="periksapasien_edit" id="periksapasien_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-periksapasien" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
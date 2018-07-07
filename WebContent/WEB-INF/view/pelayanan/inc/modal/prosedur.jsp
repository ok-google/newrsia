<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-diagnosa9">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Prosedur Pasien</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-diagnosa9" class="from-horizontal">
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="diagnosa9_tanggal" id="diagnosa9Tanggal" class="form-control boxed datetimepicker">
                            </div>
                            <div class="form-group">
                                <div class="select2-wrapper">
                                    <select name="icd9" id="icd9" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Diagnosa ---</option>
                                        <c:forEach var="icd9" items="${icd9s}">
                                            <option value="${icd9.icd9ID }" date-kode="${icd9.icd9Kode }">
                                                ${icd9.icd9Nama }
                                            </option>   
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="diagnosa9Keterangan" id="diagnosa9Keterangan" class="form-control boxed">
                            </div>
                            <input type="hidden" name="diagnosa9ID" id="diagnosa9ID">
                            <input type="hidden" name="diagnosa9_mode" id="diagnosa9_mode">
                            <input type="hidden" name="diagnosa9_edit" id="diagnosa9_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-diagnosa9" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <div class="modal fade" id="modal-pelayanan-diagnosapasien">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Diagnosa Pasien</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-diagnosapasien" class="from-horizontal">
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="diagnosapasienTanggal" id="diagnosapasienTanggal" class="form-control boxed datetimepicker">
                            </div>
                            <div class="form-group">
                                <label>Nama Diagnosa</label>
                                <input type="text" name="diagnosapasienNamaDiagnosa" id="diagnosapasienNamaDiagnosa" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Jenis Diagnosa</label>
                                <select name="diagnosapasienJenis" id="diagnosapasienJenis" class="form-control boxed">
                                    <option>UTAMA</option>
                                    <option>SEKUNDER</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Kasus</label>
                                <select name="diagnosapasienKasus" id="diagnosapasienKasus" class="form-control boxed">
                                    <option>LAMA</option>
                                    <option>BARU</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="diagnosapasienKeterangan" id="diagnosapasienKeterangan" class="form-control boxed">
                            </div>
                            <input type="hidden" name="diagnosapasienID" id="diagnosapasienID">
                            <input type="hidden" name="diagnosapasien_mode" id="diagnosapasien_mode">
                            <input type="hidden" name="diagnosapasien_edit" id="diagnosapasien_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-diagnosapasien" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
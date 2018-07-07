<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-soap">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah SOAP</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-soap" class="from-horizontal">
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="soapTanggal" id="soapTanggal" class="form-control boxed datetimepicker">
                            </div>
                            <div class="form-group">
                                <label>Subject</label>
                                <input type="text" name="soapSubject" id="soapSubject" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Obejct</label>
                                <input type="text" name="soapObject" id="soapObject" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Kesimpulan</label>
                                <input type="text" name="soapAssesment" id="soapAssesment" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Rencana</label>
                                <input type="text" name="soapPlan" id="soapPlan" class="form-control boxed">
                            </div>
                            <input type="hidden" name="soapID" id="soapID">
                            <input type="hidden" name="soap_mode" id="soap_mode">
                            <input type="hidden" name="soap_edit" id="soap_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-soap" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
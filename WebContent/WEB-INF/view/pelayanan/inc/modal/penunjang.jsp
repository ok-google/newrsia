<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-penunjangtrans">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Penunjang Medis</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-penunjangtrans" class="from-horizontal">
                            <div class="form-group">
                                <label>Penunjang medis</label>
                                <div class="select2-wrapper">
                                    <select name="penunjangMedis" id="penunjangMedis" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Penunjang ---</option>
                                        <c:forEach var="pnj" items="${penunjangs}">
                                            <option value="${pnj.penunjangmedisID }" 
                                                    data-standar="${pnj.paramperiksa[0].paramperiksaStandar}" 
                                                    data-satuan="${pnj.paramperiksa[0].paramperiksaSatuan}" 
                                                    data-harga="${pnj.penunjangkelas[0].penunjangkelasHarga}">
                                                ${pnj.penunjangmedisNama }
                                            </option>   
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Hasil</label>
                                <input type="text" name="penunjangtransHasil" id="penunjangtransHasil" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nilai Normal</label>
                                <input type="text" name="penunjangtransStandar" id="penunjangtransStandar" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Satuan</label>
                                <input type="text" name="penunjangtransSatuan" id="penunjangtransSatuan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Jumlah</label>
                                <input type="text" name="penunjangtransJumlah" id="penunjangtransJumlah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Harga</label>
                                <input type="text" name="penunjangtransHarga" id="penunjangtransHarga" class="form-control boxed">
                            </div>
                            <input type="hidden" name="penunjangtransID" id="penunjangtransID">
                            <input type="hidden" name="penunjangtrans_mode" id="penunjangtrans_mode">
                            <input type="hidden" name="penunjangtrans_edit" id="penunjangtrans_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-penunjangtrans" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
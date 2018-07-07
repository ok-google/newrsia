<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <div class="modal fade" id="modal-pelayanan-pakai">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Tambah Fisik</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">X</span>
                            <span class="sr-only">Close</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form id="form-pelayanan-pakai" class="from-horizontal">
                            <div class="form-group">
                                <label>Barang</label>
                                <div class="select2-wrapper">
                                    <select name="pakaiBarang" id="pakaiBarang" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Barang ---</option>
                                        <% /**<c:forEach var="barang" items="${barangs}">
                                            <option value="${barang.IdBarang }">
                                                ${barang.NamaBarang }
                                            </option>
                                        </c:forEach>
                                        **/ %>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Satuan</label>
                                <div class="select2-wrapper">
                                    <select name="pakaiSatuan" id="pakaiSatuan" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Satuan ---</option>
                                        <c:forEach var="satuan" items="${satuans}">
                                            <option value="${satuan.satuanID }">
                                                ${satuan.satuanNama }
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <label>Jumlah</label>
                                <input type="text" name="pakaiJumlah" id="pakaiJumlah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Harga</label>
                                <input type="text" name="pakaiHarga" id="pakaiHarga" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Sub Total</label>
                                <input type="text" name="pakaiSubtotal" id="pakaiSubtotal" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keterangan</label>
                                <input type="text" name="pakaiKeterangan" id="pakaiKeterangan" class="form-control boxed">
                            </div>
                            <input type="hidden" name="pakaiID" id="pakaiID">
                            <input type="hidden" name="pakai_mode" id="pakai_mode">
                            <input type="hidden" name="pakai_edit" id="pakai_edit">
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
                        <button type="button" id="simpan-pakai" class="btn btn-primary rounded-0">Simpan</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
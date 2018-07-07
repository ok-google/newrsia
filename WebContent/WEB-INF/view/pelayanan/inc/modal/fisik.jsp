<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		<div class="modal fade" id="modal-pelayanan-riwayatperiksa">
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
						<form id="form-pelayanan-riwayatperiksa" class="from-horizontal">
                            <div class="form-group">
                                <label>Tanggal</label>
                                <input type="text" name="periksaTanggal" id="periksaTanggal" class="form-control boxed datetimepicker">
                            </div>
							<div class="form-group">
								<label>TInggi</label>
								<input type="text" name="periksaTb" id="periksaTb" class="form-control boxed">
							</div>
                            <div class="form-group">
                                <label>Berat</label>
                                <input type="text" name="periksaBb" id="periksaBb" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Detak Jantung</label>
                                <input type="text" name="periksaJantung" id="periksaJantung" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Tekanan Darah </label>
                                <input type="text" name="periksaDarah" id="periksaDarah" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Suhu</label>
                                <input type="text" name="periksaSuhu" id="periksaSuhu" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Nafas</label>
                                <input type="text" name="periksaNafas" id="periksaNafas" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Keluhan</label>
                                <input type="text" name="periksaKeluhan" id="periksaKeluhan" class="form-control boxed">
                            </div>
                            <div class="form-group">
                                <label>Pemeriksa</label>
                                <div class="select2-wrapper">
                                    <select name="pegawai" id="pegawai" class="form-control boxed select2-single">
                                        <option value="">--- Pilih Pemeriksa ---</option>
                                        <c:forEach var="pegawai" items="${pegawais}">
                                            <option value="${pegawai.pegawaiID }">
                                                ${pegawai.pegawaiNama }
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <input type="hidden" name="periksaID" id="periksaID">
							<input type="hidden" name="riwayatperiksa_mode" id="riwayatperiksa_mode">
							<input type="hidden" name="riwayatperiksa_edit" id="riwayatperiksa_edit">
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary rounded-0" data-dismiss="modal">Close</button>
						<button type="button" id="simpan-riwayatperiksa" class="btn btn-primary rounded-0">Simpan</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
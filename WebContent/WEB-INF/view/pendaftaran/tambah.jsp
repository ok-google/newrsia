<<<<<<< HEAD
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <section class="section">
        <div class="container">
            <div class="col-12" id="add_Pendaftaran_form">
                <div class="card">
                    <div class="card-header">
                        <div class="header-block">
                            <h3 class="title"> Tambah Pendaftaran </h3>
                        </div>
                    </div>
                    <div class="card-block">
                        <form:form modelAttribute="PendaftaranModel" method="POST" action="/pendaftaran/store">
                            <div class="row">
                                <div class="col-6">
                                    <div class="form-group">
                                        <label>Nomor Rekam Medis</label>
                                        <div class="select2-wrapper">
                                            <form:select path="pasien.pasienID"
                                                class="form-control input-lg select2-single boxed">
                                                <option value="">--- Pilin Rekam Medis ---</option>
                                                <c:forEach var="pasien" items="${pasiens}">
                                                    <form:option value="${pasien.pasienID}"
                                                        label="${pasien.pasienNorm} - ${pasien.pasienNama}"/>
                                                </c:forEach>
                                            </form:select>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="control-label">Jenis Pendaftaran</label>
                                        <form:select path="pendaftaranJenis" id="jenis_daftar" class="form-control boxed">
                                            <option value="">--- Pilih Jenis Pendaftaran ---</option>
                                            <option value="RI">Rawat Inap</option>
                                            <option value="RJ">Rawat Jalan</option>
                                        </form:select>
                                    </div>

                                    <div id="form-rawat-inap" style="display: none">
                                        <div class="form-group">
                                            <label>Kamar</label>
                                            <div class="select2-wrapper">
                                                <form:select path="pendaftaranNo" class="form-control select2-single">
                                                    <c:forEach var="kamar" items="${kamars}">
                                                        <form:option value="${kamar.kamarID}"
                                                            label="${kamar.kamarNo}"/>
                                                    </c:forEach>
                                                </form:select>
                                            </div>
                                        </div>
                                    </div>
                                    <div id="form-rawat-jalan" style="display: none">
                                        <div class="form-group">
                                            <label>Poli</label>
                                            <form:select path="pendaftaranPoli" class="form-control">
                                                <option value="">--- Pilih Poli ---</option>
                                                <option value="Obyn">Obyn</option>
                                                <option value="Anak">Anak</option>
                                            </form:select>
                                        </div>
                                    </div>
                                    
                                    <% /**<div class="form-group">
                                        <label class="control-label">Kondisi Pasien</label>
                                        <div class="select2-wrapper">
                                            <form:select path="kondisi.kondisiID"
                                                class="form-control input-lg select2-single">
                                                <c:forEach var="kondisipasien" items="${kondisipasiens}">
                                                    <form:option value="${kondisipasien.kondisiID}"
                                                        label="${kondisipasien.kondisiNama}"/>
                                                </c:forEach>
                                            </form:select>
                                        </div>
                                    </div> **/ %>
                                    
                                    
                                    <div class="form-group">
                                        <label class="control-label">Kondisi Kedatangan Pasien</label>
                                        <form:select path="kondisiMasuk" class="form-control boxed" id="kondisi_pasien">
                                            <option value="">--- Pilih Kondisi ---</option>
                                            <option value="D">Datang Sendiri</option>
                                            <option value="R">Rujukan</option>
                                        </form:select>
                                    </div>
                                    
                                    <div id="form-rujukan">
                                        <div class="form-group">
                                            <label>Rujukan</label>
                                            <div class="select2-wrapper">
                                                <form:select path="rujukan.rujukanID"
                                                    class="form-control input-lg select2-single boxed">
                                                    <c:forEach var="rujukan" items="${rujukans}">
                                                        <form:option value="${rujukan.rujukanID}"
                                                            label="${rujukan.rujukanNama}"/>
                                                    </c:forEach>
                                                </form:select>
                                            </div>
                                        </div>
                                        <% /**<div class="form-group">
                                            <label>Tindakan</label>
                                            <form:input path="pendaftaranJenis" class="form-control" />
                                        </div> **/ %>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="form-group">
                                        <label>Tgl Waktu MRS</label>
                                        <form:input path="pendaftaranMrs" class="form-control boxed datetimepicker" />
                                    </div>
                                    <% /** <div class="form-group">
                                        <label class="control-label">Kelas Pendaftaran</label>
                                        <form:select path="pendaftaranJenis" class="form-control boxed">
                                            <option value="">--- Pilih Kelas ---</option>
                                            <c:forEach var="kelas" items="${kelases}">
                                                <option value="${kelas.kelasID }">
                                                    ${kelas.kelasNama }
                                                </option>
                                            </c:forEach>
                                        </form:select>
                                    </div> **/ %>
                                    <div class="form-group">
                                        <label class="control-label">Dokter</label>
                                        <form:select path="pegawai.pegawaiID" class="form-control boxed">
                                            <option value="">--- Pilih Dokter ---</option>
                                            <c:forEach var="pegawai" items="${pegawais}">
                                                <option value="${pegawai.pegawaiID }">
                                                    ${pegawai.pegawaiNama }
                                                </option>
                                            </c:forEach>
                                        </form:select>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Paket</label>
                                        <div class="select2-wrapper">
                                            <form:select path="paketID" class="form-control boxed input-lg select2-single">
                                                <option value="" disabled>--- Pilih Paket ---</option>
                                                <c:forEach var="paket" items="${pakets}">
                                                    <form:option value="${paket.paketID}"
                                                        label="${paket.paketNama}"/>
                                                </c:forEach>
                                            </form:select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
                                        <button type="button" class="btn btn-danger d_pasien-button">
                                            <a href="/pasien/list" style="color: white; text-decoration: none">Batal</a>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
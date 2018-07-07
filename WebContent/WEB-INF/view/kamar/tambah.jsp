<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <section class="section">
        <div class="container">
            <div class="container" id="add_kamar_form">
                <div class="card">
                    <div class="card-header">
                        <div class="header-block ">
                            <h3 class="title">Tambah Kamar</h3>
                        </div>
                    </div>
                    <form:form modelAttribute="kamarModel" method="POST" action="/kamar/store">
                    <div class="card-block row">
                        
                        <div class="col-6">
                            <div class="form-group">
                                <label class="control-label">Ruang</label>
                                <div class="select2-wrapper">
                                    <form:select path="ruang.ruangID"
                                        class="form-control input-lg select2-single">
                                        <c:forEach var="ruang" items="${ruang}">
                                            <form:option value="${ruang.ruangID }"
                                                label="${ruang.ruangNama }" />
                                        </c:forEach>
                                    </form:select>
                                </div>
                            </div>

                            <div class="form-group">
                                <label>No / Nama Kamar</label>
                                <form:input path="kamarNo" placeholder="Masukan No Kamar"
                                    class="form-control" />
                            </div>

                            <div class="form-group">
                                <label class="control-label">Kelas Ruangan</label>
                                <div class="select2-wrapper">
                                    <form:select path="kelas.kelasID"
                                        class="form-control input-lg select2-single">
                                        <c:forEach var="kelas" items="${kelas}">
                                            <form:option value="${kelas.kelasID }"
                                                label="${kelas.kelasNama }" />
                                        </c:forEach>
                                    </form:select>
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label">Jenis Pelayanan</label>
                                <div class="select2-wrapper">
                                    <form:select path="jenisPelayanan" items="${pelayanan}"
                                        class="form-control" />
                                </div>
                            </div>
                        </div>

                        <div class="col-6">
                            <div class="form-group">
                                <label>Jumlah Bed</label>
                                <form:input path="jumlahBed" placeholder="Masukan Jumlah Bed"
                                    class="form-control" />
                            </div>

                            <div class="form-group">
                                <label>Tarif Harian</label>
                                <form:input path="tarif" placeholder="Masukan Harga per Hari"
                                    class="form-control" />
                            </div>

                            <div class="form-group">
                                <label>Keterangan</label>
                                <form:input path="kamarKeterangan"
                                    placeholder="Masukan Keterangan" class="form-control" />
                            </div>
                        </div>

                        <div class="container form-group" style="float: right;">
                            <button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
                            <button type="button" class="btn btn-danger d_pasien-button">
                                <a href="/kamar" style="color: white; text-decoration: none;">Batal</a>
                            </button>
                        </div>
                        
                    </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
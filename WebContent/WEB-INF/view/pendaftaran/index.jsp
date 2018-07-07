<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <div class="container">
        <div class="ca
        rd">
            <div class="card">
                <div class="card-header">
                    <div class="header-block">
                        <h3 class="title"> Data Pendaftaran </h3> 
                        <a class="btn btn-sm btn-primary" href="/pendaftaran/tambah">Tambah</a>
                    </div>
                </div>
                <div class="card-block">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Nomor RM</th>
                                    <th>Nama</th>
                                    <th>Alamat</th>
                                    <!-- <th>Aksi</th> -->
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="pendaftaran" items="${pendaftarans}">
                                    <tr>
                                        <td>${pendaftaran.pasien.pasienNorm}</td>
                                        <td>${pendaftaran.pasien.pasienNama}</td>
                                        <td>${pendaftaran.pasien.pasienAlamat}</td>
                                        <!-- <td>
                                            <a href="/pendaftaran/update/${pendaftaran.pendaftaranID}" class="btn btn-info rounded-0">Update</a>
                                            <a href="/pendaftaran/delete/${pendaftaran.pendaftaranID}" class="btn btn-warning rounded-0">Delete</a>
                                        </td> -->
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
<jsp:include page="../app/footer.jsp" />
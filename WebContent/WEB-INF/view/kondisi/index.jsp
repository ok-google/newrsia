<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <div class="header-block">
                            <h3 class="title">List Kondisi Pasien </h3>
                            <a href="/kondisi/tambah" class="btn btn-primary btn-sm">Tambah</a>
                        </div>
                    </div>
                    <div class="card-block">
                        <section class="example">
                            <jsp:include page="inc/tabel.jsp" />
                        </section>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
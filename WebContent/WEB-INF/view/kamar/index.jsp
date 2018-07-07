<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
        <section class="section">
            <div class="container">
                <div class="container" id="add_kamar_form" style="display: none">

                </div>
                <div class="container">
                    <div class="card">
                        <div class="card-header">
                            <div class="header-block">
                                <h3 class="title">List Kamar</h3>
                                <a href="/kamar/tambah" class="btn btn-success btn-sm" style="color: white" >Tambah Data</a>
                            </div>
                        </div>

                        <div class="card-block">
                            <div class="table-responsive">
                                 <jsp:include page="inc/tabel.jsp" />
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            </section>
<jsp:include page="../app/footer.jsp" />
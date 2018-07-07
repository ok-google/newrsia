<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
    <section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-block">
                        <div class="card-title-block">
                        <a href="/kondisi/tambah"/><button class="btn btn-primary">Tambah Data</button></a>
                            <h3 class="title"> List Opaname Detail </h3>
                        </div>
                        <section class="example">
                            <!-- <jsp:include page="inc/tabel.jsp" /> -->
                            <div class="fixed-table-pagination" style="display: block; margin-top:25px">
                                 <form action="" method="get">
                                        <div class="pull-right pagination" style="margin-right: 20px;">
                                             ${link }
                                        </div>
                                  </form>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
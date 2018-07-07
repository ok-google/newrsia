<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <div class="row">
        <div class="col-md-12">
            <div class="card">
                <div class="card-block">
                    <section class="list-user">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>Username</th>
                                        <th>Nama Pegawai</th>
                                        <th>Terakhir login</th>
                                        <th>Aksi</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="user" items="${users}">
                                        <tr>
                                            <td>${user.userName }</td>
                                            <td>${user.pegawai.pegawaiNama }</td>
                                            <td>${user.userLogin}</td>
                                            <td>
                                                <a href="user/update/${user.userID }" class="btn btn-info rounded-0">Update</a>
                                                <a href="user/delete/${user.userID }" class="btn btn-warning rounded-0">Delete</a>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>

                            </table>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    </div>
    <div class="fixed-table-pagination" style="display: block; margin-top:25px">
        <form action="" method="get">
            <div class="pull-right pagination" style="margin-right: 20px;">
                ${link }
            </div>
        </form>
    </div>
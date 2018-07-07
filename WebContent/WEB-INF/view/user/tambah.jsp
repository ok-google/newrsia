<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Data Users </h3>
                    </div>
                    <form:form modelAttribute="userModel" method="POST" action="/user/store">
                        <div class="form-group">
                            <label>Pegawai</label>
                            <div class="select2-wrapper">
                                <form:select path="pegawai.pegawaiID" class="form-control">
                                    <option value="">--- Pilih Pegawai ---</option>
                                    <c:forEach var="pegawai" items="${pegawais}">
                                        <form:option value="${pegawai.pegawaiID}" label="${pegawai.pegawaiNama}"/>
                                    </c:forEach>
                                </form:select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Username</label>
                            <form:input path="userName" placeholder="username" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Password</label>
                            <form:input path="userPassword" type="password" placeholder="password" class="form-control"/>
                         </div>
                        <div class="form-group">
                            <form:select path="userRole" class="form-control boxed" multiple="true">
                                <option value="">--- Pilih Role ---</option>
                                <form:options items="${roles}" itemValue="role_id" itemLabel="rolePriv" />
                            </form:select>
                        </div>
                         <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
    <section class="section">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-block">
                        <div class="card-title-block">
                            <h3 class="title"> List Users </h3>
                        </div>
                        <section class="example">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                            <th>Username</th>
                                            <th colspan="2">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="tempusers" items="${user}">
                                                <tr>
                                                    <td> ${tempusers.userName } </td>
                                                    <td> <a href="/user/update/${tempusers.userID }" class="btn btn-info">Update</a>
                                                     <a href="/user/delete/${tempusers.userID }" class="btn btn-warning">Delete</a></td>
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
             <div class="clearfix"></div>
    </section>
<jsp:include page="../app/footer.jsp" />
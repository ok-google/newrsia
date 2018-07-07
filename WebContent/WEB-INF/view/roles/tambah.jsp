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
                        <h3 class="title">Tambah Data roles </h3>
                    </div>
                    <form:form modelAttribute="roleModel" method="POST" action="/roles/store">
                        <div class="form-group">
                            <label>Role Priv</label>
                            <form:input path="rolePriv" placeholder="role priv" class="form-control"/>
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
                            <h3 class="title"> List Role </h3>
                        </div>
                        <section class="example">
                          <table class="table table-striped table-bordered table-hover">
                            <thead>
                                <tr>
                                    <th>Role Autoload</th>
                                    <th>ROle Priv</th>
                                    <th colspan="2">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="temprole" items="${role}">
                                        <tr>
                                            <td> ${temprole.roleAutoload } </td>
                                            <td> ${temprole.rolePriv } </td>
                                            <td> <a href="/roles/update/${temprole.role_id }" class="btn btn-info">Update</a>
                                             <a href="/roles/delete/${temprole.role_id }" class="btn btn-warning">Delete</a></td>
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
    </section>
<jsp:include page="../app/footer.jsp" />
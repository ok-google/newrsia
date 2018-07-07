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
                        <h3 class="title">Update Data roles </h3>
                    </div>
                    <form:form modelAttribute="roleModel" method="POST" action="/roles/update">
                    <form:hidden path="role_id" />
                        <form:hidden path="roleCreatedBy" />
                        <form:hidden path="roleCreatedDate" />
                        <form:hidden path="roleAktif" />
                        <div class="form-group">
                            <label>Role Autoload</label>
                            <form:input path="roleAutoload" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Role Priv</label>
                            <form:input path="rolePriv" class="form-control"/>
                         </div>                      
                         <div class="form-group">
                            <button type="submit" class="btn btn-primary">Simpan</button>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />

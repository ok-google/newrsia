<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../app/header.jsp" />
<table class="table table-striped table-bordered table-hover">
<section class="section">
        <div class="row sameheight-container">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <div class="card card-block sameheight-item">
                    <div class="title-block">
                        <h3 class="title"> Data user </h3>
                    </div>
                    <form:form modelAttribute="userModel" method="POST" action="/user/update">
                        <form:hidden path="userID" />
                        <form:hidden path="userCreatedBy" />
                        <form:hidden path="userCreatedDate" />
                        <form:hidden path="userAktif" />
                        <div class="form-group">
                            <label>Username</label>
                            <form:input path="userName" class="form-control"/>
                         </div>
                         
                        <div class="form-group">
                            <label>Ubah Password</label>
                            <form:input path="userPassword" type="text" class="form-control"/>
                         </div>
                         <div class="form-group">
                            <button type="submit" class="btn btn-primary">Update</button>
                        </div>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </section>
<jsp:include page="../app/footer.jsp" />
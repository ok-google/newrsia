<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Login RSI AL-HIKMAH</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/app.css'/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/vendor.css'/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value='${baseURL}resources/css/style.css'/>" />
</head>

<body>

    <div class="auth">
        <div class="auth-container">
            <div class="card">
                <header class="auth-header">
                    <h1 class="auth-title">
                        <img style="width: 90px; margin-bottom: 10px;" src="/resources/images/RSIA.png" />
                        <br>
                        LoginAdmin </h1>
                </header>
                <div class="auth-content">
                    <form id="login-form" action="<c:url value='/login' />"  method="POST" novalidate="">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="email" class="form-control underlined" name="user_name" id="user_name" placeholder="Your email address" required> </div>
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" class="form-control underlined" name="user_password" id="user_password" placeholder="Your password" required> </div>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        <div class="form-group">
                            <button type="submit" class="btn btn-block btn-primary">Login</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
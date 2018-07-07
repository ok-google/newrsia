<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="req" value="${pageContext.request}" />
<c:set var="url">${req.requestURL}</c:set>
<c:set var="uri" value="${req.requestURI}" />
<c:set var="baseURL" value="${fn:substring(url, 0, fn:length(url) - fn:length(uri))}${req.contextPath}/" />
			</article>
			<footer class="footer"></footer>
		</div>
	</div>
	<script src="<c:url value='${baseURL}resources/js/vendor.js'/>"></script>
	<script src="<c:url value='${baseURL}resources/bootstrap-datepicker/js/bootstrap-datepicker.min.js'/>"></script>
	<script src="<c:url value='${baseURL}resources/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js'/>"></script>
	<script src="<c:url value='${baseURL}resources/js/select2.min.js'/>"></script>
    <script src="<c:url value='${baseURL}resources/js/app.js'/>"></script>
    <jsp:include page="${footerjs}" />
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>���������κ��� ����� JSP(�丮��������)</h1>
	<hr />
	<h3>
		JSP�� ���:<%=request.getAttribute("msg")%></h3>
	<h3>EL�� ���:${msg}</h3>

	<spring:message code="member.form.id" />
	<spring:message code="member.form.pass" />
	<spring:message code="member.form.name" />
	<spring:message code="member.form.addr" />
</body>
</html>
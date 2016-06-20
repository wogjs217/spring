<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 스프링프레임워크 내부에 (MessageSource객체)에 셋팅된 message를 웹페이지에 출력하기 위해
	일반 jsp에서 사용하는 태그를 이용해서 출력할 수 없고 spring에서 제공되는 커스텀 태그를 이용해서 출력해야 한다. -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post">
		<table>
			<tr>
				<td>
					<form:label path="id">
						<spring:message code="member.form.id" />
					</form:label>
				</td>
				<td>
					<form:input path="id"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="pass">
						<spring:message code="member.form.pass" />
					</form:label>
				</td>
				<td>
					<form:input path="pass"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="name">
						<spring:message code="member.form.name" />
					</form:label>
				</td>
				<td>
					<form:input path="name"/>
				</td>
			</tr>
			<tr>
				<td>
					<form:label path="addr">
						<spring:message code="member.form.addr" />
					</form:label>
				</td>
				<td>
					<form:input path="addr"/>
				</td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �����������ӿ�ũ ���ο� (MessageSource��ü)�� ���õ� message�� ���������� ����ϱ� ����
	�Ϲ� jsp���� ����ϴ� �±׸� �̿��ؼ� ����� �� ���� spring���� �����Ǵ� Ŀ���� �±׸� �̿��ؼ� ����ؾ� �Ѵ�. -->
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
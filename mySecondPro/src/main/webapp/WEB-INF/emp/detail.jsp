<%@page import="emp.dto.MyEmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<% MyEmpDTO user = (MyEmpDTO) request.getAttribute("userInfo"); %>
<body>
	<div align="center">
		<table width="400" border="1">
			<tr>
				<td>ȸ�����̵�</td>
				<td><%= user.getId() %></td>
			</tr>
			<tr>
				<td>ȸ���н�����</td>
				<td><%= user.getPass()%></td>
			</tr>
			<tr>
				<td>ȸ������</td>
				<td><%= user.getName() %></td>
			</tr>
			<tr>
				<td>ȸ���ּ�</td>
				<td><%= user.getAddr() %></td>
			</tr>
			<tr>
				<td>ȸ���μ��ڵ�</td>
				<td><%= user.getDeptno() %></td>
			</tr>
			<tr>
				<td>���</td>
				<td><%= user.getGrade() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="�����ϱ�" 
						onclick="location.href='mybatisRead.do?id=<%=user.getId()%>&action=update'"/>
					<input type="button" value="�����ϱ�"
						onclick="location.href='mybatisDel.do?id=<%=user.getId() %>&action=delete'"/>
					<input type="button" value="��Ϻ���"
						onclick="location.href='mybatislist.do'"/>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>










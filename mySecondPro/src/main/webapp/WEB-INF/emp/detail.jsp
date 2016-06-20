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
				<td>회원아이디</td>
				<td><%= user.getId() %></td>
			</tr>
			<tr>
				<td>회원패스워드</td>
				<td><%= user.getPass()%></td>
			</tr>
			<tr>
				<td>회원성명</td>
				<td><%= user.getName() %></td>
			</tr>
			<tr>
				<td>회원주소</td>
				<td><%= user.getAddr() %></td>
			</tr>
			<tr>
				<td>회원부서코드</td>
				<td><%= user.getDeptno() %></td>
			</tr>
			<tr>
				<td>등급</td>
				<td><%= user.getGrade() %></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="수정하기" 
						onclick="location.href='mybatisRead.do?id=<%=user.getId()%>&action=update'"/>
					<input type="button" value="삭제하기"
						onclick="location.href='mybatisDel.do?id=<%=user.getId() %>&action=delete'"/>
					<input type="button" value="목록보기"
						onclick="location.href='mybatislist.do'"/>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>










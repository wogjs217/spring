<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="emp.dto.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 	<% MyEmpDTO user = (MyEmpDTO) session.getAttribute("loginUser"); %>
</head>
<body>
	<div class="container-fluid">
		<h1>HRM System</h1>
		<nav class="navbar navbar-inverse">
		
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">HOME</a></li>
					<li class="divider-vertical"></li>
					<li>
					<a href="/template/view.do?pathurl=../content.jsp">�μ�����</a></li>
				 	<li class="divider-vertical"></li>
					<li><a href="#">�λ����</a></li>
					<li class="divider-vertical"></li>
					<%if(user==null){ %>
						<li><a href="/mySecondPro/login.do">�α���</a></li>
					<%}else{ %>
						<li class="divider-vertical"></li>
						<li><a href="/mySecondPro/logout.do">�α׾ƿ�</a></li>
					<%} %>
				</ul>
				<form class="navbar-form pull-right"
						 method="get" 
						 action="/template/search.do">
					<input type="text" name="search">
					<input type="submit" value="�˻�">
				</form>
			
		</nav>
	</div>
</body>
</html>
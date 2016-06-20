<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="java.util.*,board.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<!--  -->
<%
	List<TB_BoardDTO> boardlist = (List<TB_BoardDTO>) request.getAttribute("boardlist");
	int size = boardlist.size();
	System.out.println("게시글 size=" + size);
	
/* 	String pageNum = (String)request.getParameter("pageNum");
	System.out.println("페이지 num" + pageNum); */
	
%>
<body>
	<div class="container">
		<h2>Table</h2>
		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>등록시간</th>
						<th>수정시간</th>
					</tr>
				</thead>
				<tbody>
					<%
						for (int i = 0; i < size; i++) {
							TB_BoardDTO board = boardlist.get(i);
					%>
					<tr>
						<td><%=board.getBoard_No()%></td>
						<td><%=board.getTitle()%></td>
						<td><%=board.getMem_Id()%></td>
						<td><%=board.getCount()%></td>
						<td><%=board.getReg_Dtm()%></td>
						<td><%=board.getMod_Dtm()%></td>
						<td><a>수정</a><span>     </span><a>삭제</a></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
	</div>
	<div class="container">
		<button type="button" class="btn btn-info" onclick="location.href='boardwrite.do'">글쓰기</button>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" import="java.util.*,board.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>

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
<script type="text/javascript">
	/* function fn_search(pageNo) {
		var comSubmit = new ComSubmit();
		comSubmit.setUrl("<c:url value='/finalShop/board.do'/>");
		comSubmit.addParam("currentPageNo", currentPageNo);
		comSubmit.submit();
	} */
</script>
<body>
	<div class="container">
		<h2>Table</h2>
		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>����</th>
						<th>�ۼ���</th>
						<th>��ȸ��</th>
						<th>��Ͻð�</th>
						<th>�����ð�</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${fn:length(boardlist) > 0}">
							<c:forEach items="${boardlist}" var="row">
								<tr>
									<td>${row.BOARD_NO}</td>
									<td><a
										href="/finalShop/boarddetail.do?BOARD_NO=${row.BOARD_NO}">${row.TITLE}</a>
									</td>
									<td>${row.MEM_ID }</td>
									<td>${row.COUNT }</td>
									<td>${row.REG_DTM }</td>
									<td>${row.MOD_DTM }</td>
									<td><a href="/finalShop/boarddelete.do?BOARD_NO=${row.BOARD_NO}">����</a></td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="4">��ȸ�� ����� �����ϴ�.</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
		</div>
	</div>

	<div class="col-xs-8">

		<ui:pagination paginationInfo="${paginationInfo}" type="text"
			jsFunction="linkPage" />

	</div>
	<script type="text/javascript">
	function linkPage(currentPageNo){
		location.href = "/finalShop/board.do?currentPageNo="+currentPageNo;
	}	
	</script>
	<div class="container">
	<button type="button" class="btn btn-info"
			onclick="location.href='/finalShop/prdlist.do'">Ȩ����</button>
		<button type="button" class="btn btn-info"
			onclick="location.href='/finalShop/boardwrite.do'">�۾���</button>
	</div>

</body>
</html>
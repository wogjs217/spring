<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="form1" method="post" action="/finalShop/boardupdate.do">
		<table align="center" cellpadding="0" cellspacing="0" width="479">
			<tbody>
				<tr>
					<td width="469" colspan="2" height="42">
						<p align="center">
							<code>
								<b> <span style="font-size: 20pt;">글읽기</span>
								</b>
							</code>
						</p>
					</td>
				</tr>
				<tr>
					<td width="479" colspan="2">
						<hr>
					</td>
				</tr>
				<tr>
					<td width="104">
						<p>
							<code>
								<b>아이디</b>
							</code>
						</p>
					</td>
					<td width="359">
						<p>
							<code>
								<input type="text" name="mem_Id" size="30" value="${map.MEM_ID}">
							</code>
						</p>
					</td>
				</tr>
				<tr>
					<td width="104"></td>
				</tr>
				<tr></tr>
				<tr>
					<td width="104">
						<p>
							<code>
								<b>제목</b>
							</code>
						</p>
					</td>
					<td width="359">
						<p>
							<code>
								<input type="text" name="title" size="51" value="${map.TITLE}">
							</code>
						</p>
					</td>
				</tr>
				<tr>
					<td width="104">
						<p>
							<code>
								<b>내용</b>
							</code>
						</p>
					</td>
					<td width="359">
						<p>
							<textarea name="text" rows="10" cols="50">${map.TITLE}</textarea>
						</p>
					</td>
				</tr>
				<tr>
					<td width="479" colspan="2">
						<hr>
					</td>
				</tr>
				<tr>
					<td width="479" colspan="2">
						<p align="center">
							<button type="button" class="btn btn-info"
								onclick="location.href='board.do?currentPageNo=1'">홈으로</button>
							<input type="hidden" name="board_no" value="${map.board_no}">
							<input type="submit" name="formbutton1" value="수정">

						</p>
					</td>
				</tr>
				<tr>
					<td width="479" colspan="2" height="9" valign="bottom">
						<p>
							<code>
								<a href="/webTest/MemberListServlet">리스트(L)</a>
							</code>
						</p>
					</td>
				</tr>
				<tr>
					<td width="479" colspan="2" height="57" valign="bottom">
						<p align="right">
							<code>
								<input type="hidden" name="jumin"> <input type="hidden"
									name="ilsi">
							</code>
						</p>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
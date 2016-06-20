<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*,product.dto.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
 <link rel="shortcut icon" href="/finalShop/common/favicon.ico"> 
<link rel="stylesheet" type="text/css" 
				href="/finalShop/resources/css/demo.css" />
<link rel="stylesheet" type="text/css" href="/finalShop/resources/css/style.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300,300italic' rel='stylesheet' type='text/css'>
<script type="text/javascript" 
		src="/finalShop/resources/js/modernizr.custom.79639.js"></script> 
</head>
<body>


  <div class="container">
	<% List<ProductDTO> toplist = 
			(List<ProductDTO>)request.getAttribute("toplist"); %>
			
			<section class="main">
			
				<div class="ia-container">
				<%
				int size = toplist.size();
				for(int i=0;i<size;i++){
					ProductDTO pro = toplist.get(i);
				%>
				
					<figure>
						<img src="/finalShop/resources/images/product/<%=pro.getImg_gen_file_nm() %>" alt="image01" />
						<input type="radio" name="radio-set" checked="checked"/>
						<figcaption><span><%= pro.getPrd_nm() %></span></figcaption>
					
				
				<%} %>
												</figure>
												
											</figure>
								
										</figure>	
											
									</figure>	
										
								</figure>
									
							</figure>
							
						</figure>
						
					</figure>
					
				</div><!-- ia-container -->
				
			</section>
			
        </div>
</body>
</html>
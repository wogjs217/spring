<%@page import="product.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=940" />
<?xml version="1.0" encoding="UTF-8" ?>

<!-- *Title -->
<title>Fuji Xerox</title>
<!-- Ÿ��Ʋ�� ���� �ϰ� ���� ��� include ���� title�±׸� ����ϸ� ��. -->
<!-- Title -->

<!-- *Css -->
<!-- 
<link type="text/css"
	href="../../include/script/jquery-ui-1.10.3.custom/css/ui-lightness/jquery-ui-1.10.3.custom.css"
	rel="stylesheet" />
<link type="text/css"
	href="../../include/script/jqgrid/css/ui.jqgrid.css" rel="stylesheet" />
* treegrid�� css����...jqgrid �����ο��� �̰� �ʿ�?

<link type="text/css"
	href="../../include/script/jquery-ui-1.10.3.custom/css/ui-lightness/jquery-ui-1.10.3.custom.css"
	rel="stylesheet" />
<link type="text/css"
	href="../../include/script/jquery-ui-1.10.3.custom/development-bundle/themes/base/jquery.ui.all.css"
	rel="stylesheet" />
<link type="text/css"
	href="../../include/script/jquery-ui-1.10.3.custom/development-bundle/demos/demos.css"
	rel="stylesheet" /> -->


<link type="text/css" href="/finalShop/resources/css/master.css"
	rel="stylesheet" media="screen,print" />
<link type="text/css" href="/finalShop/resources/css/print.css" rel="stylesheet"
	media="print" />
<link type="text/css" href="/finalShop/resources/css/mall.css" rel="stylesheet"
	media="screen,print" />




<style>
A.applink:hover {
	border: 2px dotted #DCE6F4;
	padding: 2px;
	background-color: #ffff00;
	color: green;
	text-decoration: none
}

A.applink {
	border: 2px dotted #DCE6F4;
	padding: 2px;
	color: #2F5BFF;
	background: transparent;
	text-decoration: none
}

A.info {
	color: #2F5BFF;
	background: transparent;
	text-decoration: none
}

A.info:hover {
	color: green;
	background: transparent;
	text-decoration: underline
}

#sky {
	position: absolute;
	width: 100px;
	left: 50%;
	top: 150px;
	margin-left: 400px;
	background: #ffffff;
	border: solid #ccc;
	height: 200px;
	padding: 30px
}
</style>
<script src="//code.jquery.com/jquery-1.4.2.min.js"></script>
<script type="text/javascript">
	$(function() {
		var cssTop = parseInt($("#sky").css("top"));
		$(window).scroll(function() {
			var position = $(window).scrollTop();
			$("#sky").stop().animate({
				"top" : position + cssTop + "px"
			}, 500);
		});
	});
</script>

</head>
<body>

	<div id="header"></div>
	<!-- /header -->
	<hr />

	<!-- content/-->


	<!-- lyt-main/ -->
	<div class="lyt-main">
		<!-- title -->
		<h2></h2>
		<div class="goodsDetailWrap">
			<div class="leftWrap">
				<!---------------------- ��ǰ����  ----------------------->
				<div class="photoWrap">
					<div class="photo">
						<!-- ���λ��� -->
						<a href="#"><img
							src="/finalShop/images/product/bottom_image2.jpg"
							alt="���̹���" /></a>
					</div>
					<div class="zoomBtn">
						<!-- Ȯ��  -->
						<a href="#" onclick="imageZoom( '918' );"><img
							src="/finalShop/images/btn_zoom.gif" alt="Ȯ��" /></a>
					</div>
				</div>
			</div>
			<!-- leftWrap END-->

			<div class="rightWrap">
				<form name="frm" method="post" action="">
					<!-------------------------- ������ ��ǰ ���� ��Ÿ ���� ------------------------>
					<dl class="goodsDetail">
						<!-- ��ǰ ���� -->

						<!-- ��������ó�� -->















						<!-- ��������ó�� -->
						<dt>�Һ��ڰ�</dt>
						<dd>
							��
						</dd>

						<dt>�ǸŰ�</dt>
						<dd>
							�� [ ������
							
							�� ]
						</dd>









					</dl>

					<dl class="goodsDetail">
						<dt>���޻�</dt>
						<dd>�ڹٳ���</dd>
					</dl>

					<dl class="goodsDetail" id="defaultDl">
						<dt>��ǰ�ڵ�</dt>
						<dd></dd>

						<dt>�԰�</dt>
						<dd>standard</dd>

						<dt>����/�ּұ��Ŵ���</dt>
						<dd>1EA EA</dd>

						<dt>������/������</dt>
						<dd>�ѱ� /</dd>

						<!-- 											<dt>�������</dt> -->
						<!-- 												<dd>���� ��ۻ�ǰ</dd> -->

						<dt>�ֹ�����</dt>
						<!------------------ ��ǰ�� �Ϲ���  ---------------------->

						<dd>
							<!-- ��ǰ ���� ���� ����-->
							<div class="gCnt">
								<input type="text" name="v_prbuyea" value="1"
									style="width: 35px;" title="�����Է�ĭ" onchange="eaChange( this );" />
								<input type="hidden" name="h_prcode"
									value="G4042_F0002_X0004_K0040" /> <input type="hidden"
									name="h_prname" value="FXK-UTM V300" /> <input type="hidden"
									name="h_prmoney" value="8800000" /> <input type="hidden"
									name="h_prstock" value="10000" /> <input type="hidden"
									name="h_prminbuyea" value="1" />
							</div>
							<div class="btns">
								<a href="#" onclick="eaUp( this, 1 ); return false;"><img
									src="/finalShop/images/b_up.gif" alt="����" class="al" /></a> <a href="#"
									onclick="eaUp( this, -1 ); return false;"><img
									src="/finalShop/images/b_down.gif" alt="����" class="al" /></a>
							</div>
						</dd>




						<div class="delBtn">
							<a href="#" onclick="optionAdd( this, 0 ); return false;"> <img
								src="/finalShop/images/btn_icon_plus.gif" alt="�߰�" />
							</a>
						</div>



						<!------------------ ��ǰ�� �Ϲ���  �� ---------------------->


						<!-- *���ÿɼ� -->


						<!-- *�Է¿ɼ� -->


					</dl>

					<!-- *�ɼ��߰����� -->
					<div id="optionAdd"></div>
					<!-- *�ɼ��߰����� -->

					<dl class="goodsDetail">

						<div class="optionGoods h50 fr">
							<span id="v_prtotmoney" class="sale fl">0 </span><span
								class="sale02 fnt20">��</span>
						</div>


						<!------------------ ��ǰ�� �Ϲ��� �� ---------------------->
					</dl>

					<ul class="btnArea mgt20">
						<!-- ���Ź�ư -->

						<li><a href="#" onclick="dialogOpen('N'); return false;"><img
								src="/finalShop/images/btnm_nowBuy.gif" alt="�ٷα���" /></a></li>
						<li class="marL07"><a href="#"
							onclick="basketIn('N'); return false;"><img
								src="/finalShop/images/btnm_cart.gif" alt="��ٱ���" /></a></li>
						<li class="fl_right marL07"><a href="#"
							onclick="history.back();"><img
								src="/finalShop/images/btnm_list.gif" alt="���" /></a></li>
						<li class="fl_right"><a href="#"
							onclick="productWishIn( 'G4042_F0002_X0004_K0040', 'N' );return false;"><img
								src="/finalShop/images/btnm_wish.gif" alt="���ø���Ʈ" /></a></li>
						<li class="fl_right"><a
							href="/finalShop/proread.do?prdno=&action=UPDATE">������Ʈ</a></li>

					</ul>
				</form>
			</div>
			<!-- rightWrap : ������ ��ǰ���� END-->
		</div>
		<!-- goodsDetailWrap : ��ǰ������ ��ü END-->

		<img src="/finalShop/images/product/bottom_image2.jpg"
			alt="���̹���" />
		<div id="sky">
			<img src="/finalShop/images/product/bottom_image2.jpg"
			alt="���̹���" width="50px" height="50px" />
		</div>
</body>
</html>



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页左侧导航</title>
<link rel="stylesheet" type="text/css" href="../css/public.css" />
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/public.js"></script>
<head></head>

<body id="bg">
	<!-- 左边节点 -->
	<div class="container">

		<div class="leftsidebar_box">
			<a href="main.jsp" target="main"><div class="line">
					<img src="../img/coin01.png" />&nbsp;&nbsp;首页
				</div></a>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin03.png" /><img class="icon2"
						src="../img/coin04.png" /> 赛前准备<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun1.action"
						target="main">男生百米参赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun2.action"
						target="main">女生百米参赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun3.action"
						target="main">男生跳远参赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun4.action"
						target="main">女生跳远参赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun5.action"
						target="main">男生百米预赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun6.action"
						target="main">女生百米预赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun7.action"
						target="main">男生百米半决赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun8.action"
						target="main">女生百米半决赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun9.action"
						target="main">男生百米决赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/chaxun10.action"
						target="main">女生百米决赛人员</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				
				
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin01.png" /><img class="icon2"
						src="../img/coin02.png" /> 比赛成绩录入<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="input.jsp"
						target="main">录入成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate1.action"
						target="main">录入男子百米预赛成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate2.action"
						target="main">录入女子百米预赛成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate3.action"
						target="main">录入男子跳远成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate4.action"
						target="main">录入女子跳远成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate5.action"
						target="main">录入男子百米半决赛成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate6.action"
						target="main">录入女子百米半决赛成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate7.action"
						target="main">录入男子百米决赛成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
					<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/preupdate8.action"
						target="main">录入女子百米决赛成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin07.png" /><img class="icon2"
						src="../img/coin08.png" /> 查询<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="${pageContext.request.contextPath }/chaxun11.action" target="main"
						class="cks">男生百米成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="${pageContext.request.contextPath }/chaxun12.action" target="main"
						class="cks">女生百米成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="${pageContext.request.contextPath }/chaxun13.action" target="main"
						class="cks">男生跳远成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="${pageContext.request.contextPath }/chaxun14.action" target="main"
						class="cks">女生跳远成绩</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="${pageContext.request.contextPath }/updateCredit.action" target="main"
						class="cks">班级排名</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a href="${pageContext.request.contextPath }/updateNewsreel.action" target="main"
						class="cks">破纪录情况</a><img class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coin01.png" /><img class="icon2"
						src="../img/coin02.png" /> 搜索<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="search.jsp"
						target="main">搜索</a><img class="icon5" src="../img/coin21.png" />
				</dd>
				
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="../img/coinL1.png" /><img class="icon2"
						src="../img/coinL2.png" /> 系统管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="../img/coin111.png" /><img class="coin22"
						src="../img/coin222.png" /><a class="cks" href="${pageContext.request.contextPath }/logout.action" target="_parent">退出</a><img
						class="icon5" src="../img/coin21.png" />
				</dd>
			</dl>

		</div>

	</div>
</body>
</html>

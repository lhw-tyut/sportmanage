<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="../2/css/normalize.css" />
	<link rel="stylesheet" href="../2/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="../2/css/htmleaf-demo.css">
	<link rel="stylesheet" href="../2/css/style.css">
</head>
<body>
	<div class="htmleaf-container">
		<header class="htmleaf-header">
			<h1>太原理工大学软件学院 <span>田径运动会</span></h1>
			<div class="htmleaf-links">
				<a class="htmleaf-icon icon-htmleaf-home-outline" href="main.jsp" target="_self"><span> 首页</span></a>
				<a class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href="main.jsp" target="_self"><span> 首页</span></a>
			</div>
		</header>
		 
		<div class="search d1">
		<form action="${pageContext.request.contextPath }/search.action" method="post">
		  <input type="text" placeholder="输入id..." name="s_id">
		   <button type="submit"></button>
		  </form>
		</div>
		<div class="search d2">
		<form action="${pageContext.request.contextPath }/search.action" method="post">
		  <input type="text" placeholder="输入班级..." name="s_class">
		   <button type="submit"></button>
		  </form>
		</div>
		<div class="search d3">
		<form action="${pageContext.request.contextPath }/search.action" method="post">
		  <input type="text" placeholder="输入姓名..." name="s_name">
		   <button type="submit"></button>
		  </form>
		</div>
		<div class="search d4">
		<form action="${pageContext.request.contextPath }/search.action" method="post">
		  <input type="text" placeholder="输入学号..." name="s_sno">
		  <button type="submit"></button>
		  </form>
		</div>
		
	</div>
</body>
</html>
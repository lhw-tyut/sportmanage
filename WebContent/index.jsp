<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

<!-- Custom Theme files -->
<link href="1/css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="1/css/jquery.countdown.css" />

<!--fonts--> 
<link href="http://fonts.googleapis.com/css?family=Bellefair&amp;subset=hebrew,latin-ext" rel="stylesheet">
<link href="http://fonts.googleapis.com/css?family=Rambla:400,400i,700,700i&amp;subset=latin-ext" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800,600,300' rel='stylesheet' type='text/css'>
<!--//fonts--> 
<link href="1/css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="1/js/jquery.min.js"></script>
</head>
<body>
	<div class="w3layouts-banner-slider">
			<div class="container">
				<div class="slider">
					<div class="callbacks_container">
						<ul class="rslides callbacks callbacks1" id="slider4">
							<li>
								<div class="agileits-banner-info">
									<div class="banner-dot"></div>
								</div>
							</li>
							<li>
								<div class="agileits-banner-info agileits-banner-info1">
									<div class="banner-dot"></div>
								</div>
							</li>
							<li>
								<div class="agileits-banner-info agileits-banner-info2">
									<div class="banner-dot"></div>
								</div>
							</li>
							<li>
								<div class="agileits-banner-info agileits-banner-info3">
									<div class="banner-dot"></div>
								</div>
							</li>
							
						</ul>
					</div>
					<script src="1/js/responsiveslides.min.js"></script>
					<script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:false,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							  $('.events').append("<li>before event fired.</li>");
							},
							after: function () {
							  $('.events').append("<li>after event fired.</li>");
							}
						  });
					
						});
					 </script>
					<!--banner Slider starts Here-->
				</div>
			</div>
	</div>
    <div class="bg agile">
     	<div class="container">
			<div class="main">
				<div class="header">
					<h1>软件学院田径运动会<span>快来了</span></h1>
				</div>
				<!--newsletter-->
	<div class="newsletter w3l-agile">
		<div class="email-text">           
			</div>
			<div class="email">
			
			<form action="pages/baoming.jsp" method="post">	
			<a href=${pageContext.request.contextPath }/login.action ><font color="#ffffff">登录</font></a>	
				<input type="submit" value="报名">
			</form>
		</div>
		<div class="clear"></div>
	</div>
<!--//newsletter-->

				<div class="content">
					<div class="content2">
						<div class="timer_wrap">
							<div id="counter"> </div>		
						</div>
					</div>
					
				</div>
				<div class="agileinfo-social-grids">
						<ul>
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-rss"></i></a></li>
							<li><a href="#"><i class="fa fa-vk"></i></a></li>
						</ul>
						<p>太原理工大学软件学院 1513班 <a target="_blank" href="pages/jianjie.html">项目组介绍</a></p>
					</div>	

				<div class="footer">
					
				</div>
			</div>
        </div>
   </div>
<!--js-->
<script src="1/js/jquery.countdown.js"></script>
<script src="1/js/script.js"></script>
<!--js-->

</body>
</html>	
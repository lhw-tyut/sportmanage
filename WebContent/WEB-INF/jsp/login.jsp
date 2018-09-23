<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>太原理工大学</title><base target="_blank" />

<style>
*{
	padding:0px;
	margin:0px;
	}
    a{color:White}
body{
	font-family:Arial, Helvetica, sans-serif;
	background:url(images/login.jpg) no-repeat  center;
	font-size:13px;    
	}
img{
	border:0;
	}
.lg{width:468px; height:468px; margin:100px auto; background:url(images/login_bg1.png) no-repeat;}
.lg_top{ height:200px; width:468px;}
.lg_main{width:400px; height:180px; margin:0 25px;}
.lg_m_1{
	width:290px;
	height:100px;
	padding:60px 55px 20px 55px;
}
.ur{
	height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(images/user.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.pw{
	height:37px;
	border:0;
	color:#666;
	width:236px;
	margin:4px 28px;
	background:url(images/password.png) no-repeat;
	padding-left:10px;
	font-size:16pt;
	font-family:Arial, Helvetica, sans-serif;
}
.bn{width:330px; height:72px; background:url(images/enter.png) no-repeat; border:0; display:block; font-size:18px; color:#FFF; font-family:Arial, Helvetica, sans-serif; font-weight:bolder;}
.lg_foot{
	height:80px;
	width:330px;
	padding: 6px 68px 0 68px;
}
</style>
<script>
// 判断是登录账号和密码是否为空
function check(){
    var usercode = $("#usercode").val();
    var password = $("#password").val();
    if(usercode=="" || password==""){
    	$("#message").text("账号或密码不能为空！");
        return false;
    }  
    return true;
}
</script>
</head>

<body class="b">
<font color="red">
			 <%-- 提示信息--%>
			 <span id="message">${msg}</span>
		</font>
<div class="lg">

<form action="${pageContext.request.contextPath }/login.action" method="POST" onsubmit="return check()">
    <div class="lg_top"></div>
    <div class="lg_main">
        <div class="lg_m_1">
        <input name="usercode"  class="ur" id="usercode" type="text"/>
        <input name="password" type="password"  class="pw" id="password"/>
        
        </div>
    </div>
    <div class="lg_foot">
    <input type="submit" value="点这里登录" class="bn" /></div>
</form>
</div>

</body>
</html>

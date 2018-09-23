<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="GBK">
  <title>报名</title>
    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css" />
</head>
<body>
  <div class="container">  
  <form id="contact" action="${pageContext.request.contextPath }/insert.action" method="post">
    <h3>太原理工大学软件学院</h3>
    <h4>秋季运动会马上就要举行了，欢迎大家参加！</h4>
    <fieldset>
      姓名：<input type="text" name="s_name" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
     班级： <input  type="text" name="s_class" tabindex="2" required>
    </fieldset>
    <fieldset>
     性别： <input  type="text" name="s_sex" tabindex="4" required>
    </fieldset>
    <fieldset>
     学号： <input  type="text" name="s_sno" tabindex="4" required>
    </fieldset>
    <fieldset>
     项目： <input  type="text" name="s_type" tabindex="5" required>
    </fieldset>
    <fieldset>
      <button value="提交" type="submit">提交</button>
    </fieldset>
  </form>

</div>
<div style="text-align:center;clear:both">
<script src="../gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="../follow.js" type="text/javascript"></script>
</div>
</body>

</html>
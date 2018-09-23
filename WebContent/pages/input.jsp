<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

  <meta charset="UTF-8">

  <title>录入成绩</title>

    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css" />

</head>

<body>

  <div class="container">  
  <form id="contact" action="${pageContext.request.contextPath }/update.action" method="post">
    <h3>及时录入成绩</h3>
    <h4>筛选后面比赛人员!</h4>
    <fieldset>
      编号： <input name="s_id" type="text" tabindex="1" required autofocus>
    </fieldset>

    <fieldset>
        比赛阶段 ：<input name="phase" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      成绩：<input name="s_score" type="text" tabindex="3" required>
  
    <fieldset>
      <button name="submit" type="submit" >提交</button>
    </fieldset>
  </form>

</div>
<div style="text-align:center;clear:both">
<script src="../gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="../follow.js" type="text/javascript"></script>
</div>
</body>

</html>
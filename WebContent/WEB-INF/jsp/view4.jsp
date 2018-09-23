<%@ page contentType="text/html; charset=UTF-8"  %>
<%@ page import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>太原理工大学软件学院</title>
  <style media="print">  
        .noprint {  
            display: none;  
        }  
    </style>
 </head>   
<BODY>
<div class="noprint" style="width:800px;margin:30px auto 0 auto;text-align:right;"> 
   <input value="打印" type="button" onclick="window.print()" /> 
  </div> 
<p align="center">${msg1}</p>

 <TABLE align="center" width="60%" border=1 cellspacing=0>
 
 <thead><tr><th>编号</th><th>姓名</th><th>班级</th><th>学号</th><th>性别</th>
 <th>项目</th><th>成绩</th><th>排名</th></tr></thead>
<%int sporter_count=1; %>
<c:forEach items="${msg}" var="item">
<tr>
<td>${item.s_id }</td>
<td>${item.s_name }</td>
<td>${item.s_class }</td>
<td>${item.s_sno }</td>
<td>${item.s_sex }</td>
<td>${item.s_type }</td>
<td>${item.s_score} </td>
<td><%=sporter_count %> </td>
</tr>
<%sporter_count++; %>
</c:forEach>
 </Table>

</form>
</body>
</html>

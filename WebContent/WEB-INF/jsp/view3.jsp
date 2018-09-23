<%@ page contentType="text/html; charset=UTF-8"  %>
<%@ page import="java.util.*"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="itheima" uri="http://itheima.com/common/"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>太原理工大学软件学院</title>
<!-- 引入css样式文件 -->
	<!-- Bootstrap Core CSS -->
	<link href="3/css/bootstrap.min.css" rel="stylesheet" />
	<!-- MetisMenu CSS -->
	<link href="3/css/metisMenu.min.css" rel="stylesheet" />
	<!-- DataTables CSS -->
	<link href="3/css/dataTables.bootstrap.css" rel="stylesheet" />
	<!-- Custom CSS -->
	<link href="3/css/sb-admin-2.css" rel="stylesheet" />
	<!-- Custom Fonts -->
	<link href="3/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<link href="3/css/boot-crm.css" rel="stylesheet" type="text/css" />
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
<h1 align="center">${msg1}</h1>
  <!-- 客户列表查询部分  start-->
	<div id="wrapper">
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">运动员信息列表</div>
					<!-- /.panel-heading -->
					<table class="table table-bordered table-striped">

 
 <thead><tr><th>编号</th><th>姓名</th><th>班级</th><th>学号</th><th>性别</th>
 <th>项目</th><th>成绩</th></tr></thead>
						<tbody>
							<c:forEach items="${page.rows}" var="row">
						
<tr>
<td>${row.s_id }</td>
<td>${row.s_name }</td>
<td>${row.s_class }</td>
<td>${row.s_sno }</td>
<td>${row.s_sex }</td>
<td>${row.s_type }</td>
<td>${row.s_score2 }</td>

</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="col-md-12 text-right">
				
						<itheima:page url="	${pageContext.request.contextPath }/${msg2 }"/>
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
	</div>
	<!-- 客户列表查询部分  end-->
<!-- 引入js文件 -->
<!-- jQuery -->
<script src="3/js/jquery-1.11.3.min.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="3/js/bootstrap.min.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script src="3/js/metisMenu.min.js"></script>
<!-- DataTables JavaScript -->
<script src="3/js/jquery.dataTables.min.js"></script>
<script src="3/js/dataTables.bootstrap.min.js"></script>
<!-- Custom Theme JavaScript -->
<script src="3/js/sb-admin-2.js"></script>
</body>
</html>

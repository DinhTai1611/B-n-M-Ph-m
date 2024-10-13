<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Skincare</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a href="adminloaicontroller">quản lý loại</a></li>
				<li><a href="#">quản lý sp</a></li>
				<li><a href="adminxacnhancontroller">xác nhận hóa đơn</a></li>
				<li><a href="#">danh sách khách hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						đăng nhập</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						đăng xuất</a></li>
			</ul>
		</div>
	</nav>

	<%
	String ml = (String) request.getAttribute("maloai");
	String tenloai = (String) request.getAttribute("tenloai");
	%>
	<form action="adminloaicontroller" method="post">
		mã loại: <input type="text" name="txtmaloai"
			value="<%=(ml == null) ? "" : ml%>"> <br> tên loại: <input
			type="text" name="txttenloai"
			value="<%=(tenloai == null) ? "" : tenloai%>"> <br> <input
			type="submit" name="butadd" value="add" class="btn-primary">
		<input type="submit" name="butupdate" value="update"
			class="btn-primary">
	</form>
	<table class="table table-hover">
		<%
		ArrayList<loaibean> ds = (ArrayList<loaibean>) request.getAttribute("ds");
		for (loaibean loai : ds) {
		%>
		<tr>
			<td><%=loai.getMaloai()%></td>
			<td><%=loai.getTenloai()%></td>
			<td><a
				href="adminloaicontroller?ml=<%=loai.getMaloai()%>&tab=select">Select</a></td>
			<td><a
				href="adminloaicontroller?ml=<%=loai.getMaloai()%>&tab=delete">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
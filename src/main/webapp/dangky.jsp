<%@page import="bean.skincarebean"%>
<%@page import="bean.loaibean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.khachhangbean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Skincare</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="skincarecontroller">Trang chủ</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#mynavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="mynavbar">
				<ul class="nav navbar-nav me-auto">
					<li class="nav-item"><a class="nav-link" href="giocontroller">Giỏ
							hàng</a></li>
					<li class="nav-item"><a class="nav-link"
						href="lichsucontroller">Lịch sử</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="nav-item"><a class="nav-link"
						href="dangkycontroller"><span class="glyphicon glyphicon-user"></span>Đăng
							ký</a></li>

					<%
					khachhangbean kh = (khachhangbean) session.getAttribute("dn");
					if (kh != null) {
					%>
					<li class="nav-item">
						<button class="nav-link" type="button" data-bs-toggle="modal"
							data-bs-target="#myModal">
							Xin chào:
							<%=kh.getTenkh()%></button>
					</li>

					<%
					} else {
					%>
					<li class="nav-item">
						<button class="nav-link" type="button" data-bs-toggle="modal"
							data-bs-target="#myModal">Đăng nhập</button>
					</li>
					<%
					}
					%>

					<li class="nav-item"><a class="nav-link"
						href="dangxuatcontroller"><span
							class="glyphicon glyphicon-log-in"></span> Đăng xuất</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container mt-3">
		<h2>Hãy điền thông tin</h2>
		<form action="dangkycontroller" method="post">
			<div class="mb-3 mt-3">
				<label for="email">Họ tên:</label> <input type="text"
					class="form-control" id="hoten" placeholder="Nhập họ tên"
					name="tenkh">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">Địa chỉ:</label> <input type="text"
					class="form-control" id="diachi" placeholder="Nhập địa chỉ"
					name="diachi">
			</div>
			<div class="mb-3 mt-3">
				<label for="text">số điện thoại:</label> <input type="text"
					class="form-control" id="sodt" placeholder="Nhập số điện thoại"
					name="sodt">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Nhập email"
					name="email">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">Tên đăng nhập:</label> <input type="text"
					class="form-control" id="un"
					placeholder="Nhập tên đăng nhập" name="tendn">
			</div>
			<div class="mb-3">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pw" placeholder="Nhập password"
					name="pass">
			</div>
			<button type="submit" class="btn btn-primary">Đăng kí</button>
		</form>
	</div>
</body>
</html>
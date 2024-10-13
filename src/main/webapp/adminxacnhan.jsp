<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<table class="table table-hover">
		<thead>
			<tr>
				<th scope="col">Tên khách hàng</th>
				<th scope="col">Tên</th>
				<th scope="col">Giá</th>
				<th scope="col">Số lượng mua</th>
				<th scope="col">Thành tiền</th>
				<th scope="col">Trạng thái</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="xn" items="${ds }">
				<tr>
					<td>${xn.getTenkh() }</td>
					<td>${xn.getTenskincare() }</td>
					<td>${xn.getGia() }</td>
					<td>${xn.getSoluongmua() }</td>
					<td>${xn.getThanhtien() }</td>
					<c:choose>
						<c:when test="${xn.isHddamua() == true}">
							<td>Đã thanh toán</td>
						</c:when>
						<c:otherwise>
							<td>Chưa thanh toán</td>
						</c:otherwise>
					</c:choose>

					<td><a
						href="adminxacnhancontroller?mact=${xn.getMachitiethd() }">xác
							nhận</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
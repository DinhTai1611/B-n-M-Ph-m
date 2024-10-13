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

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 p-3">
				<table class="table table-hover">
					<%
					//Lay dsloai tu sachController gui ve
					ArrayList<loaibean> dsloai = (ArrayList<loaibean>) request.getAttribute("dsloai");
					for (loaibean loai : dsloai) {
					%>

					<tr>
						<td><a class="nav-link"
							href="skincarecontroller?ml=<%=loai.getMaloai()%> "> <%=loai.getTenloai()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</div>
			<div class="col-sm-6 p-3">
				<div class="container-fluid">
					<div class="row">
						<%
						ArrayList<skincarebean> ds = (ArrayList<skincarebean>) request.getAttribute("dsskin");
						int n = ds.size();
						for (int i = 0; i < n; i++) {
							skincarebean s = ds.get(i);
						%>
						<div class="col-sm-6 p-3">
							<img style="width: 100%" src="<%=s.getAnh()%>"> <br>
							Tên:
							<%=s.getTenskincare()%>
							<br> Giá:
							<%=s.getGia()%>
							<br> <a
								href="themcontroller?ms=<%=s.getMaskincare()%>&ts=<%=s.getTenskincare()%>&gia=<%=s.getGia()%>">
								<img src="buy.jpg">
								<hr>
							</a>
						</div>
						<%
						i++;
						if (i < n) {
							s = ds.get(i);
						%>
						<div class="col-sm-6 p-3">
							<img style="width: 100%" src="<%=s.getAnh()%>"> <br>
							Tên:
							<%=s.getTenskincare()%>
							<br> Giá:
							<%=s.getGia()%>
							<br> <a
								href="themcontroller?ms=<%=s.getMaskincare()%>&ts=<%=s.getTenskincare()%>&gia=<%=s.getGia()%>">
								<img src="buy.jpg">
								<hr>
							</a>
						</div>
						<%
						}
						%>
						<%
						}
						%>
					</div>
				</div>
			</div>
			<div class="col-sm-3 p-3">
				<form method="post" action="skincarecontroller">
					Tìm Kiếm <input type="text" name="txttim" placeholder="Nhap Key"
						class="form-control"> <input type="submit" name="btntim">
				</form>
			</div>
		</div>
	</div>


	<%
	if (session.getAttribute("dn") == null) {
	%>

	<!-- The Modal -->
	<div class="modal" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Đăng nhập</h4>
					<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					<form class="form-horizontal" method="post"
						action="dangnhapcontroller">
						<div class="form-group">
							<label class="control-label col-sm-2" for="email">Use
								name:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="email"
									placeholder="Nhập Use name" name="txtun">
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-sm-2" for="pwd">Password:</label>
							<div class="col-sm-10">
								<input type="password" class="form-control" id="pwd"
									placeholder="Nhập password" name="txtpass">
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<div class="checkbox">
									<label><input type="checkbox" name="remember">
										Remember me</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button type="submit" class="btn btn-primary">Đăng nhập</button>
							</div>
						</div>
						<div class="control-label" style="text-align: center"></div>
					</form>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="button" class="btn btn-danger"
						data-bs-dismiss="modal">Close</button>
				</div>

			</div>
		</div>
	</div>
	<%
	} else {
	%>
	<!-- The Modal -->
	<div class="modal" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Thông tin tài khoản</h4>
					<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
				</div>

				<!-- Modal body -->
				<div class="modal-body">
					Xin chào:
					<%=kh.getTenkh()%>
					<br> Mã khách hàng:
					<%=kh.getMakh()%>
					<br> Họ tên:
					<%=kh.getTenkh()%>
					<br> Địa chỉ:
					<%=kh.getDiachi()%>
					<br> Số điện thoại:
					<%=kh.getSodt()%>
					<br> Email:
					<%=kh.getEmail()%>
					<br> Tên đăng nhập:
					<%=kh.getTendn()%>
					<br> Mật khẩu:
					<%=kh.getPass()%>
					<br>
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="button" class="btn btn-danger"
						data-bs-dismiss="modal">Close</button>
				</div>

			</div>
		</div>
	</div>
	<%
	}
	%>
</body>
</html>
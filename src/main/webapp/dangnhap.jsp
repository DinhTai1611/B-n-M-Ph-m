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

	<div class="container">
		<h2>Đăng nhập</h2>
		<form class="form-horizontal" action="dangnhapcontroller">
			<%
			String un = request.getParameter("txtun");
			String pass = request.getParameter("txtpass");
			%>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Use name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="email"
						placeholder="Nhập Use name" name="txtun"
						value="<%=(un == null) ? "" : un%>">
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
					<button type="submit" class="btn btn-default">Đăng nhập</button>
				</div>
			</div>

		</form>
	</div>

</body>
</html>



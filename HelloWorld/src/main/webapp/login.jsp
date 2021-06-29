<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo form login</title>
</head>
<body>
	<h4>Login Form</h4>
	${msg}
	<form method="post">
		<div class="form-group">
			<span>Username</span> 
			<input class="form-control" name="username" />
		</div>
		<div class="form-group">
			<span>Password</span> 
			<input class="form-control" type="password" name="password" />
		</div>
		<div class="form-group">
			<input class="form-control" type="submit" value="Login" />
		</div>

	</form>
</body>
</html>
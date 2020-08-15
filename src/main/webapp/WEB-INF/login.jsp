<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login!</title>
</head>
<body>
<form method="post">
<font color="red">${message }</font>
Name : <input type="text" name="name"/>
Password: <input type="password" name="password"/>
<input type="submit" value="Login"/>
</form>

</body>
</html>
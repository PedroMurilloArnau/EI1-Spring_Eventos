<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login de eventos:</h1>
<h2>${mensaje}</h2>
<form action="/login" method="post">

	<label>Usuario</label>
	<input type="text" name="userName" placeholder="Usuario" >
	</br>
	<label>Pasword</label>
	<input type="text" name="pasword" placeholder="Pasword">
	</br>
	<input type="submit" value="Enviar">
	
</form>

</body>
</html>
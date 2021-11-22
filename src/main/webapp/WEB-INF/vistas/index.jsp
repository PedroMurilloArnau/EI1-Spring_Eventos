<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EventosPedroMurillo</title>


</head>
<body>

<h1>Bienvenido ${Prop} ${mensaje}</h1>
<h3>${mensajelogin}</h3>

<a href="/login">Login</a>
<a href="/cerrarSesion" >Logout</a>
<a href="/Activos" >Eventos activos</a>
<a href="/Destacados" >Eventos Destacados</a>
<table border="2">

<c:forEach var="eve" items="${listaEventos }">

<tr>
<td>${eve.nombre}</td>
<td>${eve.tipo.nombre}</td>
<td>${eve.fechaInicio}</td>
<td>${eve.duracion} horas</td>
<c:if test="${not empty Detalle}">
<td><a href="/detalle?id=${eve.idEvento}">Editar</a></td>
</c:if>
</tr>
</c:forEach>

</table>

</body>
</html>
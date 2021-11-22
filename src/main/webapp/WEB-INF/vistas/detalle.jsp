<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.eventos{
height: 400px;
}
</style>

</head>
<body>
<table border="2">
<tr>
<td>Nombre: ${evento.nombre}</td>
<td>Descripcion: ${evento.descripcion}</td>
<td>Direccion: ${evento.direccion}</td>
<td>Fecha de inicio: ${evento.fechaInicio}</td>
<td>Duracion: ${evento.duracion} horas</td>
<td>Aforo Maximo: ${evento.aforoMaximo}</td>
<td>Minima Asistencia: ${evento.minimoAsistencia}</td>

</tr>
</table>
<c:choose>
<c:when test="${evento.tipo.idTipo == 1}">
<img class="eventos" src="https://d7lju56vlbdri.cloudfront.net/var/ezwebin_site/storage/images/_aliases/img_1col/reportajes/cuando-volveremos-a-ir-a-conciertos-con-normalidad/8867610-2-esl-MX/Cuando-volveremos-a-ir-a-conciertos-con-normalidad.png" alt="concierto">
</c:when>
<c:when test="${evento.tipo.idTipo == 2}">
<img class="eventos" src="https://st3.idealista.it/cms/archivie/styles/idcms_social_large_desktop/public/2018-09/media/image/opera-pixabay.jpg?fv=Zgfvbfr4&itok=lxVOytyx" alt="Opera">
</c:when>
<c:when test="${evento.tipo.idTipo == 3}">
<img Class="eventos" src="https://saposyprincesas.elmundo.es/wp-content/uploads/2016/09/landing-teatro-980x350.jpg" alt="Teatro">
</c:when>
<c:otherwise>
<p>Version incorrecta</p>
</c:otherwise>
</c:choose>
<p><a href="/inicio">Retorno a incio</a></p>

<ul>
<li> Precio Unitario: ${evento.precio } E</li>
<li> Cantidad de plazas: ${evento.aforoMaximo} plazas</li>

</ul>
<form action="/reservar/${evento.idEvento}" method="post">
<fieldset>
<h3>Cantidad:</h3>
<p>Puede seleccionar entre 1 y 10 entradas!</p>
<label>Seleccione el numero de entrada</label>
<input type="number" min=0 max=10 step=1 name="cantidad">
</fieldset>
<input type="submit" value="Reservar">
</form>

</body>
</html>
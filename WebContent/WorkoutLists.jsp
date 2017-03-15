<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<%@ include file="header.jsp" %>
</center>
<center>
<table>	
<tr>
	<th>Usuario</th>
	<th>Nombre</th>
	<th>Apellido</th>
</tr>
  <c:forEach items="${users}" var="user">
    <tr>
      <td> ${user.idUsuario }</td>	
      <td>${user.nombre}</td>
      <td>${user.apellido}</td>
    </tr>
  </c:forEach>
</table>

</center>
</body>
</html>
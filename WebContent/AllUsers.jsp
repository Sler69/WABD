<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/TableStyle.css" rel="stylesheet" type="text/css"/>
<link href="css/DesignBD.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">

window.onload = function() {
	debugger
	 var tab = "${users}";
	};
	
</script>
<title>Usuarios</title>
</head>
<body>
<center>
	<%@ include file="header.jsp" %>

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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<%@ include file="header.jsp" %>

<table>	
  <c:forEach items="${usuarios}" var="product">
    <tr>
      <td><c:out value="${usuarios.tareWeight}" /></td>
      <td><c:out value="${product.barCode}" /></td>
    </tr>
  </c:forEach>
</table>

</center>
</body>
</html>
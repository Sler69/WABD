<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/TableSyle.css" rel="stylesheet" type="text/css"/>
<link href="css/FormCss.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
<center>
	<%@ include file="header.jsp" %>
</center>
<center>
<div>
  <h2 style="text-transform: uppercase;"><c:out value="${workouts[0].nombre}" />-<c:out value="${workouts[0].strDescripcion}" /> </h2>
</div>
<table>	
<tr>
	<th>Exercise</th>
	<th>Sets</th>
	<th>Reps</th>
</tr>
  <c:forEach items="${workouts}" var="workout">
    <tr>
      <td> ${workout.strWorkout }</td>	
      <td>${workout.intSets}</td>
      <td>${workout.intReps}</td>
    </tr>
  </c:forEach>
</table>

</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/FormCss.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
<center>
<%@ include file="header.jsp" %>
<div class="form-style-8">
  <h2>WorkOuts</h2>
  <form action="CoachUserServlet" method="post">
    <input type="text" name="field1" placeholder="User ID" />
    <input type="submit" value="Look for Workouts" />
  </form>
</div>
</center>
</body>
</html>
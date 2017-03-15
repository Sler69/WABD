<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
<link href="css/FormCss.css" rel="stylesheet" type="text/css"/>
<title>New User</title>
</head>
<body>
<center>
<%@ include file="header.jsp" %>
<div class="form-style-8">
  <h2>New User</h2>
  <form action="NewUserServlet" method="post">
    <input type="text" name="field1" placeholder="User ID" />
    <input type="text" name="field2" placeholder="Name" />
    <input type="text" name="field3" placeholder="Last Name" />
    <input type="text" name="field4" placeholder="Birth Date"/>
    <input type="text" name="field5" placeholder="Height"/>
    <input type="text" name="field6" placeholder="Weight"/>
    <input type="text" name="field7" placeholder="Complexion"/>
    <input type="text" name="field8" placeholder="Assigned Coach"/>
    <input type="submit" value="Create New User" />
  </form>
</div>
</center>
</body>
</html>
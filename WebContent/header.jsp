<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/DesignBD.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
 <script type="text/javascript" src="js/jquery.quickflip.js"></script>
<script type="text/javascript">


window.onload = function() {
	debugger
	 var tab = $("#tabSelected").val();
	};
	
</script>
</head>
<body style="background:#e6e6e6">
<img src="images/WelcomeGym.jpg" width="640px" height="298px" >
<div id="flip-tabs" style="background:black;height:38px;width:1000px;margin:0px" >  
    <ul id="flip-navigation"  style="padding:9px">  
        <li ><a href="#" id="tab-0">Recent</a></li>  
        <li><a href="#" id="tab-1" onclick ="changeContent('userConsult')" >Popular</a></li>  
        <li><a href="#" id="tab-2" >Comments</a></li> 
        <li><a href="#" id="tab-3">Long</a></li> 
    </ul>   
</div>  
</body>
</html>
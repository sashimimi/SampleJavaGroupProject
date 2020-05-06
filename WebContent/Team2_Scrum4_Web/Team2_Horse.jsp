<!DOCTYPE HTML>
<%@page import="team2_scrum4.*"%>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Team2_Horse</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
	String name = request.getParameter("name");
	String tailLength = request.getParameter("tLength");
	String quality = request.getParameter("uQuality");
	
	String sFurlong = request.getParameter("furlong");
	int furlong = 0;
	try{
		furlong = Integer.parseInt(sFurlong);
	}
	catch(Exception ex){
	 String message = "Please enter valid number!";
	}
	
	Team2_Horse_API newHorse = new Team2_Horse_API();
	
	Team2_Horse aNewHorse = newHorse.createHorse(name,tailLength,quality,furlong);
	out.print("<h1><br><br> A New Horse :<h1><h3>"+aNewHorse.toString()+"</h3>");
	

 %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src="js/validation.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 	 <form id="regi" action="CustomerRegisterServlet" method="post">
	 		Enter user name:<input type="text" name="username" id="un"><span id="span1"></span><br><br>
	 		Enter password:<input type="password" name="password" id="cwd"><span id="span2"></span><br><br>
	 		<input type="submit" value="submit" onclick="f1()">
         </form>

</body>
</html>
<%@page import="com.app.dbconnection.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table cellpadding="1" cellspacing="1" border="1">
<tr><th>USER NAME</th><th>PASSWORD</th></tr>
<%


PreparedStatement ps=null;
ResultSet rs=null;
Connection con=null;
String username=null;
String password=null;


try{
	con=DBConnection.con();
	ps=con.prepareStatement("select * from customer_regi");
	rs=ps.executeQuery();
	while(rs.next()){
		username=rs.getString(1);
		password=rs.getString(2);
		
	%>
		
		<tr><td><%=username %></td><td><%=password %></td></tr>
		
		
		
	<%	
	}
	
	
}catch(Exception e){
	e.printStackTrace();
}









%>
</table>
</body>
</html>
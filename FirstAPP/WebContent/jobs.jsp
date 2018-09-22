<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
   th,td{
     background-color: darkred;
     color: white;
     height: 30px;
     width: 150px;
   }
   
   td{
     background-color: lightgray;
     color:black;
   }
</style>
</head>
<body>
	<table>
	    <tr>
	       <th>Job ID</th>
	       <th>Job Title</th>
	       <th>Min Salary</th>
	       <th>Max Salary</th>
	    </tr>
	    <%
	       List<Jobs> l= (List<Jobs>)request.getAttribute("jlist");
	    	for(Jobs x:l){
	    
	    %>
	       <tr>
	         <td><%=x.getJob_id() %></td>
	         <td><%=x.getJob_title() %> </td>
	         <td><%=x.getMin_salary() %> </td>
	         <td><%=x.getMax_salary() %></td>
	       </tr>
	    <%} %>
	    
	</table>

</body>
</html>
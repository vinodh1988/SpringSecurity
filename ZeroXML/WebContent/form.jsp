<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="s"   uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="store.asp" method="post" modelAttribute="job" >
  <table>
      <tr>
          <th> Job_id </th>
          <td> <s:input path="job_id"/> </td>
      </tr>
       <tr>
          <th> Job Title</th>
          <td> <s:input path="job_title"/> </td>
      </tr>
       <tr>
          <th> Min Salary </th>
          <td> <s:input path="min_salary"/> </td>
      </tr>
       <tr>
          <th> Max Salary </th>
          <td> <s:input path="max_salary"/> </td>
      </tr>
       <tr>
          <td colspan="2" style="text-align:center"> 
          <input type="submit" value="store"> </td>
      </tr>
  
  </table>
  </s:form>
</body>
</html>
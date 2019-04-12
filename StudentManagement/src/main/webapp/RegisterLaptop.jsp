<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
Fill the Student Details

 <form:form action = "LaptopSuccess" method="post" modelAttribute="laptop">
  <table>
     
			
			<tr>
				<td>Brand</td>
				<td><form:input path="lbrand"/></td>
			</tr>


			<tr>
				<td>ram</td>
				<td><form:input path="ram"/></td>
			</tr>
			
			<tr>
				<td>Cost</td>
				<td><form:input path="cost"/></td>
            </tr>


			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>
</center>
</body>
</html>
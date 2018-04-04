<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>

<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="/EmployeeInfo_SpringMVC/addEmployee" modelAttribute="login">
	<form:errors path="*" />
	
	 <table>
		<tr>
			<td><form:label path="uname">User Name</form:label></td>
			<td><form:input path="uname" /></td>
		</tr>
		<tr>
			<td><form:label path="pw">Password</form:label></td>
			<td><form:input path="pw" /></td>
		</tr>
		
	  </table> 
    <td><input type="submit" value="Submit"/></td>
	</form:form>
</body>
</html>
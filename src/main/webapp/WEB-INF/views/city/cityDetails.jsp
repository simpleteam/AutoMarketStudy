<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table bgcolor="yellow" border="1" bordercolor="red">
		
		<tr>
			<td>city</td>
		</tr>
				
		<tr>
			<form:form method="delete">
				<td>${city.city}</td> 
					<input type="submit" value="delete" />
				 	<a href="${city.id}/edit">edit</a>
				
			</form:form>
		</tr>	
		
	</table>
	
</body>
</html>
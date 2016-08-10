<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="/AutoMarket/advertisement/found" method="get" modelAttribute="search">
		city:
		<form:input path="cityId"/><br>
		model:
		<form:input path="modelId"/><br>
		minPrice:
		<form:input path="minPrice"/><br>
		maxPrice:
		<form:input path="maxPrice"/><br>
		minYear:
		<form:input path="minYear"/><br>
		maxYear:
		<form:input path="maxYear"/><br>
		<input type="submit">
	</form:form>


</body>
</html>
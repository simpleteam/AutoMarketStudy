<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../resources/jquery.js"></script>
<script type="text/javascript" src="../resources/my.js"></script>
<title>Insert title here</title>
</head>
<body>
	<!--  
	<script type="text/javascript">
		function json(){
		    $.getJSON('http://localhost:8080/AutoMarket/region/getAll', function(data){
			  var items = [];		
			  $("#select").empty();
			  $.each(data, function(key, val){
			      items.push('<li id="' + key + '">' + val + '</li>');
			  	$("#select").append("<option value ='"+ val.id + "' onClick='gg("+val.id+")'  > " + val.region + "</select>");
			  });
			});		    
		}
		
		function gg(target){
		    $.getJSON('http://localhost:8080/AutoMarket/city/getAllByRegion/'+target, function(data){
			var items = [];
			$("#select1").empty();
			  $.each(data, function(key, val){
			    items.push('<li id="' + val.id + '">' + val.city + '</li>');
			  	$("#select1").append("<option value ="+ val.id + " > " + val.city + "</select>");
			  });
		    });
		}
		
	</script>
	
-->
	<form:form action="/AutoMarket/user" method="post" modelAttribute="user">
			
		name:<br>
		<form:input path="name"/><br>
		password:<br>
		<form:password path="password"/><br>
		phone:<br>
		<form:input path="phone"/><br>
		region:<br>
		<select id="select" onfocus="json()">
		</select><br>
		city:<br>
		<form:select path="city.id" id="select1">
		</form:select><br>
		registrate:<br>
		<button type="submit">add user</button>
	
	</form:form>
	
	
</body>
</html>
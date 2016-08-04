<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript" src="resources/my.js"></script>
<title>Insert title here</title>
</head>
<body>
	
<!--  
	<script type="text/javascript">
	
		function json(){
		    $.getJSON('region/getAll', function(data){
			  var items = [];		
			  $("#select").empty();
			  $.each(data, function(key, val){
			    
			      items.push('<li id="' + key + '">' + val + '</li>');
			  	$("#select").append("<option value ='"+ val.id + "' onClick='gg("+val.id+")'  > " + val.region + "</select>");
			  });
			 
			 

			});
		}
		
		function gg(target){
		    
		    $.getJSON('city/getAllByRegion/'+target, function(data){
				
			var items = [];
			$("#select1").empty();
			  $.each(data, function(key, val){
			    items.push('<li id="' + val.id + '">' + val.city + '</li>');
			  	$("#select1").append("<option value ="+ val.id + " > " + val.city + "</select>");
			  });
			
			
		    })
		    
		    
		    
		    
		}
		
		
	
	
	</script>

-->

	<select id="select">
		
	
	</select>
	
	<select id="select1">
		
	
	</select>
	
	

	<div  class = "a" id="test" onclick="$('#test').hide();"> out block </div> 
	<div  class = "a" id="tes1" onclick="$('#test').hide();"> out block </div>
	<div  class = "a" id="tes2" onclick="$('#test').hide();"> out block </div>
	
	
	<button onclick="myFunc()">hide</button>
	<button onclick="myProc()">show</button>
	<button onclick="f()">change text</button>
	<button onclick="g()">change</button>

	<input type="radio" name="radio" onchange="g('red')" />
	<input type="radio" name="radio" onchange="g('green')" />

	<button onclick="json()">Json</button>
	
	<button onclick="gg(1)">Json2</button>

	<c:forEach items="ex" var="e">
		<br>
		${e}
	
	
	
	</c:forEach>

	


</body>
</html>
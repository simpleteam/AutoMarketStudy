<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap 101 Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<script type="text/javascript" src="../resources/jquery.js"></script>
<link href="../resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="resources/css/NewFile.css" rel="stylesheet" >
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="http://getbootstrap.com/docs-assets/js/html5shiv.js"></script>
<script src="http://getbootstrap.com/docs-assets/js/respond.min.js"></script>
<![endif]-->
</head>
<body>


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="//code.jquery.com/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="../resources/js/bootstrap.min.js"></script>

	<table class="table table-inverse" >
		<thead>
				<tr>
					<th>year</th><th>price</th>
				</tr>
			</thead>
		
		<c:forEach items="${advertisements}" var="advertisement">
			
			<tbody>
				<tr">
					<td >${advertisement.year}</td><td> ${advertisement.price}</td>
				</tr>
			</tbody>
		</c:forEach>
	</table>
	
	
	
	
	
<button type="button" class="btn btn-ttc">Save changes</button>

</body>
</html>
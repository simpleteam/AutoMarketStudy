


function myFunc(){
	$('#test').hide();
}


function myProc(){
	var str = " this is my message ";
	str = $.trim(str);
	jQuery('#test').show();
}


function f(){
	var element = $('#test');
	element.html("this is another text");
}


function g(color){
    var elements = $('div.a');
    for (var i = 0; i < elements.length; i++) {
	elements.get(i).style.color = color;
	
    }
}





$(document).ready(function json(){
    $.getJSON('/AutoMarket/region/getAll', function(data){
	  var items = [];		
	  $("#select").empty();
	  $.each(data, function(key, val){
	    
	      items.push('<li id="' + key + '">' + val + '</li>');
	  	$("#select").append("<option value ='"+ val.id + "' onClick='gg("+val.id+")'  > " + val.region + "</select>");
	  });
	 
	 

	});
});







function gg(target){
    
    $.getJSON('/AutoMarket/city/getAllByRegion/'+target, function(data){
		
	var items = [];
	$("#select1").empty();
	  $.each(data, function(key, val){
	    items.push('<li id="' + val.id + '">' + val.city + '</li>');
	  	$("#select1").append("<option value ="+ val.id + " > " + val.city + "</select>");
	  });
	
	
    })
    
    
    
    
}









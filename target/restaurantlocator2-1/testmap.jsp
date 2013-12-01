<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<title>Test Map</title>
</head>
<body>
<h1>Test Map</h1>
<script type="text/javascript">
var mapOptions;
	  var markers = [];
	 var map;
	 function initialize() {
		

		  var latlng = new google.maps.LatLng(-25.363882, 131.044922);
		mapOptions = {
	 	zoom: 12,
	 	center: latlng,
	 	mapTypeId: google.maps.MapTypeId.ROADMAP
	   };
	   
	    
	   $(document).ready(function () {
		 	map = new google.maps.Map(document.getElementById("map_canvas"), mapOptions);
		 });
		 
	   createMarker(latlng);
	   
			    	 
	 }
	 
	 
	 function createMarker(location){
		 
	 marker=new google.maps.Marker({
		   position:location,
		   icon:'http://www.google.com/mapfiles/marker.png',
		  //animation:google.maps.Animation.BOUNCE
		   });

		 
		 address = "SOMETHING restARANDJ;"
		 var infowindow = new google.maps.InfoWindow({
			   content:address
			   });

			 infowindow.open(map,marker);
			 
			 marker.setMap(map)
			 
			 
}

</script>
<table><tr><td width="10" colspan="2"> <div id="map_canvas" style="width: 580px; height: 500px"></div></td></tr></table>



</body>
<script>
google.maps.event.addDomListener(window, 'load', initialize);
</script>
</html>
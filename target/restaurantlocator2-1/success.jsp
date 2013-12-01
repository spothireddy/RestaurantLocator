<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ page import="com.sindhup.restaurantlocator2.Restaurant"%>
 <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false"></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

<title>Test Map</title>
</head>
<body>
<h1>Test Map With multiple</h1>
<%ArrayList<Restaurant> rList = (ArrayList<Restaurant>)request.getAttribute("resList");%>

<%=rList.size() %>
	 
<script type="text/javascript">
<%if (rList.size()>0){%>    
	  var markers = [];
	 
	 function initialize() {
		 var map;
		 var mapOptions;


		  var latlng = new google.maps.LatLng(37.3175, -122.0419);
		 
		  mapOptions = {
				 	zoom:8,
				 	center: latlng,
				 	mapTypeId: google.maps.MapTypeId.ROADMAP
				   };
				   
				    
		   $(document).ready(function () {
		 	map = new google.maps.Map(document.getElementById("map_canvas"), mapOptions);
		 });
		 


		   <%  for (int z=0; z< rList.size();z++) {%>

		   <%Restaurant r = (Restaurant) rList.get(z); %>
	
		     	var latlng2 = new google.maps.LatLng(<%=r.getLatitude()%>,<%=r.getLongitude()%>);
		     	marker=new google.maps.Marker({
		     		   position:latlng2,
		     		   icon:'http://www.google.com/mapfiles/marker.png',
		     		  //animation:google.maps.Animation.BOUNCE
		     		   });
   			 marker.setMap(map)

	<% }%>     
		   	   	 
	 }
	 

	  <%}%>	 


</script>
<table><tr><td width="10" colspan="2"> <div id="map_canvas" style="width: 580px; height: 500px"></div></td></tr></table>



</body>
<script>
google.maps.event.addDomListener(window, 'load', initialize);
</script>
</html>
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
<%=request.getParameter("postcode") %>
<%ArrayList<Restaurant> rList = (ArrayList<Restaurant>)request.getAttribute("resList");%>

<%=rList.size() %>
	 
<script type="text/javascript">
<%if (rList.size()>0){%>    
	  var markers = [];
	 
	 function initialize() {
		 var map;
		 var mapOptions;
		 var latlng;
		 var geocoder;
		 var resAd;
		 
		 
		  mapOptions = {
				 	zoom:12,
				 	mapTypeId: google.maps.MapTypeId.ROADMAP
				   };
				   
				    
		   $(document).ready(function () {
		 	map = new google.maps.Map(document.getElementById("map_canvas"), mapOptions);
		 	geocoder= new google.maps.Geocoder();
		 });

			 geocoder.geocode( { 'address': '<%=request.getParameter("postcode") %>'}, function(results, status) {
			      if (status == google.maps.GeocoderStatus.OK) {
			    	  map.setCenter(results[0].geometry.location);
			      } 
			    });
		 


		   <%  for (int z=0; z< rList.size();z++) {%>

		   <%Restaurant r = (Restaurant) rList.get(z); %>
				
		     	var latlng2 = new google.maps.LatLng(<%=r.getLatitude()%>,<%=r.getLongitude()%>);
		     	marker=new google.maps.Marker({
		     		   position:latlng2,
		     		   icon:'http://www.google.com/mapfiles/marker.png',
		     		  //animation:google.maps.Animation.BOUNCE
		     		   });
		     	marker.setMap(map);
		     	
		     	google.maps.event.addListener(marker, 'click', (function(marker, content) {
		            return function() {
		                infowindow.setContent(content);
		                infowindow.open(map, marker);
		            }
		        })(marker, content));
		     	var infowindow = new google.maps.InfoWindow({
					   content:'<%=r.getResID()%>'
					   });
		     	infowindow.open(map,marker);

		     	google.maps.event.addListener(marker, 'mouseover', function() {
		     	    infowindow.open(map, this);
		     	});

		     	// assuming you also want to hide the infowindow when user mouses-out
		     	google.maps.event.addListener(marker, 'mouseout', function() {
		     	    infowindow.close();
		     	});
		     	infowindow.close();
					 
					 

	<% }%>     
		   	   	 
	 }
	 

	 

	  <%}%>	 


</script>
<table><tr><td width="10" colspan="2"> <div id="map_canvas" style="width: 580px; height: 500px"></div></td></tr></table>


<table>
<s:iterator value="restaurantList">
<%String resID = request.getAttribute("resID").toString();%>
<%String website = request.getAttribute("website").toString();%>
<%String postcode = request.getAttribute("postcode").toString();%>
<%String address = request.getAttribute("address").toString();%>
<%String locality = request.getAttribute("locality").toString();%>


<tr>
<td><s:url id="url" action="infoAction"><s:param name="resID"><%=resID %></s:param></s:url>
<s:a href="%{url}"><s:property value="resID"/></s:a></td>
<td><a href="<%=website %>"><s:property value="name"/></a></td>
<td><%=address %></td>
<td> <%=locality %></td>
<td><s:property value="longitude"/></td>
<td><s:property value="postcode"/></td>
<td><s:property value="rating"/></td>

</tr>
</s:iterator>

</table>
</body>
<script>
google.maps.event.addDomListener(window, 'load', initialize);
</script>
</html>
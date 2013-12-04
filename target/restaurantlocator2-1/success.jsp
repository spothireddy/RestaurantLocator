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

<style type='text/css'>
 .CSSTableGenerator {
	margin:0px;padding:0px;
	width:100%;
	box-shadow: 10px 10px 5px #888888;
	border:1px solid #000000;
	
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
	
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
	
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
	
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
}.CSSTableGenerator table{
    border-collapse: collapse;
        border-spacing: 0;
	width:100%;
	height:100%;
	margin:0px;padding:0px;
}.CSSTableGenerator tr:last-child td:last-child {
	-moz-border-radius-bottomright:0px;
	-webkit-border-bottom-right-radius:0px;
	border-bottom-right-radius:0px;
}
.CSSTableGenerator table tr:first-child td:first-child {
	-moz-border-radius-topleft:0px;
	-webkit-border-top-left-radius:0px;
	border-top-left-radius:0px;
}
.CSSTableGenerator table tr:first-child td:last-child {
	-moz-border-radius-topright:0px;
	-webkit-border-top-right-radius:0px;
	border-top-right-radius:0px;
}.CSSTableGenerator tr:last-child td:first-child{
	-moz-border-radius-bottomleft:0px;
	-webkit-border-bottom-left-radius:0px;
	border-bottom-left-radius:0px;
}.CSSTableGenerator tr:hover td{
	
}
.CSSTableGenerator tr:nth-child(odd){ background-color:#ffaa56; }
.CSSTableGenerator tr:nth-child(even)    { background-color:#ffffff; }.CSSTableGenerator td{
	vertical-align:middle;
	
	
	border:1px solid #000000;
	border-width:0px 1px 1px 0px;
	text-align:left;
	padding:7px;
	font-size:10px;
	font-family:Arial;
	font-weight:normal;
	color:#000000;
}.CSSTableGenerator tr:last-child td{
	border-width:0px 1px 0px 0px;
}.CSSTableGenerator tr td:last-child{
	border-width:0px 0px 1px 0px;
}.CSSTableGenerator tr:last-child td:last-child{
	border-width:0px 0px 0px 0px;
}
.CSSTableGenerator tr:first-child td{
		background:-o-linear-gradient(bottom, #ff7f00 5%, #bf5f00 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #ff7f00), color-stop(1, #bf5f00) );
	background:-moz-linear-gradient( center top, #ff7f00 5%, #bf5f00 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#ff7f00", endColorstr="#bf5f00");	background: -o-linear-gradient(top,#ff7f00,bf5f00);

	background-color:#ff7f00;
	border:0px solid #000000;
	text-align:center;
	border-width:0px 0px 1px 1px;
	font-size:14px;
	font-family:Arial;
	font-weight:bold;
	color:#ffffff;
}
.CSSTableGenerator tr:first-child:hover td{
	background:-o-linear-gradient(bottom, #ff7f00 5%, #bf5f00 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #ff7f00), color-stop(1, #bf5f00) );
	background:-moz-linear-gradient( center top, #ff7f00 5%, #bf5f00 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#ff7f00", endColorstr="#bf5f00");	background: -o-linear-gradient(top,#ff7f00,bf5f00);

	background-color:#ff7f00;
}
.CSSTableGenerator tr:first-child td:first-child{
	border-width:0px 0px 1px 0px;
}
.CSSTableGenerator tr:first-child td:last-child{
	border-width:0px 0px 1px 1px;
}
</style>
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


<div class="CSSTableGenerator" >
<table>
<tr>
    <td>
        Restaurant ID
    </td>
    <td >
        Restaurant Name
    </td>
    <td>
        Address
    </td>
    <td>
        City
    </td>
    <td>
        Zipcode
    </td>
    <td>
        Rating
    </td>
</tr>
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
<td><s:property value="postcode"/></td>
<td><s:property value="rating"/></td>

</tr>
</s:iterator>

</table>
</div>
</body>
<script>
google.maps.event.addDomListener(window, 'load', initialize);
</script>
</html>
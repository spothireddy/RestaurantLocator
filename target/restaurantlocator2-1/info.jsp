<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type='text/css'>
input, textarea { 
	padding: 9px;
	border: solid 1px #E5E5E5;
	outline: 0;
	font: normal 13px/100% Verdana, Tahoma, sans-serif;
	width: 200px;
	background: #FFFFFF;
	}

textarea { 
	width: 400px;
	max-width: 400px;
	height: 150px;
	line-height: 150%;
	}

input:hover, textarea:hover,
input:focus, textarea:focus { 
	border-color: #C9C9C9; 
	}

.form label { 
	margin-left: 10px; 
	color: #999999; 
	}

.submit input {
	width: auto;
	padding: 9px 15px;
	background: #617798;
	border: 0;
	font-size: 14px;
	color: #FFFFFF;
	}
</style>
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
<title>Restaurant Info</title>
</head>
<body>
<h1>Restaurant Information</h1>
<%String resID = request.getAttribute("resID").toString();%>
<div class="CSSTableGenerator" >
<table>
<s:iterator value="restaurantList">
<tr>
<td>Restaurant Info </td>
<td>Values</td>
</tr>
<tr>
<td>Restaurant ID: </td>
<td><s:property value="resID"/></td>
</tr>
<tr>
<td>Restaurant Name: </td>
<td><s:property value="name"/></td>
</tr>
<tr>
<td>Restaurant Address: </td>
<td><s:property value="address"/></td>
</tr>
<tr>
<td>Restaurant Locality: </td>
<td><s:property value="locality"/></td>
</tr>
<tr>
<td>Restaurant Postcode: </td>
<td><s:property value="postcode"/></td>
</tr>
<tr>
<td>Restaurant latitude: </td>
<td><s:property value="latitude"/></td>
</tr>
<tr>
<td>Restaurant longitude: </td>
<td><s:property value="longitude"/></td>
</tr>
<tr>
<td>Restaurant telephone: </td>
<td><s:property value="tel"/></td>
</tr>
<tr>
<td>Restaurant website: </td>
<td><s:property value="website"/></td>
</tr>
<tr>
<td>Restaurant rating: </td>
<td><s:property value="rating"/></td>
</tr>


</s:iterator>


</table>
</div>
<h2>Cuisines:</h2>
<ul>
<s:iterator value="restaurantCuisineList">
<%String cuisine = request.getAttribute("cuisine").toString();%>
<li><s:property value="cuisine"/></li>

</s:iterator>
</ul>
<h2>Comments:</h2>
<div class="CSSTableGenerator" >
<table>
<tr>
    <td >
        User Name
    </td>
    <td>
        User Comment
    </td>
    <td>
        User Rating
    </td>
</tr>
<s:iterator value="userList">

<tr>
<td><s:property value="userName"/></td>
<td><s:property value="userComment"/></td>
<td><s:property value="userRating"/></td>
</tr>
</s:iterator>
</table>
</div>


<h3>Add a Comment!</h3>
<s:form  action="addCommentAction" >
  <s:textfield name="userName" label="Your Name" />
  <s:textarea name="userComment" label="Your Comment" />
  <s:textfield name="userRating" label="Your Rating" />
  <s:hidden name="resID" value="%{resID}" />
  <s:submit />
</s:form>


</body>
</html>
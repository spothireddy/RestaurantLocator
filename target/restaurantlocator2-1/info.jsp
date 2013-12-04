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
<title>Restaurant Info</title>
</head>
<body>
<%String resID = request.getAttribute("resID").toString();%>
<p>ANOTHER</p>
<p><s:property value="resID"></s:property></p>
<h3>BLAH</h3>
<table>
<s:iterator value="restaurantList">
<tr>
<td><s:property value="resID"/></td>
<td><s:property value="longitude"/></td>
<td><s:property value="postcode"/></td>
<td><s:property value="rating"/></td>

</tr>
</s:iterator>


</table>
<h2>Cuisines:</h2>
<s:iterator value="restaurantCuisineList">
<%String cuisine = request.getAttribute("cuisine").toString();%>

<s:property value="resID"/>
<s:property value="cuisine"/>
<p>Yum: <%=cuisine %>, <p>
</s:iterator>

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
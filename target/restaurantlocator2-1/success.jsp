<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Successful Zip Entry</title>
</head>
<body>
   
<b>All the restaurants</b><br/>
<s:iterator value="restaurantList">
	<s:property value="name"/> , 
	<s:property value="resID"/>,
	<s:property value="postcode"/><br/>
</s:iterator>
<br/><br/>
</body>
</html>
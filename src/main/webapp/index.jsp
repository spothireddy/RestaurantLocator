<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Restaurant Finder</h1>
<h3>Find by zipcode:</h3>
<s:form  action="selectZipcodeAction" >
  <s:textfield name="postcode" label="Postcode" />
  <s:submit />
</s:form>

<br />
<h3>Find by potcode and cuisine:</h3>
<s:form  action="selectZipCusAction" >
  <s:textfield name="postcode" label="Postcode" />
  <s:textfield name="cuisine" label="Cuisine" />
  <s:submit />
</s:form>

<h3>Find by restaurant name:</h3>
<s:form  action="selectResNameAction" >
  <s:textfield name="name" label="Restaurant Name" />
  <s:submit />
</s:form>

</body>
</html>
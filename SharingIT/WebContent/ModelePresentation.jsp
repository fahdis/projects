<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@ taglib uri="http://tiles.apache.org/tags-tiles"
prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="titrePage"/></title>
</head>
<body>
<tiles:insertAttribute name="entete"/>
<tiles:insertAttribute name="contenu"/>
<tiles:insertAttribute name="piedpage"/>



</body>
</html>
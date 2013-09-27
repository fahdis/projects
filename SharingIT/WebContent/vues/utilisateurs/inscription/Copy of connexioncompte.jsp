<%@taglib uri="/struts-tags"prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Atelier 2</title>
</head>
<body>
 <s:form method="POST" action="connection" >
 	<s:textfield name="email" label="Email" />
 	<s:password name="password" label="Mot de passe"></s:password>
 	<s:reset name="reset" label="Effacer"></s:reset>

 	<s:submit value="Valider"/>
 </s:form>
 
<!-- Pieds de page -->

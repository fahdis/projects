<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h3>Ajouter un client</h3>
<s:form method="post" action="ValiderAjouter_Client">
<s:textfield name="identifiant" id="identifiant"
label="Identifiant" labelposition="top" cssClass="input"/>
<s:textfield name="motdepasse" id="motdepasse" label="Mot de
passe" labelposition="top" cssClass="input"/>
<s:submit value="Ajouter un client"/>
</s:form>

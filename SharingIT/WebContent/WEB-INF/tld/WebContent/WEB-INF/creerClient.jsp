<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Création d'un client</title>
<link type="text/css" rel="stylesheet" href="inc/style.css"/>
</head>
<body>
<div>
<form method="get" action="creationClient">
<fieldset>
<legend>Informations client</legend>
<label for="nomClient"> Nom <span class="requis">*</span></label>
<input type="text" id="nomClient" name="nomClient" value="Votre Nom" size="20" maxlength="20" />
<br>
<label for="prenomClient"> Prénom</label>
<input type="text" id="prenomClient" name="prenomClient" value="Votre Prenom" size="20" maxlength="20"/> 
<br/>
<label for="adresseClient">Adresse de livraison<span class="requis">*</span></label>
<input type="text" id="adresseClient"
name="adresseClient" value="" size="20" maxlength="20" />
<br />
<label for="telephoneClient">Numéro de téléphone
<span class="requis">*</span></label>
<input type="text" id="telephoneClient"
name="telephoneClient" value="" size="20" maxlength="20" />
<br />
<label for="emailClient">Adresse Email <span class="requis"> *</span></label>
<input type="email" id="emailClient"
name="emailClient" value="" size="20" maxlength="60" />
<br />

</fieldset>
<input type="submit" value="Valider"  />
<input type="reset" value="Remettre à zéro" /> <br/>



</form>









</div>
</body>
</html>
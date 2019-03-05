<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>login</title>
</head>
<body>
	<h1>LOGIN</h1>
	<p>
	Merci de bien vouloir renseigner les champs user et pass afin d'acceder à notre boutique en ligne
	</p>
	
	<div >
		<!-- formulaire de login renvoi sur la servlet ctrllogin pour verification -->
		<form method='post' action="frontControleur?cmd=Login">
			<!-- champs user -->
			<label for='user'>user</label>
			<input type='text' name='user'>
			
			<!-- champs pass -->
			<label for='pass'>pass</label>
			<input type='password' name='pass'>
			
			<!-- bouton submit -->
			<input type='submit' name='buttonSub'>
		
		
		</form>
	
	
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<style></style>

</head>
<body>

	<div class="container mt-5" align="center">
	
	<h3>Employee Signup Form</h3>
		<form action="Signup" method="post">
			<b> Employee ID :</b> <input type="text" name="empid" class="my-1"><br>
			<b> Password :</b> <input type="password" name="pass" class="my-1"><br>
			<b> First Name :</b> <input type="text" name="fname" class="my-1"><br>
			<b> Last Name :</b> <input type="text" name="lname" class="my-1"><br>
			<b> Date of Birth :</b> <input type="text" name="dob" class="my-1"><br>
			<b> Contact Number :</b> <input type="text" name="contact" class="my-1"><br>
			<input class="btn btn-success my-3" type="submit" value="Submit">
			<a href="login.jsp" class="btn btn-outline-secondary mx-2 my-3">Already an user?</a>
		</form>
		
	</div>


	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Roboto, Helvetica, sans-serif;
}
/* Fix the button on the left side of the page */
.open-btn {
	display: flex;
	justify-content: left;
}
/* Style and fix the button on the page */
.open-button {
	background-color: #1c87c9;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	opacity: 0.8;
	position: fixed;
}
/* Position the Popup form */
.login-popup {
	position: relative;
	text-align: center;
	width: 100%;
}
/* Hide the Popup form */
.form-popup {
	display: none;
	position: fixed;
	left: 45%;
	top: 5%;
	transform: translate(-45%, 5%);
	border: 2px solid #666;
	z-index: 9;
}
/* Styles for the form container */
.form-container {
	max-width: 300px;
	padding: 20px;
	background-color: #fff;
}
/* Full-width for input fields */
.form-container input[type=text], .form-container input[type=password] {
	width: 100%;
	padding: 10px;
	margin: 5px 0 22px 0;
	border: none;
	background: #eee;
}
/* When the inputs get focus, do something */
.form-container input[type=text]:focus, .form-container input[type=password]:focus
	{
	background-color: #ddd;
	outline: none;
}
/* Style submit/login button */
.form-container .btn {
	background-color: #8ebf42;
	color: #fff;
	padding: 12px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	margin-bottom: 10px;
	opacity: 0.8;
}
/* Style cancel button */
.form-container .cancel {
	background-color: #cc0000;
}
/* Hover effects for buttons */
.form-container .btn:hover, .open-button:hover {
	opacity: 1;
}
</style>
</head>
<body>

	<h2>Popup Form</h2>
	<p>Click on the "Open Form" button to open the Popup form.</p>
	<div class="open-btn">
		<button class="open-button" onclick="openForm()">
			<strong>Open Form</strong>
		</button>
	</div>
	<div class="login-popup">
		<div class="form-popup" id="popupForm">
			<form action="login" class="form-container">
				<h2>Please Log in</h2>
				<label for="email"> <strong>E-mail</strong>
				</label> <input type="text" id="email" placeholder="Your Email" name="email"
					required> <label for="psw"> <strong>Password</strong>
				</label> <input type="password" id="psw" placeholder="Your Password"
					name="psw" required>
				<button type="submit" class="btn">Log in</button>
				<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
			</form>
		</div>
	</div>
	<script>
		function openForm() {
			document.getElementById("popupForm").style.display = "block";
		}

		function closeForm() {
			document.getElementById("popupForm").style.display = "none";
		}
	</script>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="css/registration.css">

<script>
	var stateObject = ${stateObject};

	window.onload = function() {

		myInput.onfocus = function() {
			document.getElementById("message").style.display = "block";
		}

		var countySel = document.getElementById("countySel"), stateSel = document
				.getElementById("stateSel"), citySel = document
				.getElementById("citySel");

		for ( var country in stateObject) {
			countySel.options[countySel.options.length] = new Option(country,
					country);
		}
		countySel.onchange = function() {
			stateSel.length = 1;
			citySel.length = 1;
			if (this.selectedIndex < 1)
				return;
			for ( var state in stateObject[this.value]) {
				stateSel.options[stateSel.options.length] = new Option(state,
						state);
			}
		}

		countySel.onchange();
		stateSel.onchange = function() {
			citySel.length = 1;
			if (this.selectedIndex < 1)
				return;
			var district = stateObject[countySel.value][this.value];
			for (var i = 0; i < district.length; i++) {
				citySel.options[citySel.options.length] = new Option(
						district[i], district[i]);
			}
		}
	}
</script>
</head>

<body>

	<h2>Registration</h2>
	<div class="container">
		<form method="post" action="userRegistration" id="userRegistration">
			<div class="row">
				<div class="col-25">
					<label for="fname">First Name:* </label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="FirstName" value="${FirstName}"
						placeholder="Your name.." required="required"
						${disable ?'disabled="disabled"':''}>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Last Name :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="LastName" value="${LastName}"
						placeholder="Your last name.."
						${disable ?'disabled="disabled"':''}>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="email">Email</label>
				</div>
				<div class="col-75">
					<input type="email" id="email" name="EmailId" value="${EmailId}"
						placeholder="Your Email Id.." ${disable ?'disabled="disabled"':''}>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="mobile_no">Mobile No</label>
				</div>
				<div class="col-75">
					<input type="number" id="mobile_no" name="MobileNo"
						value="${MobileNo}" placeholder="Your Mobile No.."
						${disable ?'disabled="disabled"':''}>
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="country">Country*</label>
				</div>
				<div class="col-75">
					<select required name="country" id="countySel" size="1"
						${disable ?'disabled="disabled"':''}><option value=""
							selected="selected" ${disable ?'disabled="disabled"':''}>${Country}</option></select>
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="state">State*</label>
				</div>
				<div class="col-75">
					<select name="state" id="stateSel" size="1"
						${disable ?'disabled="disabled"':''}><option value=""
							selected="selected" ${disable ?'disabled="disabled"':''}>${State}</option></select>
				</div>
			</div>


			<div class="row">
				<div class="col-25">
					<label for="city">City*</label>
				</div>
				<div class="col-75">
					<select name="city" id="citySel" size="1"
						${disable ?'disabled="disabled"':''}><option value=""
							selected="selected" ${disable ?'disabled="disabled"':''}>${City}</option></select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="username">Username*</label>
				</div>
				<div class="col-75">
					<input type="text" id="username" name="Username"
						value="${Username}" placeholder="Your Username..."
						required="required" ${disable ?'disabled="disabled"':''}>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="password">Password*</label>
				</div>
				<div class="col-75">
					<input type="password" id="password" name="Password"
						value="${Password}" placeholder="Your Password.."
						required="required" ${disable ?'disabled="disabled"':''}
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
						required>
				</div>
			</div>
			<div class="row" id="message">
				<h4>Password must contain the following:</h4>
				<h4 id="letter" class="invalid">
					A <b>lowercase</b> letter
				</h4>
				<h4 id="capital" class="invalid">
					A <b>capital (uppercase)</b> letter
				</h4>
				<h4 id="number" class="invalid">
					A <b>number</b>
				</h4>
				<h4 id="length" class="invalid">
					Minimum <b>8 characters</b>
				</h4>
			</div>

		<div class="row">
		<label></label>
		</div>
		
		<h3>${successRegMsg}</h3>
			<div class="row">
			
				<!-- <button class="back-home-btn" onclick="toHomePage()">Back</button> -->
				<button class="signup" ${disable ?'disabled="disabled"':''}>Sign Up</button>
			</div>

		</form>
		<div class="row">
		<label></label>
		</div>
			<div class="row">
				<button class="back-home-btn" onclick="toHomePage()">Back</button>
			</div>
	</div>

	<script>
		function toHomePage() {
			location.href = "home";
		}

		var myInput = document.getElementById("password");
		var letter = document.getElementById("letter");
		var capital = document.getElementById("capital");
		var number = document.getElementById("number");
		var length = document.getElementById("length");

		// When the user clicks on the password field, show the message box
		myInput.onfocus = function() {
			document.getElementById("message").style.display = "block";
		}

		// When the user clicks outside of the password field, hide the message box
		/* myInput.onblur = function() {
		  document.getElementById("message").style.display = "none";
		} */

		// When the user starts to type something inside the password field
		myInput.onkeyup = function() {
			// Validate lowercase letters
			var lowerCaseLetters = /[a-z]/g;
			if (myInput.value.match(lowerCaseLetters)) {
				letter.classList.remove("invalid");
				letter.classList.add("valid");
			} else {
				letter.classList.remove("valid");
				letter.classList.add("invalid");
			}

			// Validate capital letters
			var upperCaseLetters = /[A-Z]/g;
			if (myInput.value.match(upperCaseLetters)) {
				capital.classList.remove("invalid");
				capital.classList.add("valid");
			} else {
				capital.classList.remove("valid");
				capital.classList.add("invalid");
			}

			// Validate numbers
			var numbers = /[0-9]/g;
			if (myInput.value.match(numbers)) {
				number.classList.remove("invalid");
				number.classList.add("valid");
			} else {
				number.classList.remove("valid");
				number.classList.add("invalid");
			}

			// Validate length
			if (myInput.value.length >= 8) {
				length.classList.remove("invalid");
				length.classList.add("valid");
			} else {
				length.classList.remove("valid");
				length.classList.add("invalid");
			}
		}
	</script>
</body>
</html>

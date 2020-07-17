<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>

<!-- <link rel="stylesheet" type="text/css" href="css/registration.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

					<style type="text/css">
					input[type=text], select, textarea {
						width: 80%;
						padding: 12px;
						border: 1px solid #ccc;
						border-radius: 4px;
						resize: vertical;
					}
					input[type=select] {
						width: 80%;
						padding: 12px;
						border: 1px solid #ccc;
						border-radius: 4px;
						resize: vertical;
					}
					
					input[type=password] {
						width: 80%;
						padding: 12px;
						border: 1px solid #ccc;
						border-radius: 4px;
						resize: vertical;
					}
					
					input[type=email] {
						width: 80%;
						padding: 12px;
						border: 1px solid #ccc;
						border-radius: 4px;
						resize: vertical;
					}
					input[type=number] {
						width: 80%;
						padding: 12px;
						border: 1px solid #ccc;
						border-radius: 4px;
						resize: vertical;
					}
					
					label {
						padding: 12px 12px 12px 0;
						display: inline-block;
					}
					
					input[type=submit] {
						background-color: #4CAF50;
						color: white;
						padding: 12px 20px;
						border: none;
						border-radius: 4px;
						cursor: pointer;
						float: right;
					}
					
					input[type=submit]:hover {
						background-color: #45a049;
					}
					
					.container {
						border-radius: 5px;
						background-color: #f2f2f2;
						padding: 30px;
						margin: 20px
					}
					
					.col-25 {
						float: left;
						width: 25%;
						margin-top: 6px;
					}
					
					.col-75 {
						float: left;
						width: 75%;
						margin-top: 6px;
					}
					
					.row:after {
						content: "";
						display: table;
						clear: both;
					}
					
					@media screen and (max-width: 600px) {
						.col-25, .col-75, input[type=submit] {
							width: 80%;
							margin-top: 0;
						}
					}
					
					.signup {
						background: rgb(0, 196, 65);
						color: #fff;
						font-weight: bold;
						cursor: pointer;
						transition: background 0.23s;
						float: left;
						padding: 8px;
						text-align: center;
						border: none;
						border-radius: 3px;
						font-size: 1em;
					}
					
					.signup:hover {
						background: rgb(0, 180, 50);
					}
					</style>
					
					
<script>
var stateObject = ${stateObject};

window.onload = function() {
	
	var countySel = document.getElementById("countySel"), stateSel = document.getElementById("stateSel"), citySel = document.getElementById("citySel");

		for ( var country in stateObject) {
			countySel.options[countySel.options.length] = new Option(country, country);
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

	<div class="container">
		<form method="post" action="userRegistration" id="userRegistration">
			<div class="row">
				<div class="col-25">
					<label for="fname">First Name:* </label>
				</div>
				<div class="col-75">
					<input type="text" id="fname" name="FirstName" value="${FirstName}" placeholder="Your name.." required="required">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="lname">Last Name :</label>
				</div>
				<div class="col-75">
					<input type="text" id="lname" name="LastName" value="${LastName}" placeholder="Your last name..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="email">Email</label>
				</div>
				<div class="col-75">
					<input type="email" id="email" name="EmailId" value="${EmailId}" placeholder="Your Email Id..">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="mobile_no">Mobile No</label>
				</div>
				<div class="col-75">
					<input type="number" id="mobile_no" name="MobileNo" value="${MobileNo}" placeholder="Your Mobile No..">
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-25">
					<label for="countryName">Country*</label>
				</div>
				<div class="col-75">
					<select required name="countryName" id="countySel" size="1"><option value="" selected="selected">Select Country</option></select>			
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-25">
					<label for="stateName">State*</label>
				</div>
				<div class="col-75">
					<select name="stateName" id="stateSel" size="1"><option value="" selected="selected">Please select Country first</option></select> 
				</div>
			</div>
			
			
			<div class="row">
				<div class="col-25">
					<label for="cityName">City*</label>
				</div>
				<div class="col-75">
					<select name="cityName" id="citySel" size="1"><option value="" selected="selected">Please select State first</option></select>
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="username">Username*</label>
				</div>
				<div class="col-75">
					<input type="text" id="username" name="Username" placeholder="Your Username..." required="required">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="password">Password*</label>
				</div>
				<div class="col-75">
					<input type="password" id="password" name="Password" placeholder="Your Password.." required="required">
				</div>
			</div>
			<div class="row">
				<button class="signup">Sign Up</button>
			</div>
  
 			 <h3>${successRegMsg}</h3>
		</form>
	</div>
</body>
</html>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="css/feedback.css">

</head>
<body>

	<h2>Feedback</h2>

	<div class="container">
		<form name="RegForm" method="post" action="feedbackSubmit"
			onsubmit="return validateInput()">
			<h4>
				We Would Like To Hear more about your experience <i
					class='far fa-comments' style='font-size: 48px; color: limegreen'></i>
			</h4>

			<div class="row">
				<p>Help Us to serve you better !!</p>
				<p>
					Choose the Rating on scale of 1 to 5 <i class='far fa-smile'
						style='font-size: 24px; color: limegreen'></i> <br>(1 being
					lowest 5 being Highest)
				</p>

				<div class="col-25">
					<p>The Website has User Friendly Interface?</p>
				</div>
				<div class="col-75">
					<br> <input type="radio" name="understandability" value=1
						required /> 1 <br> <input type="radio"
						name="understandability" value=2> 2 <br> <input
						type="radio" name="understandability" value=3> 3 <br>
					<input type="radio" name="understandability" value=4> 4 <br>
					<input type="radio" name="understandability" value=5> 5
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<p>Was the website able to satisfy your query ?</p>
				</div>
				<div class="col-75">
					<br> <input type="radio" name="reliability" value=1 required />
					1 <br> <input type="radio" name="reliability" value=2>
					2 <br> <input type="radio" name="reliability" value=3>
					3 <br> <input type="radio" name="reliability" value=4>
					4 <br> <input type="radio" name="reliability" value=5>
					5
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="comments">Additional Comments</label>
				</div>

				<div class="col-75">
					<textarea id="comments" name="additionalComments"
						placeholder="Write Comments.." style="height: 200px" required></textarea>
				</div>
			</div>
			<h3>${successFeedback}</h3>

			<div class="row">
				<button class="back-home-btn" onclick="toHomePage()">Back</button>
				<input type="submit" value="Submit">
			</div>

		</form>
	</div>

	<script>
         function toHomePage()
            {
                location.href="home";
            }

          function validateInput() {

              console.log('in validate input')
              var x1, x2, x3, x4, x5, x6, text;
              // Get the value of the input field
              var x1 = document.forms["RegForm"]["fname"];
              var x2 = document.forms["RegForm"]["lname"];
              var x3 = document.forms["RegForm"]["email"];
              var x4 =  document.forms["RegForm"]["mobile_no"];
              var x5 = document.forms["RegForm"]["understandability"];
              var x6 = document.forms["RegForm"]["reliability"];
              var x7 = document.forms["RegForm"]["additionalComments"];
              var emailText=x3.value
              var letters = /^[A-Za-z]+$/;
              var atposition=emailText.indexOf("@");
              var dotposition=emailText.lastIndexOf(".");
              console.log(x1, x2, x3, x4, x5, x6, x7)

              if (isNaN(x4.value)) {
                  window.alert("Invalid Phone Number");
                  x4.focus();
                  return false;
                     }
              if(atposition<1 || dotposition<atposition+2 || dotposition+2>=emailText.length){
                  window.alert("Please Enter Valid Email");
                  x3.focus();
                  return false;
              }
              if(x1.value.match(letters) == null){
                  window.alert("Name cannot have Numerics");
                  x1.focus();
                  return false;
              }
              if(x2.value.match(letters) == null){
                  window.alert("Name cannot have Numerics");
                  x2.focus();
                  return false;
              }

              return true;
          }

    </script>
</body>
</html>
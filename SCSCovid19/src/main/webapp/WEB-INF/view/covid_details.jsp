<%@page import="com.example.scs.controller.CovidController"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Covid Dashboard</title>

<link rel="stylesheet" type="text/css" href="css/covid_details.css">

<script>

	var countryDtls = ${allCountryDetails};
	console.log("countryDtls..." + countryDtls);
	
	var stateObject = ${stateObject};
	console.log("stateObject" + stateObject);

	
	var countryList = [ "India", "Germany"];
	window.onload = function() {

		var table = document.createElement("TABLE");
		table.border = "1";

		var columnCount = countryDtls[0].length;

		var row = table.insertRow(-1);
		for (var i = 0; i < columnCount; i++) {
			var headerCell = document.createElement("TH");
			if(i==0)
				headerCell.innerHTML = ["Country Id"];
			if(i==1)
				headerCell.innerHTML = ["Country Name"];
			if(i==2)
				headerCell.innerHTML = ["Total Cases"];
			if(i==3)
				headerCell.innerHTML = ["Active Cases"];
			if(i==4)
				headerCell.innerHTML = ["Recovered Cases"];
			if(i==5)
				headerCell.innerHTML = ["Death Cases"];
			if(i==6)
				headerCell.innerHTML = ["Daily New Cases"];
			if(i==7)
				headerCell.innerHTML = ["Daily Recovered Cases"];
			if(i==8)
				headerCell.innerHTML = ["Daily Death Cases"];
			
			row.appendChild(headerCell);
		}

		for (var i = 0; i < countryDtls.length; i++) {
			row = table.insertRow(-1);
			for (var j = 0; j < columnCount; j++) {
				var cell = row.insertCell(-1);
				if(j==1){
					cell.innerHTML = countryList[i];
				} else {
					cell.innerHTML = countryDtls[i][j];
				}	
			}
		}
		
		var covidDetailsTbl = document.getElementById("covidDetailsTbl");
		covidDetailsTbl.innerHTML = "";
		covidDetailsTbl.appendChild(table);


		// DropDown selection - Country state city
		var countySel = document.getElementById("countySel"), 
		stateSel = document.getElementById("stateSel"), 
		citySel = document.getElementById("citySel");

		for ( var country in stateObject) {
			countySel.options[countySel.options.length] = new Option(country, country);
		}
		countySel.onchange = function() {
			stateSel.length = 1; // remove all options bar first
			citySel.length = 1; // remove all options bar first
			if (this.selectedIndex < 1)
				return; // done 
			for ( var state in stateObject[this.value]) {
				stateSel.options[stateSel.options.length] = new Option(state,
						state);
			}
		}

		countySel.onchange(); // reset in case page is reloaded
		stateSel.onchange = function() {
			citySel.length = 1; // remove all options bar first
			if (this.selectedIndex < 1)
				return; // done 
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
		<h4>Hello ${firstName} !</h4>
		<p style="color:RED">${alertMsg}</p>

		<!-- <div class="row">
		<input type="submit" id="feedback" value="Feedback" onclick="feedback()">
			<button class="feedbackBtn" onclick="feedback()">Feedback</button>
		</div> -->


		<form name="myform" id="myForm" action="getRegionalCovidDetails">

			<div class="row" align="center">
				<div class="col-35">
					<label for="countryName">Select Country: </label> <br /> <select
						required name="countryName" id="countySel" size="1">
						<option value="" selected="selected">Select Country</option>
					</select>
				</div>
				<div class="col-35">
					<label for="stateName">Select State: </label> <br /> <select
						name="stateName" id="stateSel" size="1">
						<option value="" selected="selected">Please select
							Country first</option>
					</select>
				</div>
				<div class="col-35">
					<label for="cityName">Select City: </label> <br /> <select
						name="cityName" id="citySel" size="1">
						<option value="" selected="selected">Please select State
							first</option>
					</select>
				</div>

				<!-- <div class="col-25">
						<input type="submit" id="submit" value="Submit">
					</div> -->
			</div>
			<br />
			<br />

			<div class="row" align="center">
				<div align="center">
					<input type="submit" id="submit" value="Submit">
				</div>
			</div>
		</form>




		<div class="row">
			<div class="col-25">
				<label for="TotalCases">Total Cases:</label> <br /> <input
					type="text" id="TotalCases" name="TotalCases" value="${TotalCases}"
					readonly="readonly">
			</div>
			<div class="col-25">
				<label for="ActiveCases">Active Cases:</label> <br /> <input
					type="text" id="ActiveCases" name="ActiveCases"
					value="${ActiveCases}" readonly="readonly">
			</div>
			<div class="col-25">
				<label for="Recovered">Recovered:</label> <br /> <input type="text"
					id="Recovered" name="Recovered" value="${Recovered}"
					readonly="readonly">
			</div>
			<div class="col-25">
				<label for="Deaths">Deaths:</label> <br /> <input type="text"
					id="Deaths" name="Deaths" value="${Death}" readonly="readonly">
			</div>
		</div>
		<br />

		<%-- <p class="blink" id="zoneId"  style="color:${Zone};">Government has declared it as ${Zone} Zone</p>--%>
		<p class="blink" id="zoneId" style="color:${Zone};">${ZoneInfo}</p>

		<br />
		<hr />
		<br /> 
		<textarea id="myInput" onkeyup="myFunction()" placeholder="Search for Country..." title="Type in a name" rows="1"></textarea><label>Last updated on : ${lastUpdatedOn}</label>

		<div id="covidDetailsTbl" class="table table-fluid" align="center" width=100%></div>


		<div class="row">
			<!-- <input type="submit" id="feedback" value="Feedback" onclick="feedback()"> org-->
			<button class="feedback-home-btn" onclick="feedback()">Feedback</button>
			<button class="back-home-btn" onclick="toHomePage()">Back</button>
		</div>
	</div>

	<script type="text/javascript">

	 function toHomePage()
     {
         location.href="home";
     }
     
	function myFunction() {
		  var input, filter, table, tr, td, i, txtValue;
		  input = document.getElementById("myInput");
		  filter = input.value.toUpperCase();
		  table = document.getElementById("covidDetailsTbl");
		  tr = table.getElementsByTagName("tr");
		  for (i = 0; i < tr.length; i++) {
		    td = tr[i].getElementsByTagName("td")[1];
		    if (td) {
		      txtValue = td.textContent || td.innerText;
		      if (txtValue.toUpperCase().indexOf(filter) > -1) {
		        tr[i].style.display = "";
		      } else {
		        tr[i].style.display = "none";
		      }
		    }       
		  }
		}

	function feedback() {
		location.href = 'giveFeedback';
	}

	</script>
</body>
</html>


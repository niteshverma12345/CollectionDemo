<html>
<head>



<style>
.form-div {
	margin: 40px;
	float: right;
}
</style>


<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">BlogApp</a>

		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="#">Home</a></li>



			</ul>


		</div>
	</div>

</nav>


<body>
	<div class="form-div">
		<form class="container" action="regisData" >
			<div class="row">
				<div class="col m6 offset-m3">
					<div class="card">
						<div class="card-content">
							<h5>Registration here...</h5>

							<input type="text" name="name" id="name" placeholder="Enter Name"
								size="15"> <input type="Number" name="roll_number"
								id="roll_number" placeholder="Roll_number" size="15"> <input
								type="text" name="address" id="address"
								placeholder="Enter Address" size="15"> <input
								type="text" name="city" id="city" placeholder="Enter City"
								size="15"> <input type="text" name="schl" id="schl"
								placeholder="Enter school" size="15"> <input
								type="submit" name="submit" class="btn blue"> <input
								type="reset" name="reset" class="btn  purple darken-4"><br>
							<br> <a href="login">Already have an acount</a>
						</div>
					</div>
				</div>
			</div>
	</div>
</body>
</html>

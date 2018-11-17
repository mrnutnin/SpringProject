<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Register Page</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
	<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<!--===============================================================================================-->


</head>

<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">
				<form class="login100-form validate-form" action="/addMember" method="POST" name="login">
					<a href="/"><img src="images/icons/favicon.ico" height="35" width="35"></a>
					<span class="login100-form-title p-b-55">
						Sign Up
					</span>

					<!-- Email -->
					<div class="wrap-input100 validate-input m-b-16" data-validate="Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="email" placeholder="Email">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-envelope"></span>
						</span>
					</div>

					<!-- Password -->
					<div class="wrap-input100 validate-input m-b-16" data-validate="Password is required">
						<input class="input100" type="password" name="password" placeholder="Password" id="txtNewPassword">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-lock"></span>
						</span>
					</div>


					<!-- Re-Password -->
					<div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
						<input class="input100" type="password" name="passwordConf" placeholder="Re-Password" id="txtConfirmPassword">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-lock"></span>
						</span>
					</div>
					<div style="color: red" class="registrationFormAlert" id="divCheckPasswordMatch"></div>


					<!-- Username -->
					<div class="wrap-input100 validate-input m-b-16" data-validate="Username is required">
						<input class="input100" type="text" name="username" placeholder="Username">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
						</span>
					</div>

					<!-- Phone -->
					<div class="wrap-input100 validate-input m-b-16" data-validate="Phone is required">
						<input class="input100" type="text" name="phone" placeholder="Phone">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
						</span>
					</div>

					<div class="container-login100-form-btn p-t-25">
						<button class="login100-form-btn" type="submit">
							Sign Up
						</button>
					</div>

				</form>
			</div>
		</div>
	</div>

</body>

	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>
	<script src="js/check.js"></script>

</html>
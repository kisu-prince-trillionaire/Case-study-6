<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>REGISTRATION PAGE</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>
	<div class="text-center container mt-5">
		<h1>D_PHONE</h1>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
			crossorigin="anonymous">
			
		</script>
		<h1>WELCOME TO D_PHONE</h1>
		<h3>One of the best online buying platform</h3>
		<form action="addReferral">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" class="form-control"
					id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					email with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Full Name</label>
				<input type="text" class="form-control" id="exampleInputEmail1"
					name="name" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					details with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Phone
					Number</label> <input type="number" class="form-control"
					id="exampleInputEmail1" name="mobileNo" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					details with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Age
					</label> <input type="number" class="form-control"
					id="exampleInputEmail1" name="age" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					details with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Referral
					Code</label> <input type="text" class="form-control"
					id="exampleInputEmail1" name="refferalCode"
					aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					details with anyone else.</div>
			</div>
			<div class="mb-3 form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div>
			<button type="submit" class="btn btn-primary">Add Referral</button>
		</form>
	</div>
</body>
</html>
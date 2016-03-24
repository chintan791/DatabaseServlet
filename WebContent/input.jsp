
<!DOCTYPE html>
<html lang="en">
<head>
<title>Hello World</title>
<style>
.error {
	color: red;
}

.success {
	color: green;
}
</style>
</head>
<body>
	<form action="DatabaseServlet" method="post">
		<h1>Hello</h1>

		<h2>Select author:</h2>
		<input type="text" name="name"><br>

		<p>

			<input type="submit">

		</p>
	</form>
	<h2>To print full table</h2>
	<form action="DatabaseServlet2" method="post">


		<p>

			<input type="submit">

		</p>



	</form>
</body>
</html>
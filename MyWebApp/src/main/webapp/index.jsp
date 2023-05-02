<!DOCTYPE html>
<html>
<head>
	<title>My JSP Page</title>
</head>
<body>
	<h1>Welcome to my JSP Page</h1>

	<p>The current date and time is: <%= new java.util.Date() %></p>

	<form action="processForm.jsp" method="post">
		<label for="name">Name:</label>
		<input type="text" id="name" name="name" />
		<br />

		<label for="email">Email:</label>
		<input type="email" id="email" name="email" />
		<br />

		<input type="submit" value="Submit" />
	</form>

</body>
</html>
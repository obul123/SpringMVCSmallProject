<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp Page</title>
<body>
<body>
	<center>
		<h3>Registration Form</h3>
		<form action="signup" method="post">
			<table>
				<tr>
					<td>First Name :</td>
					<td><input type="text" name="fname"></td>
					<br>
				</tr>
				<tr>
					<td>Second Name :</td>
					<td><input type="text" name="sname"></td>
					<br>
				</tr>
				<tr>
					<td>Mobile Number :</td>
					<td><select name="country_code">
							<option value="+91">+91</option>
							<option value="+1">+258</option>
					</select> <input type="text" name="mobile"></td>
					<br>
				</tr>
				<tr>
					<td>Email Address :</td>
					<td><input type="text" name="mailid"></td>
					<br>
				</tr>
				<tr>
					<td>Gender :</td>
					<td><input type="radio" value="Male" name="gen">Male <input
						type="radio" value="Female" name="gen">Female</td>
				</tr>
				<br>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="pass"><br></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Signup">
					</td>
					<td>Already Registered?<a href="index.jsp" > Login here</a></td>
				</tr>
			</table>
		</form>
	</center>
</body>
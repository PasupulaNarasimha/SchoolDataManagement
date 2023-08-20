<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateStudent" method="post">
<fieldset>
<legend>Update Student Form</legend>
Id=<input type="number" name="id" placeholder="Enter Id"><br><br>
Name=<input type="text" name="name" placeholder="Enter Name"><br><br>
Email=<input type="text" name="email" placeholder="Enter Email"><br><br>
Std=<input type="number" name="std" placeholder="Enter Std"><br><br>
Section=<input type="text" name="sec" placeholder="Enter Section"><br><br>
DateOfBirth=<input type="date" name="dob" placeholder="Enter Date of Birth"><br><br>
ThroughoutPercentage=<input type="text" name="tp" placeholder="Enter Throught Percentage"><br><br>
Password=<input type="text" name="pass" placeholder="Enter Password"><br><br>
<input type="submit">
</fieldset>
</form>

</body>
</html>
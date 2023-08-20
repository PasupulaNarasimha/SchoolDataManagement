<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="saveTeacher" method="post">
<fieldset>
<legend>Save Teacher Form</legend>
Id=<input type="number" name="id" placeholder="Enter Id"><br><br>
Name=<input type="text" name="name" placeholder="Enter Name"><br><br>
Email=<input type="text" name="email" placeholder="Enter Email"><br><br>
Subject=<input type="text" name="sub" placeholder="Enter Subject"><br><br>
Salary=<input type="number" name="sal" placeholder="Enter Salary"><br><br>
DateOfJoining=<input type="date" name="doj" placeholder="Enter Date fo Joining"><br><br>
ClassTeacher=<input type="text" name="ct" placeholder="Enter Class teacher"><br><br>
password=<input type="text" name="pass" placeholder="Enter Password"><br><br>
<input type="submit">
</fieldset>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="updateadmin" method="post">
<fieldset>
<legend>Update Admin Form</legend>

Id=<input type="number" name="id" placeholder="Enter Id"><br><br>
Name=<input type="text" name="name" placeholder="Enter Usre Name"><br><br>
Email=<input type="text" name="email" placeholder="Enter Email"><br><br>
Department=<input type="text" name="dept" placeholder="Enter Department"><br><br>
Password=<input type="text" name="pass" placeholder="Enter Password"><br><br>

<input type="submit">
</fieldset>
</form>

</body>
</html>
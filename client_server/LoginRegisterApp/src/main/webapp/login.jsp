<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="validation.js"></script>
</head>

<body>

<h2>Login</h2>

<form name="loginForm"
      action="login"
      method="post"
      onsubmit="return validateLogin()">

Username:
<input type="text" name="username"><br><br>
Password:
<input type="password" name="password"><br><br>
<input type="submit" value="Login">

</form>

<p><a href="register.jsp">Register here</a></p>

<%
String error = request.getParameter("error");
if(error != null){
%>
<p style="color:red;"><%= error %></p> <%}%>

</body>
</html>
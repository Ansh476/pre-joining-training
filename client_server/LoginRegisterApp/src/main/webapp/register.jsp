<%@ page session="false" %>

<html>
<head>
<title>Register</title>
<script src="validation.js"></script>
</head>

<body>
<h2>Register</h2>
<form name="registerForm"
      action="register"
      method="post"
      onsubmit="return validateRegister()">

Username:
<input type="text" name="username"><br><br>
Password:
<input type="password" name="password"><br><br>
Confirm password:
<input type="password" name="confirmPassword"><br><br>
<input type="submit" value="Register">

</form>

<p><a href="login.jsp">back to login</a></p>

<%
String message = request.getParameter("msg");
if(message != null){
%>
<p style="color:red;"><%= message %></p> <%}%>

</body>
</html>
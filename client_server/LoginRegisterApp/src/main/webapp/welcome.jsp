<%
String user = (String) session.getAttribute("username");
if(user == null){
    response.sendRedirect("login.jsp");
    return;
}
%>

<html>
<head>
<title>Welcome</title>
</head>
<body>

<h2>Welcome, <%= user %>!</h2>
<p>login successful</p>
<form action="logout" method="post">
<input type="submit" value="Logout">

</form>
</body>
</html>
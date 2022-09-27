<%@ page import="mackshchim.firstwebapp.Main" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 27.09.2022
  Time: 08:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Yooopti yopti.</title>
</head>
<body>

<h1>Yooopti yopti.</h1>

<% Main.main(null); %>

<% if (request.getSession().getAttribute("username") == null) { %>

<form action="signIn" method="post">
<h2>Sign In</h2>
<table>

    <tr>
        <td>Username:</td>
        <td><input type="text" name="username"></td>

    </tr>

    <tr>

        <td>Password:</td>
        <td><input type="password" name="password"></td>
    </tr>

</table>

<input type="submit" value="Sign In">

<br>

don't you have an account? <a href="SignUpPage.html" title="SignUp.">Sign Up</a>
<% } else { %>
<a href="Profile%20Page.jsp" title="Account">Account</a>
<% }%>

</body>
</html>

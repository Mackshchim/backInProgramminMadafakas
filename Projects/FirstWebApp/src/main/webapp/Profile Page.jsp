<%@ page import="mackshchim.firstwebapp.Main" %>
<%@ page import="static mackshchim.firstwebapp.Main.currentUser" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 15.09.2022
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<h1>Yooopti yopti.</h1>

<br>
<br>
<%="<h2>" + request.getSession().getAttribute("username") %>
<br>

<%--<%= currentUser.getBirthday().toString() %>--%>

<br>
<br>
<br>
<br>
<a href="signOut" title="Sign Out">Exit</a>

</body>
</html>

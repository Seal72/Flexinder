<%--
  Created by IntelliJ IDEA.
  User: Percy
  Date: 5/29/2015
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Hello World Example</title> 
  <script src="script/login.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1>Login</h1>

<form action="login.action">
  <label for="name">LOGIN PAGE</label><br/>
  <p for="name">Login</p>
  <input id="loginFieldId" type="text" name="login"/><br>
  <p for="name">Password</p>
  <input id="passwordFieldId" type="text" name="password"/><br>
  <input type="submit" value="log in"/>
</form>
</body>
</html>
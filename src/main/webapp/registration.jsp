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
</head>
<body>
<h1>Sign up</h1>

<form action="logup.action">
    <p style="text-align: left;">Become part of our community :)</p>
    <p style="text-align: left;">Login</p>
    <input type="text" name="login"/><br>
    <p style="text-align: center;"></p>
    <p style="text-align: left;">Password</p>
    <input type="text" name="password"/><br>
    <p style="text-align: center;"></p>
    <p style="text-align: left;">First name</p>
    <input type="text" name="firstName"/><br>
    <p style="text-align: center;"></p>
    <p style="text-align: left;">Last name</p>
    <input type="text" name="lastName"/><br>
    <p style="text-align: center;"></p>
    <p style="text-align: left;">Gender</p>
    <input type="radio" id="male" name="gender" value="male">
    <label for="male">Male</label><br>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label><br>
    <p style="text-align: center;"></p>
    <p style="text-align: center;"></p>
    <input type="submit" value="sign up"/>
</form>
</body>
</html>
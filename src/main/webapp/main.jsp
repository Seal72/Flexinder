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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="script/main.js"></script>
    <title>Hello World Example</title>
</head>
<body>
<h1 style="color: #800080;">FlexInder</h1>

<form action="hello">
    <p></p>
    <p id="foundUserName" style="text-align: left; margin-left:400px "></p>
    <p id="personalInfo" style="text-align: left; margin-left:400px "></p>
    <p id="relationships" style="text-align: left; margin-left:400px "><br /><br /></p>
    <input onclick="getNewUser()" style="margin-left:400px;" type="button" value="Лайк"/>
    <input onclick="getNewUser()" style="margin-left:100px;" type="button" value="Дизлайк"/>
    <br /><br />
    <a style="color: #9932cc;">Знакомства</a> <br /><br />
    <a href="chat.jsp" style="color: #808080;">Сообщения</a> <br /><br />
    <a href="profile.jsp" style="color: #808080;">Профиль</a>
</form>
</body>
</html>
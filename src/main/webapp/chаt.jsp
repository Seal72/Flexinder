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
    <script src="script/loadChat3.js"></script>
    <title>Hello World Example</title>
    <style type="text/css">
        * { margin: 0; padding: 0; }
        p { padding: 10px; }
        #left { position: absolute; left: 0; top: 0; width: 25%; }
        #center { position: absolute; left: 25%; top: 0; width: 25%; }
        #right { position: absolute; right: 0; top: 0; width: 50%; }
    </style>
</head>
<body>
<h1 style="color: #800080;">FlexInder</h1>

<form action="login.action">
    <p></p>
    <div></div>
    <div id="left"><br /><br /><br /><br /><br /><br /><br /><br />
        <a href="main.jsp" style="color: #808080;">Знакомства</a> <br /><br />
        <a style="color: #9932cc;">Сообщения</a> <br /><br />
        <a href="profile.jsp" style="color: #808080;">Профиль</a></div>
    <div id="center" style="border-left:1px solid grey; padding-left:10px;">
        <a href="chat.jsp">Kristina</a> <br>
        <a href="сhat.jsp">Maxim</a><br>
        <a href="chаt.jsp">Alexander</a> &#8226</div><br>
    <div id="right"  style="border-left:1px solid grey; padding-left:10px;">
        <p><strong>Alexander</strong></p>
        <div id="chatContentId"><%--
            <p>&#8226 Приветствую!</p>
            <p style="margin-left: 60px;">Здарова, старик, как ты? &#8226</p>--%>
        </div>
        <input id="messageContentId" style="margin-top: 400px;" type="text" name="userName" placeholder="Введите сообщение" size="30" />
        <input onclick="sendMessage()"  style="color: #9932cc; margin-left: 10px;" type="button" value="Отправить"/></div>
</form>
</body>
</html>
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
    <style type="text/css">
        * { margin: 0; padding: 0; }
        p { padding: 10px; }
        #left { position: absolute; left: 0; top: 0; width: 20%; }
        #right { position: absolute; right: 0; top: 0; width: 70%; }
    </style>
</head>
<body>
<h1 style="color: #800080;">FlexInder</h1>

<form action="login.action">
    <p></p>
    <div></div>
    <div id="left"><br /><br /><br /><br /><br /><br /><br /><br />
        <a href="main.jsp" style="color: #808080;">Знакомства</a> <br /><br />
        <a href="chat.jsp" style="color: #808080;">Сообщения</a> <br /><br />
        <a href="profile.jsp" style="color: #9932cc;">Профиль</a>
    <div id="right"  style="border-left:1px solid grey; padding-left:10px;">
        <p><strong>Артём, 20 лет</strong></p>
        <div><br><br><br><br><br><br><br><br></div>
        <p><strong>Я хочу: </strong> Я хочу общаться.</p>
        <p><strong>Интересы: покер, футбол, комедия, смех, музыка(Ёкаверасан)</strong></p>
        <p><strong>Личная информация:</strong><br>
            улуллулулулуллулулуллул</p>
        <p>Отношения: Чрезмерная любовь к тяночкам.</p>
        <p>Ориентация: Норд-Норд-Вест.</p>
        <p>Внешность: Похож на красавца.</p>
        <p>Я живу: Один как перст, но вчера мама приехала в гости.</p>
    </div>
</form>
</body>
</html>
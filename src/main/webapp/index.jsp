<%--@elvariable id="name" type="com"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body class="vi">
<h1>Пролог</h1>
<p>Ты стоишь в космическом порту и готов подняться на борт своего корабля.<br>
    Разве ты не об этом мечтал?<br>
    Стать капитаном космического судна с экипажем
    который будет совершать подвиги под твоим командованием.
    Так что вперед!</p>
<br><br>
<h1>Знакомство с экипажем</h1>
<p>Когда ты поднялся на борт корабля тебя встретила девушка с черной папкой.<br>
    -Здравствуйте командир!Я Зинаида-ваш помошник.<br>
    Видите там в углу пьет кофе наш штурман-Перегарный Шлейф.<br>
    Под штурвалом стоит -Черный Богдан.
    А как обращаться к вам?</p>

<form action="hello" method="GET">
    <input type="text" name="name" size=”20” maxlength=”25” value=""> <input type="submit" value="Представиться"><br>
</form>

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h1>Ты поднялся на мостик.Ты кто?</h1>
<form method="POST" action="three">
    <input type="radio" name="twoRadio" value="1">Рассказать правду о себе<br>
    <input type="radio" name="twoRadio" value="2">Солгать о себе<br>
    <input type="submit" value="Отправить"/>
</form>
<br><br>
<br><br>
<br><br>
<br><br>
<br><br>
<br><br>
<div>
    <h4>Статистика:</h4>
    <h5>Количество игр :${visitCounter}</h5>
    <h5> Имя :${name}</h5>
    <h5>Today <%= new java.util.Date() %></h5>
</div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h3>Тебя вернули домой ${name}!</h3>
<h1>ПОБЕДА!</h1>

<input type="button" name="submit" onclick="window.location='/index.jsp'" value="Начать с начала!"/>

</body>
</html>
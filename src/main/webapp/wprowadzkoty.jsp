<%--
  Created by IntelliJ IDEA.
  User: Komp
  Date: 2018-07-17
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Dodaj Kotka</title>
</head>
<body>
<h1>Strona tworzenia kotów</h1>
<div>Utwórz kota formularzem i prześlij do serwleta. </br>W odpowiedzi dostaniesz listę utworzonych kotów</div>
<form method="POST" action="/catcreate">
    <input type="text" name="catname" value="Rudy" /><br>
    <input type="number" name="catage" value="6"/><br>
    <input type="submit" value="SUbmit" name="submit"/>
</form>
<%--<p>imię kota ${requestScope.catname}</p>--%>



</body>
</html>

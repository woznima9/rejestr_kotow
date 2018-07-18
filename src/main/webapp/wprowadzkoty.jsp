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
    <link rel="stylesheet" href="/html_css/style.css">
    <title>Dodaj Kotka</title>
</head>
<body>
<h1>Strona tworzenia kotów</h1>
<div>Utwórz kota formularzem i prześlij do serwleta. </br>W odpowiedzi dostaniesz listę utworzonych kotów</div>
<form method="POST" action="/catcreate">
    <p>wprowadź imię kota <input type="text" name="catname" value="Rudy" /></p><br><br>

    <p>wprowadź wiek kota <input type="number" name="catage" value="6"/></p><br><br>
    <input type="submit" value="ENTER" name="submit"/>
</form>

</body>
</html>

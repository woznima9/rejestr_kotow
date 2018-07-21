<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html lang="pl">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/html_css/style.css">
    <title>DODAJ</title>
</head>
<body>
<h1>Dodawanie kota do ewidencji</h1>
<jsp:include page="menu.jsp"/>
<br>
<div>Zauważonemu kotu nadaj imię i określ wiek.<br>Za pomocą formularza prześlij dane do rejestru</br>W odpowiedzi
    dostaniesz
    listę utworzonych kotów
</div>
<form method="POST" action="/catcreate">
    <p>wprowadź imię kota <input type="text" name="catname" value="Bieluch"/></p><br><br>

    <p>wprowadź wiek kota <input type="number" name="catage" value="6"/></p><br><br>
    <input type="submit" value="ENTER" name="submit" width="30"/>
</form>
</body>
</html>

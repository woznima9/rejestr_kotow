<%--
  Created by IntelliJ IDEA.
  User: Komp
  Date: 2018-07-19
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowPersons</title>
</head>
<body>
<h1>Baza danych opiekunów kotów</h1>
<jsp:include page="menu.jsp"/>
<p><%=request.getAttribute("header")%></p>
<div>Zarejestrowane osoby</div>
<br>
tu będzie wynik zapytania SQL
<p><%=request.getAttribute("listpersons")%></p>
</body>
</html>

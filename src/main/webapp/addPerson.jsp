<%--
  Created by IntelliJ IDEA.
  User: Komp
  Date: 2018-07-19
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body>
<h1>Baza opiekunów kotów</h1>
<jsp:include page="menu.jsp"/>
<div>Dodaj do bazy dane kolejnego opiekuna kotów</div>
<p><%=request.getAttribute("header")%></p>

<form method="POST" action="/addpersserv">
    <p>Name <input type="text" name="opiekunname" value="Lucjan"/></p><br>
    <p>Surname <input type="text" name="opiekunsurname" value="Witoń"/></p><br>
    <p>BornYear <input type="number" name="opiekunbornyear" value="1995"/></p><br>
    <p>Phone <input type="number" name="opiekunphone" value="11223344"/></p><br>
    <p>Sex <input type="text" name="opiekunsex" value="MEN"/></p><br>
    <input type="submit" value="ENTER" name="submit" width="60"/>
</form>




</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body>
<h1>Baza opiekunów kotów</h1>
<jsp:include page="menu.jsp"/>
<div>Dodaj do bazy dane kolejnego opiekuna kotów</div>
<p><%=request.getAttribute("header")%>
</p>

<form method="POST" action="/addpersserv">
    <p>Name <input type="text" name="opiekunname" value="Lucjan"/></p>
    <p>Surname <input type="text" name="opiekunsurname" value="Witoń"/></p>
    <p>BornYear <input type="number" name="opiekunbornyear" value="1995"/></p>
    <p>Phone <input type="number" name="opiekunphone" value="11223344"/></p>
    <p>Sex <input type="text" name="opiekunsex" value="MEN"/></p>
    <input type="submit" value="ENTER" name="submit" width="60"/>
</form>


</body>
</html>

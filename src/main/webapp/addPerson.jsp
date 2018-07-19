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
<div>Dodaj do bazy danych opiekuna kotów</div>
<p><%=request.getAttribute("header")%></p>

</body>
</html>

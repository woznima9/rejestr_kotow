<%@ page import="pl.mw.model.Cat" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page isELIgnored="false" %>
<html lang="pl">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="/html_css/style.css">
    <title>REJESTR</title>
</head>
<body>

<h1>Zarejestrowane koty</h1>
<jsp:include page="menu.jsp"/>


<%--<p>Lista kotów pobierana do tej strony: ${catname} </p>--%>
<br>
<% ArrayList<Cat> catArrayList = (ArrayList<Cat>) request.getAttribute("catname"); %>
<br>
<p>TABLICA KOTÓW</p>
<table border="3">
    <tr>
        <th></th>
        <th scope="col">nadane imię</th>
        <th scope="col">oszacowany wiek</th>
    </tr>
    <% for (Cat cat : catArrayList) { %>
    <tr>
        <th scope="row">numer kota</th>
        <td width="50"><%=cat.getName()%>
        </td>
        <td width="50"><%=cat.getAge()%>
        </td>
        <%}%>
    </tr>
</table>


</body>
</html>

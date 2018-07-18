<%--
  Created by IntelliJ IDEA.
  User: Komp
  Date: 2018-07-18
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" href="/html_css/style.css">
    <title>Utworzone Koty</title>
</head>
<body>

<h1>Utworzone koty</h1><br>
<p>imię utworzonego kota ${catname}</p>
<p>wiek utworzonego kota ${requestScope.catage}</p>
<br>
<jsp:include page="menu.jsp"/>

</body>


</html>

<%--
  Created by IntelliJ IDEA.
  User: Komp
  Date: 2018-07-18
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link rel="stylesheet" href="/html_css/style.css">
    <title>EMPTY</title>
</head>
<body>
<h1>Servlet tese</h1>
<jsp:include page="menu.jsp"/>
<h1><%=request.getAttribute("servletinfo")%></h1>

</body>
</html>

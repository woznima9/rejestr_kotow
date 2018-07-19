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
<br>
<h1><%=request.getAttribute("servletinfo")%>
</h1>

</body>
</html>

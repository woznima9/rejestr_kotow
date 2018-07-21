<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>ShowPersons</title>
</head>
<body>
<h1>Baza danych opiekunów kotów</h1>
<jsp:include page="menu.jsp"/>
<p><%=request.getAttribute("header")%>
</p>
<jsp:text>Text z sekcji jsp ${db.listPersons()}</jsp:text>
<div>Zarejestrowane osoby</div>
<br>
<table border="1">
    <c:forEach var="entityString" items="${requestScope.listpersons}">
        <tr>
            <td><c:out value="${entityString.getName()}"/></td>
            <td><c:out value="${entityString.getSurName()}"/></td>
            <td><c:out value="${entityString.getBornYear()}"/></td>
            <td><c:out value="${entityString.getPhone()}"/></td>
            <td><c:out value="${entityString.getSex()}"/></td>
        </tr>
    </c:forEach>

</table>
<%--<p>przykład użycia forEach</p>--%>
<%--<c:forEach var="i" begin="1" end="5">--%>
<%--Item <c:out value="${i}"/><p>--%>
<%--</c:forEach>--%>
</body>
</html>

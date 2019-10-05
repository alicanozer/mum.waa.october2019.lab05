
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Advice</title>
</head>
<body>
<table>
    <c:forEach items="${advice}" var="item">
        <tr><td>${item}</td></tr>
    </c:forEach>
</table>
</body>
</html>

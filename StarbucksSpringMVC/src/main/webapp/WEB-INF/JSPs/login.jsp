<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Starbuck's</title>
    <link rel="stylesheet" type="text/css" href="/WEB-INF/css/style.css"/>
</head>
<body>
<div id="login">
    <p> Please Login to ask for advice</p>
    <form:form action="authenticate" method="post">
        <table>
            <tr><td class="left">Username:</td><td><input type="text" name="name"/></td></tr>
            <tr><td class="left">Password:</td><td><input type="password" name="password"/></td></tr>
            <tr><td>${error}</td></tr>
            <tr><td></td><td><input type="submit" value="Log In"/></td></tr>
        </table>

    </form:form>
</div>
</body>

</html>

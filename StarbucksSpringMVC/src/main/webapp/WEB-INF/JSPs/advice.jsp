<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advice</title>
</head>
<body>
<h2>Ask for advice about your favorite roast:</h2>

<form:form action="advice" method="post">
    <form:select path="roast">
        <form:option value="-" label="--Choose Roast--" />
        <form:option value="dark" label="Dark" />
        <form:option value="medium" label="Medium" />
        <form:option value="light" label="Light" />
    </form:select>
    <input type="submit" value = "Submit"/>
</form:form>

</body>
</html>

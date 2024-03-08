<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/26/2024
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/message" method="post">
    <label>
        <input type="text" placeholder="enter vocabulary" name="vocabulary">
    </label>
    <button type="submit">Summitt</button>
</form>
<c:if test="${message != null}">
    ${message}
</c:if>
<c:if test="${result != null}">
    ${result}
</c:if>

</body>
</html>

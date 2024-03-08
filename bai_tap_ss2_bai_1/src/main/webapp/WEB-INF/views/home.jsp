<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/28/2024
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang hien thi</title>
</head>
<body>
<form action="/save">
    <label>
        <input type="checkbox" value="Lettuce" name="condiment">Lettuce
    </label>
    <label>
        <input type="checkbox" value="Tomato" name="condiment">Tomato
    </label>
    <label>
        <input type="checkbox" value="Mustard" name="condiment">Mustard
    </label>
    <label>
        <input type="checkbox" value="Sprouts" name="condiment">Sprouts
    </label>
    <button type="submit">SaVe</button>

</form>
</body>
</html>

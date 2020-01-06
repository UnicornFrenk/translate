<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<TABLE>
    <tr>

        <th>Login</th>
        <th>password</th>

    </tr>
    <c:forEach var="user" items="${user}" varStatus="status">
        <tr>

            <td>${user.userName}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</TABLE>
</body>
</html>

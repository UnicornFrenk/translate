<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<c:set var="x" value="180" scope="page"/>
<head>
    <title>createUser</title>
    <style>
        address {
            font-size: large;
            color: gray;
        }


        body {
            margin: 0;
            background-image: url("http://bestfons.ru/_ph/24/985579237.jpg");
            color: #302E2D;
        }</style>
</head>
<body>
<form name="New user" method="post">Создать нового пользователя <br/>

    Введите логин:<br/>
    <input type="text"  id="login" name="login" placeholder="Login"><br/>
    Введите пароль:<br/>
    <input type="text"  id="password" name="password" placeholder="Password"/><br/>

    <input type="submit" value="зарегистрироваться" />
</form>
</body>
</html>

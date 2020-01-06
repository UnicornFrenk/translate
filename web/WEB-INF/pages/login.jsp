<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>--%>
<%--<fmt:setBundle basename = "messages" var = "i18n"/>--%>
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
        }
        .myButton {
            -moz-box-shadow: 3px 4px 0px 0px #899599;
            -webkit-box-shadow: 3px 4px 0px 0px #899599;
            box-shadow: 3px 4px 0px 0px #899599;
            background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ededed), color-stop(1, #bab1ba));
            background:-moz-linear-gradient(top, #ededed 5%, #bab1ba 100%);
            background:-webkit-linear-gradient(top, #ededed 5%, #bab1ba 100%);
            background:-o-linear-gradient(top, #ededed 5%, #bab1ba 100%);
            background:-ms-linear-gradient(top, #ededed 5%, #bab1ba 100%);
            background:linear-gradient(to bottom, #ededed 5%, #bab1ba 100%);
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ededed', endColorstr='#bab1ba',GradientType=0);
            background-color:#ededed;
            -moz-border-radius:15px;
            -webkit-border-radius:15px;
            border-radius:15px;
            border:1px solid #d6bcd6;
            display:inline-block;
            cursor:pointer;
            color:#3a8a9e;
            font-family:Arial;
            font-size:17px;
            padding:7px 25px;
            text-decoration:none;
            text-shadow:0px 1px 0px #e1e2ed;
        }
        .myButton:hover {
            background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #bab1ba), color-stop(1, #ededed));
            background:-moz-linear-gradient(top, #bab1ba 5%, #ededed 100%);
            background:-webkit-linear-gradient(top, #bab1ba 5%, #ededed 100%);
            background:-o-linear-gradient(top, #bab1ba 5%, #ededed 100%);
            background:-ms-linear-gradient(top, #bab1ba 5%, #ededed 100%);
            background:linear-gradient(to bottom, #bab1ba 5%, #ededed 100%);
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#bab1ba', endColorstr='#ededed',GradientType=0);
            background-color:#bab1ba;
        }
        .myButton:active {
            position:relative;
            top:1px;
        }

    </style>
</head>
<body>
<a class="myButton" href="${pageContext.request.contextPath}/mainpage">На главную</a>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div><br>
        <label for="login"><fmt:message key= "login.login" bundle="$i18n"/>
        </label>
        <input type="text" id="login" name="login" placeholder="Login">
    </div><br>
    <div>
        <label for="password">Пароль</label>
        <input type="password" id="password" name="password" placeholder="Password">
    </div><br>
    <button class="myButton" type="submit" >Login</button>
</form>
</body>
</html>

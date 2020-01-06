<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            margin: 0;
            background: red;
            color: #302E2D;
        }</style>
    <address>@ created by Melgui Tatsiana</address>
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
        TABLE {
            width: 700px; /* Ширина таблицы */
            border-collapse: collapse; /* Убираем двойные линии между ячейками */
        }
        TD, TH {
            padding: 3px; /* Поля вокруг содержимого таблицы */
            border: 1px solid black; /* Параметры рамки */
        }
        TH {
            background: #b0e0e6; /* Цвет фона */
        }

    </style>
</head>
<body>

<form action="${pageContext.request.contextPath}/orders" method="post">
    <table>
        <tr>

            <th>Дата заказа</th>
            <th>Дата сдачи</th>
            <th>язык перевода</th>
            <th>язык оригинала</th>

        </tr>
        <c:forEach var="order" items="${orders}">
            <tr>

                <td>${order.orderDate}</td>
                <td>${order.deadline}</td>
                <td>${order.inputLang}</td>
                <td>${order.outputLang}</td>

            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>

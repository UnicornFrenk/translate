<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Translators</title>
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
<div>
    <form action="${pageContext.request.contextPath}/ourTranslators" method="post">
        <table>
            <tr>
                <th>№</th>
                <th>Имя</th>
                <th>Опыт работы</th>
                <th>Email</th>
                <th>Контактный телефон</th>
            </tr>
            <c:forEach var="translator" items="${allTranslators}">
                <tr>
                    <td>${translator.idTranslator}</td>
                    <td>${translator.nameTranslator}</td>
                    <td>${translator.experienceYear}</td>
                    <td>${translator.email}</td>
                    <td>${translator.connectionNumber}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title> My Translators Bureau</title>

    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/resourses/css/mainPage.css">--%>
    <address>@ created by Melgui Tatsiana</address>

    <style>
        address {
            font-size: large;
            color: gray;
        }

        blockquote {
            font-style: inherit;
            font-size: small;
            color: gray;
        }

        body {
            margin: 0;
            background-image: url("http://bestfons.ru/_ph/24/985579237.jpg");
            color: #302E2D;
        }

        header {
            padding: 50px 20px;
            margin-right: 20px;
            margin-left: 20px;
            background-image: url("https://thumbs.dreamstime.com/z/overhead-white-office-table-notebook-computer-keyboard-mouse-tablet-pc-smartphone-61897025.jpg");
            border: 3px solid gray;
            border-radius: 20px;
            font-size: larger;
            color: black;
            font-style: italic;
        }

        .container {
            width: max-content;
            padding: 20px 20px;
            margin-right: 5px;

        }

        .main-content {
            margin-right: 10px;
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
            padding: auto;
            border: 3px solid gray;
            border-radius: 20px;
            background-image: url("http://365psd.ru/images/backgrounds/bg-lightl-884.jpg");
        }
        .mainimg {
            size: auto;
        }


        aside {
            background-image: url("http://365psd.ru/images/backgrounds/bg-lightl-884.jpg");
            width: max-content;
            padding: 20px 20px;
            margin-right: 5px;
            border: 3px solid gray;
            border-radius: 20px;
        }

        footer {
            padding: 30px 60px;
            margin-right: 20px;
            margin-left: 20px;
            background-image: url("http://365psd.ru/images/backgrounds/bg-lightl-884.jpg");
            border: 3px solid gray;
            border-radius: 20px;
        }

        p {
            display: inline-block;
        }

        @media (max-width: 3000px) {
            .container {
                display: flex;
            }
        }

        @media (min-width: 1500px) {
            .main-content {
                margin: 20px 20px 30px 0;
            }
        }


        #menu li {
            list-style: none;
            float: left;
            height: 40px;
            width: 170px;
            text-align: center;
            font-size: medium;
            color: black;
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
            position: relative;
            border: 10px black;
            border-radius: 8px;
        }

        #menu li ul {
            list-style: none;
            padding: 0;
            margin: 0;
            width: 170px;
            display: none;
            position: absolute;
            left: 0;
            top: 22px;
            border: 5px black;
        }

        #menu li ul li {
            float: none;
            height: 50px;
            width: 150px;
            text-align: center;
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
            font-style: italic;
        }

        #menu li a {
            display: block;
            width: 150px;
            height: 50px;
            color: black;
            font-weight: 600;
            font-style: italic;
            text-decoration: none;
        }

        #menu li a2 {
            width: 300px;
            height: 300px;
            color: #006A35;
            text-decoration: none;
        }

        #menu li:hover ul {
            display: block;
        }

        #menu li:hover {
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
        }

        #menu li ul li ul {
            left: 150px;
            top: 0;
        }

        #menu li ul li ul li {
            display: none;
        }

        #menu li ul li:hover ul li {
            display: block;
        }

        #formaincontain img {
            width: 200px;
        }



        a.registration {
            text-decoration: blink;
            font-size: small;

        }

        .footer {
            font-style: italic;
        }
        .imgfoot {
            width: 20px;
        }

        #translators {
            padding: 0;
            margin: 0;
            font-family: Verdana;
        }

        #translators li {
            list-style: none;
            float: left;
            height: 50px;
            margin: 0;
            width: 150px;
            text-align: center;
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
            position: relative;
            padding: 1px 0 0;
            border: 3px gray;
            border-radius: 8px;
        }

        #translators li ul {
            list-style: none;
            padding: 0;
            margin: 0;
            width: 150px;
            display: none;
            position: absolute;
            left: 0;
            top: 42px;
        }

        #translators li ul li {
            float: none;
            height: 30px;
            margin: 0;
            width: 150px;
            text-align: center;
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
            font-size: small;
            font-style: italic;
        }

        #translators li a {
            display: block;
            width: 150px;
            height: 30px;
            color: #006A35;
            text-decoration: none;
            border: 3px;
        }

        #translators li:hover ul {
            display: block;
        }

        #translators li:hover {
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
        }

        #translators li ul li ul {
            left: 50px;
            top: 0;
        }

        #translators li ul li ul li {
            display: none;
        }

        #translators li ul li:hover ul li {
            display: block;
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

<%@include file="/WEB-INF/pages/mainpage.jsp" %>
</body>
</html>

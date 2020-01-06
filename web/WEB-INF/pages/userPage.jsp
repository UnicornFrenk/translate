<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title> My Translators Bureau</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

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
            height: 30px;
            width: 150px;
            text-align: center;
            background: -webkit-linear-gradient(#666660 0%, #ffffff 100%);
            font-style: italic;
        }

        #menu li a {
            display: block;
            width: 150px;
            height: 30px;
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
<blockquote><em> Из десяти переводчиков девять не знают языка, с которого переводят, а из десяти знающих язык, с
    которого переводят, девять не знают языка, на который они переводят. Шарль Нодье</em></blockquote>
<hr>

<header>
    <a class="myButton" href="${pageContext.request.contextPath}/logout">Выйти </a>
    <h1 align="left"><b>WELCOME TO MY TRANSLATORS BUREAU</b>
    </h1>
    <ul id="menu">
        <li><a>Пользователь</a></li>
        <li><a href="${pageContext.request.contextPath}/newUser">Новый пользователь</a></li>
        <li>
            <a href="#">Услуги:</a>
            <ul>
                <li><a href="../../html/techTrans.html"> Перевод письменный </a></li>
                <li><a href="../../html/techTrans.html"> Перевод устный </a></li>
                <li><a href="../../html/techTrans.html"> Синхронный перевод </a></li>
                <li><a href="../../html/techTrans.html"> Технический перевод </a></li>
                <li><a href="../../html/techTrans.html"> Локализация </a></li>
                <li><a href="../../html/techTrans.html"> Нотариальный перевод </a></li>
                <li><a href="../../html/techTrans.html"> Редактура</a></li>
            </ul>
        </li>
        <li><a href="../../html/allLanguages.html">Languages</a>
            <ul>
                <li><a href="#">english</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">chinese</a></li>
                        <li><a href="#">japanese</a></li>
                        <li><a href="#">deutsch</a></li>
                        <li><a href="#">ukrainian</a></li>
                        <li><a href="#">polish</a></li>
                        <li><a href="#">french</a></li>
                    </ul>
                </li>
                <li><a href="#">chinese</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">deutsch</a></li>
                        <li><a href="#">ukrainian</a></li>
                        <li><a href="#">french</a></li>
                    </ul>
                </li>
                <li><a href="#">deutsch</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">english</a></li>
                    </ul>
                </li>
                <li><a href="#">french</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">chinese</a></li>
                    </ul>
                </li>
                <li><a href="#">russian</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">japanese</a></li>
                        <li><a href="#">deutsch</a></li>
                        <li><a href="#">ukrainian</a></li>
                        <li><a href="#">chinese</a></li>
                        <li><a href="#">french</a></li>
                        <li><a href="#">belorussian</a></li>
                    </ul>
                </li>
                <li><a href="#">belorussian</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">ukrainian</a></li>
                        <li><a href="#">polish</a></li>
                        <li><a href="#">french</a></li>
                    </ul>
                </li>
                <li><a href="#">japanese</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                    </ul>
                </li>
                <li><a href="#">ukrainian</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">chinese</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li><a href="${pageContext.request.contextPath}/aboutUs">About us</a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/contacts">Contact us</a></li>
                <li><a href="${pageContext.request.contextPath}/ourTranslators">Our translators</a></li>
                <li><a href="${pageContext.request.contextPath}/FAQ">FAQ</a></li>
            </ul>
        </li>
        <li><a href="#">Отзывы</a></li>
        <li><a href="${pageContext.request.contextPath}/createOrder"> Создать заказ</a></li>
        <li><a href="href="${pageContext.request.contextPath}/orders"> Мои заказы</a></li>
    </ul>
</header>


<div class="container">
    <div class="main-content">
        <p><b><h1> ________________________________________________________________</h1></b></p>
    </div>


    <aside>
        <h1>Наши переводчкик</h1>
        <ul id="translators">
            <li><a href="mt.jsp"><span style="color: black; "> Мельгуй Татьяна</span></a></li>
            <li><a href="mt.jsp"><span style="color: black; "> Жданович Алена</span></a></li><br>
            <li><a href="mt.jsp"><span style="color: black; "> Аксенова Елена </span></a></li>
            <li><a href="mt.jsp"><span style="color: black; "> Florian WEinderstritt</span></a></li><br>
            <li><a href="mt.jsp"><span style="color: black; "> Мельгуй Андрей</span></a></li>
            <li><a href="mt.jsp"><span style="color: black; "> Mark Folk</span></a></li>   <br>
            <li><a href="mt.jsp"><span style="color: black; "> Meinstream Kevin</span></a></li>
            <li><a href="mt.jsp"><span style="color: black; "><b> 毛激动</b></span></a></li>
        </ul>


    </aside>
</div>


<footer><h3><b>Ищите нас в социальных сетях:
    _________________________________________________________________________________________________________________________</b></h3>
    <p><a href="https://download-telegram.ru/"><img class="imgfoot" src="https://upload.wikimedia.org/wikipedia/commons/5/5c/Telegram_Messenger.png"></a></p>
    <p><a href="https://twitter.com/?lang=ru"><img class="imgfoot" src="https://upload.wikimedia.org/wikipedia/ru/thumb/9/9f/Twitter_bird_logo_2012.svg/1200px-Twitter_bird_logo_2012.svg.png"></a></p>
    <p><a href="https://ok.ru/"><img class="imgfoot" src="https://upload.wikimedia.org/wikipedia/commons/0/0c/Odnoklassniki.svg"></a></p>
    <p><a href="https://vk.com/go_oglya"><img class="imgfoot" src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/VK.com-logo.svg/220px-VK.com-logo.svg.png"></a></p>
    <p><a href="https://mail.google.com/mail/u/0/#inbox?compose=new"><img class="imgfoot" src="https://upload.wikimedia.org/wikipedia/commons/4/4e/Gmail_Icon.png"></a></p>
    <p><a href="https://www.linkedin.com/in/%D1%82%D0%B0%D1%82%D1%8C%D1%8F%D0%BD%D0%B0-%D0%B1%D0%B0%D1%80%D1%8B%D1%88%D0%B5%D0%B2%D0%B0-a032a595/"><img class="imgfoot" src="http://www.inosat.pt/wp-content/uploads/untitled-design-5.jpg"></a></p>
</footer>
</body>
</html>


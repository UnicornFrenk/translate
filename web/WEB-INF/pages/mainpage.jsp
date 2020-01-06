<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href=${pageContext.request.contextPath}/resourses/css/mainPage.css">
    <link type= "text/css" rel="stylesheet" media="screen" href="/css/mainPage.css" />
        <title> My Translators Bureau</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
</head>
<body>

<blockquote><em> Из десяти переводчиков девять не знают языка, с которого переводят, а из десяти знающих язык, с
    которого переводят, девять не знают языка, на который они переводят. Шарль Нодье</em></blockquote>
<hr>

<header>
    <a class="myButton" href="${pageContext.request.contextPath}/mainpage">Русский</a>
    <a class="myButton" href="${pageContext.request.contextPath}/mainpage">English</a>
    <h1 align="left"><b>WELCOME TO MY TRANSLATORS BUREAU</b>
    </h1>
    <ul id="menu">
        <li><a href="${pageContext.request.contextPath}/login">Войти</a></li>
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
        <li><a href="../../html/allLanguages.html">Языки</a>
            <ul>
                <li><a href="#">Английский</a>
                    <ul>
                        <li><a href="#">русский</a></li>
                        <li><a href="#">белорусский</a></li>
                        <li><a href="#">китайский</a></li>
                        <li><a href="#">японский</a></li>
                        <li><a href="#">немецкий</a></li>
                        <li><a href="#">украинский</a></li>
                        <li><a href="#">польский</a></li>
                        <li><a href="#">французский</a></li>
                    </ul>
                </li>
                <li><a href="#">Китайский</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">deutsch</a></li>
                        <li><a href="#">ukrainian</a></li>
                        <li><a href="#">french</a></li>
                    </ul>
                </li>
                <li><a href="#">Немецкий</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">english</a></li>
                    </ul>
                </li>
                <li><a href="#">Французский</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">chinese</a></li>
                    </ul>
                </li>
                <li><a href="#">Русский</a>
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
                <li><a href="#">Белорусский</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">ukrainian</a></li>
                        <li><a href="#">polish</a></li>
                        <li><a href="#">french</a></li>
                    </ul>
                </li>
                <li><a href="#">Японский</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                    </ul>
                </li>
                <li><a href="#">Украинский</a>
                    <ul>
                        <li><a href="#">russian</a></li>
                        <li><a href="#">belorussian</a></li>
                        <li><a href="#">english</a></li>
                        <li><a href="#">chinese</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li><a href="${pageContext.request.contextPath}/aboutUs">О нас</a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/contacts">Контактная информация</a></li>
                <li><a href="${pageContext.request.contextPath}/ourTranslators">Наши переводчики</a></li>
                <li><a href="${pageContext.request.contextPath}/FAQ">FAQ</a></li>
            </ul>
        </li>
        <li><a href="#">Отзывы</a></li>
        <li><a href="href="${pageContext.request.contextPath}/createOrder"> Создать заказ</a></li>
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


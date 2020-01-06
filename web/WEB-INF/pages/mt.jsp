<%--
  Created by IntelliJ IDEA.
  User: tanya_melgui
  Date: 25.11.18
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>body {
    margin: 0;
    background: red;
    color: #302E2D;
    }</style>
    <address>@ created by Melgui Tatsiana</address>
</head>
<body>
Информация о переводчике по данным из таблицы

select nameTranslator,
experienceYear,
l1.nameLanguage as 'language for translate',
l2.nameLanguage as 'native language',
email,
connectionNumber
from translator as t
join translatorslanguagetranslate as tl on t.idTranslator = tl.idTranslator
join languages as l1 on l1.idLanguage = tl.idLanguage

join translatorsNativelanguages as tn on tn.idTranslator = t.idTranslator
join languages as l2 on l2.idLanguage = tn.idLanguage where t.idTranslator=1;

</body>
</html>

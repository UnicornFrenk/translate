
select idOrder, orderDate, deadLine, il.nameLanguage as 'inputLanguage', ol.nameLanguage as 'outputLanguage'
from `order` as o
       join languages as il on o.inputLanguage = il.idLanguage
join languages as ol on o.outputLanguage = ol.idLanguage;



select idOrder, StartProjet,deadLine, nameTool, nameField
from `order`
       join fields f on `order`.orderField = f.idField
       join tools t on `order`.orderTool = t.idTool
       join translatorslanguagetranslate t2 on `order`.inputLanguage = t2.idLanguage
       join translatorsNativelanguages tN on `order`.outputLanguage = tN.idLanguage
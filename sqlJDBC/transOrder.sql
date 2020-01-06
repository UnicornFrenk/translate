select t2.nameTranslator, l.nameLanguage as 'inp', l2.nameLanguage as 'out',orderDate, deadLine
from `order` as o2
       join  translatorslanguagetranslate tt on o2.inputLanguage = tt.idLanguage
       join languages as l on l.idLanguage = tt.idLanguage
       join translator as t2 on t2.idTranslator = tt.idTranslator
       join translatorsNativelanguages tN on o2.outputLanguage = tN.idLanguage
       join languages as l2 on l2.idLanguage = tN.idLanguage
where o2.inputLanguage = tt.idLanguage and idOrder =1 group by t2.nameTranslator;
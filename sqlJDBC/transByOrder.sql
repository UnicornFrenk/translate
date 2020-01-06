select t2.nameTranslator,deadLine, inputLanguage, outputLanguage
from `order` as o
       join translatorsNativelanguages tN on o.outputLanguage = tN.idLanguage
       join translator as t on t.idTranslator = tN.idTranslator
       join translatorslanguagetranslate tt on o.inputLanguage = tt.idLanguage
       join translator as t2 on t2.idTranslator = tt.idTranslator
where (o.outputLanguage = tN.idLanguage);





select nameTranslator,  tt.idLanguage as 'forTrans',nt.idLanguage as 'nat'
from translator as t
       join translatorslanguagetranslate as tt on t.idTranslator = tt.idTranslator
       join translatorsNativelanguages as nt on nt.idTranslator = tt.idTranslator
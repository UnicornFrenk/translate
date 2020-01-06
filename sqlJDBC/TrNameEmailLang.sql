
select nameTranslator, email, l.nameLanguage as 'NativeLanguage', l1.nameLanguage as 'LangToTrans'
from translator as t
       join translatorsNativelanguages as nl on t.idTranslator = nl.idTranslator
       join languages as l on l.idLanguage = nl.idLanguage
    join translatorslanguagetranslate as tt on t.idTranslator = tt.idTranslator
join languages as l1 on l1.idLanguage = tt.idLanguage
select nameTranslator, email, nameLanguage as "Language for translating"
from translatorslanguagetranslate as tlt
       join translator as t on tlt.idTranslator = t.idTranslator
       join languages as l on l.idLanguage = tlt.idLanguage
where nameTranslator in (select t.nameTranslator
       from translatorstools as tt
              join translator as t on tt.idTranslator = t.idTranslator
              join tools as too on too.idTool = tt.idTool where (nameTool = "Trados"));

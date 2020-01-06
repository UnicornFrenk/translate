select nameTranslator, nameLanguage
from translatorsNativelanguages as tnl
       join translator as t on tnl.idTranslator = t.idTranslator
       join languages as l on l.idLanguage = tnl.idLanguage;
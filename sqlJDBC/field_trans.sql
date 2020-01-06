select nameTranslator, nameField
from translatorsfields as tf
       join translator as t on tf.idTranslator = t.idTranslator
       join fields as f on tf.idField = f.idField;
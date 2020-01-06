package servises;

import dao.entities.Translator;
import java.util.List;

public interface TranslatorService {
    Translator create(String nameTranslator, long experienceYear, String email, String connectionNumber);

    Translator read(long id);

    void update(Translator translator);

    int delete(long id);

    List<Translator> getAll();
}

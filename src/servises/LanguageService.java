package servises;

import dao.entities.Language;
import java.util.List;

public interface LanguageService {

    Language create(String nameLanguage);

    Language read(long idLanguage);

    void update(Language language);

    int delete(long idLanguage);

    List<Language> getAll();
}


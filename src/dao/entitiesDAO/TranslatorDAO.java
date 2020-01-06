package dao.entitiesDAO;

import dao.entities.Translator;

import java.sql.SQLException;
import java.util.List;

public interface TranslatorDAO extends DAO<Translator> {

    List<Translator> getAll() throws SQLException;
    Translator getByLang(String nameLanguage) throws SQLException;
}

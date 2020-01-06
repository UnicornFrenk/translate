package dao.entitiesDAO;


import dao.entities.Language;

import java.sql.SQLException;
import java.util.List;

public interface LanguageDAO extends DAO<Language> {

    List<Language> getAll() throws SQLException;
}

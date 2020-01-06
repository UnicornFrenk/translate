package dao;

import dao.entities.Language;
import dao.entitiesDAO.LanguageDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LanguageDAOImpl extends AbstractJDBCDao implements LanguageDAO {

    private static volatile LanguageDAO INSTANCE = null;

    private static final String createLanguage = "insert into languages (nameLanguage) value (?);";
    private static final String updateLanguage = "update languages set nameLanguage = ? where idLanguage=?;";
    private static final String getLanguageById = "select nameLanguage from languages where idLanguage = ?;";
    private static final String readAllLanguage = "select * from languages";
    private static final String deleteLanguage = "delete from languages where idLanguage=?";

    private PreparedStatement psCreateLanguage;
    private PreparedStatement psUpdateLanguage;
    private PreparedStatement psGetLanguageById;
    private PreparedStatement psReadAllLanguage;
    private PreparedStatement psDeleteLanguage;

    @Override
    public Language create(Language language) throws SQLException {
        psCreateLanguage = prepareStatement(createLanguage, Statement.RETURN_GENERATED_KEYS);
        psCreateLanguage.setString(1, language.getNameLanguage());
        psCreateLanguage.executeUpdate();
        ResultSet rs = psCreateLanguage.getGeneratedKeys();
        if (rs.next()) {
            language.setIdLanguage(rs.getLong(1));
        }
        close(rs);
        return language;
    }


    @Override
    public Language read(long idLang) throws SQLException {
        psGetLanguageById = prepareStatement(getLanguageById);
        psGetLanguageById.setLong(1, idLang);
        psGetLanguageById.executeQuery();
        ResultSet rs = psGetLanguageById.getResultSet();
        if (rs.next()) {
            return langEntity(rs);
        }
        close(rs);

        return langEntity(rs);
    }


    @Override
    public void update(Language language) throws SQLException {
        psUpdateLanguage = prepareStatement(updateLanguage);
        psUpdateLanguage.setString(1, language.getNameLanguage());
        psUpdateLanguage.executeUpdate();
    }

    @Override
    public int delete(long idLang) throws SQLException {
        psDeleteLanguage = prepareStatement(deleteLanguage);
        psDeleteLanguage.setLong(1, (long) idLang);
        return psDeleteLanguage.executeUpdate();
    }

    @Override
    public List<Language> getAll() throws SQLException {
        psReadAllLanguage = prepareStatement(readAllLanguage);
        psReadAllLanguage.execute();
        List<Language> list = new ArrayList<>();
        ResultSet rs = psReadAllLanguage.getResultSet();
        while (rs.next()) {
            list.add(langEntity(rs));
        }
        close(rs);
        return list;
    }

    private Language langEntity(ResultSet rs) throws SQLException {
        Language languageEntity = new Language();
        languageEntity.setIdLanguage(rs.getLong(1));
        languageEntity.setNameLanguage(rs.getString(2));

        return languageEntity;
    }

    public static LanguageDAO getInstance() {
        LanguageDAO languageDAO = INSTANCE;
        if (languageDAO == null) {
            synchronized (LanguageDAOImpl.class) {
                languageDAO = INSTANCE;
                if (languageDAO == null) {
                    INSTANCE = languageDAO = new LanguageDAOImpl();
                }
            }
        }

        return languageDAO;
    }


}


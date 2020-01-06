package dao;


import dao.entities.Language;
import dao.entities.Translator;
import dao.entitiesDAO.TranslatorDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TranslatorDAOImpl extends AbstractJDBCDao implements TranslatorDAO {

    private static volatile TranslatorDAO INSTANCE = null;

    private static final String createTranslator = "INSERT INTO TRANSLATOR (nameTranslator, experienceYear, email, connectionNumber) VALUES (?, ?, ?, ?)";
    private static final String updateTranslator = "UPDATE TRANSLATOR SET email WHERE idTranslator=?";
    private static final String readTranslatorById = "SELECT * FROM translator WHERE idTranslator=?";
    private static final String deleteTranslator = "DELETE FROM translator WHERE idTranslator=?";
    private static final String getAllTranslator = "SELECT *FROM TRANSLATOR";
    private static final String getByLanguage = "SELECT *FROM TRANSLATOR WHERE"; //SQL-запрос


    private PreparedStatement psCreateTranslator;
    private PreparedStatement psUpdateTranslator;
    private PreparedStatement psReadTranslatorById;
    private PreparedStatement psDeleteTranslator;
    private PreparedStatement psGetAllTranslator;
    private PreparedStatement psGetByLang;

    private TranslatorDAOImpl() {
    }

    @Override
    public Translator create(Translator translator) throws SQLException {
        psCreateTranslator = prepareStatement(createTranslator, Statement.RETURN_GENERATED_KEYS);
        psCreateTranslator.setString(1, translator.getNameTranslator());
        psCreateTranslator.setLong(2, translator.getExperienceYear());
        psCreateTranslator.setString(3, translator.getEmail());
        psCreateTranslator.setString(4, translator.getConnectionNumber());
        psCreateTranslator.executeUpdate();
        ResultSet rs = psCreateTranslator.getGeneratedKeys();
        if (rs.next()) {
            translator.setIdTranslator(rs.getLong(1));
        }
        close(rs);
        return translator;
    }


    @Override
    public Translator read(long id) throws SQLException {
        psReadTranslatorById = prepareStatement(readTranslatorById);
        psReadTranslatorById.setLong(1, id);
        psReadTranslatorById.executeQuery();
        ResultSet rs = psReadTranslatorById.getResultSet();
        if (rs.next()) {
            return translatorsEntity(rs);
        }
        close(rs);

        return translatorsEntity(rs);
    }


    @Override
    public Translator getByLang(String nameLanguage) throws SQLException {
        psGetByLang = prepareStatement(getByLanguage);
        psGetByLang.setString(2, nameLanguage);
        psGetByLang.executeQuery();
        ResultSet rs = psGetByLang.getResultSet();
        if (rs.next()) {
            return translatorsEntity(rs);
        }
        close(rs);

        return translatorsEntity(rs);
    }

    @Override
    public void update(Translator translator) throws SQLException {
        psUpdateTranslator = prepareStatement(updateTranslator);
        psUpdateTranslator.setLong(1, translator.getIdTranslator());
        psUpdateTranslator.setString(2, translator.getNameTranslator());
        psUpdateTranslator.setLong(3, translator.getExperienceYear());
        psUpdateTranslator.setString(4, translator.getEmail());
        psUpdateTranslator.setString(5, translator.getConnectionNumber());
        psUpdateTranslator.executeUpdate();
    }

    @Override
    public int delete(long id) throws SQLException {
        psDeleteTranslator = prepareStatement(deleteTranslator);
        psDeleteTranslator.setLong(1, (long) id);
        return psDeleteTranslator.executeUpdate();
    }


    @Override
    public List<Translator> getAll() throws SQLException {
        psGetAllTranslator = prepareStatement(getAllTranslator);
        psGetAllTranslator.execute();
        List<Translator> list = new ArrayList<>();
        ResultSet rs = psGetAllTranslator.getResultSet();
        while (rs.next()) {
            list.add(translatorsEntity(rs));
        }
        close(rs);
        return list;
    }


    private Translator translatorsEntity(ResultSet rs) throws SQLException {
        Translator translatorEntity = new Translator();
        translatorEntity.setIdTranslator(rs.getLong(1));
        translatorEntity.setNameTranslator(rs.getString(2));
        translatorEntity.setExperienceYear(rs.getInt(3));
        translatorEntity.setEmail(rs.getString(4));
        translatorEntity.setConnectionNumber(rs.getString(5));

        return translatorEntity;
    }

    public static TranslatorDAO getInstance() {
        TranslatorDAO translatorDAO = INSTANCE;
        if (translatorDAO == null) {
            synchronized (TranslatorDAOImpl.class) {
                translatorDAO = INSTANCE;
                if (translatorDAO == null) {
                    INSTANCE = translatorDAO = new TranslatorDAOImpl();
                }
            }
        }

        return translatorDAO;
    }


}



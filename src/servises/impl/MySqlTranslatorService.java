package servises.impl;

import dao.OrderDAOImpl;
import dao.TranslatorDAOImpl;
import dao.entities.Translator;
import dao.entitiesDAO.OrderDAO;
import dao.entitiesDAO.TranslatorDAO;
import servises.AbstractService;
import servises.OrderService;
import servises.ServiceException;
import servises.TranslatorService;

import java.sql.SQLException;
import java.util.List;

public class MySqlTranslatorService extends AbstractService implements TranslatorService {
    private static volatile TranslatorService INSTANCE = null;
    public TranslatorDAO translatorDAO = TranslatorDAOImpl.getInstance();


    @Override
    public Translator create(String nameTranslator, long experienceYear, String email, String connectionNumber) {
        Translator translator = new Translator();
        try {
            startTransaction();
            translator.setNameTranslator(nameTranslator);
            translator.setEmail(email);
            translator.setConnectionNumber(connectionNumber);
            translator.setExperienceYear(experienceYear);
            translatorDAO.create(translator);
            commit();   //wt
            return translator;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error creating translator " + translator, e);  // db translator
        }
    }

    @Override
    public Translator read(long idTranslator) {
        try {
            return translatorDAO.read(idTranslator);
        } catch (SQLException e) {
            throw new ServiceException("Error getting translator by id " + idTranslator);
        }
    }

    @Override
    public void update(Translator translator) {
        try {
            translatorDAO.update(translator);
        } catch (SQLException e) {
            throw new ServiceException("Error updating translator " + translator);
        }
    }


    @Override
    public int delete(long idTranslator) {

        try {
            translatorDAO.delete(idTranslator);
        } catch (SQLException e) {
            throw new ServiceException("Error deleting translator " + idTranslator);
        }
        return 0;    //?
    }

    @Override
    public List<Translator> getAll() {
        try {
            startTransaction();
            List<Translator> list = translatorDAO.getAll();
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting Translators");
        }
    }
    public static TranslatorService getInstance() {
        TranslatorService translatorService = INSTANCE;
        if (translatorService == null) {
            synchronized (TranslatorService.class) {
                translatorService = INSTANCE;
                if (translatorService == null) {
                    INSTANCE = translatorService = new MySqlTranslatorService();
                }
            }
        }

        return translatorService;
    }
}


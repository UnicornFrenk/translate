package servises.impl;

import dao.LanguageDAOImpl;
import dao.entities.Language;
import dao.entitiesDAO.LanguageDAO;
import servises.*;

import java.sql.SQLException;
import java.util.List;

public class LanguageServiceImpl extends AbstractService implements LanguageService {
    private static volatile LanguageService INSTANCE = null;

    public LanguageDAO languageDAO = LanguageDAOImpl.getInstance();

    @Override
    public Language create( String nameLanguage) {
        Language language = new Language();
        try {
            startTransaction();
            language.setNameLanguage(nameLanguage);
            languageDAO.create(language);
            commit();   //wt
            return language;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error creating language " + language, e);
        }
    }

    @Override
    public Language read(long idLang) {
        try {
            return languageDAO.read(idLang);
        } catch (SQLException e) {
            throw new ServiceException("Error getting language by id " + idLang);
        }
    }

    @Override
    public void update(Language language) {
        try {
            languageDAO.update(language);
        } catch (SQLException e) {
            throw new ServiceException("Error updating language " + language);
        }
    }

    @Override
    public int delete(long idLang) {

        try {
            languageDAO.delete(idLang);
        } catch (SQLException e) {
            throw new ServiceException("Error deleting language " + idLang);
        }
        return 0;    //?
    }

    @Override
    public List<Language> getAll() {
        try {
            startTransaction();
            List<Language> list = languageDAO.getAll();
            commit();
            return list;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting Languages");
        }
    }


    public static LanguageService getInstance() {
        LanguageService languageService = INSTANCE;
        if (languageService == null) {
            synchronized (LanguageService.class) {
                languageService = INSTANCE;
                if (languageService == null) {
                    INSTANCE = languageService = new LanguageServiceImpl();
                }
            }
        }

        return languageService;
    }

}



package servises.impl;

import dao.UserDAOImpl;
import dao.entities.User;
import dao.entitiesDAO.UserDAO;
import servises.AbstractService;
import servises.ServiceException;
import servises.UserService;

import java.sql.SQLException;

public class UserServiceImpl extends AbstractService implements UserService {
    private static volatile UserService INSTANCE = null;
    private UserDAO userDAO = UserDAOImpl.getInstance();

    @Override
    public User create(String userName, String password) {
        User user = new User();
        try {
            startTransaction();
            user.setUserName(userName);
            user.setPassword(password);
            userDAO.create(user);
            commit();   //wt
            return user;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error creating user " + user, e);  // db translator
        }
    }

    @Override
    public User read(long idUser) {
        try {
            return userDAO.read(idUser);
        } catch (SQLException e) {
            throw new ServiceException("Error getting user by id " + idUser);
        }
    }

    @Override
    public void update(User user) {
        try {
            userDAO.update(user);

        } catch (SQLException e) {
            throw new ServiceException("Error updating user " + user);
        }
    }


    @Override
    public int delete(long idUser) {

        try {
            userDAO.delete(idUser);
        } catch (SQLException e) {
            throw new ServiceException("Error deleting user " + idUser);
        }
        return 0;    //?
    }



    @Override
    public User getUserByName(String userName) {
        try {
            return userDAO.getUserByName(userName);
        } catch (SQLException e){
            throw new ServiceException("Error deleting user " + userName);
        }
    }

    @Override
    public User getRole(String userName, String password) {
        try {
            return userDAO.getRole(userName, password);
        } catch (SQLException e) {
            throw new ServiceException("Error");
        }
    }


    public static UserService getInstance() {
        UserService userService = INSTANCE;
        if (userService == null) {
            synchronized (UserService.class) {
                userService = INSTANCE;
                if (userService == null) {
                    INSTANCE = userService = new UserServiceImpl();
                }
            }
        }

        return userService;
    }


}




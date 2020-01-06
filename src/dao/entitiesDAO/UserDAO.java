package dao.entitiesDAO;


import dao.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO extends DAO<User> {
    List<User> getAll() throws SQLException;
    User getRole(String userName, String password) throws SQLException;
    User getUserByName(String userName) throws  SQLException;
}

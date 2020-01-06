package dao;

import dao.entities.Role;
import dao.entities.User;
import dao.entitiesDAO.UserDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl extends AbstractJDBCDao implements UserDAO {

    private static volatile UserDAO INSTANCE = null;

    private static final String createUser = "Insert into user (userName, password) VALUES (?, ?)";
    private static final String updateUser = "UPDATE user SET password WHERE idUser=?";
    private static final String readUserById = "SELECT * FROM user WHERE idUser=?";
    private static final String deleteUser = "DELETE FROM user WHERE idUser=?";
    private static final String getAllUser = "SELECT * FROM user";
    private static final String getRole ="select * from user where userName = ? and password = ?";
    private static final String getUserByName = "select * from user where userName =?";


    private PreparedStatement psCreateUser;
    private PreparedStatement psUpdateUser;
    private PreparedStatement psReadUserById;
    private PreparedStatement psDeleteUser;
    private PreparedStatement psGetAllUser;
    private PreparedStatement psGetRole;
    private PreparedStatement psGetUserByName;

    private UserDAOImpl() {
    }


    @Override
    public User create(User user) throws SQLException {
        psCreateUser = prepareStatement(createUser, Statement.RETURN_GENERATED_KEYS);
       // psCreateUser.setLong(1, user.getIdUser());
        psCreateUser.setString(1, user.getUserName());
        psCreateUser.setString(2, user.getPassword());
        psCreateUser.executeUpdate();
        ResultSet rs = psCreateUser.getGeneratedKeys();
        if (rs.next()) {
            user.setIdUser(rs.getLong(1));
        }
        close(rs);
        return user;
    }

    @Override
    public User read(long id) throws SQLException {
        psReadUserById = prepareStatement(readUserById);
        psReadUserById.setLong(1, id);
        psReadUserById.executeQuery();
        ResultSet rs = psReadUserById.getResultSet();
        if (rs.next()) {
            return userEntity(rs);
        }
        close(rs);

        return userEntity(rs);
    }

    @Override
    public int delete(long id) throws SQLException {
        psDeleteUser = prepareStatement(deleteUser);
        psDeleteUser.setLong(1, id);
        return psDeleteUser.executeUpdate();
    }


    @Override
    public void update(User user) throws SQLException {
        psUpdateUser = prepareStatement(updateUser);
      //  psUpdateUser.setLong(1, user.getIdUser());
        psUpdateUser.setString(1, user.getUserName());
        psUpdateUser.setString(2, user.getPassword());
        psUpdateUser.executeUpdate();
    }

    @Override
    public List<User> getAll() throws SQLException {

        psGetAllUser = prepareStatement(getAllUser);
        psGetAllUser.execute();
        List<User> list = new ArrayList<>();
        ResultSet rs = psGetAllUser.getResultSet();
        while (rs.next()) {
            list.add(userEntity(rs));
        }
        close(rs);
        return list;
    }

    @Override
    public User getRole(String userName, String password) throws SQLException {
        psGetRole = prepareStatement(getRole);
        psGetRole.setString(1,userName);
        psGetRole.setString(2,password);
        psGetRole.executeQuery();
        ResultSet rs = psGetRole.getResultSet();
        if (rs.next()) {
            return userEntity(rs);
        }
        close(rs);
        return userEntity(rs);
    }

    @Override
    public User getUserByName(String userName) throws SQLException {
        psGetUserByName = prepareStatement(getUserByName);
        psGetUserByName.setString(1,userName);
        psGetUserByName.executeQuery();
        ResultSet rs = psGetUserByName.getResultSet();
        if (rs.next()) {
           return userEntity(rs);
        }
        close(rs);
        return userEntity(rs);
    }

    private User userEntity(ResultSet rs) throws SQLException {
        User userEntity = new User();
        userEntity.setIdUser(rs.getLong(1));
        userEntity.setUserName(rs.getString(2));
        userEntity.setPassword(rs.getString(3));
       userEntity.setRole(Role.valueOf(rs.getString(4)));
//        String role = rs.getString(4);
//        if (role.equals("admin")) {
//            userEntity.setRole(Role.ADMIN);
//        } else {
//            userEntity.setRole(Role.USER);
//        }
        return userEntity;
    }

    public static UserDAO getInstance() {
        UserDAO userDAO = INSTANCE;
        if (userDAO == null) {
            synchronized (UserDAOImpl.class) {
                userDAO = INSTANCE;
                if (userDAO == null) {
                    INSTANCE = userDAO = new UserDAOImpl();
                }
            }
        }

        return userDAO;
    }
}

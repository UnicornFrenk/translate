package servises;

import dao.entities.User;

import java.io.Serializable;
import java.util.List;

public interface UserService {
    User create(String userName, String password);
    User read (long idUser);
    void update (User user);
    int delete (long idUser);
    User getUserByName(String userName);
    User getRole(String userName, String password);

}

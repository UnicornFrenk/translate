package dao.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "user")
@Data
public class User implements Serializable {
    @Id
    private long idUser;
    private String userName;
    private String password;
    private Role role;


    public User(long idUser, String userName, String password, Role role) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public User (String userName, String password)
    {
    this.userName = userName;
    this.password = password;
    }


    public User() {

    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

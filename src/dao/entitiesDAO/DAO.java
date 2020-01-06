package dao.entitiesDAO;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {

    T create(T t) throws SQLException;
    T read(long id) throws SQLException;
    void update(T t) throws SQLException;
    int delete(long id) throws SQLException;
    List<T> getAll() throws SQLException;

}

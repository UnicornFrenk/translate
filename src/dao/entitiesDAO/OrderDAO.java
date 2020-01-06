package dao.entitiesDAO;

import dao.entities.Order;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO extends DAO<Order> {
    List<Order> getAll() throws SQLException;
    List <Order> getByUserId(long idUser) throws SQLException;
    }

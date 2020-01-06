package dao;

import dao.entities.Order;
import dao.entitiesDAO.OrderDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl extends AbstractJDBCDao implements OrderDAO {

    private static volatile OrderDAO INSTANCE = null;

    private static final String createOrder = "INSERT INTO `ORDER` (orderDate, deadline, inputLanguage, outputLanguage) VALUES (?,?,?,?)";
    private static final String updateOrder = "UPDATE `ORDER` SET deadLine = ? WHERE OrderDate=?";
    private static final String getOrdersByUserId = "SELECT * FROM `ORDER` WHERE IdUser=?";
    private static final String readAllOrder = "SELECT * FROM `ORDER`";
    private static final String deleteOrder = "DELETE FROM `ORDER` WHERE iDOrder=?";
    private static final String readOrder = "SELECT * FROM `ORDER` WHERE iDOrder=?";

    private PreparedStatement psCreateOrder;
    private PreparedStatement psUpdateOrder;
    private PreparedStatement psGetOrdersByUserId;
    private PreparedStatement psReadAllOrder;
    private PreparedStatement psDeleteOrder;
    private PreparedStatement psReadOrder;

    @Override
    public Order create(Order order) throws SQLException {
        psCreateOrder = prepareStatement(createOrder, Statement.RETURN_GENERATED_KEYS);
       // psCreateOrder.setLong(1, order.getIdUser());
        psCreateOrder.setString(1, order.getOrderDate());
        psCreateOrder.setString(2, order.getDeadline());
        psCreateOrder.setString(3, order.getInputLang());
        psCreateOrder.setString(4, order.getOutputLang());
        psCreateOrder.executeUpdate();
        ResultSet rs = psCreateOrder.getGeneratedKeys();
        if (rs.next()) {
            order.setIdOrder(rs.getLong(1));
        }
        close(rs);
        return order;
    }

    @Override
    public Order read(long idOrder) throws SQLException {
        psReadOrder = prepareStatement(readOrder);
        psReadOrder.setLong(1, idOrder);
        psReadOrder.executeQuery();
        ResultSet rs = psReadOrder.getResultSet();
        if (rs.next()) {
            return orderEntity(rs);
        }
        close(rs);

        return orderEntity(rs);
    }

    @Override
    public void update(Order order) throws SQLException {
        psUpdateOrder = prepareStatement(updateOrder);
        psUpdateOrder.setString(1, order.getDeadline());
        psUpdateOrder.setString(2, order.getOrderDate());
        psUpdateOrder.executeUpdate();
    }

    @Override
    public int delete(long id) throws SQLException {
        psDeleteOrder = prepareStatement(deleteOrder);
        psDeleteOrder.setLong(1,  id);
        return psDeleteOrder.executeUpdate();
    }

    @Override
    public List<Order> getAll() throws SQLException {
        psReadAllOrder = prepareStatement(readAllOrder);
        psReadAllOrder.execute();
        List<Order> list = new ArrayList<>();
        ResultSet rs = psReadAllOrder.getResultSet();
        while (rs.next()) {
            list.add(orderEntity(rs));
        }
        close(rs);

        return list;
    }

    @Override
    public List<Order> getByUserId(long idUser) throws SQLException {
        psGetOrdersByUserId = prepareStatement(getOrdersByUserId);
        psGetOrdersByUserId.setLong(1, (long) idUser);
        psGetOrdersByUserId.executeQuery();
        List<Order> list = new ArrayList<>();
        ResultSet rs = psGetOrdersByUserId.getResultSet();
        if (rs.next()) {
            list.add(orderEntity(rs));
        }
        close(rs);

        return list;
    }


    private Order orderEntity(ResultSet rs) throws SQLException {
        Order orderEntity = new Order();
        orderEntity.setIdOrder(rs.getLong(1));
        orderEntity.setOrderDate(rs.getString(2));
        orderEntity.setDeadline(rs.getString(3));
        orderEntity.setInputLang(rs.getString(4));
        orderEntity.setOutputLang(rs.getString(5));
        orderEntity.setIdUser(rs.getLong(6));
        return orderEntity;
    }

    public static OrderDAO getInstance() {
        OrderDAO orderDao = INSTANCE;
        if (orderDao == null) {
            synchronized (OrderDAOImpl.class) {
                orderDao = INSTANCE;
                if (orderDao == null) {
                    INSTANCE = orderDao = new OrderDAOImpl();
                }
            }
        }

        return orderDao;
    }
}

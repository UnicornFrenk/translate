package servises.impl;

import dao.OrderDAOImpl;
import dao.entities.Order;
import dao.entitiesDAO.OrderDAO;
import servises.AbstractService;
import servises.OrderService;
import servises.ServiceException;

import java.sql.SQLException;
import java.util.List;

public class OrderServiceImpl extends AbstractService implements OrderService {
    private static volatile OrderService INSTANCE = null;

    private OrderDAO orderDao = OrderDAOImpl.getInstance();


    @Override
    public Order create(String orderDate, String deadline, String inputLang, String outputLang) {
        Order order = new Order();
        try {
            startTransaction();
            order.setOrderDate(orderDate);
            order.setDeadline(deadline);
            order.setInputLang(inputLang);
            order.setOutputLang(outputLang);
            orderDao.create(order);
            commit();
            return order;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error creating Order " + order, e);
        }
    }


    @Override
    public Order read(long id) {
        try {
            return orderDao.read(id);
        } catch (SQLException e) {
            throw new ServiceException("Error getting Order by id" + id);
        }
    }

    @Override
    public void update(Order order) {
        try {
            orderDao.update(order);
        } catch (SQLException e) {
            throw new ServiceException("Error updating Order " + order);
        }
    }

    @Override
    public int delete(long id) {
        try {
            return orderDao.delete(id);
        } catch (SQLException e) {
            throw new ServiceException("Error deleting Order by id" + id);
        }
    }


    @Override
    public List<Order> getByUserId(long userId) {
        try {
            startTransaction();
            List<Order> orders = orderDao.getByUserId(userId);
            for (Order order : orders) {
                List<Order> orderByUserId = orderDao.getByUserId(order.getIdUser());
                commit();
            }
            return orders;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting Orders by userId" + userId);
        }
    }

    @Override
    public List<Order> getAll() {
        try {
            startTransaction();
            List<Order> orders = orderDao.getAll();
            commit();
            return orders;
        } catch (SQLException e) {
            rollback();
            throw new ServiceException("Error getting orders");
        }
    }


    public static OrderService getInstance() {
        OrderService orderService = INSTANCE;
        if (orderService == null) {
            synchronized (OrderService.class) {
                orderService = INSTANCE;
                if (orderService == null) {
                    INSTANCE = orderService = new OrderServiceImpl();
                }
            }
        }

        return orderService;
    }
}

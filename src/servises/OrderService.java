package servises;


import dao.entities.Order;
import java.util.List;

public interface OrderService {

    Order create(String orderDate, String deadline, String inputLang, String outputLang);
    Order read(long idOrder);
    void update(Order order);
    int delete(long idOrder);

    List<Order> getByUserId(long userId);
    List<Order> getAll();
}

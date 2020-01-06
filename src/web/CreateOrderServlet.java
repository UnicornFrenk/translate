package web;

import servises.OrderService;
import servises.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


@WebServlet(urlPatterns = {"/createOrder"})
public class CreateOrderServlet extends HttpServlet {
    private final OrderService orderService = OrderServiceImpl.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/createOrder.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("create Order submitted");
       // DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String orderDate = req.getParameter("orderDate");
        String deadline = req.getParameter("deadline");
        String inputLang = req.getParameter("inputLang");
        String outputLang = req.getParameter("outputLang");

        orderService.create(orderDate, deadline, inputLang, outputLang);
        resp.sendRedirect(req.getContextPath() + "/orders");

    }


}

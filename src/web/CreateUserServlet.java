package web;

import dao.entities.User;
import servises.UserService;
import servises.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/newUser"})
public class CreateUserServlet extends HttpServlet {
    private UserService userService = UserServiceImpl.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/WEB-INF/pages/createUser.jsp").forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/newUser");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        System.out.println("create User submitted");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        userService.create(login,password);
        resp.sendRedirect(req.getContextPath() + "/login");
}}


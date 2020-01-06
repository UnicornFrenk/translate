package web;

import dao.entities.User;
import servises.UserService;
import servises.impl.UserServiceImpl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    private final UserService userService = UserServiceImpl.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("login request submitted");
        String login = req.getParameter("login");
        System.out.println(login);
        String password = req.getParameter("password");
        System.out.println(password);

        User user = userService.getRole(login, password);
        System.out.println(user.getRole());
        try {
            if (user != null) {
                req.getSession().setAttribute("user", user);
                switch (user.getRole()) {
                    case ADMIN:
                        System.out.println("User is admin. Redirect to /admin");
                        resp.sendRedirect(req.getContextPath() + "/adminPage");
                        break;
                    case USER:
                        System.out.println("Redirect to /user");
                        resp.sendRedirect(req.getContextPath() + "/userPage");
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown role");
                }
            } else {
                System.out.println("Credentials is not valid");
                req.getSession().setAttribute("error", "Credentials is not valid");
                resp.sendRedirect(req.getContextPath() + "/login");
            }
        } catch (IOException e) {
            System.out.println("ExceptionServlet during request");
            throw new IllegalStateException("Unknown error");
        }
    }
}
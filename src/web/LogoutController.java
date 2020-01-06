package web;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/logout"})
public class LogoutController extends HttpServlet  {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(req, resp);
    }
//    @Override
//    protected void goPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String MAIN_PAGE ="/WEB-INF/index.jsp";
//        req.getSession().invalidate();
//        req.getRequestDispatcher(MAIN_PAGE).forward(req, resp);
//    }
}

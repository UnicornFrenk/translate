package web;

import servises.TranslatorService;
import servises.impl.MySqlTranslatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/createTranslator"})
public class CreateTranslatorServlet extends HttpServlet {

    private final TranslatorService translatorService = MySqlTranslatorService.getInstance();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/createTranslator.jsp").forward(req, resp);
    }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
            System.out.println("create Translator submitted");
            String nameTranslator = req.getParameter("nameTranslator");
            String experienceYear = req.getParameter("experienceYear");
            String email = req.getParameter("email");
            String connectionNumber = req.getParameter("connectionNumber");
            translatorService.create(nameTranslator, Long.valueOf(experienceYear), email, connectionNumber);
            resp.sendRedirect(req.getContextPath() + "/ourTranslators");

        }


}

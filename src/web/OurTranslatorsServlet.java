package web;

import dao.entities.Translator;
import servises.TranslatorService;
import servises.impl.MySqlTranslatorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/ourTranslators"})
public class OurTranslatorsServlet extends HttpServlet {

    private final TranslatorService translatorService = MySqlTranslatorService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Translator> allTranslators = translatorService.getAll();
        req.setAttribute("allTranslators", allTranslators);
        req.getRequestDispatcher("/WEB-INF/pages/ourTranslators.jsp").forward(req, resp);
    }

    }

package pl.mw;

import pl.mw.CatCreateServlet;
import pl.mw.model.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CatReportServlet", value = "/catreport")
public class CatReportServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("pozło GET catReport");
        ArrayList<Cat> mojeKoty = CatCreateServlet.koty;
        request.setAttribute("catname", mojeKoty);
        request.getRequestDispatcher("/showcats.jsp").forward(request, response);
    }
}

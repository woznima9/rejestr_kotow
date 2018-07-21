package pl.mw;

import pl.mw.model.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CatCreateServlet", value = "/catcreate")
public class CatCreateServlet extends HttpServlet {
    static ArrayList<Cat> koty = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        System.out.println("POST w /catcreate");
        koty.add(new Cat(request.getParameter("catname"), Integer.parseInt(request.getParameter("catage"))));
        request.setAttribute("catname", koty);
        System.out.println("testowo lista do przekazania" + koty.toString());
        request.getRequestDispatcher("/showcats.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET w /catcreate");
        request.getRequestDispatcher("/wprowadzkoty.jsp").forward(request, response);
    }
}

package pl.mw;

import pl.mw.model.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CatCreateServlet", value = "/catcreate")
public class CatCreateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getParameterNames();
//        request.getParameterMap();
        System.out.println("dostałem POST na CatCreateServlet");
        Cat cat = new Cat();
        cat.setName(request.getParameter("catname"));
//        String catAgeString = request.getParameter("catage");
//        System.out.println("wiek kota " + catAgeString);
        cat.setAge(Integer.parseInt(request.getParameter("catage")));
        request.setAttribute("catname", cat.getName());
        request.setAttribute("catage", cat.getAge());
        System.out.println(cat);
        request.getRequestDispatcher("/showcats.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("wykonał się doGet.CatCreateServlet");
        request.getRequestDispatcher("/wprowadzkoty.jsp").forward(request, response);
    }
}

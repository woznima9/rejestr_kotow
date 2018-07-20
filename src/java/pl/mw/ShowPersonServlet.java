package pl.mw;

import pl.mw.drivers.SqliteJDBCDriverConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowPersonServlet", value = "/showpersserv")
public class ShowPersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header", "SHOW_PERSONS");
        try {
            SqliteJDBCDriverConnection db = new SqliteJDBCDriverConnection();
//            System.out.println(db.listPersons());
            request.setAttribute("listpersons", db.listPersons());
            db.closeConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/showPersons.jsp").forward(request, response);
    }
}

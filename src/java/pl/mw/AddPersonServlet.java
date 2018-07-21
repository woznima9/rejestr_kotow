package pl.mw;

import pl.mw.drivers.SqliteJDBCDriverConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddPersonServlet", value = "/addpersserv")
public class AddPersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String nameOpiekun = request.getParameter("opiekunname");
        String surNameOpiekun = request.getParameter("opiekunsurname");
        int bornYearOpiekun = Integer.parseInt(request.getParameter("opiekunbornyear"));
        int phoneOpiekun = Integer.parseInt(request.getParameter("opiekunphone"));
        System.out.println(nameOpiekun + " " + bornYearOpiekun);
        String sexOpiekun = request.getParameter("opiekunsex");
        try {
            SqliteJDBCDriverConnection db = new SqliteJDBCDriverConnection();
            db.insertDataToSQLite("INSERT INTO people (Name,Surname,BornYear,Phone,Sex) VALUES " +
                    "('" + nameOpiekun + "','"
                    + surNameOpiekun + "',"
                    + bornYearOpiekun + ","
                    + phoneOpiekun + ", '"
                    + sexOpiekun + "')");
            db.closeConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        ShowPersonServlet.doGet();   - TODO - jak skierować z jednego servletu do metody drugiego?
        request.getRequestDispatcher("/index.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("header", "ADD_PERSON");
        request.getRequestDispatcher("/addPerson.jsp").forward(request, response);
    }
}

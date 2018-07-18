package pl.mw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "HelloServlet", value = "/hiservlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hiservlet zadziałał");
        String nameParam = request.getParameter("name");
        String ageParam = request.getParameter("age");

        System.out.println("Hi servlet " + nameParam + " " + ageParam);
        Map<String, String[]> parameterMap = request.getParameterMap();

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        writer.println("<div><h2>Otrzymane parametry przekazane linią URL:</h2></div>");
        writer.println("<div>ODCZYTANE PARAMETRY-");
        for (String key : parameterMap.keySet()) {
            writer.print("<p>");
            writer.print(key+":&nbsp ");

            for (String value : parameterMap.get(key)) {
                writer.print(value + ",&nbsp ");
            }
            writer.println("</p>");
        }
        writer.println("</div>");
        writer.print("</html>");

    }

}

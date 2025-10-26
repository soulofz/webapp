package by.tms.HW25.AgeServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "AdultServet", urlPatterns = {"/adult"})
public class Adult extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String ageValue = req.getParameter("age");
        Writer writer = resp.getWriter();
        try {
            int age = Integer.parseInt(ageValue);
            if (age >= 18) {
                writer.append("Adult.");
            } else {
                writer.append("Not adult.");
            }

        } catch (NumberFormatException e) {
            writer.append("Invalid age");
        }
        writer.close();
    }
}

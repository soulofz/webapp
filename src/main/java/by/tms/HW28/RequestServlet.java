package by.tms.HW28;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/saveRequest"})
public class RequestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        if (name == null
                || email == null
                || message == null
                || name.isBlank()
                || email.isBlank()
                || message.isBlank()) {
            req.getRequestDispatcher("save-request.jsp").forward(req, resp);
        } else {
            req.setAttribute("name", name);
            req.setAttribute("email", email);
            req.setAttribute("message", message);
            req.getRequestDispatcher("success.jsp").forward(req, resp);
        }
    }
}

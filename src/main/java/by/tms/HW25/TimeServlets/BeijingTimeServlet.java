package by.tms.HW25.TimeServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "BeijingTimeServlet", urlPatterns = {"/beijing"})
public class BeijingTimeServlet extends HttpServlet {
    private final static ZoneId BEIJING = ZoneId.of("Asia/Shanghai");
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ZonedDateTime nowBeijing = ZonedDateTime.now(BEIJING);
        String result = "Time in Beijing : " + FORMATTER.format(nowBeijing);
        try (Writer out = response.getWriter()) {
            out.append(result);
        }
    }
}

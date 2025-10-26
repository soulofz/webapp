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

@WebServlet(name = "WashingtonTimeServlet", urlPatterns = {"/washington"})
public class WashingtonTimeServlet extends HttpServlet {
    private final static ZoneId WASHINGTON = ZoneId.of("America/New_York");
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ZonedDateTime nowWashington = ZonedDateTime.now(WASHINGTON);
        String result = "Time in Washington : " + FORMATTER.format(nowWashington);
        try (Writer out = response.getWriter()) {
            out.append(result);
        }
    }
}

package TimeServlets;

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

@WebServlet(name = "MinskTimeServlet", urlPatterns = {"/minsk"})
public class MinskTimeServlet extends HttpServlet {
    private final static ZoneId MINSK = ZoneId.of("Europe/Minsk");
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ZonedDateTime nowMinsk = ZonedDateTime.now(MINSK);
        String result = "Time in Minsk : " + FORMATTER.format(nowMinsk);
        try (Writer out = response.getWriter()) {
            out.append(result);
        }
    }
}

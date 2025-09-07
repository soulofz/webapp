package Logs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;


@WebServlet(name = "LogServet", urlPatterns = {"/logs"})
public class LogServet extends HttpServlet {
    private final static String FILEPATH = "C:/Users/HYPERPC/IdeaProjects/webapp/logs/servlet_logs.txt";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Writer writer = response.getWriter();
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
                writer.flush();
            }
        }
    }
}
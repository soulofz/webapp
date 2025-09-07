package Logs;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet(name = "LogFile", urlPatterns = {"/writelog"})
public class LogFile extends HttpServlet {
    private BufferedWriter bufferedWriter;

    private synchronized void writeLog(String message) {
        try {
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println("Error writing log: " + e.getMessage());
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            String filePath = "C:/Users/HYPERPC/IdeaProjects/webapp/logs/servlet_logs.txt";
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            writeLog("Servlet Initialized: " + LocalDateTime.now());
        } catch (IOException e) {
            throw new ServletException("Error opening log files: " + e);
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        writeLog("Servlet Service :" + LocalDateTime.now()
                + " | Method :" + req.getMethod()
                + " | URI :" + req.getRequestURI());
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        writeLog("Servlet Destroyed :" + LocalDateTime.now());
        try {
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain; charset=UTF-8");
        resp.getWriter().println("LogFile servlet is alive. Check logs/servlet_logs.txt");
    }
}
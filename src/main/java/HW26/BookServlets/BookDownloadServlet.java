package HW26.BookServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(urlPatterns = {"/book"})
public class BookDownloadServlet extends HttpServlet {
    private static final String BOOKS_STORAGE = "C:\\Users\\HYPERPC\\IdeaProjects\\webapp\\books";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookName = request.getParameter("name");
        if (bookName == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Specify the 'name' parameter.");
            return;
        }

        File file = new File(BOOKS_STORAGE + File.separator + bookName);
        if (!file.exists() || !file.isFile()) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Book is not found.");
            return;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");

        try (FileInputStream fis = new FileInputStream(file);
             OutputStream os = response.getOutputStream()) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) != -1){
                os.write(buffer, 0, length);
            }
        }
    }
}


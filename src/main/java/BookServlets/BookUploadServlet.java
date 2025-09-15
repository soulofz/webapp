package BookServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

@WebServlet(urlPatterns = {"/load-book"})
@MultipartConfig
public class BookUploadServlet extends HttpServlet {
    private static final String BOOKS_STORAGE = "C:\\Users\\HYPERPC\\IdeaProjects\\webapp\\books";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Part filePart = req.getPart("file");
            if (filePart == null || filePart.getSubmittedFileName().isEmpty()) {
                throw new IOException("File not transferred.");
            }

            File uploadDir = new File(BOOKS_STORAGE);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            String fileName = filePart.getSubmittedFileName();
            fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);

            filePart.write(uploadDir + File.separator + fileName);

            getServletContext().getRequestDispatcher("/Success.html").forward(req, resp);
        } catch (Exception e) {
            getServletContext().getRequestDispatcher("/Unsuccess.html").forward(req, resp);
        }
    }
}
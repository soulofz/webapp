package by.tms.HW26.Listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Webapp is launched successfully.");
    }
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Webapp is stopped.");
    }
}

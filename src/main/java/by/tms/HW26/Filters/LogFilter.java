package by.tms.HW26.Filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@WebFilter(value = "/*")
public class LogFilter implements Filter {
    private HttpServletRequest httpServletRequest = null;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("LogFilter is working.");
        if (servletRequest instanceof HttpServletRequest) {
            String time = LocalDateTime.now().format(formatter);
            httpServletRequest = (HttpServletRequest) servletRequest;
            System.out.println("[" + time + "]" + " URI: " + httpServletRequest.getRequestURI());
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}

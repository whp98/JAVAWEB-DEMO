package xyz.intellij.javaweb;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("404");
        printWriter.close();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

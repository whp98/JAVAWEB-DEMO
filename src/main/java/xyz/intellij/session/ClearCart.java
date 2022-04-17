package xyz.intellij.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ClearCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().setAttribute("cart", null);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("ok");
        resp.setHeader("Refresh", "0.5; url=" + req.getContextPath() + "/book");
    }
}

package xyz.intellij.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

public class AddCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*图书id*/
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        HttpSession httpSession = req.getSession();
        if (httpSession.isNew() || httpSession.getAttribute("cart") == null) {
            httpSession.setAttribute("cart", new HashMap<String, Integer>());
        }
        HashMap<String, Integer> stringIntegerHashMap = (HashMap<String, Integer>) httpSession.getAttribute("cart");
        stringIntegerHashMap.merge(id, 1, Integer::sum);
        resp.getWriter().write("<h1>添加完成</h1>");
        resp.setHeader("Refresh", "0.5; url=" + req.getContextPath() + "/book");
    }
}

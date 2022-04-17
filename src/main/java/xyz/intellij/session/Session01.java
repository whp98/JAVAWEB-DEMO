package xyz.intellij.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Session01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*获取存储值*/
        String value  = req.getParameter("value");
        /*获取session*/
        HttpSession session = req.getSession();
        /*将name存储到session中*/
        session.setAttribute("name",value);
        System.out.println("session存储完毕");
    }
}

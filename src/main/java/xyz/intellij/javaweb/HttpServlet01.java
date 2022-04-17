package xyz.intellij.javaweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 继承HttpServlet可以处理get和post请求
 */
public class HttpServlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println(req.getParameter("username"));
        System.out.println("post");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(req.getParameter("username"));
        printWriter.println(req.getParameter("passwd"));
        printWriter.println(req.getAttribute("forward"));
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("username"));
        System.out.println("get");
    }
}

package xyz.intellij.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieReceive extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie:cookies){
            System.out.println("name="+cookie.getName());
            System.out.println("value="+cookie.getValue());
            System.out.println("maxAge="+cookie.getMaxAge());
        }
    }
}

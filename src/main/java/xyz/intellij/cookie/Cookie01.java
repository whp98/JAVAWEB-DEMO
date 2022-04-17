package xyz.intellij.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*Cookie的默认绑定路径*/
public class Cookie01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*第一个参数类似map的key，第二个类似value,不能存放中文*/
        Cookie cookie1 = new Cookie("userName","haha");
        Cookie cookie2 = new Cookie("userId","001");
        /*手动设置cookie的绑定路径*/
        String contextPath  = req.getContextPath();
        cookie1.setPath(contextPath+"/aaa");
        cookie2.setPath(contextPath+"/bbb");
        /*设置Cookie的失效时间,单位是秒*/
        cookie1.setMaxAge(60*60)/*一小时*/;
        cookie2.setMaxAge(60*60*24)/*一天*/;
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}

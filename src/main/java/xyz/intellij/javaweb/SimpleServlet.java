package xyz.intellij.javaweb;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class SimpleServlet extends GenericServlet {
    /**
     * 更加简单的匹配服务
     * 只需要实现一个方法
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello generic service");
    }
}

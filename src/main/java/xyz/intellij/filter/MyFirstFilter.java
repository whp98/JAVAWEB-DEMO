package xyz.intellij.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器在tomcat启动的时候实例化和初始化
 * 关闭服务器会销毁过滤器
 */
public class MyFirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化监听器");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤请求");
        /*经过过滤器向下层传递*/
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("响应");
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器");
    }
}

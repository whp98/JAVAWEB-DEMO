package xyz.intellij.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
/**
 * 监听器用于监听httprequest对象的创建和销毁事件
 * */
public class MyHttpRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("httpRequest销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("httpRequest创建");
    }
}

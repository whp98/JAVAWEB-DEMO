package xyz.intellij.servlet3;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = {"/servletTest"},
name = "sjhsjhs1",loadOnStartup = 2,
initParams = {
        @WebInitParam(name = "teacher",value = "1"),
        @WebInitParam(name = "teacher1",value = "2")
})
public class ServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig sc = this.getServletConfig();
        String name = sc.getServletName();
        Enumeration<String> pa = sc.getInitParameterNames();
        while(pa.hasMoreElements()){
            System.out.println(pa.nextElement());
        }
    }
}

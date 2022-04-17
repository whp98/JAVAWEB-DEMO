package xyz.intellij.fileupload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*E:\WIN_HOME\Desktop\*/
public class FileUpload extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream servletInputStream = req.getInputStream();
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = servletInputStream.read(b)) != 1) {
            System.out.println(new String(b, 0, len));
        }
    }
}

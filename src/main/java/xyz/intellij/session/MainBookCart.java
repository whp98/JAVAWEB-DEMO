package xyz.intellij.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MainBookCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*展示全部书籍*/
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("<h1>全部书</h1><br/>");
        DBMock dbMock = new DBMock();
        List<BookEntity> bookEntityList = dbMock.getAll();
        bookEntityList.stream().forEach(bookEntity -> {
            printWriter.write(bookEntity.getName() + "&nbsp;" + "<a href='" + req.getContextPath() + "/book" + "/add" + "?id="
                    + bookEntity.getId() + "'>添加</a>" + "<br/>");
        });
        printWriter.write("</br><a href='" + req.getContextPath() + "/book" + "/clear" + "'>清空购物车</a><br/>");
        printWriter.write("<a href='" + req.getContextPath() + "/book" + "/showCart" + "'>查看购物车</a><br/>");
    }
}

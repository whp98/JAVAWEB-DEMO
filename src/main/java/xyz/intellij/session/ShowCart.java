package xyz.intellij.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShowCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        HashMap<String, Integer> stringIntegerHashMap = (HashMap<String, Integer>) req.getSession().getAttribute("cart");
        if (stringIntegerHashMap == null) {
            resp.getWriter().write("<h1>购物车为空</h1>");
        }
        Set<Map.Entry<String, Integer>> entrySet = stringIntegerHashMap.entrySet();
        PrintWriter printWriter = resp.getWriter();
        DBMock dbMock = new DBMock();
        entrySet.forEach(stringIntegerEntry ->
                printWriter.write(
                        dbMock.getOneBook(stringIntegerEntry.getKey()).getName()
                                + " X " + stringIntegerEntry.getValue() + "<br/>"));
    }
}

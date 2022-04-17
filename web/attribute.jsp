<%@ page import="xyz.intellij.listener.MyobjectListener" %>
<%@ page import="xyz.intellij.listener.Person" %><%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2022/4/17
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>属性操作</title>
</head>
<body>
<%
    /*session.setAttribute("q1", "sdaad");
    session.setAttribute("q2", "sdadsadad");
    session.setAttribute("q1", "ssss");
    session.removeAttribute("q1");*/
    /*MyobjectListener myobjectListener = new MyobjectListener();
    myobjectListener.setId(1000);
    session.setAttribute("obj",myobjectListener);
    session.removeAttribute("obj");*/
    Person person = new Person();
    person.setId(10238798);
    session.setAttribute("asss",person);
%>
</body>
</html>

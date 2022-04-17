<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2022/4/6
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First Page</title>
</head>
<body>
<% Date date = new Date();%>
<% out.write("服务器时间"); %>
<% out.write(date.toLocaleString()); %>
</body>
</html>

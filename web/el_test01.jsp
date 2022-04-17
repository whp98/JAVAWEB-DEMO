<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2022/4/6
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el表达式</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "1");
    request.setAttribute("name", "1");
    session.setAttribute("name", "1");
    application.setAttribute("name", "2");
%>
${name}
</body>
</html>

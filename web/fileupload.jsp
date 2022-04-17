<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2022/4/17
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form enctype="multipart/form-data" action="${pageContext.request.contextPath}/fileUpload" method="post">
    <input type="file" name="file"/><br/>
    <input type="submit" value="上传"/><br/>
</form>
</body>
</html>

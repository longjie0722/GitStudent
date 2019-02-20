<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\21 0021
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上课的内容2</title>
</head>
<body>
<h1>解决中文乱码</h1>

<!--
   在浏览器上面输入地址
   http://localhost:8080/JSP/2.jsp?name=龙杰
 -->

<%
    String name = request.getParameter("name");
    byte[] bytes = name.getBytes("ISO-8859-1"); //ISO-8859-1浏览器默认编码值
    String newName = new String(bytes,"utf-8"); //转换服务端识别的编码值UTF-8
    out.write(newName);
%>
</body>
</html>

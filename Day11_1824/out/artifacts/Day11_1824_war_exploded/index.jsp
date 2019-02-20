<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\26 0026
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>

  <%
    String car = (String) session.getAttribute("test");
    if(car == null){
        out.println("<h1>空页面</h1>");
        session.setAttribute("test","aaa");
    }else{
        out.println("<h1>非空页面</h1>"+car);
    }
  %>

  <h1>我是首页</h1>
  </body>
</html>

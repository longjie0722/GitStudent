<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\14 0014
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
      <form method="post" action="/JSP/TestServlet">
         账户:<input name="username" type="text"><br>
         密码:<input name="pwd" type="password"><br>
         <input type="submit" value="登录"><br>
      </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\19 0019
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
     <form method="post" action="/JSP/login">
         账户:<input type="text" name="username"><br/>
         密码:<input type="password" name="pwd"><br/>
         <input type="submit" value="登录"> <a href="zhu.jsp">用户注册</a>
     </form>
  </body>
</html>

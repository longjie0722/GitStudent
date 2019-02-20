<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\23 0023
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
      <form action="/JSP/login" method="post">
          账户:<input type="text" name="username"><br/>
          密码:<input type="password" name="pwd"><br/>
          生日:<input type="text" name="date"><br/>
          价格:<input type="text" name="pay"><br/>
          <input type="submit" value="提交">
      </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\23 0023
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>EL表达式</title>
  </head>
  <body>
  <%-- 获取的是你浏览器访问服务端的头部信息 这个在火狐浏览器的fn + F12 的网络下面可以看见--%>
       ${header} <br/>
  <%-- 获取头部的cookie信息 --%>
       ${header.cookie}<br/>
  <%--  --%>
       ${cookie}<br/>
  <%--  --%>
       ${cookie.JSESSIONID}<br/>
  </body>
</html>

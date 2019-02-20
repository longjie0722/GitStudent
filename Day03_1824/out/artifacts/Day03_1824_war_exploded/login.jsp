<%@ page import="org.omg.IOP.CodecOperations" %>
<%@ page import="util.CookieUtil" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\19 0019
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<!--
     登录成功之后,再次回到登录界面,这个时候显示用户已登录 当关闭浏览器时,就结束了该会话
     重新打开浏览器时,就显示登录界面,  注:如果创建了一个cookie，并将它发送到浏览器，
     默认情况下它是一个会话级别的cookie。（即存储在浏览器的内核中）。
     若希望浏览器将该cookie存储在磁盘上，则需要使用maxAge。其单位为秒，
     若是设置成0则是命令浏览器立即删除该cookie。
     注意：删除cookie时，path必须一致。否则不会删除。
-->

<%
    Cookie[] cookies = request.getCookies();
    Cookie login = CookieUtil.getCookieByName(cookies, "login");

    if(login == null){
%>
<form method="post" action="/JSP/login">
    <table align="center">
        <tr>
            <td>账户:</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="pwd"></td>
        </tr>
        <tr align="center">
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>

<%
    }else {
%>
<h1>用户已登录</h1>
<%
    }
%>

</body>
</html>

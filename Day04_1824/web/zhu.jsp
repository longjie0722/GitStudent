<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\19 0019
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>

    <form method="post" action="/JSP/zhu">
        <h1>用户注册</h1>
        <table>
            <tr>
                <td align="left">请输入账户:</td>
                <td><input type="text" name="user"></td>
            </tr>
            <tr>
                <td align="left">请输入密码:</td>
                <td><input type="text" name="pass"></td>
            <tr>
                <td align="left">请输入验证码:</td>
                <td><input type="text"></td>

            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</body>
</html>

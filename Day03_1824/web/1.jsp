<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\16 0016
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
    <table border="1">
        <tr>
        <%
           for(int i = 1;i <= 9 ; i++){
               for (int j = 1; j <= i; j++) {
        %>
            <td><%= j + "*" + i +"="+ i*j %></td>
        <%
                }
        %>
        <tr></tr>
        <%
            }
        %>  
        </tr>
    </table>
</body>
</html>

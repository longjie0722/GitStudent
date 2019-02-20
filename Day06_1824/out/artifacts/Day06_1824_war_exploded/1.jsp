<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\21 0021
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上课的内容1</title>
</head>
<body>
<%
    pageContext.setAttribute("temp","value",PageContext.PAGE_SCOPE);
%>

<%= pageContext.getAttribute("temp",PageContext.SESSION_SCOPE) %>
</body>
</html>

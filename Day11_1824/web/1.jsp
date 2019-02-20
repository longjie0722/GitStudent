<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\26 0026
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSTL & EL 跳转</title>
</head>
<body>
    <%--
          当在浏览器将session给禁用,直接跳转(a href="index.jsp")时,不能传数据  一直是<h1>空页面</h1>
          而(a href="${a}")这个跳转,即使session禁用了也可以传数据  他自动运用了session追踪技术
          浏览器地址栏:index.jsp;jsessionid=76D5F58963D04D83FA363E2F4C5148A1
          当写第一种跳转时,会自动将${a}后面起一个id地址
    --%>


    <c:url value="index.jsp" var="a"></c:url>

    <a href="${a}">首页(a href="${"a"}")</a>
    <br/>
    <br/>
    <a href="index.jsp">首页(a href="index.jsp")</a>


</body>
</html>

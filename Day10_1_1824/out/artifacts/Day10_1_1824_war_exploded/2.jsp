<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\23 0023
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>c标签</title>
</head>
<body>
    <h3>使用c标签是为了不在jsp页面使用java代码,方便web前端操作页面</h3>
    <br/>
    <h3>JSTL  全称:JSP Standard Tag Library</h3>
    <h3>JSP  全称:Java Server Pages</h3>
    <c:set var="name" value="你好"></c:set>
    ${name}

    <c:if test="${name eq '你好'}">
         <h1>true</h1>
    </c:if>


</body>
</html>

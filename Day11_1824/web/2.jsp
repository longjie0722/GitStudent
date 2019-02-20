<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\26 0026
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSTL & EL 判断</title>
</head>
<body>
    <%--
         request.setAttribute("a","10");
    --%>
    <c:set var="a" value="10"></c:set>
    <c:if test="${a ge 10}">
        <h1>第一种:  a 等于 10</h1>
    </c:if>
    <hr/>
    <h1>第二种</h1>
    <c:choose>
        <%-- if --%>
        <c:when test="${a gt 10}">
            <h1>a 大于 10</h1>
        </c:when>
        <%-- else if --%>
        <c:when test="${a lt 10}">
            <h1>a 小于 10</h1>
        </c:when>
        <%-- else --%>
        <c:otherwise>
            <h1>a 等于 10</h1>
        </c:otherwise>
    </c:choose>

   <%--
       <c:choose>
       </c:choose>
       相当于if   else if  if
   --%>

</body>
</html>

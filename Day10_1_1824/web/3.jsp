<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\23 0023
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c标签</title>
</head>
<body>
    <h3>传统方式</h3>
    <%
         try {
             int a = 10 / 0;
             out.print(a);
         }catch (Exception e){
             e.printStackTrace();
         }
    %>

    <h3>JSTL & EL</h3>
    <c:catch var="temp">
       <%
          int b = 10/0;
       %>
    </c:catch>

    ${temp}

</body>
</html>

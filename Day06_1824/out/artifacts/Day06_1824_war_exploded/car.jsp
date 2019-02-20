<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\21 0021
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
    <%
        String id = request.getParameter("id");
        HttpSession session1 = request.getSession();
        Map<String,Integer> car = (Map<String, Integer>) session1.getAttribute("car");
        if(car == null){
            car = new HashMap<String,Integer>();
            car.put(id,1);
            response.addCookie();
        }else{
            car.
        }
    %>
</body>
</html>

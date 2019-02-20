<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\20 0020
  Time: 16:05
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
        session1.setAttribute("car",car);
    }else {
        boolean b = car.containsKey(id);
        if(b){
            Integer integer = car.get(id);
            integer++;
            car.put(id,integer);
        }else{
            car.put(id,1);
        }
    }
%>

<h1>商品已添加</h1><a href="shan.jsp">返回商品列表</a>
</body>
</html>

<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\22 0022
  Time: 14:01
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

   <h1>添加成功!</h1><a href="index.jsp">返回商品列表</a>
</body>
</html>

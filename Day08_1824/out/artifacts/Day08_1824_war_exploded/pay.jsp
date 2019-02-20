<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\22 0022
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结算</title>
</head>
<body>
<%
    HttpSession session1 = request.getSession();
    Map<String,Integer> car = (Map<String, Integer>) session1.getAttribute("car");
    if(car == null){
%>
       <h1>你还没有添加</h1>
<%
    }
    Set<String> strings = car.keySet();
    for (String s:strings) {
        String name = null;
        if(s.equals("1")){
            name = "相机";
        }else if(s.equals("2")){
            name = "电脑1";
        }else if(s.equals("3")){
            name = "电脑2";
        }else {
            name = "鼠标";
        }
%>
        商品:<%=name%>,数量:<%=car.get(s)%><br/>
<%
    }
%>
<div>
    <a href="index.jsp">返回商品列表</a>
</div>
</body>
</html>

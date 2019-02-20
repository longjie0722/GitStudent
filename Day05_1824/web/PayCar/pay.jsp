<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\20 0020
  Time: 16:14
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
    if(car==null){
%>
<h1>未添加商品,请添加商品</h1><a href="shan.jsp">返回商品列表</a>
<%
        return;
    }

    Set<String> strings = car.keySet();
    for (String p:strings) {
        String name = null;
        if(p.equals(1)){
            name="相机";
        }else if(p.equals(2)){
            name="电脑1";
        }else {
            name="电脑2";
        }
%>
         <h1>购买了商品<%=name%>,数量为<%=car.get(p)%></h1>
<%
    }
%>
</body>
</html>

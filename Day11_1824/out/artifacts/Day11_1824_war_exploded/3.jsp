<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\26 0026
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSTL & EL 循环</title>
</head>
<body>
<%
    List<String> lists = new ArrayList();
    lists.add("A");
    lists.add("B");
    lists.add("C");
    lists.add("D");
    request.setAttribute("lists",lists);
%>

    <c:forEach var="temp" begin="0" end="3" items="${lists}" step="1">
         ${temp}
    </c:forEach>
    <br />
    <%--
         当设置了varStatus="temp" 值时:
              first   表示是不是第一个值
              last    表示是不是最后一个值
              index   当没有items=""时或没有值时: 他就是根据begin值开始到结束 如果有,那他就是下标
              begin   表示他的开始值
              end     表示结束值
              current 表示值
    --%>
    <!--        开始      结束     循环一次加多少                                 -->
    <c:forEach begin="1" end="9" step="1"      varStatus="temp">
        ${temp.first}
        ${temp.last}
        ${temp.index}
        ${temp.begin}
        ${temp.end}
        ${temp.current}
        <hr/>
    </c:forEach>

</body>
</html>

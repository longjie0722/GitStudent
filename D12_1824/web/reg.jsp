<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\30 0030
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/reg">
        账户:<input type="text" name="username" id="username" onblur="judgeUser()"><br/>
        密码:<input type="password" name="password"><br/>
        <input type="submit" value="提交">
    </form>

    <script>
        function Ajax() {
            var ajax;
            if(window.XMLHttpRequest){
                ajax = new XMLHttpRequest();
            }else if(window.ActiveXObject){
                ajax = new ActiveXObject('Msxml2.XMLHTTP');
            }else {
                ajax = new ActiveXObject('Microsoft.XMLHTTP');
            }
            return ajax;
        }
        function judgeUser(){
            var ajax = Ajax;
            ajax.onreadystatechange = function () {
                  if(ajax.readyState == 4){
                      var msg = JSON.parse(ajax.responseText);
                      alert(msg.msg);
                  }
            };

            var name = document.getElementById("username").value;
            ajax.open("get", "/JSP/username?uname=" + name, true);
            ajax.send();
        }

    </script>
</body>
</html>

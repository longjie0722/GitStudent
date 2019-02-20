<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\30 0030
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="">
         账户:<input type="text" name="username" id="username" onblur="judgeUser()"><br/>
         密码:<input type="password" name="password"><br/>
         <input type="submit" value="注册">
    </form>

    <script>
        function judgeAjax() {
            var ajax;
            if(window.XMLHttpRequest){
                ajax = new XMLHttpRequest();
            }else if(window.ActiveXObject){
                ajax = new ActiveXObject('xml1');
            }else {
                ajax = new ActiveXObject('xml2');
            }
            return ajax;
        }


        function judgeUser() {
            var ajax = judgeAjax();
            ajax.onreadystatechange = function () {
                if(ajax.readyState == 4){
                    var msg = JSON.parse(ajax.responseText);
                    alert(msg);
                }
            }
            var name = document.getElementById("username").value;
            ajax.open("get", "/JSP/username?username=" + name, true);
            ajax.send();
        }

    </script>
</body>
</html>

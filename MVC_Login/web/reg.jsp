<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\11\28 0028
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
     <h3 style="color: red">${regInfo}</h3>
     <%--${pageContext.request.contextPath} 表示整个项目内--%>
     <form method="post" action="${pageContext.request.contextPath}/reg" onsubmit="return judge()">
          <table>
              <tr>
                  <td align="right">用户名:</td>
                  <td colspan="2"><input type="text" minlength="6" maxlength="12" name="username" id="username"></td>
              </tr>
              <tr>
                  <td align="right">密码:</td>
                  <td colspan="2"><input type="password" name="pwd" minlength="6" maxlength="12" id="password"></td>
              </tr>
              <tr>
                  <td align="right">确认密码:</td>
                  <td colspan="2"><input type="password" minlength="6" maxlength="12" id="repassword"></td>
              </tr>
              <tr>
                  <td align="right">性别:</td>
                  <td colspan="2">
                      <input type="radio" name="sex" value="0">男
                      <input type="radio" name="sex" value="1">女
                  </td>
              </tr>
              <tr>
                  <td align="right">电话:</td>
                  <td colspan="2"><input type="text" minlength="11" maxlength="11" name="phone" id="phone"></td>
              </tr>
              <tr>
                  <td align="right">验证码:</td>
                  <td><input type="text" name="check"></td>
                  <td><img src="${pageContext.request.contextPath}/check?type=reg" id="check" width="60px" height="30px" onclick="imgs()"></td>
              </tr>
              <tr>
                  <td colspan="3" align="center">
                      <input type="submit" value="注册">
                      <input type="reset" value="取消">
                  </td>
              </tr>
          </table>



     </form>

     <script>
         function judge() {
              var username = document.getElementById("username").value;
              if(/^[0-9]/.test(username)){
                  alert("用户名不能以数字开头!");
                  return false;
              }
              var pass = document.getElementById("password").value;
              var repwd = document.getElementById("repassword").value;
              if(pass != repwd){
                  alert( "两次输入的密码不一致!");
                  return false;
              }

              var phone = document.getElementById("phone").value;
              if(phone.length != 11){
                  alert("输入的电话长度不对,必须是11位");
                  return false;
              }
              if(!/^[1][0-9]/.test(phone)){
                  alert("手机号只能以1开头");
                  return false;
              }
         }

         function imgs() {
              var check = document.getElementById("check");
              check.src = "${pageContext.request.contextPath}/check?type=reg&"+new Date();
         }
         
         
     </script>





</body>
</html>

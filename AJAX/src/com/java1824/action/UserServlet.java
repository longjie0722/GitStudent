package com.java1824.action;

import com.java1824.service.UserService;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "UserService",urlPatterns = "/user")
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
         request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        byte[] bytes = username.getBytes("ISO-8859-1");
        username = new String(bytes,"utf-8");

        boolean b = UserService.judgeUser(username);
        String msg = b ? "用户名已注册":"用户名可以使用";
        String remsg = "{\'msg \',\'"+msg+"\'}";

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(remsg);

    }
}

package com.java1824.action;

import com.java1824.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setCharacterEncoding("utf-8");

         String username = request.getParameter("username");
         byte[] bytes = username.getBytes("ISO-8859-1");
         username = new String(bytes,"utf-8");

         boolean b = UserService.judgeUserExists(username);
         String msg = b ? "用户名已注册":"用户名可以使用";
         String jsonMsg = "{\"msg\":\"" + msg + "\"}";
         response.setContentType("text/html;charset=utf-8");
         response.getWriter().println(jsonMsg);
    }
}

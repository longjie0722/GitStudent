package com.java1824;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        if (username.equals("sa") && pwd.equals("123456")) {
            writer.println("登录成功!");
            //在这里new一个Cookie时
            Cookie cookie = new Cookie("login", "sccuess");
            Cookie user = new Cookie("username","sa");  //记录住user的登录名
            response.addCookie(cookie);
            response.addCookie(user);
        } else {
            response.sendRedirect("/JSP/login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }

}

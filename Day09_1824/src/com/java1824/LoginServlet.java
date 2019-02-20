package com.java1824;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "LoginServlet",urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    public static final String LOGIN_LIST = "login_list";
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
          doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Cookie cookie = getByCookie(cookies,LOGIN_LIST);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        if(cookie == null){
            writer.println("第一次登录!");
        }else {
            writer.println("第二次登录!"+cookie.getValue());
        }

        Cookie cook = new Cookie(LOGIN_LIST,getByTime());
        cook.setMaxAge(60);
        response.addCookie(cook);
    }

    public  String getByTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(new Date());
    }

    public static Cookie getByCookie(Cookie [] arr,String name){
        if(arr.length == 0){
            return null;
        }
        for (Cookie cook:arr) {
            if(cook.getName().equals(name)){
                return cook;
            }
        }
        return null;
    }
}

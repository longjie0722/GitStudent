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

@WebServlet(name = "LoncationServlet",urlPatterns = "/loncation")
public class LoncationServlet extends HttpServlet { //第一次访问浏览器显示第一次登录
    //第二次登录  就显示上一次登录的时间
    public static final String LONC_TEST = "lonc_list";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Cookie cookie = getByName(cookies,LONC_TEST);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        if(cookie == null){
            writer.println("<h1>第一次登陆</h1>");
        }else{
            writer.println("<h1>上一次登陆</h1>"+cookie.getValue());
        }

        Cookie cook = new Cookie(LONC_TEST,getByTime());
        cook.setMaxAge(10);

        response.addCookie(cook);
    }

    public static String getByTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(new Date());
    }

    public static Cookie getByName(Cookie [] arr,String name){
          if(arr.length == 0){
              return null;
          }
        for (Cookie cook:arr) {
            if(cook.equals(name)){
                return cook;
            }
        }
        return null;
    }
}

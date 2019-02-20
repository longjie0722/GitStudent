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

@WebServlet(name = "AccuessServlet",urlPatterns = "/accuess")
public class AccuessServlet extends HttpServlet {

    public static final String Last_ACCUES =  "lasta_ccuess";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Cookie cookie = getCookieByName(cookies,Last_ACCUES);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        if(cookie == null){
            writer.println("<h1>第一次访问</h1>");
        }else{
            writer.println("<h1>上一次访问的时间:+</h1>"+cookie.getValue() );
        }

        Cookie cookie1 = new Cookie(Last_ACCUES,getCookieDate());
        cookie1.setMaxAge(10);

        response.addCookie(cookie1);
    }

    public String getCookieDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return sdf.format(new Date());
    }

    public Cookie getCookieByName(Cookie[] arr,String name){
        if(arr.length == 0){
            return null;
        }
        for (Cookie cookie:arr) {
            if(cookie.equals(Last_ACCUES)){
                return cookie;
            }
        }
        return null;
    }
}

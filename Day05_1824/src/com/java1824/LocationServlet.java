package com.java1824;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LocationServlet")
public class LocationServlet extends HttpServlet {
    public static final String SHAN_LIST = "shan_list";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        Cookie[] cookies = request.getCookies();
        Cookie cookie = getByCookie(cookies,SHAN_LIST);
        if(cookie == null){
            Cookie cook = new Cookie(SHAN_LIST,id);
            response.addCookie(cook);
        }else{
            String values = cookie.getValue();
            if(!justCookie(values,id)){
                values += ("#"+id);
                cookie.setValue(values);
            }

            response.addCookie(cookie);
        }

    }

    public static boolean justCookie(String str,String id){
        String[] split = str.split("#");
        for (String _id:split) {
            if(_id.equals(id)){
                return true;
            }
        }
        return false;
    }


    public static Cookie getByCookie(Cookie [] arr,String name){
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

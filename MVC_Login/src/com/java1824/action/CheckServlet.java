package com.java1824.action;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CheckServlet",urlPatterns = "/check")
public class CheckServlet extends HttpServlet {
    //当注册和登录都有验证码的时候,在这里就要区分验证码是谁传过来的,还要在jsp页面做一个传值
    public static final String TYPE_REG = "reg";
    public static final String TYPE_LOGIN = "login";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if(type == null){
            type = TYPE_LOGIN;
            //如果jsp中点击验证码,刷新验证码,必须要传时间(才能刷新),但是只需要type值,不要时间
            //所以这里要用startsWith()(测试此字符串是否以指定的前缀开始。)方法
        }else if(type.startsWith(TYPE_REG)){
            type = TYPE_REG;
        }else {
            type = TYPE_LOGIN;
        }

        BufferedImage bi = new BufferedImage(60,30,BufferedImage.TYPE_INT_RGB);

        Graphics gh =  bi.getGraphics();
        Random random = new Random();
        Color color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
        gh.setColor(color);
        gh.fillRect(0,0,60,30);

        String str = "1234567890ABCDEFGJKLOIUYTazxcnseriufdsa";

        //记录验证码
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            //添加验证码
            sb.append(c);
            Color setcolor = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
            gh.setColor(setcolor);
            gh.drawString(c+"",i*15+3,20);
        }

        ImageIO.write(bi,"png",response.getOutputStream());

        //将jsp页面引用Servlet页面中生成的验证码给记录下来
        HttpSession session1 = request.getSession();
        //sb.toString() 验证码的值
        session1.setAttribute(type,sb.toString());
    }
}

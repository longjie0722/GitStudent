package com.java1824;

import com.sun.prism.paint.Gradient;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CheckServlet")
public class CheckServlet extends HttpServlet { //验证码
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        BufferedImage bi = new BufferedImage(60,30,BufferedImage.TYPE_INT_RGB);
        //
        Graphics gp = bi.getGraphics();
        Color color = new Color(163, 205, 255);
        gp.setColor(color);
        gp.fillRect(0,0,60,30);

        String arr = "0123456789ASDFGHJKL";

        Random ran = new Random();

        for (int i = 0; i < 4; i++) {
            int index = ran.nextInt(arr.length());
            char c = arr.charAt(index);
            Color co = new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));
            gp.setColor(co);
            gp.drawString(c+"",i*15+3,18);
        }

        ImageIO.write(bi,"png",response.getOutputStream());
    }
}

package com.java1824;

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
public class CheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedImage bi = new BufferedImage(60,30,BufferedImage.TYPE_INT_BGR);

        Random ran = new Random();

        Graphics graphics = bi.getGraphics();
        Color color = new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));
        graphics.setColor(color);
        graphics.fillRect(0,0,60,30);

        String arr = "0123456789ASDFGHJ";

        for (int i = 0; i < 4; i++) {
            int index = ran.nextInt(arr.length());
            char c = arr.charAt(index);
            Color colorrr = new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));
            graphics.setColor(colorrr);
            graphics.drawString(c+"",i*15+3,18);
        }

        ImageIO.write(bi,"png",response.getOutputStream());
    }
}

package com.java1824.action;

import com.java1824.ov.User;
import com.java1824.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "RegServlet",urlPatterns = "/reg")
public class RegServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //防止jsp页面传过来的汉字在servlet页面中乱码
        request.setCharacterEncoding("utf-8");

        //jsp传过来的name和value 中要判断用户输入的验证码是否与给予的验证码一致

        //获取jsp页面的验证码
        String check = request.getParameter("check");
        //获取Servlet(CheckServlet)页面生成的验证码
        String checkSess = (String) request.getSession().getAttribute(CheckServlet.TYPE_REG);
        if (!checkSess.equals(check)) {//如果不相等,就说验证码错误
            request.setAttribute("regInfo", "验证码错误");
            //转发
            request.getRequestDispatcher("/reg.jsp").forward(request, response);
            return;
        }


        //导三个必要的jar包后  将jsp传过来的name和value 存入 到java类(一般把java类放在ov(bean)包中)中

           //getParameterMap  获得jsp页面传过来的name和value
        Map<String, String[]> map = request.getParameterMap();
           //要存入到哪一个java类中
        User user = new User();

        try {
            //BeanUtils 导入jar包之后才有这个属性和方法
            BeanUtils.populate(user,map);
            UserService us = new UserService();
            String result = us.regUser(user);
            if(result.equals("Success")){
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }else{
                request.setAttribute("regInfo", result);
                request.getRequestDispatcher("/reg.jsp").forward(request, response);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

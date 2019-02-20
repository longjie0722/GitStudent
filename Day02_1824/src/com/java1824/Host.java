package com.java1824;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Host  implements Servlet {

    @Override  //初始化   自动加载
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override //
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");

        //设置响应的编码值 , 告诉服务端
        servletResponse.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = servletResponse.getWriter();


    }

    @Override //销毁
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }
}

package com.java1824;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet",urlPatterns = "/test")

//<servlet>
//             <servlet-name>TestServlet</servlet-name>
//             <servlet-class>com.java1824.TestServlet</servlet-class>
//             <init-param>
//                 <param-name>name</param-name>
//                 <param-value>/</param-value>
//             </init-param>
//             <load-on-startup>1</load-on-startup>
//         </servlet>
//         <servlet-mapping>
//             <servlet-name>TestServlet</servlet-name>
//             <url-pattern>/test</url-pattern>
//         </servlet-mapping>
public class TestServlet extends HttpServlet {//上课内容3
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

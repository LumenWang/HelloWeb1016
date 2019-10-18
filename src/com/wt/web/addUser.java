package com.wt.web;

import java.io.IOException;

/**
 * @Author: Lumen Wang https://www.zhihu.com/people/dai-li-72-46/activities
 * @Date: 2019-10-16 16:00
 * @Version: 1.0
 */
@javax.servlet.annotation.WebServlet(name = "addUser", urlPatterns={"/addUser"})
public class addUser extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userName = request.getParameter("username");
        String userAge  = request.getParameter("userage");
        System.out.println(userName + " " +userAge);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}

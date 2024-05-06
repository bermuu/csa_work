package com.mu.controller;

import com.mu.entity.model.MessageModel;
import com.mu.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();


    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uname = request.getParameter("uname");
    String upwd = request.getParameter("pwd");
    MessageModel messageModel = userService.userLogin(uname,upwd);
    if(messageModel.getFlag() == 1){
        request.getSession().setAttribute("user",messageModel.getObject());
        response.sendRedirect("index.jsp");
    }else{
        request.setAttribute("messageModel",messageModel);
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }
    }

}


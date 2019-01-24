package com.salonschedule.controller;

import com.salonschedule.DAO.MyModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/commonSchedule",name = "AdminPageServlet")
public class AdminPageServlet extends HttpServlet {

    MyModel model = new MyModel();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("commonSchedule",model.getSchedule());
        request.getRequestDispatcher("/admin-menu.jsp").forward(request,response);

    }
}

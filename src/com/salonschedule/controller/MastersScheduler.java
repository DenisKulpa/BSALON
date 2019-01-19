package com.salonschedule.controller;

import com.salonschedule.DAO.MyModel;
import com.salonschedule.DAO.Scheduler;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.ArrayList;

@javax.servlet.annotation.WebServlet(urlPatterns = "/masters-schedule", name="MastersSchedule")
public class MastersScheduler extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp"); //keysensitive
//        requestDispatcher.forward(request,response);
    }
}

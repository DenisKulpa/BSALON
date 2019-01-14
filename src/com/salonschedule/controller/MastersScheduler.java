package com.salonschedule.controller;

import com.salonschedule.DAO.MyModel;
import com.salonschedule.DAO.Scheduler;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.ArrayList;

@javax.servlet.annotation.WebServlet(urlPatterns = "/masters-schedule", name="MastersSchedule")
public class MastersScheduler extends javax.servlet.http.HttpServlet {
    MyModel myModel = new MyModel();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Scheduler masterTimeInfo = myModel.getTimeScheduler(3);

        request.setAttribute("Scheduler", masterTimeInfo);

        ArrayList<String> timeFromTable =masterTimeInfo.getTimeInterval(); //
        request.setAttribute("schedulerTime", timeFromTable);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp"); //keysensitive
        requestDispatcher.forward(request,response);
    }
}

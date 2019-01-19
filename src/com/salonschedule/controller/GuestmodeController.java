package com.salonschedule.controller;

import com.salonschedule.DAO.Master;
import com.salonschedule.DAO.MyModel;
import com.salonschedule.DAO.Scheduler;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/guestmodepage", name="GuestmodeController")
public class GuestmodeController extends HttpServlet {

    MyModel myModel = new MyModel();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get a list of masters to represent them on jsp
        List<Master> masters = myModel.getMasters();
        response.setContentType("text/html; charset=UTF-8");
        request.setAttribute("Masters", masters);

        // receive concrete master free time
        Scheduler masterTimeInfoId1 = myModel.getTimeScheduler(1);
        request.getSession().setAttribute("masterFreeTimeId1", masterTimeInfoId1);

        Scheduler masterTimeInfoId2 = myModel.getTimeScheduler(2);
        request.getSession().setAttribute("masterFreeTimeId2", masterTimeInfoId2);

        Scheduler masterTimeInfoId3 = myModel.getTimeScheduler(3);
        request.getSession().setAttribute("masterFreeTimeId3", masterTimeInfoId3);

        Scheduler masterTimeInfoId4 = myModel.getTimeScheduler(4);
        request.getSession().setAttribute("masterFreeTimeId4", masterTimeInfoId4);

        Scheduler masterTimeInfoId5 = myModel.getTimeScheduler(5);
        request.getSession().setAttribute("masterFreeTimeId5", masterTimeInfoId5);

        Scheduler masterTimeInfoId6 = myModel.getTimeScheduler(6);
        //ArrayList<String> masterTimeId6 =masterTimeInfoId6.getTimeInterval();
        request.getSession().setAttribute("masterFreeTimeId6", masterTimeInfoId6);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/guestmodepage.jsp"); //keysensitive
        requestDispatcher.forward(request,response);

    }
}

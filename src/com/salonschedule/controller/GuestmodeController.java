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
        List<Master> masters = myModel.getMasters();
        response.setContentType("text/html; charset=UTF-8");
        request.setAttribute("Masters", masters);

        // receive concrete master free time
        Scheduler masterTimeInfoId1 = myModel.getTimeScheduler(1);

        ArrayList<String> masterTimeId1 =masterTimeInfoId1.getTimeInterval();
        request.setAttribute("masterFreeTimeId1", masterTimeId1);

        // receive concrete master free time
        Scheduler masterTimeInfoId2 = myModel.getTimeScheduler(2);
        ArrayList<String> masterTimeId2 =masterTimeInfoId2.getTimeInterval();
        request.setAttribute("masterFreeTimeId2", masterTimeId2);

        // receive concrete master free time
        Scheduler masterTimeInfoId3 = myModel.getTimeScheduler(3);
        ArrayList<String> masterTimeId3 =masterTimeInfoId3.getTimeInterval();
        request.setAttribute("masterFreeTimeId3", masterTimeId3);

        // receive concrete master free time
        Scheduler masterTimeInfoId4 = myModel.getTimeScheduler(4);
        ArrayList<String> masterTimeId4 =masterTimeInfoId4.getTimeInterval();
        request.setAttribute("masterFreeTimeId4", masterTimeId4);

        // receive concrete master free time
        Scheduler masterTimeInfoId5 = myModel.getTimeScheduler(5);
        ArrayList<String> masterTimeId5 =masterTimeInfoId5.getTimeInterval();
        request.setAttribute("masterFreeTimeId5", masterTimeId5);

        // receive concrete master free time
        Scheduler masterTimeInfoId6 = myModel.getTimeScheduler(6);
        ArrayList<String> masterTimeId6 =masterTimeInfoId6.getTimeInterval();
        request.setAttribute("masterFreeTimeId6", masterTimeId6);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/guestmodepage.jsp"); //keysensitive
        requestDispatcher.forward(request,response);

    }
}

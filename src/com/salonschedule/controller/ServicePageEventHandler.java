package com.salonschedule.controller;

import com.salonschedule.DAO.MyModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/loggedFormEvent", name="ServicePageEventHandler")
public class ServicePageEventHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MyModel myModel = new MyModel();

        resp.setContentType("text/html; charset=UTF-8");

        int service = Integer.parseInt(req.getParameter("serviceKind"));
        int timeId = Integer.parseInt(req.getParameter("timeId"));
       // int remind = Integer.parseInt(req.getParameter("remind"));
        String masterIdBusy = req.getParameter("masterIdBusy");
        String masterIdFree = req.getParameter("masterIdFree");

        String tmp = "free";

        // Calculate how mach cells we need to insert in to masters_scheduler table
        int quantityCell = 0;
        if(service<=2){
            quantityCell = 1;
        }else if (service>2 & service<=7){
            quantityCell = 2;
        }else if (service>7 & service<=11){
            quantityCell = 3;
        }else if (service>11 & service<=16){
            quantityCell = 4;
        }else if (service>16 & service<=17){
            quantityCell = 6;
        }

        if(myModel.checkIfFree(timeId+1,timeId+quantityCell,masterIdBusy)){
            myModel.insertBusyTime(timeId,timeId+quantityCell,masterIdBusy,masterIdFree);
        } else {
            tmp ="busy";
        }

        PrintWriter out = resp.getWriter();
        out.println("service nomber: " + service);
        out.println("time id: " + timeId);
      //  out.println(" remind at: " + remind);
        out.println(" insert busy:  " + masterIdBusy);
        out.println(" insert free:  " + masterIdFree);
        out.println(" status:  " + tmp);
    }
}

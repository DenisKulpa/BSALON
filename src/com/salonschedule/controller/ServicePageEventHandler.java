package com.salonschedule.controller;

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

       // req.setCharacterEncoding("UTF-8"); like alternative,but dosent work
        resp.setContentType("text/html; charset=UTF-8");
        String service = req.getParameter("service");
        String time = req.getParameter("time");
        String remind = req.getParameter("remind");
        String testSelectPar = (String) req.getSession().getAttribute("servicePar");

        PrintWriter out = resp.getWriter();
        out.println("service: " + service);
        out.println(" time: " + time);
        out.println("remind: " + remind);
        out.println("testSelectPar: " +testSelectPar );
    }
}

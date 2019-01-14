package com.salonschedule.controller;

import com.salonschedule.DAO.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/masterId1page")
public class MasterId1Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Service service = new Service();
        service.setService("some-service");
        String serv = service.getService();
        req.getSession().setAttribute("servicePar",serv);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/masterId1page.jsp");
        requestDispatcher.forward(req,resp);
    }
}
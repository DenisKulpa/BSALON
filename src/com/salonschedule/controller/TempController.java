package com.salonschedule.controller;

import com.salonschedule.DAO.Master;
import com.salonschedule.DAO.MyModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TempController", name = "com.salonschedule.controller.TempController")
public class TempController extends HttpServlet {

    MyModel myModel = new MyModel();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/newTemp.jsp"); //keysensitive
        requestDispatcher.forward(request,response);
    }
}

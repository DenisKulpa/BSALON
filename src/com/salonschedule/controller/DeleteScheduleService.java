package com.salonschedule.controller;

import com.salonschedule.DAO.MyModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete",name = "DeleteScheduleService")
public class DeleteScheduleService extends HttpServlet {
    MyModel model = new MyModel();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String idService = request.getParameter("idService");
        response.getWriter().write(id + " " + idService);
        model.deleteMasterService(idService,id);

        response.sendRedirect("/bsalon/commonSchedule");

    }
}

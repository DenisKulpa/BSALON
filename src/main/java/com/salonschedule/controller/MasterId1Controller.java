package com.salonschedule.controller;

import com.salonschedule.DAO.Service;
import com.salonschedule.email.EmailController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/masterId1page")
public class MasterId1Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = "wishtanuki";
        String password = "123qwe!@#QWE";
        EmailController emailController = new EmailController();
        emailController.send(userName,password);

        Service service = new Service();
        service.setService("some-service");
        String serv = service.getService();
        req.getSession().setAttribute("servicePar",serv);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/masterId1page.jsp");
        requestDispatcher.forward(req,resp);
    }
}

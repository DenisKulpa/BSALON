package com.salonschedule.controller;

import com.salonschedule.DAO.Order;

import java.util.ArrayList;

public class OrderTimelineController {

    private ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}

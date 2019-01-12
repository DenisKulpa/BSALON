package com.salonschedule.DAO;

import java.util.ArrayList;

public class Scheduler {

    private String id;
    private ArrayList<String> timeInterval = new ArrayList<>();
    private String idbusy;
    private String idfree;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(String timeInterval) {
        this.timeInterval.add(timeInterval);
    }

    public String getIdbusy() {
        return idbusy;
    }

    public void setIdbusy(String idbusy) {
        this.idbusy = idbusy;
    }

    public String getIdfree() {
        return idfree;
    }

    public void setIdfree(String idfree) {
        this.idfree = idfree;
    }
}

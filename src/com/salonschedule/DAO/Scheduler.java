package com.salonschedule.DAO;

import java.util.ArrayList;

public class Scheduler {

    private String id;
    private ArrayList<TimeObj> timeObj = new ArrayList<>();
    private String idbusy;
    private String idfree;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<TimeObj> getTimeObj() {
        return timeObj;
    }

    public void setTimeInterval(String timeInterval,int id) {
        TimeObj obj = new TimeObj();
        obj.setTimeInterval(timeInterval);
        obj.setId(id);
        this.timeObj.add(obj);
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

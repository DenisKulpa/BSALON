package com.salonschedule.DAO;

import java.util.List;

public abstract class AbstractDAO  {

    public abstract List<Master> getMasters();
    public abstract MasterScheduler getTimeScheduler(int id);
    public abstract boolean checkIfFree(int idNext, int idEnd, String masterIdBusy);
    public abstract void insertBusyTime(int idTime, int idTimeEnd, String masterIdBusy, String masterIdFree,String masterIdService, int serviceId);

}

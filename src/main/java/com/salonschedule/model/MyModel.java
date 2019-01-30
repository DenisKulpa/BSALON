package com.salonschedule.model;

import com.salonschedule.DAO.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyModel extends AbstractDAO {

    public List<Master> getMasters() {

        List<Master> masterList = new ArrayList<>();

        try(Connection con = ConnectorDB.getConnection()){

            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM masters_full_name, masters_speciality,master_speciality_mapping WHERE masters_full_name.MastersID = master_speciality_mapping.MastersID AND masters_speciality.SpecialityID = master_speciality_mapping.SpecialityID");
            while (resultSet.next()) {
                Master master = new Master();
                master.setMasrersid(resultSet.getInt("Mastersid"));
                master.setName(resultSet.getString("name"));
                master.setSurname(resultSet.getString("surname"));
                master.setPatronymic(resultSet.getString("patronymic"));
                master.setSpeciality(resultSet.getString("specialitytitle"));
                masterList.add(master);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return masterList;
    }

    public MasterScheduler getTimeScheduler(int id) {

        MasterScheduler masterInfo = new MasterScheduler();
        try(Connection con = ConnectorDB.getConnection()){

            String idNomber = "nonumber";

            switch (id) {
                case 1:  idNomber = "id1free";
                    break;
                case 2:  idNomber = "id2free";
                    break;
                case 3:  idNomber = "id3free";
                    break;
                case 4:  idNomber = "id4free";
                    break;
                case 5:  idNomber = "id5free";
                    break;
                case 6:  idNomber = "id6free";
                    break;
                default: idNomber = "setnonumber";
                    throw new IllegalArgumentException("Invalid idNomber: " + idNomber);
            }

            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT *  FROM masters_schedule where "+idNomber+"='1'");
            while (resultSet.next()) {
                masterInfo.setTimeInterval(resultSet.getString("time_interval"),resultSet.getInt("id"));
            }
            //masterInfo.setId("2111");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return masterInfo;
    }

    // check if Masters time is free
    public boolean checkIfFree(int idNext, int idEnd, String masterIdBusy) {

        ArrayList<Integer> mas = new ArrayList<>();
        boolean status = false;

        try(Connection con = ConnectorDB.getConnection()){

            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT "+masterIdBusy+" FROM masters_schedule WHERE (ID) BETWEEN "+idNext+" AND "+idEnd+"");
            while (resultSet.next()) {
                mas.add(resultSet.getInt("id1busy"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (!mas.contains(1)){
            status = true;
        }
        return status;
    }

    public void insertBusyTime(int idTime, int idTimeEnd, String masterIdBusy, String masterIdFree, String masterIdService, int serviceId) {

        try(Connection con = ConnectorDB.getConnection()){

            Statement statement = con.createStatement();

            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdBusy+" = 1 WHERE (ID) BETWEEN "+idTime+" AND "+idTimeEnd+"");
            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdFree+" = NULL WHERE (ID) BETWEEN "+idTime+" AND "+idTimeEnd+"");
            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdService+" = "+serviceId+" WHERE (ID) BETWEEN "+idTime+" AND "+idTimeEnd+"");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<CommonSchedule> getSchedule(){

        ArrayList<CommonSchedule> commonSchedule = new ArrayList<>();

        try(Connection con = ConnectorDB.getConnection()){

            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM masters_schedule");
            while (resultSet.next()) {
                CommonSchedule schedule = new CommonSchedule();
                schedule.setId(resultSet.getInt("id"));
                schedule.setTimeInterval(resultSet.getString("time_interval"));
                schedule.setId1service(resultSet.getInt("id1service"));
                schedule.setId2service(resultSet.getInt("id2service"));
                schedule.setId3service(resultSet.getInt("id3service"));
                schedule.setId4service(resultSet.getInt("id4service"));
                schedule.setId5service(resultSet.getInt("id5service"));
                schedule.setId6service(resultSet.getInt("id6service"));
                commonSchedule.add(schedule);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return commonSchedule;
    }

    public void deleteMasterService(String masterServiceId, int id){

        String masterIdBusy;
        String masterIdFree;
        switch (masterServiceId) {
            case "id1service":
                masterIdFree ="id1free";
                masterIdBusy = "id1busy";
                break;
            case "id2service":
                masterIdFree ="id2free";
                masterIdBusy = "id2busy";
                break;
            case "id3service":
                masterIdFree ="id3free";
                masterIdBusy = "id3busy";
                break;
            case "id4service":
                masterIdFree ="id4free";
                masterIdBusy = "id4busy";
                break;
            case "id5service":
                masterIdFree ="id5free";
                masterIdBusy = "id5busy";
                break;
            case "id6service":
                masterIdFree ="id6free";
                masterIdBusy = "id6busy";
                break;
            default:
                throw new IllegalArgumentException("Invalid id1service: " + masterServiceId);
        }

        try(Connection con = ConnectorDB.getConnection()){

            Statement statement = con.createStatement();

            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdBusy+" = NULL WHERE id="+id+"");
            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdFree+" = 1 WHERE id="+id+"");
            statement.executeUpdate("UPDATE masters_schedule SET "+masterServiceId+" = NULL WHERE id="+id+"");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // next method
}

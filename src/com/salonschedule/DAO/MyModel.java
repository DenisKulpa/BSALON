package com.salonschedule.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
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

    public Scheduler getTimeScheduler(int id) {

        Scheduler masterInfo = new Scheduler();
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
                    break;
            }

            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT *  FROM masters_schedule where "+idNomber+"='1'");
            while (resultSet.next()) {
               // masterInfo.setId(resultSet.getString("id"));
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

    public void insertBusyTime(int idTime, int idTimeEnd, String masterIdBusy, String masterIdFree) {

        try(Connection con = ConnectorDB.getConnection()){

            Statement statement = con.createStatement();

            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdBusy+" = 1 WHERE (ID) BETWEEN "+idTime+" AND "+idTimeEnd+"");
            statement.executeUpdate("UPDATE masters_schedule SET "+masterIdFree+" = NULL WHERE (ID) BETWEEN "+idTime+" AND "+idTimeEnd+"");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

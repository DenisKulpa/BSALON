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

            ResultSet resultSet = statement.executeQuery("SELECT time_interval  FROM masters_schedule where "+idNomber+"='1'");
            while (resultSet.next()) {
               // masterInfo.setId(resultSet.getString("id"));
                masterInfo.setTimeInterval(resultSet.getString("time_interval"));
            }
            //masterInfo.setId("2111");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return masterInfo;
    }
}

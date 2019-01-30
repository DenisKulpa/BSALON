package com.salonschedule.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

// Class for convenience (that's book says), here we set all properties to conncet a database.

public class ConnectorDB {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        ResourceBundle resource = ResourceBundle.getBundle("db");
        String URL = resource.getString("jdbc.url");
        String username = resource.getString("jdbc.username");
        String password = resource.getString("jdbc.password");
        String driver = resource.getString("jdbc.driver");
        if (driver != null) {
            Class.forName(driver) ;
        }
        return DriverManager.getConnection(URL, username, password);
    }
}

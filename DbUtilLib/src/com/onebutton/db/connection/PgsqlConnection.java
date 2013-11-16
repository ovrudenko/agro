/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onebutton.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author lolka
 */
public class PgsqlConnection {

    public static final String USER_NAME = "postgres";
    public static final String PASSWORD = "12345678";
    public static final String URL = "jdbc:postgresql://localhost:5432/agro";
    private  Connection connect;
    
    public Connection getConnection() throws SQLException{
        if (connect == null){
            connect();
        }
        return connect;
    }

    private void connect() throws SQLException {
        if (connect == null) {
            Properties connectionProps = new Properties();
            connectionProps.put("user", USER_NAME);
            connectionProps.put("password", PASSWORD);

            connect = DriverManager.getConnection(URL, connectionProps);
        }
    }
    
    public  void closeConnection() throws SQLException{
        if (connect != null){
            connect.close();
        }
    }
}

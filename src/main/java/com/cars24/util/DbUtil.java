package com.cars24.util;

import com.cars24.config.DbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil{
    private static Connection dbConnection; // because we have to close the connection also. has default value as null and that is why we have to execute line number 13

    public static Connection getConnection() { //Connection is a datatype
        if (dbConnection == null) {
            try {
                // to ensure that only one connection is there

                dbConnection = DriverManager.getConnection(DbConfig.host, DbConfig.userName, DbConfig.password); // it establishes a connection between java and sql and holds it in dbConnection
                System.out.println("Connection Successful!");

//            return dbConnection;
            } catch(SQLException e){
            System.out.println("Error connecting to the db");
            throw new RuntimeException(e);
        }
    }
        return dbConnection;
    }

}

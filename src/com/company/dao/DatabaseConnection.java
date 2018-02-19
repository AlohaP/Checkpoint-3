package com.company.dao;
import java.sql.*;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;
    private Connection connection = null;
    private final String DBNAME = "jdbc:sqlite:checkpoint-db.db";

    private DatabaseConnection(){
        getConnectionToDatabase();
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private void getConnectionToDatabase(){
        try{
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(DBNAME);
            System.out.println("connected");
        } catch (SQLException | NullPointerException e ){
            System.out.println("DB connection problem.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }



    public Connection getConnection(){
        return connection;
    }

}

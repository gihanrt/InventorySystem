package com.company;

import java.sql.*;
import java.util.Date;


/**
 * Created by taniyaj on 1/15/2018.
 */
public class DBConnectionHandler implements DBHandler{

    private static String USERNAME = "";
    private static String PASSWORD = "";
    private static String CONN = "jdbc:mysql://localhost/inventrysystemdb";
    private Connection connection;

    public DBConnectionHandler(){

    }

    public DBConnectionHandler(String USERNAME,String PASSWORD,String CONN) throws SQLException {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.CONN = CONN;
        initConnection();
    }

    public void initConnection(){
        try {
            this.connection = DriverManager.getConnection(CONN,USERNAME,PASSWORD);
            System.out.println("connected to the DataBase...");

        }catch (SQLException e){
            System.out.println(e);

        }
    }

    @Override
    public Connection getConnection()  {
        return this.connection;
    }

    @Override
    public boolean addUserToDB(User user) throws SQLException {
        Connection conn = getConnection();

        if(conn != null){
            // the mysql insert statement
            String query = "insert into user (UserName,LastLogginTime) " + " values (?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, user.getUserName());
            preparedStmt.setString (2, new Date( ).toString());
            preparedStmt.execute();

        }

        return false;
    }

    public boolean updateUserLoggingInDB(User user) throws SQLException {
        Connection conn = getConnection();

        if(conn != null){
            //the mysql update statement
            String query = "update user set LastLogginTime = ? where UserName = ?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString (1, new Date( ).toString());
            preparedStmt.setString (2, user.getUserName());


            return preparedStmt.execute();

        }
        else {
            System.out.println("ERROR, DATABASE UPDATE UNSUCCESSFULL...");
            return false;
        }
    }


}


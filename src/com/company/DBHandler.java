package com.company;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by taniyaj on 1/14/2018.
 */
public interface DBHandler {


    public Connection getConnection() throws SQLException;

//    public void setUsername(String userName);
//
//    public void setPassWord(String passWord);
//
//    public void setConn(String conn);

    public boolean addUserToDB(User user) throws SQLException;
}

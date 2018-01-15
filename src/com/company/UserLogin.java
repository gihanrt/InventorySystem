package com.company;

import java.sql.SQLException;

/**
 * Created by taniyaj on 1/15/2018.
 */
public class UserLogin {
    private String userName;
    private Object passWord;
    public DBConnectionHandler dbConnectionHandler = null;

    public UserLogin(String userName,String passWord){
        this.userName = userName;
        this.passWord = passWord;

        dbConnectionHandler = new DBConnectionHandler();
        dbConnectionHandler.initConnection();
    }



    public User initUserLoggin(UserStatus userStatus) throws SQLException {
        User user = createUser();
        if(validateUser(user) && UserStatus.EXISTING_USER.equals(userStatus)){//if existing User is valied
            userLoginUpdate(user);
//            newUserLogginUpdate(user);
            System.out.println("User Login Successful");
            return user;

        }
        else if ((!validateUser(user)) && (UserStatus.NEW_USER.equals(userStatus))) { //if a new user
            //add newUser
            newUserLogginUpdate(user);
            return user;
        }
        else {
            System.out.println("ERROR, INVALIED USER...");
            return null;
        }
    }

    private User createUser(){
        User user = new User(userName);
        return user;
    }

    //TO DO check validity of the User
    private boolean validateUser(User user){

        return true;
    }

    private boolean userLoginUpdate(User user) throws SQLException {
        dbConnectionHandler.updateUserLoggingInDB(user);
        return true;

    }

    private boolean newUserLogginUpdate(User user) throws SQLException {
        dbConnectionHandler.addUserToDB(user);
        return true;
    }
}

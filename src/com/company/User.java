package com.company;

import java.lang.Object;import java.lang.String;

/**
 * Created by taniyaj on 1/14/2018.
 */
public class User {

    private String userName;
    private Object password;
    private String phoneNumber;
    private String email;
    private String address;
    private UserTypes userType;

    public User(String userName){
        this.userName = userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setPassword(Object password){
        this.password = password;
    }

    public Object getPassword(){
        return this.password;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setUserTypes(UserTypes userType){
        this.userType = userType;
    }

    public UserTypes getUserType(){
        return this.userType;
    }

}

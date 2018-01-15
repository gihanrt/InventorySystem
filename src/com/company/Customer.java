package com.company;

/**
 * Created by taniyaj on 1/14/2018.
 */
public class Customer {
    private String customerName;
    private String customerAddress;

    public Customer(String customerName,String customerAddress){
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public boolean addNewCustomer(){
        return true;
    }
}

package com.cars24.runner;
import com.cars24.data.req.AddCustomerReq;

import java.util.*;
public class Ui {

    private Scanner scanner  = new Scanner(System.in);
    public void addCustomer()
    {
        System.out.println("Enter customer details");
        AddCustomerReq req = new AddCustomerReq();

        req.setName(scanner.next());
        req.setEmail(scanner.next());
    }

    public void getCustomer()
    {
        System.out.println("Search customer details");

        System.out.println("Enter Email  : ");

        System.out.println("Enter Phone  : ");
    }

}
package com.cars24.runner;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.services.impl.CustomerServiceImpl;

import java.util.*;
public class Ui {

    private static Scanner scanner  = new Scanner(System.in);


    public static void addCustomer() {
        System.out.println("Enter customer details");
        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        AddCustomerReq addCustomerReq = null;


        AddCustomerReq addCustomerReq = new AddCustomerReq();
        System.out.print("Enter your name: ");
        addCustomerReq.setName(scanner.next());
        System.out.print("Enter your phone number: ");
        addCustomerReq.setPhone(scanner.next());
        System.out.print("Enter your email: ");
        addCustomerReq.setEmail(scanner.next());
        System.out.print("Enter your address: ");
        addCustomerReq.setAddress(scanner.next());
        customerService.registerCustomer(addCustomerReq);


    }

    public static void getCustomer()
    {
        System.out.println("Search customer details");

        System.out.println("Enter Email  : ");

        System.out.println("Enter Phone  : ");
    }

    public static void updateCustomer()
    {
        System.out.println("Search customer details");

        System.out.println("Enter Email  : ");

        System.out.println("Enter Phone  : ");
    }
    public static void deleteCustomer()
    {
        System.out.println("Search customer details");

        System.out.println("Enter Email  : ");

        System.out.println("Enter Phone  : ");
    }

}
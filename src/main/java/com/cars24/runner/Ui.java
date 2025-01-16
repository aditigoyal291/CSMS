package com.cars24.runner;
import com.cars24.data.req.AddCustomerReq;

import java.util.*;
public class Ui {

    private static Scanner scanner  = new Scanner(System.in);
    public static void addCustomer()
    {
        System.out.println("Enter customer details");
        AddCustomerReq req = new AddCustomerReq();

        req.setName(scanner.next());
        req.setEmail(scanner.next());
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
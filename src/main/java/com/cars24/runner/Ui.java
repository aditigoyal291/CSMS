package com.cars24.runner;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.req.DelCustomerReq;
import com.cars24.data.response.CustomerProfileResponse;
import com.cars24.services.CustomerService;
import com.cars24.services.impl.CustomerServiceImpl;

import java.sql.SQLOutput;
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
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        CustomerProfileReq customerProfileReq=new CustomerProfileReq();
        System.out.print("Enter the email: ");
        customerProfileReq.setEmail(scanner.next());
        System.out.print("Enter the phone number: ");
        customerProfileReq.setPhone(scanner.next());

        CustomerProfileResponse customerProfileResponse=customerService.getCustomerDetails(customerProfileReq);


//        customerService.getCustomerDetails(customerProfileReq);
        System.out.println(customerProfileResponse);
    }

    public static void updateCustomer()
    {
        System.out.println("Search customer details");

        System.out.println("Enter Email  : ");

        System.out.println("Enter Phone  : ");
    }
    public static void deleteCustomer()
    {
        CustomerProfileReq customerProfileReq=new CustomerProfileReq();
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        System.out.print("enter your email: ");
        customerProfileReq.setEmail(scanner.next());
        System.out.print("Enter your phone: ");
        customerProfileReq.setPhone(scanner.next());
        String returnMsg = customerService.deleteCustomer(customerProfileReq);
        System.out.println(returnMsg);




    }

}
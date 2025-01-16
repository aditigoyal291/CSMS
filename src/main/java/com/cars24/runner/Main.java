package com.cars24.runner;


import com.cars24.dao.impl.CustomerDaoImpl;
import com.cars24.data.req.AddCustomerReq;
import com.cars24.data.req.CustomerProfileReq;
import com.cars24.data.response.CustomerProfileResponse;
import com.cars24.services.impl.CustomerServiceImpl;
import com.cars24.util.DbUtil;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        DbUtil.getConnection();
        CustomerDaoImpl customerDaoImplementation=new CustomerDaoImpl();
//        String cdiValues=customerDaoImplementation.createCustomer("John2","2231987654","john2@example.com","Blr");
//        System.out.println(cdiValues);
        CustomerServiceImpl customerService=new CustomerServiceImpl();
//        AddCustomerReq addCustomerReq=new AddCustomerReq();
//        addCustomerReq.setName("");
//        addCustomerReq.setPhone("1122334455");
//        addCustomerReq.setEmail("Johnn@example.com");
//        addCustomerReq.setAddress("Mumbai");
//        customerService.registerCustomer(addCustomerReq);


//
        CustomerProfileReq customerProfileReq=new CustomerProfileReq();
        customerProfileReq.setEmail("john@example.com");
        customerProfileReq.setPhone("1230987654");
//        CustomerProfileResponse resp=customerDaoImplementation.getCustomerDetails(customerProfileReq );
//        System.out.println(resp);
//       System.out.println(cdiValues);


        CustomerProfileResponse customerProfileResponse=customerService.getCustomerDetails(customerProfileReq);
        System.out.println(customerProfileResponse);



//        System.out.println("Application stopped");


    }
}


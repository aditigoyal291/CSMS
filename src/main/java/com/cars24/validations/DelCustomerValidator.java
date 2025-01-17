package com.cars24.validations;

import com.cars24.data.req.CustomerProfileReq;
//import com.cars24.data.req.customerProfileReq;

public class DelCustomerValidator {
    public static void validateDelCustomerReq(CustomerProfileReq customerProfileReq){
        if(customerProfileReq.getEmail()==null && customerProfileReq.getPhone()==null)
        {
            throw new IllegalArgumentException("Please fill either Phone number or Email");
        }
        if(customerProfileReq.getPhone()!=null) validateDelCustomerPhone(customerProfileReq.getPhone());
        if(customerProfileReq.getEmail()!=null) validateDelCustomerEmail(customerProfileReq.getEmail());
    }

    private static void validateDelCustomerEmail(String email) {
        if(email.indexOf('@')==-1) throw new IllegalArgumentException("Please enter a valid email!");
    }

    private static void validateDelCustomerPhone(String phone) {
        if(phone.length()!=10) throw new IllegalArgumentException("Please enter a valid phone number!");
    }
}

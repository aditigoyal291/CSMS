package com.cars24.validations;

import com.cars24.data.req.CustomerProfileReq;

public class GetCustomerValidator {
    public static void validateGetCustomerReq(CustomerProfileReq customerProfileReq){
        if(customerProfileReq.getEmail()==null && customerProfileReq.getPhone()==null)
        {
            throw new IllegalArgumentException("Please fill either Phone number or Email");
        }
        if(customerProfileReq.getPhone()!=null) validateGetCustomerPhone(customerProfileReq.getPhone());
        if(customerProfileReq.getEmail()!=null) validateGetCustomerEmail(customerProfileReq.getEmail());
    }

    private static void validateGetCustomerEmail(String email) {
        if(email.indexOf('@')==-1) throw new IllegalArgumentException("Please enter a valid email!");
    }

    private static void validateGetCustomerPhone(String phone) {
        if(phone.length()!=10) throw new IllegalArgumentException("Please enter a valid phone number!");
    }
}

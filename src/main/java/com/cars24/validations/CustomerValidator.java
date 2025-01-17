package com.cars24.validations;

import com.cars24.data.req.AddCustomerReq;

public class CustomerValidator {
    public static void validateAddCustomerReq(AddCustomerReq addCustomerReq){
        validateCustomerName(addCustomerReq.getName());

    }
    private static void validateCustomerName(String name)
    {
        if(name==null)
        {
            throw new IllegalArgumentException("Name cannot be empty!"); //

        }

        if(name.length()<3 || name.length()>100)
        {
            throw new IllegalArgumentException("Name length must be between 3 and 100");
        }



    }
    public static void validateCustomerPhone(String phone)
    {
        if(phone==null) return;

        if(phone.length()!=10)  return;
    }
    public static void validateCustomerEmail(String email)
    {
        if(email==null) return;

        if(email.length()!=10)  return;

    }
}
